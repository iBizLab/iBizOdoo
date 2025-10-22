package cn.ibizlab.ibizodoo.mail.mailtrackingdurationmixin.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[MAIL_TRACKING_DURATION_MIXIN]处理逻辑[计算跟踪属性耗时]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class ComputeDurationTracking extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(ComputeDurationTracking.class)

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
                //执行逻辑节点[构造查询条件]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "BINDPARAM_01":
                //执行逻辑节点[绑定跟踪属性参数]
                executeBindparam01(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_01":
                //执行逻辑节点[查询邮件跟踪值数据集]
                executeDedataset01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[回填属性跟踪耗时结构对象]
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
     * 执行逻辑节点[构造查询条件]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            // 获取默认参数对象
			def _default = logic.param("Default").getReal()
			// 获取过滤器参数实际对象
			def filterEntity = logic.param("filterParam").getReal()
			
			// 获取子实体运行时
			def childDataDataEntityRuntime = net.ibizsys.runtime.util.DataEntityRuntimeHolder.peekChildDataEntityRuntime()
			
			//获取跟踪属性名
			def filterField = "__None__"
			def psDEFieldList = childDataDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
			if(!org.springframework.util.ObjectUtils.isEmpty(psDEFieldList)) {
			  for(def iPSDEField : psDEFieldList) {
			      String strTag = iPSDEField.getFieldTag();
			      if (!org.springframework.util.StringUtils.hasLength(strTag)) {
			          continue;
			      }
			      if("DURATION_TRACK".equals(strTag)){
			        filterField = iPSDEField.getName();
			        break;
			      }
			  }
			}
			
			// 直接设置属性值
			filterEntity.set("n_res_id_eq", _default.get("id"))
			filterEntity.set("n_model_eq", childDataDataEntityRuntime.getName())
			filterEntity.set("n_field_id_eq", filterField)
			filterEntity.set("size", 100)
			
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
     * 执行逻辑节点[绑定跟踪属性参数]，逻辑类型[BINDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBindparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[查询邮件跟踪值数据集]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[回填属性跟踪耗时结构对象]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            // 获取默认参数对象
			def _default = logic.param("Default").getReal()
			def resultList = logic.param("resultList").getReal()
			def tracking_field = logic.param("tracking_field").getReal()
			def durationMap = [:]
			def trackValueList = []
			trackValueList.addAll(resultList)
			 // 添加当前值的“假”跟踪记录
			 if(_default.get(tracking_field)){
			    trackValueList.add([
			        create_date: net.ibizsys.runtime.util.DateUtils.getCurTime(),
			        old_value_char: _default.get(tracking_field)
			    ])
			}
			def previousDate = _default.get("create_date").toLocalDateTime()
			// 计算每个阶段的持续时间
			trackValueList.each { tracking ->
			    def oldId = tracking.old_value_char
			    def createDate = tracking.create_date.toLocalDateTime()
			
			    long duration = java.time.temporal.ChronoUnit.SECONDS.between(previousDate, createDate)
			    durationMap.putIfAbsent(oldId, 0L)
			    durationMap[oldId] += duration
			
			    previousDate = createDate
			}
			_default.set("duration_tracking",durationMap)
			
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

