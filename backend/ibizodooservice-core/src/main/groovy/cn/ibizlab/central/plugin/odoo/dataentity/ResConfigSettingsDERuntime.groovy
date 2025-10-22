package cn.ibizlab.central.plugin.odoo.dataentity

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.annotation.DEAction
import net.ibizsys.model.dataentity.defield.IPSDEField
import org.apache.commons.collections.map.LinkedMap
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import java.util.concurrent.ConcurrentHashMap;

public class ResConfigSettingsDERuntime extends OdooDataEntityRuntime {
    private static final Log log = LogFactory.getLog(ResConfigSettingsDERuntime.class);
    private IDataEntityRuntime configParameterDERuntime = null;
    private Map<String,Object> classifiedFieldMap  = new ConcurrentHashMap<>();
    protected IDataEntityRuntime getConfigParameterDERuntime() {
        if (this.configParameterDERuntime == null) {
            this.configParameterDERuntime = this.getSystemRuntime().getDataEntityRuntime("IR_CONFIG_PARAMETER");
        }

        return this.configParameterDERuntime;
    }

    private IDataEntityRuntime defaultDERuntime = null;
    protected IDataEntityRuntime getDefaultDERuntime() {
        if (this.defaultDERuntime == null) {
            this.defaultDERuntime = this.getSystemRuntime().getDataEntityRuntime("IR_DEFAULT");
        }

        return this.defaultDERuntime;
    }

    @DEAction("default_get")
    protected Object doDefaultGet(IEntityDTO iEntityDTO) throws Throwable {
        //该方法实际上对应fillentitydefaultvalue,后续可转成重写默认值设置方法
        Map fieldMap = getClassifiedFields();
        Map<String,String> defaultMap = fieldMap.get("default") as Map<String, String>;
        List<String> moduleList = fieldMap.get("module") as List<String>;
        List<String> groupList = fieldMap.get("group") as List<String>;
        Map<String,String> configMap =fieldMap.get("config") as Map<String, String>;
        //查询默认值
        if (defaultMap.size() > 0) {
            ISearchContextDTO defaultFilter = this.getDefaultDERuntime().createSearchContext();
            defaultFilter.in("field_id", defaultMap.keySet().toArray().join("[,]"));
            defaultFilter.set("size", 1000);
            List<IEntityDTO> defaults = this.getDefaultDERuntime().select(defaultFilter)
            defaults.forEach({ _default ->
                iEntityDTO.set(defaultMap.get(_default.get("field_id")), _default.get("json_value"));
            });
        }
        //查询模块安装
        if (moduleList.size() > 0) {
            //todo
        }

        //查询权限
        if (groupList.size() > 0){
            //todo
        }
        //查询系统参数
        if (configMap.size() > 0) {
            ISearchContextDTO parameterFilter = this.getConfigParameterDERuntime().createSearchContext();
            parameterFilter.in("key",configMap.keySet().toArray().join("[,]"));
            parameterFilter.set("size", 1000);
            List<IEntityDTO> parameters = this.getConfigParameterDERuntime().select(parameterFilter)
            parameters.forEach({ parameter ->
                iEntityDTO.set(configMap.get(parameter.get("key")), parameter.get("value"));
            });
        }

        return iEntityDTO; // 返回成功标识
    }

    @DEAction("set_values")
    protected Object doSetValues(IEntityDTO iEntityDTO) throws Throwable {
        Map fieldMap = getClassifiedFields();
        IEntityDTO currentSettings = this.doDefaultGet(this.createEntity());
        Map<String,String> defaultMap = fieldMap.get("default") as Map<String, String>;
        List<String> moduleList = fieldMap.get("module") as List<String>;
        List<String> groupList = fieldMap.get("group") as List<String>;
        Map<String,String> configMap =fieldMap.get("config") as Map<String, String>;

        if (defaultMap.size() > 0) {
            defaultMap.forEach { key,value ->
                if (!currentSettings.hasProperty(value) || iEntityDTO.get(value) != currentSettings.get(value)) {
                    IEntityDTO defaultParameter = this.getDefaultDERuntime().createEntity();
                    defaultParameter.put("field_id", key);
                    defaultParameter.put("json_value", iEntityDTO.get(value));
                    //后续提供default的set方法，处理不同数据类型格式的值项
                    this.getDefaultDERuntime().save(defaultParameter);
                }
            }
        }

        if (configMap.size() > 0) {
            configMap.forEach { key,value ->
                if (!currentSettings.hasProperty(value) ||  iEntityDTO.get(value) != currentSettings.get(value)) {
                    IEntityDTO configParameter = this.getConfigParameterDERuntime().createEntity();
                    configParameter.put("key",key);
                    configParameter.put("value",iEntityDTO.get(value));
                    this.getConfigParameterDERuntime().save(configParameter);
                }
            }
        }
    }

    private Map<String,Object> getClassifiedFields(){
        // 1. 初始化参数列表
        Map<String,String> defaultMap = new LinkedMap();
        List<String> moduleList = new LinkedList<>();
        List<String> groupList = new LinkedList<>();
        Map<String,String> configMap = new LinkedMap();
        classifiedFieldMap.clear();
        // 2. 分类属性
        this.getPSDEFields(true).forEach({ field ->
            String fieldName = field.getName();
            if (fieldName.startsWith("DEFAULT_")) {
                String realFieldName = field.getName().substring(8).toLowerCase();
                if(field.getUserTag() != null && field.getUserTag().startsWith("default_model:")) {
                    String entityName = field.getUserTag().split("[:]")[1];
                    IDataEntityRuntime defaultEntityDERuntime = this.getSystemRuntime().getDataEntityRuntime(entityName,true);
                    if (defaultEntityDERuntime != null) {
                        IPSDEField defaultField = defaultEntityDERuntime.getPSDEField(true,realFieldName,true);
                        if (defaultField == null) {
//                        throw new Exception("属性[" + fieldName + "]在模型[" + entityName + "]"不存在);
                        }
                    }else {
//                        throw new Exception("属性[" + fieldName + "]default_model参数有误");
                    }

                    defaultMap.put( String.format("%s.%s",entityName,realFieldName),fieldName);
                }else {
//                    throw new Exception("属性[" + fieldName + "]未定义default_model参数");
                }
            } else if (fieldName.startsWith("MODULE_")) {
                moduleList.add(fieldName);
            } else if (fieldName.startsWith("GROUP_")) {
                groupList.add(fieldName);
            } else if (field.getUserTag() != null && field.getUserTag().startsWith("config_parameter:")) {
                String fieldKey = field.getUserTag().split("[:]")[1];
                configMap.put(fieldKey,fieldName);
            }
        });
        classifiedFieldMap.put("default",defaultMap);
        classifiedFieldMap.put("module",moduleList);
        classifiedFieldMap.put("group",groupList);
        classifiedFieldMap.put("config",configMap);
        return classifiedFieldMap;
    }
}