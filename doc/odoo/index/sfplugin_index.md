# 服务插件 <!-- {docsify-ignore-all} -->

|  对象      |  实体  |  类型  | 插件  |备注|
|  --------  | ----- | -----    |-----    |----    |
|Odoo系统扩展组件||PSSysUtilImpl|[OdooSysExtensionUtilRuntime](#OdooSysExtensionUtilRuntime)||
|SysPSDEModelUtilRuntime||PSSysUtilImpl|[OdooSysPSDEModelUtilRuntime](#OdooSysPSDEModelUtilRuntime)||
|审计|[线索/商机(CRM_LEAD)](module/crm/crm_lead)|PSDEUtilImpl|[OdooDEDataTrackingUtilRuntime](#OdooDEDataTrackingUtilRuntime)||
|收件服务器(FETCHMAIL_SERVER)||PSDataEntityImpl|[FetchmailServerDERuntime](#FetchmailServerDERuntime)||
|配置设定(RES_CONFIG_SETTINGS)||PSDataEntityImpl|[ResConfigSettingsDERuntime](#ResConfigSettingsDERuntime)|可考虑转为底包代码|

### FetchmailServerDERuntime :id=FetchmailServerDERuntime


```cn.ibizlab.central.plugin.odoo.dataentity.FetchmailServerDERuntime```

```groovy
package cn.ibizlab.central.plugin.odoo.dataentity

import net.ibizsys.central.dataentity.DataEntityRuntime
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.annotation.DEAction
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import java.util.concurrent.ConcurrentHashMap;

public class FetchmailServerDERuntime extends OdooDataEntityRuntime {

    @DEAction("fetch_mail")
    protected Object doFetchMail(IEntityDTO iEntityDTO) throws Throwable {
        println "执行fetchmail...";
    }

}
```
### 系统运行时组件 :id=GLOBAL_SYSTEMRUNTIME


```cn.ibizlab.central.plugin.odoo.OdooSystemRuntime```

```groovy
null
```
### OdooDEDataTrackingUtilRuntime :id=OdooDEDataTrackingUtilRuntime


```cn.ibizlab.central.plugin.odoo.dataentity.util.OdooDEDataTrackingUtilRuntime```

```groovy
package cn.ibizlab.central.plugin.odoo.dataentity.util

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.model.dataentity.IPSDataEntity
import net.ibizsys.model.dataentity.action.IPSDEAction
import net.ibizsys.runtime.IDynaInstRuntime
import net.ibizsys.runtime.SystemRuntimeException
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.util.DEDataAuditUtilRuntime
import net.ibizsys.runtime.util.ActionSession
import net.ibizsys.runtime.util.ActionSessionManager
import net.ibizsys.runtime.util.DataTypeUtils
import net.ibizsys.runtime.util.DateUtils
import net.ibizsys.runtime.util.IEntityBase
import net.ibizsys.runtime.util.JsonUtils
import net.ibizsys.runtime.util.domain.DataAudit
import net.ibizsys.runtime.util.domain.DataAuditDetail
import org.springframework.util.Assert
import org.springframework.util.StringUtils;

public class OdooDEDataTrackingUtilRuntime extends DEDataAuditUtilRuntime{

    private String trackPrepareMethodName = "track_prepare";
    private String trackDiscardMethodName = "track_discard";

    public void auditAction(Object curData, IEntityBase lastEntityBase, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDataEntityRuntime iDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) {
        Assert.notNull(iDataEntityRuntime, "传入实体运行时对象无效");
        if (iDataEntityRuntime.getDataAuditMode() == 0) {
            log.warn(String.format("实体[%s]没有启用数据审计模式，忽略审计作业", iPSDataEntity.getName()));
        } else {
            ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
            Object objKey = null;
            IEntityBase curEntityBase = null;
            if (curData instanceof IEntityBase) {
                curEntityBase = (IEntityBase)curData;
                objKey = iDataEntityRuntime.getFieldValue(curEntityBase, iDataEntityRuntime.getKeyPSDEField());
            } else {
                objKey = curData;
            }

            String strAction = strActionName;
            String strActionLogicName = null;
            if (iPSDEAction != null) {
                strActionLogicName = iPSDEAction.getLogicName();
            }

            if (!StringUtils.hasLength(strActionLogicName)) {
                strActionLogicName = strAction;
            }

            DataAudit dataAudit = new DataAudit();
            dataAudit.setOpPersonId(actionSession.getUserContext().getUserid());
            dataAudit.setOpPersonName(actionSession.getUserContext().getUsername());
            dataAudit.setIPAddress(actionSession.getUserContext().getRemoteaddress());
            dataAudit.setObjectType(iDataEntityRuntime.getName());
            dataAudit.setObjectId(DataTypeUtils.getStringValue(objKey, (String)null));
            dataAudit.setAuditType(strAction);
            String strInfo = String.format("%s %s %s", DateUtils.getCurTimeString(), actionSession.getUserContext().getUsername(), strActionLogicName);
            dataAudit.setDataAuditName(strInfo);
            if (iDataEntityRuntime.getDataAuditMode() == 2 && curEntityBase != null) {
                List<DataAuditDetail> dataAuditDetails = getDataAuditDetails(curEntityBase, lastEntityBase, iPSDataEntity, iDataEntityRuntime, iDynaInstRuntime);
                if (dataAuditDetails != null) {
                    dataAudit.setDataauditdetails(dataAuditDetails);
                    ArrayNode arrayNode = JsonUtils.createArrayNode();
                    Iterator var18 = dataAuditDetails.iterator();

                    while(var18.hasNext()) {
                        DataAuditDetail dataAuditDetail = (DataAuditDetail)var18.next();

                        try {
                            JsonNode jsonNode = JsonUtils.MAPPER.readTree(JsonUtils.MAPPER.writeValueAsString(dataAuditDetail));
                            arrayNode.add(jsonNode);
                        } catch (JsonProcessingException var21) {
                            JsonProcessingException ex = var21;
                            throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%s]序列化审计记录发生异常，%s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
                        } catch (IOException var22) {
                            IOException ex = var22;
                            throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%s]序列化审计记录发生异常，%s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
                        }
                    }

                    dataAudit.setAuditInfo(arrayNode.toString());
                }
                this.logDetailsTrack(dataAudit, curEntityBase, lastEntityBase,iPSDEAction,dataAuditDetails, iPSDataEntity, iDataEntityRuntime, iDynaInstRuntime);
            }

            this.logDataAudit(dataAudit, curEntityBase, lastEntityBase, iPSDataEntity, iDataEntityRuntime, iDynaInstRuntime);
        }
    }
    protected void logDetailsTrack(DataAudit dataAudit, IEntityBase curEntityBase, IEntityBase lastEntityBase,IPSDEAction iPSDEAction,List<DataAuditDetail> dataAuditDetails, IPSDataEntity iPSDataEntity, IDataEntityRuntime iDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime) {
        IEntityDTO auditDTO = iDataEntityRuntime.createEntity();
        auditDTO.from(curEntityBase);
        auditDTO.put("last",lastEntityBase);
        auditDTO.put("dataauditdetails",dataAuditDetails);
        Object[] args = [auditDTO];
        if(org.springframework.util.ObjectUtils.isEmpty(lastEntityBase))
        {
            iDataEntityRuntime.executeAction(trackDiscardMethodName,null,args);
        }else {
            iDataEntityRuntime.executeAction(trackPrepareMethodName,null,args);
        }
    }

}
```
### OdooDynaTableDEDynaStorageUtilRuntime2 :id=OdooDynaTableDEDynaStorageUtilRuntime2


```cn.ibizlab.central.plugin.odoo.dataentity.util.OdooDynaTableDEDynaStorageUtilRuntime2```

```groovy
null
```
### OdooSysExtensionUtilRuntime :id=OdooSysExtensionUtilRuntime


```cn.ibizlab.central.plugin.odoo.sysutil.OdooSysExtensionUtilRuntime```

```groovy
null
```
### OdooSysPSDEModelUtilRuntime :id=OdooSysPSDEModelUtilRuntime


```cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil.OdooSysPSDEModelUtilRuntime```

```groovy
package cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil;


import net.ibizsys.central.plugin.extension.sysutil.SysPSDEModelUtilRuntime
import net.ibizsys.central.plugin.extension.sysutil.addin.ISysPSDEModelUtilRTAddin;

import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil.PSDEUserRoleSyncTool;
import cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil.PSSysOPPrivSyncTool;
import cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil.PSSysUniResSyncTool;

public class OdooSysPSDEModelUtilRuntime extends SysPSDEModelUtilRuntime {
    static {
        RuntimeObjectFactory.getInstance().registerObjectIf(ISysPSDEModelUtilRTAddin.class, "*:PSDEMODELSYNCTOOL:PSDEUSERROLE", PSDEUserRoleSyncTool.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(ISysPSDEModelUtilRTAddin.class, "*:PSDEMODELSYNCTOOL:PSSYSOPPRIV", PSSysOPPrivSyncTool.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(ISysPSDEModelUtilRTAddin.class, "*:PSDEMODELSYNCTOOL:PSSYSUNIRES", PSSysUniResSyncTool.class);
    }
}

```
### PSDEUserRoleSyncTool :id=PSDEUserRoleSyncTool


```cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil.PSDEUserRoleSyncTool```

```groovy
package cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil;

import net.ibizsys.central.plugin.extension.sysutil.addin.PSDEModelSyncToolBase
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSession
import net.ibizsys.runtime.util.ActionSessionManager
import net.ibizsys.runtime.util.IAction
import net.ibizsys.runtime.util.ITransactionalUtil
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

public class PSDEUserRoleSyncTool extends PSDEModelSyncToolBase {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(PSDEUserRoleSyncTool.class);

    @Override
    protected void onSync(IPSDataEntity iPSDataEntity, Object param) throws Throwable {
       
        Map<String, Object> params = null;
        if(param instanceof Map) {
            params = (Map)param;
        }

        List<Map> mapList = new ArrayList<Map>();
        IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());
        //插件中实体是否能安装
        this.getSystemRuntime().getPSSystem().getAllPSDataEntities().forEach({ iPSDataEntity2 ->
            //临时提供，此处考虑从实体运行时获取accessmanager然后获取defaultUserRoles
            if(iPSDataEntity2.getAllPSDEUserRoles()!=null) {
                iPSDataEntity2.getAllPSDEUserRoles().forEach({ iPSDEUserRole ->
                    if(org.springframework.util.StringUtils.hasLength(iPSDEUserRole.getCustomCond())){
                        Map<String, Object> obj = new LinkedHashMap<String, Object>();
                        obj.put("display_name", iPSDEUserRole.getName());
                        obj.put("name", iPSDEUserRole.getRoleTag());
                        obj.put("model_id", iPSDataEntity2.getName());
                        obj.put("active", 1);
                        //global需要判断条件确认，考虑识别特定标注
                        if ("global".equals(iPSDEUserRole.getUserTag())) {
                            obj.put("global", 0);
                        }
                        obj.put("active", 1);
                        //后续可考虑从数据集条件转换
                        obj.put("domain_force", iPSDEUserRole.getCustomCond());
                        if (iPSDEUserRole.getPSDEUserRoleOPPrivs() != null) {
                            iPSDEUserRole.getPSDEUserRoleOPPrivs().forEach ({ iPSDEUserRoleOPPriv ->
                                if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("read")) {
                                    obj.put("perm_read", 1);
                                }
                                if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("update")) {
                                    obj.put("perm_write", 1);
                                }
                                if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("create")) {
                                    obj.put("perm_create", 1);
                                }
                                if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("delete")) {
                                    obj.put("perm_unlink", 1);
                                }
                            })
                        }
                        mapList.add(obj);
                    }
                });
            }
        })

        //查询历史数据
        Map<String, IEntityDTO> lastEntityDTOMap = null;

        IPSDEDataSet iPSDEDataSet = iDataEntityRuntime.getPSDEDataSetByTag(PSMODELSYNC_PREDEFINEDDATASET_PSMODELSYNC, true);
        if(iPSDEDataSet != null) {

            lastEntityDTOMap = new HashMap<String, IEntityDTO>();
            ISearchContextDTO iSearchContextDTO = iDataEntityRuntime.createSearchContext();
            iSearchContextDTO.all().count(false);
            List<IEntityDTO> list = iDataEntityRuntime.selectDataSet(iPSDEDataSet, iSearchContextDTO);
            for(IEntityDTO item : list) {
                String unionTag = String.format("%s|%s", item.get("model_id"),item.get("name"));
                lastEntityDTOMap.put(unionTag, item);
            }
        }


        //执行批保存
        List<IEntityDTO> updateentityList = new ArrayList<IEntityDTO>();
        List<IEntityDTO> createentityList = new ArrayList<IEntityDTO>();
        for(Map<String, Object> item : mapList) {
            IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity(item);
            String unionTag = String.format("%s|%s", item.get("model_id"),item.get("name"));
            if(lastEntityDTOMap != null && lastEntityDTOMap.containsKey(unionTag)) {
                IEntityDTO lastEntity = lastEntityDTOMap.get(unionTag);
                iEntityDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),lastEntity.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),null));
                String originPerm = String.format("%s%s%s%s",item.get("perm_read",0),item.get("perm_write",0),item.get("perm_create",0),item.get("perm_unlink",0))
                String lastPerm = String.format("%s%s%s%s",lastEntity.get("perm_read",0),lastEntity.get("perm_write",0),lastEntity.get("perm_create",0),lastEntity.get("perm_unlink",0))
                if(lastEntity.get("domain_force").equals(item.get("domain_force")) && originPerm.equals(lastPerm)){
                    continue;
                }
                updateentityList.add(iEntityDTO);
            }else {
                createentityList.add(iEntityDTO);
            }
        }


        for(IEntityDTO iEntityDTO : createentityList) {
            iDataEntityRuntime.fillEntityKeyValue(iEntityDTO);
        }

        if(ObjectUtils.isEmpty(createentityList)&& ObjectUtils.isEmpty(updateentityList)){
            return;
        }
        UserContext.setCurrent(this.getSystemRuntime().createDefaultUserContext());
        try {
            iDataEntityRuntime.execute(new IAction() {
                @Override
                Object execute(Object[] args) throws Throwable {
                    if ( !ObjectUtils.isEmpty ( createentityList ) ) {
                        iDataEntityRuntime.rawCreate(createentityList, true);
                        
                    }
                    if ( !ObjectUtils.isEmpty ( updateentityList ) ) {
    //                iDataEntityRuntime.rawUpdate(updateentityList, true);
                    }
                }
            },null, ITransactionalUtil.PROPAGATION_REQUIRED);
        } catch (Throwable ex) {
            log.error(String.format("同步规则发生异常，%s", ex.getMessage()), ex);
        }
    }

}

```
### PSSysOPPrivSyncTool :id=PSSysOPPrivSyncTool


```cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil.PSSysOPPrivSyncTool```

```groovy
package cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil

import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.plugin.extension.sysutil.addin.PSDEModelSyncToolBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.model.dataentity.IPSDataEntity
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import net.ibizsys.model.security.IPSSysUniRes
import net.ibizsys.runtime.security.SysUserRoleDefaultModes
import net.ibizsys.runtime.security.UserContext
import net.ibizsys.runtime.util.ActionSession
import net.ibizsys.runtime.util.ActionSessionManager
import net.ibizsys.runtime.util.IAction
import net.ibizsys.runtime.util.ITransactionalUtil
import net.ibizsys.runtime.util.KeyValueUtils
import org.apache.commons.logging.LogFactory
import org.springframework.util.ObjectUtils


public class PSSysOPPrivSyncTool extends PSDEModelSyncToolBase {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(PSSysOPPrivSyncTool.class);

    protected IDataEntityRuntime getRuleDERuntime() {
        return this.getSystemRuntime().getDataEntityRuntime("IR_RULE");
    }

    protected IDataEntityRuntime getModelAccessDERuntime() {
        return  this.getSystemRuntime().getDataEntityRuntime("IR_MODEL_ACCESS");
    }

    protected IDataEntityRuntime getUniResDERuntime() {
        return  this.getSystemRuntime().getDataEntityRuntime("IR_UNIRES");
    }

    @Override
    protected void onSync(IPSDataEntity iPSDataEntity, Object param) throws Throwable {
        Map<String, Object> params = null;
        if(param instanceof Map) {
            params = (Map)param;
        }

        List<Map> mapList = new ArrayList<Map>();
        IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());
        if (iPSDataEntity.getAllPSDEOPPrivs() == null)
            return;

        //查询userrole(rule)历史数据
        Map<String, IEntityDTO> lastRuleMap = null;

        IPSDEDataSet iUserRolePSDEDataSet = this.getRuleDERuntime().getPSDEDataSetByTag(PSMODELSYNC_PREDEFINEDDATASET_PSMODELSYNC, true);
        if(iUserRolePSDEDataSet != null) {

            lastRuleMap = new HashMap<String, IEntityDTO>();
            ISearchContextDTO iUserRoleSearchContextDTO = this.getRuleDERuntime().createSearchContext();
            iUserRoleSearchContextDTO.all().count(false);
            List<IEntityDTO> list = this.getRuleDERuntime().selectDataSet(iUserRolePSDEDataSet, iUserRoleSearchContextDTO);
            for(IEntityDTO item : list) {
                String unionTag = String.format("%s|%s", item.get("model_id"),item.get("name"));
                lastRuleMap.put(unionTag, item);
            }
        }

        //查询unires历史数据
        Map<String, IEntityDTO> lastUniResMap = null;

        IPSDEDataSet iUniResPSDEDataSet = this.getUniResDERuntime().getPSDEDataSetByTag(PSMODELSYNC_PREDEFINEDDATASET_PSMODELSYNC, true);
        if(iUniResPSDEDataSet != null) {
            lastUniResMap = new HashMap<String, IEntityDTO>();
            ISearchContextDTO iUniReseSearchContextDTO = this.getUniResDERuntime().createSearchContext();
            iUniReseSearchContextDTO.all().count(false);
            List<IEntityDTO> list = this.getUniResDERuntime().selectDataSet(iUniResPSDEDataSet, iUniReseSearchContextDTO);
            for(IEntityDTO item : list) {
                String unionTag = String.format("%s", item.get("res_code"));
                lastUniResMap.put(unionTag, item);
            }
        }

        this.getSystemRuntime().getPSSystem().getAllPSSysUserRoles().forEach({ iPSSysUserRole ->
            if(SysUserRoleDefaultModes.NONE.equals(iPSSysUserRole.getDefaultUser())||iPSSysUserRole.getDefaultUser() == null){
                Map<String, Object> obj = new LinkedHashMap<String, Object>();
                obj.put("display_name", iPSSysUserRole.getName());
                obj.put("name", iPSSysUserRole.getName());
                obj.put("id", iPSSysUserRole.getRoleTag());
                ArrayList ruleGroupRels = new ArrayList();
                obj.put("rule_group_rels", ruleGroupRels);
                ArrayList modelAccess = new ArrayList();
                obj.put("model_access", modelAccess);
                ArrayList uniResGroupRels = new ArrayList();
                obj.put("unires_group_rels", uniResGroupRels);
                if (iPSSysUserRole.getPSSysUserRoleDatas() != null) {
                    iPSSysUserRole.getPSSysUserRoleDatas().forEach ({ iPSSysUserRoleData ->
                        if(iPSSysUserRoleData.getPSDEUserRole()!=null){
                            String unionTag = String.format("%s|%s", iPSSysUserRoleData.getPSDataEntityMust().getName(),iPSSysUserRoleData.getPSDEUserRole().getRoleTag());
                            if(lastRuleMap!=null && lastRuleMap.containsKey(unionTag)) {
                                Map<String, Object> ruleGroupRel = new LinkedHashMap<String, Object>();
                                IEntityDTO rule = lastRuleMap.get(unionTag);
                                ruleGroupRel.put("rule_id", rule.get("id"));
                                ruleGroupRels.add(ruleGroupRel);
                            }else if(iPSSysUserRoleData.getPSDEUserRole().isAllData()){
                                //全部数据角色作为默认角色
                                Map<String, Object> _modelAccess = new LinkedHashMap<String, Object>();
                                _modelAccess.put("id",KeyValueUtils.genUniqueId());
                                _modelAccess.put("model_id", iPSSysUserRoleData.getPSDataEntityMust().getName());
                                _modelAccess.put("name", iPSSysUserRoleData.getPSDEUserRole().getName());
                                if (iPSSysUserRoleData.getPSDEUserRole().getPSDEUserRoleOPPrivs() != null) {
                                    iPSSysUserRoleData.getPSDEUserRole().getPSDEUserRoleOPPrivs().forEach ({ iPSDEUserRoleOPPriv ->
                                        if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("read")) {
                                            _modelAccess.put("perm_read", 1);
                                        }
                                        if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("update")) {
                                            _modelAccess.put("perm_write", 1);
                                        }
                                        if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("create")) {
                                            _modelAccess.put("perm_create", 1);
                                        }
                                        if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("delete")) {
                                            _modelAccess.put("perm_unlink", 1);
                                        }
                                    })
                                }
                                modelAccess.add(_modelAccess);
                            }
                        }
                    })
                }
                if (iPSSysUserRole.getPSSysUserRoleReses() != null){
                    iPSSysUserRole.getPSSysUserRoleReses().forEach ({ iPSSysUserRoleRes ->
                        IPSSysUniRes iPSSysUniRes = iPSSysUserRoleRes.getPSSysUniRes();
                        if(iPSSysUniRes!=null){
                            String unionTag = String.format("%s", iPSSysUniRes.getResCode());
                            if(lastUniResMap!=null && lastUniResMap.containsKey(unionTag)) {
                                Map<String, Object> uniResGroupRel = new LinkedHashMap<String, Object>();
                                IEntityDTO uniRes = lastUniResMap.get(unionTag);
                                uniResGroupRel.put("unires_id", uniRes.get("id"));
                                uniResGroupRel.put("res_code", uniRes.get("res_code"));
                                uniResGroupRels.add(uniResGroupRel);
                            }
                        }
                    })
                }
                mapList.add(obj);
            }
        })

        //查询历史数据
        Map<String, IEntityDTO> lastEntityDTOMap = null;

        IPSDEDataSet iPSDEDataSet = iDataEntityRuntime.getPSDEDataSetByTag(PSMODELSYNC_PREDEFINEDDATASET_PSMODELSYNC, true);
        if(iPSDEDataSet != null) {

            lastEntityDTOMap = new HashMap<String, IEntityDTO>();
            ISearchContextDTO iSearchContextDTO = iDataEntityRuntime.createSearchContext();
            iSearchContextDTO.all().count(false);
            List<IEntityDTO> list = iDataEntityRuntime.selectDataSet(iPSDEDataSet, iSearchContextDTO);
            for(IEntityDTO item : list) {
                String unionTag = String.format("%s",item.get("id"));
                lastEntityDTOMap.put(unionTag, item);
            }
        }


        //执行批保存
        List<IEntityDTO> updateentityList = new ArrayList<IEntityDTO>();
        List<IEntityDTO> createentityList = new ArrayList<IEntityDTO>();
        for(Map<String, Object> item : mapList) {
            IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity(item);
            String unionTag = String.format("%s",item.get("id"));
            if(lastEntityDTOMap != null && lastEntityDTOMap.containsKey(unionTag)) {
                boolean bIgnoreUpdate = false;
                IEntityDTO lastEntity = lastEntityDTOMap.get(unionTag);
                iEntityDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),lastEntity.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),null));
                if(!ObjectUtils.isEmpty(iEntityDTO.get("rule_group_rels"))&&!ObjectUtils.isEmpty(lastEntity.get("rule_group_rels"))){
                    ArrayList curRuleGroupRels = iEntityDTO.get("rule_group_rels");
                    ArrayList lastRuleGroupRels = lastEntity.get("rule_group_rels");
                    Set<String> curRuleIds = curRuleGroupRels*.get("rule_id") as Set
                    Set<String> lastRuleIds = lastRuleGroupRels*.get("rule_id") as Set
                    // 比较两个集合是否相同
                    if(lastRuleIds.containsAll(curRuleIds)) {
                        bIgnoreUpdate = true;
                    }else {
                        bIgnoreUpdate = false;
                        ArrayList mergedRuleGroupRel = lastRuleGroupRels as List<Map>;
                        curRuleGroupRels.forEach( { rel ->
                            String ruleId = rel.get("rule_id");
                            if (!lastRuleIds.contains(ruleId)) {
                                mergedRuleGroupRel.add(rel)
                            }
                        })
                        iEntityDTO.set("rule_group_rels", mergedRuleGroupRel);
                    }
                }
                if(!ObjectUtils.isEmpty(iEntityDTO.get("model_access"))&&!ObjectUtils.isEmpty(lastEntity.get("model_access"))) {
                    ArrayList curModelAccess = iEntityDTO.get("model_access");
                    ArrayList lastModelAccess = lastEntity.get("model_access");
                    Set<String> curAccessNames = curModelAccess*.get("model_id") as Set
                    Set<String> lastAccessNames = lastModelAccess*.get("model_id") as Set
                    if (lastAccessNames.containsAll(curAccessNames)) {
                        bIgnoreUpdate = true;
                    }else {
                        bIgnoreUpdate = false;
                        ArrayList mergedModelAccess = lastModelAccess as List<Map>;
                        curModelAccess.forEach({ access ->
                            String accessName = access.get("model_id");
                            if (!lastAccessNames.contains(accessName)) {
                                mergedModelAccess.add(access)
                            }
                        })
                        iEntityDTO.set("model_access", mergedModelAccess);
                    }
                }
                if(!ObjectUtils.isEmpty(iEntityDTO.get("unires_group_rels"))&&!ObjectUtils.isEmpty(lastEntity.get("unires_group_rels"))) {
                    ArrayList curUniRes = iEntityDTO.get("unires_group_rels");
                    ArrayList lastUniRes = lastEntity.get("unires_group_rels");
                    Set<String> curResNames = curUniRes*.get("res_code") as Set
                    Set<String> lastResNames = lastUniRes*.get("res_code") as Set
                    if (lastResNames.containsAll(curResNames)) {
                        bIgnoreUpdate = true;
                    }else {
                        bIgnoreUpdate = false;
                        ArrayList mergedUniReses = lastResNames as List<Map>;
                        curUniRes.forEach({ uniRes ->
                            String resCode = uniRes.get("res_code");
                            if (!lastResNames.contains(resCode)) {
                                mergedUniReses.add(uniRes)
                            }
                        })
                        iEntityDTO.set("unires_group_rels", mergedUniReses);
                    }
                }
                if(!bIgnoreUpdate){
                    updateentityList.add(iEntityDTO);
                }
            }else {
                createentityList.add(iEntityDTO);
            }
        }


//        for(IEntityDTO iEntityDTO : createentityList) {
//            iDataEntityRuntime.fillEntityKeyValue(iEntityDTO);
//        }

        if(ObjectUtils.isEmpty(createentityList)&& ObjectUtils.isEmpty(updateentityList)){
            return;
        }
        UserContext.setCurrent(this.getSystemRuntime().createDefaultUserContext());
        try {
            iDataEntityRuntime.execute(new IAction() {
                @Override
                Object execute(Object[] args) throws Throwable {
                    if ( !ObjectUtils.isEmpty ( createentityList ) ) {
                        iDataEntityRuntime.rawCreate(createentityList, true);
                    }
                    if ( !ObjectUtils.isEmpty ( updateentityList ) ) {
//                        iDataEntityRuntime.rawUpdate(updateentityList, true);
                    }
                }
            },null, ITransactionalUtil.PROPAGATION_REQUIRED);
        }
        catch (Throwable ex) {
            log.error(String.format("同步权限组发生异常，%s", ex.getMessage()), ex);
        }
    }

}

```
### PSSysUniResSyncTool :id=PSSysUniResSyncTool


```cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil.PSSysUniResSyncTool```

```groovy
package cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil

import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.plugin.extension.sysutil.addin.PSDEModelSyncToolBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.model.dataentity.IPSDataEntity
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import net.ibizsys.runtime.security.SysUserRoleDefaultModes
import net.ibizsys.runtime.security.UserContext
import net.ibizsys.runtime.util.ActionSession
import net.ibizsys.runtime.util.ActionSessionManager
import net.ibizsys.runtime.util.IAction
import net.ibizsys.runtime.util.ITransactionalUtil
import net.ibizsys.runtime.util.KeyValueUtils
import org.apache.commons.logging.LogFactory
import org.springframework.util.ObjectUtils

import java.util.*;


public class PSSysUniResSyncTool extends PSDEModelSyncToolBase {

    @Override
    protected void onSync(IPSDataEntity iPSDataEntity, Object param) throws Throwable {
        Map<String, Object> params = null;
        if(param instanceof Map) {
            params = (Map)param;
        }

        List<Map> mapList = new ArrayList<Map>();
        IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());
        //插件中实体是否能安装
        this.getSystemRuntime().getPSSystem().getAllPSSysUniReses().forEach({ iPSSysUniRes ->
            //临时提供，此处考虑从实体运行时获取accessmanager然后获取defaultUserRoles
            Map<String, Object> obj = new LinkedHashMap<String, Object>();
            obj.put("name", iPSSysUniRes.getName());
            obj.put("display_name", iPSSysUniRes.getName());
            obj.put("res_code", iPSSysUniRes.getResCode());
            mapList.add(obj);
        })

        //查询历史数据
        Map<String, IEntityDTO> lastEntityDTOMap = null;

        IPSDEDataSet iPSDEDataSet = iDataEntityRuntime.getPSDEDataSetByTag(PSMODELSYNC_PREDEFINEDDATASET_PSMODELSYNC, true);
        if(iPSDEDataSet != null) {
            lastEntityDTOMap = new HashMap<String, IEntityDTO>();
            ISearchContextDTO iSearchContextDTO = iDataEntityRuntime.createSearchContext();
            iSearchContextDTO.all().count(false);
            List<IEntityDTO> list = iDataEntityRuntime.selectDataSet(iPSDEDataSet, iSearchContextDTO);
            for(IEntityDTO item : list) {
                String unionTag = String.format("%s", item.get("res_code"));
                lastEntityDTOMap.put(unionTag, item);
            }
        }

        //执行批保存
        List<IEntityDTO> updateentityList = new ArrayList<IEntityDTO>();
        List<IEntityDTO> createentityList = new ArrayList<IEntityDTO>();
        for(Map<String, Object> item : mapList) {
            IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity(item);
            String unionTag = String.format("%s", item.get("res_code"));
            if(lastEntityDTOMap != null && lastEntityDTOMap.containsKey(unionTag)) {
                IEntityDTO lastEntity = lastEntityDTOMap.get(unionTag);
                iEntityDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),lastEntity.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),null));
                updateentityList.add(iEntityDTO);
            }else {
                createentityList.add(iEntityDTO);
            }
        }


        for(IEntityDTO iEntityDTO : createentityList) {
            iDataEntityRuntime.fillEntityKeyValue(iEntityDTO);
        }

        if(ObjectUtils.isEmpty(createentityList)&& ObjectUtils.isEmpty(updateentityList)){
            return;
        }
        UserContext.setCurrent(this.getSystemRuntime().createDefaultUserContext());
        try {
            iDataEntityRuntime.execute(new IAction() {
                @Override
                Object execute(Object[] args) throws Throwable {
                    if ( !ObjectUtils.isEmpty ( createentityList ) ) {
                        iDataEntityRuntime.rawCreate(createentityList, true);
                    }
                    if ( !ObjectUtils.isEmpty ( updateentityList ) ) {
                        //iDataEntityRuntime.rawUpdate(updateentityList, true);
                    }
                }
            },null, ITransactionalUtil.PROPAGATION_REQUIRED);
        } catch (Throwable ex) {
            log.error(String.format("同步统一资源发生异常，%s", ex.getMessage()), ex);
        }
    }
}
```
### ResConfigSettingsDERuntime :id=ResConfigSettingsDERuntime
可考虑转为底包代码

```cn.ibizlab.central.plugin.odoo.dataentity.ResConfigSettingsDERuntime```

```groovy
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
```






