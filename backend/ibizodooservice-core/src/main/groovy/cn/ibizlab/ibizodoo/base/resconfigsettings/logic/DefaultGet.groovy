package cn.ibizlab.ibizodoo.base.resconfigsettings.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[RES_CONFIG_SETTINGS]处理逻辑[默认获取数据逻辑]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class DefaultGet extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(DefaultGet.class)

    @Override
	protected void onInit() throws Exception {
		super.onInit()
	}

    @Override
    protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        switch (iPSDELogicNode.getCodeName()) {
            case "Begin":
                //执行逻辑节点[开始]
                executeBegin(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[分类属性]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_01":
                //执行逻辑节点[准备config过滤参数]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_01":
                //执行逻辑节点[获取parameter数据]
                executeDedataset01(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_01":
                //执行逻辑节点[循环子调用]
                executeLoopsubcall01(iDELogicSession, iPSDELogicNode)
                break
            case "END_02":
                //执行逻辑节点[结束]
                executeEnd02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[回写参数]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
                break
            default:
                super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode)
        }
    }

    /**
     * 执行逻辑节点[开始]，逻辑类型[BEGIN]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBegin(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[分类属性]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
              def defaultListParam = []
			  def moduleListParam= []
			  def groupListParam= []
			  def  configListParam= []
			  
			  // 获取实体运行时对象（通过逻辑参数中的实体参数）
			  def _default = logic.param("Default")
			  def entityRuntime = _default.getDataEntityRuntime()
			  
			  // 遍历属性进行分类
			  entityRuntime.getPSDEFields(true).each { field ->
			    def _name = field.getName()
			    def fieldtag = field.getUserTag()
			    if(_name.startsWith('default_')) {
			      defaultListParam.add(_name)
			    } else if(_name.startsWith('module_')) {
			      moduleListParam.add(_name)
			    } else if(_name.startsWith('group_')) {
			      groupListParam.add(_name)
			    } else if(fieldtag != null && fieldtag.startsWith('config_parameter')) {
			      configListParam.add(_name)
			    }
			  }
			  
			  // 绑定更新后的列表到参数（如果需要显式绑定）
			  logic.param("defaultList").bind(defaultListParam)
			  logic.param("moduleList").bind(moduleListParam)
			  logic.param("groupList").bind(groupListParam)
			  logic.param("configList").bind(configListParam)
			
        }.call(iDELogicSession.getDELogicRuntime().getSystemRuntime(), iDELogicSession.getDELogicRuntime())
        //设置返回值
        iDELogicSession.setLastReturn(objRet);
        if(iPSDELogicNode.getRetPSDELogicParam() != null) {
            def retDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNode.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
        //super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备config过滤参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取parameter数据]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[循环子调用]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLoopsubcall01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEnd02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[回写参数]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param("Default").getReal()
			def parameter_temp = logic.param("parameter_temp").getReal()
			_default.set(parameter_temp.get("key"),parameter_temp.get("value"))
        }.call(iDELogicSession.getDELogicRuntime().getSystemRuntime(), iDELogicSession.getDELogicRuntime())
        //设置返回值
        iDELogicSession.setLastReturn(objRet);
        if(iPSDELogicNode.getRetPSDELogicParam() != null) {
            def retDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNode.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
        //super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEnd01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

