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