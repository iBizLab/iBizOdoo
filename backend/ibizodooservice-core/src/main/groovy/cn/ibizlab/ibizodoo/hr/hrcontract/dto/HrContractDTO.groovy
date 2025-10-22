package cn.ibizlab.ibizodoo.hr.hrcontract.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class HrContractDTO extends GroovyDTO<HrContractDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「下一活动截止日期」
     */
    @JsonProperty("activity_date_deadline")
    Timestamp activityDateDeadline
    /**
     * 「活动异常标示」
     * 字典[活动异常标示]
     */
    @JsonProperty("activity_exception_decoration")
    String activityExceptionDecoration
    /**
     * 「图标」
     */
    @JsonProperty("activity_exception_icon")
    String activityExceptionIcon
    /**
     * 「活动状态」
     * 字典[活动状态]
     */
    @JsonProperty("activity_state")
    String activityState
    /**
     * 「日历不匹配」
     * 字典[是否]
     */
    @JsonProperty("calendar_mismatch")
    Integer calendarMismatch
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「合同类型」
     */
    @JsonProperty("contract_type_id")
    String contractTypeId
    /**
     * 「合同工资」
     */
    @JsonProperty("contract_wage")
    BigDecimal contractWage
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「结束日期」
     */
    @JsonProperty("date_end")
    Timestamp dateEnd
    /**
     * 「开始日期」
     */
    @JsonProperty("date_start")
    Timestamp dateStart
    /**
     * 「部门」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「员工」
     */
    @JsonProperty("employee_id")
    String employeeId
    /**
     * 「有消息」
     * 字典[是否]
     */
    @JsonProperty("has_message")
    Integer hasMessage
    /**
     * 「人力资源主管」
     */
    @JsonProperty("hr_responsible_id")
    String hrResponsibleId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「工作岗位」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「看板状态」
     * 字典[看板状态]
     */
    @JsonProperty("kanban_state")
    String kanbanState
    /**
     * 「附件数量」
     */
    @JsonProperty("message_attachment_count")
    Integer messageAttachmentCount
    /**
     * 「消息发送错误」
     * 字典[是否]
     */
    @JsonProperty("message_has_error")
    Integer messageHasError
    /**
     * 「错误数量」
     */
    @JsonProperty("message_has_error_counter")
    Integer messageHasErrorCounter
    /**
     * 「短信发送错误」
     * 字典[是否]
     */
    @JsonProperty("message_has_sms_error")
    Integer messageHasSmsError
    /**
     * 「是关注者」
     * 字典[是否]
     */
    @JsonProperty("message_is_follower")
    Integer messageIsFollower
    /**
     * 「所需操作」
     * 字典[是否]
     */
    @JsonProperty("message_needaction")
    Integer messageNeedaction
    /**
     * 「操作数量」
     */
    @JsonProperty("message_needaction_counter")
    Integer messageNeedactionCounter
    /**
     * 「我的活动截止时间」
     */
    @JsonProperty("my_activity_date_deadline")
    Timestamp myActivityDateDeadline
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「备注」
     */
    @JsonProperty("notes")
    String notes
    /**
     * 「工作安排」
     */
    @JsonProperty("resource_calendar_id")
    String resourceCalendarId
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「工资结构类型」
     */
    @JsonProperty("structure_type_id")
    String structureTypeId
    /**
     * 「试用期结束」
     */
    @JsonProperty("trial_date_end")
    Timestamp trialDateEnd
    /**
     * 「工资」
     */
    @JsonProperty("wage")
    BigDecimal wage
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("write_uid")
    String writeUid

    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    HrContractDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    HrContractDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    HrContractDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    HrContractDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    HrContractDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「日历不匹配」值
     * 字典[是否]
     * @param val
     */
    HrContractDTO setCalendarMismatch(Integer calendarMismatch) {
        this.calendarMismatch = calendarMismatch
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrContractDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「合同类型」值
     * @param val
     */
    HrContractDTO setContractTypeId(String contractTypeId) {
        this.contractTypeId = contractTypeId
        return this
    }


    /**
     * 设置「合同工资」值
     * @param val
     */
    HrContractDTO setContractWage(BigDecimal contractWage) {
        this.contractWage = contractWage
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrContractDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrContractDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    HrContractDTO setDateEnd(Timestamp dateEnd) {
        this.dateEnd = dateEnd
        return this
    }


    /**
     * 设置「开始日期」值
     * @param val
     */
    HrContractDTO setDateStart(Timestamp dateStart) {
        this.dateStart = dateStart
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrContractDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrContractDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrContractDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    HrContractDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「人力资源主管」值
     * @param val
     */
    HrContractDTO setHrResponsibleId(String hrResponsibleId) {
        this.hrResponsibleId = hrResponsibleId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrContractDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「工作岗位」值
     * @param val
     */
    HrContractDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「看板状态」值
     * 字典[看板状态]
     * @param val
     */
    HrContractDTO setKanbanState(String kanbanState) {
        this.kanbanState = kanbanState
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrContractDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    HrContractDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    HrContractDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    HrContractDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    HrContractDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    HrContractDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    HrContractDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    HrContractDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrContractDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    HrContractDTO setNotes(String notes) {
        this.notes = notes
        return this
    }


    /**
     * 设置「工作安排」值
     * @param val
     */
    HrContractDTO setResourceCalendarId(String resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    HrContractDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「工资结构类型」值
     * @param val
     */
    HrContractDTO setStructureTypeId(String structureTypeId) {
        this.structureTypeId = structureTypeId
        return this
    }


    /**
     * 设置「试用期结束」值
     * @param val
     */
    HrContractDTO setTrialDateEnd(Timestamp trialDateEnd) {
        this.trialDateEnd = trialDateEnd
        return this
    }


    /**
     * 设置「工资」值
     * @param val
     */
    HrContractDTO setWage(BigDecimal wage) {
        this.wage = wage
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrContractDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrContractDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
