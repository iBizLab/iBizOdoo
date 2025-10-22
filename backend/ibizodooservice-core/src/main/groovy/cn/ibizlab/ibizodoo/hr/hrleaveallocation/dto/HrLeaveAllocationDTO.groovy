package cn.ibizlab.ibizodoo.hr.hrleaveallocation.dto

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
class HrLeaveAllocationDTO extends GroovyDTO<HrLeaveAllocationDTO> {

    /**
     * 「应计方案」
     */
    @JsonProperty("accrual_plan_id")
    String accrualPlanId
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
     * 「null」
     */
    @JsonProperty("actual_lastcall")
    Timestamp actualLastcall
    /**
     * 「分配类别」
     * 字典[分配类别]
     */
    @JsonProperty("allocation_type")
    String allocationType
    /**
     * 「已累计」
     * 字典[是否]
     */
    @JsonProperty("already_accrued")
    Integer alreadyAccrued
    /**
     * 「首次审批」
     */
    @JsonProperty("approver_id")
    String approverId
    /**
     * 「能批准」
     * 字典[是否]
     */
    @JsonProperty("can_approve")
    Integer canApprove
    /**
     * 「到期日期顺延天数」
     */
    @JsonProperty("carried_over_days_expiration_date")
    Timestamp carriedOverDaysExpirationDate
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
     * 「开始日期」
     */
    @JsonProperty("date_from")
    Timestamp dateFrom
    /**
     * 「结束日期」
     */
    @JsonProperty("date_to")
    Timestamp dateTo
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
     * 「分配 （天/小时）」
     */
    @JsonProperty("duration_display")
    String durationDisplay
    /**
     * 「公司」
     */
    @JsonProperty("employee_company_id")
    String employeeCompanyId
    /**
     * 「员工」
     */
    @JsonProperty("employee_id")
    String employeeId
    /**
     * 「将于 Carry_over_days_expiration_date 到期的结转天数」
     */
    @JsonProperty("expiring_carryover_days")
    Double expiringCarryoverDays
    /**
     * 「有消息」
     * 字典[是否]
     */
    @JsonProperty("has_message")
    Integer hasMessage
    /**
     * 「休假类型」
     */
    @JsonProperty("holiday_status_id")
    String holidayStatusId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称是否自订」
     * 字典[是否]
     */
    @JsonProperty("is_name_custom")
    Integer isNameCustom
    /**
     * 「主管」
     * 字典[是否]
     */
    @JsonProperty("is_officer")
    Integer isOfficer
    /**
     * 「null」
     */
    @JsonProperty("last_executed_carryover_date")
    Timestamp lastExecutedCarryoverDate
    /**
     * 「最后一次应计分配的日期」
     */
    @JsonProperty("lastcall")
    Timestamp lastcall
    /**
     * 「已休假」
     */
    @JsonProperty("leaves_taken")
    Double leavesTaken
    /**
     * 「管理员」
     */
    @JsonProperty("manager_id")
    String managerId
    /**
     * 「休假總額」
     */
    @JsonProperty("max_leaves")
    Double maxLeaves
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
     * 「具有有效性的描述」
     */
    @JsonProperty("name_validity")
    String nameValidity
    /**
     * 「下一次应计分配的日期」
     */
    @JsonProperty("nextcall")
    Timestamp nextcall
    /**
     * 「理由」
     */
    @JsonProperty("notes")
    String notes
    /**
     * 「天数」
     */
    @JsonProperty("number_of_days")
    Double numberOfDays
    /**
     * 「持续时间（天）」
     */
    @JsonProperty("number_of_days_display")
    Double numberOfDaysDisplay
    /**
     * 「时长(小时)」
     */
    @JsonProperty("number_of_hours_display")
    Double numberOfHoursDisplay
    /**
     * 「加班费免赔额」
     * 字典[是否]
     */
    @JsonProperty("overtime_deductible")
    Integer overtimeDeductible
    /**
     * 「加班时间」
     */
    @JsonProperty("overtime_id")
    String overtimeId
    /**
     * 「第二次审批」
     */
    @JsonProperty("second_approver_id")
    String secondApproverId
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「类型 申请单位」
     * 字典[类型 申请单位]
     */
    @JsonProperty("type_request_unit")
    String typeRequestUnit
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
     * 「null」
     */
    @JsonProperty("yearly_accrued_amount")
    Double yearlyAccruedAmount

    /**
     * 设置「应计方案」值
     * @param val
     */
    HrLeaveAllocationDTO setAccrualPlanId(String accrualPlanId) {
        this.accrualPlanId = accrualPlanId
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    HrLeaveAllocationDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    HrLeaveAllocationDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    HrLeaveAllocationDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    HrLeaveAllocationDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrLeaveAllocationDTO setActualLastcall(Timestamp actualLastcall) {
        this.actualLastcall = actualLastcall
        return this
    }


    /**
     * 设置「分配类别」值
     * 字典[分配类别]
     * @param val
     */
    HrLeaveAllocationDTO setAllocationType(String allocationType) {
        this.allocationType = allocationType
        return this
    }


    /**
     * 设置「已累计」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAllocationDTO setAlreadyAccrued(Integer alreadyAccrued) {
        this.alreadyAccrued = alreadyAccrued
        return this
    }


    /**
     * 设置「首次审批」值
     * @param val
     */
    HrLeaveAllocationDTO setApproverId(String approverId) {
        this.approverId = approverId
        return this
    }


    /**
     * 设置「能批准」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAllocationDTO setCanApprove(Integer canApprove) {
        this.canApprove = canApprove
        return this
    }


    /**
     * 设置「到期日期顺延天数」值
     * @param val
     */
    HrLeaveAllocationDTO setCarriedOverDaysExpirationDate(Timestamp carriedOverDaysExpirationDate) {
        this.carriedOverDaysExpirationDate = carriedOverDaysExpirationDate
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrLeaveAllocationDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveAllocationDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「开始日期」值
     * @param val
     */
    HrLeaveAllocationDTO setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    HrLeaveAllocationDTO setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrLeaveAllocationDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrLeaveAllocationDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「分配 （天/小时）」值
     * @param val
     */
    HrLeaveAllocationDTO setDurationDisplay(String durationDisplay) {
        this.durationDisplay = durationDisplay
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrLeaveAllocationDTO setEmployeeCompanyId(String employeeCompanyId) {
        this.employeeCompanyId = employeeCompanyId
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrLeaveAllocationDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「将于 Carry_over_days_expiration_date 到期的结转天数」值
     * @param val
     */
    HrLeaveAllocationDTO setExpiringCarryoverDays(Double expiringCarryoverDays) {
        this.expiringCarryoverDays = expiringCarryoverDays
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAllocationDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「休假类型」值
     * @param val
     */
    HrLeaveAllocationDTO setHolidayStatusId(String holidayStatusId) {
        this.holidayStatusId = holidayStatusId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrLeaveAllocationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称是否自订」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAllocationDTO setIsNameCustom(Integer isNameCustom) {
        this.isNameCustom = isNameCustom
        return this
    }


    /**
     * 设置「主管」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAllocationDTO setIsOfficer(Integer isOfficer) {
        this.isOfficer = isOfficer
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrLeaveAllocationDTO setLastExecutedCarryoverDate(Timestamp lastExecutedCarryoverDate) {
        this.lastExecutedCarryoverDate = lastExecutedCarryoverDate
        return this
    }


    /**
     * 设置「最后一次应计分配的日期」值
     * @param val
     */
    HrLeaveAllocationDTO setLastcall(Timestamp lastcall) {
        this.lastcall = lastcall
        return this
    }


    /**
     * 设置「已休假」值
     * @param val
     */
    HrLeaveAllocationDTO setLeavesTaken(Double leavesTaken) {
        this.leavesTaken = leavesTaken
        return this
    }


    /**
     * 设置「管理员」值
     * @param val
     */
    HrLeaveAllocationDTO setManagerId(String managerId) {
        this.managerId = managerId
        return this
    }


    /**
     * 设置「休假總額」值
     * @param val
     */
    HrLeaveAllocationDTO setMaxLeaves(Double maxLeaves) {
        this.maxLeaves = maxLeaves
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrLeaveAllocationDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAllocationDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    HrLeaveAllocationDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAllocationDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAllocationDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAllocationDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    HrLeaveAllocationDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    HrLeaveAllocationDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrLeaveAllocationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「具有有效性的描述」值
     * @param val
     */
    HrLeaveAllocationDTO setNameValidity(String nameValidity) {
        this.nameValidity = nameValidity
        return this
    }


    /**
     * 设置「下一次应计分配的日期」值
     * @param val
     */
    HrLeaveAllocationDTO setNextcall(Timestamp nextcall) {
        this.nextcall = nextcall
        return this
    }


    /**
     * 设置「理由」值
     * @param val
     */
    HrLeaveAllocationDTO setNotes(String notes) {
        this.notes = notes
        return this
    }


    /**
     * 设置「天数」值
     * @param val
     */
    HrLeaveAllocationDTO setNumberOfDays(Double numberOfDays) {
        this.numberOfDays = numberOfDays
        return this
    }


    /**
     * 设置「持续时间（天）」值
     * @param val
     */
    HrLeaveAllocationDTO setNumberOfDaysDisplay(Double numberOfDaysDisplay) {
        this.numberOfDaysDisplay = numberOfDaysDisplay
        return this
    }


    /**
     * 设置「时长(小时)」值
     * @param val
     */
    HrLeaveAllocationDTO setNumberOfHoursDisplay(Double numberOfHoursDisplay) {
        this.numberOfHoursDisplay = numberOfHoursDisplay
        return this
    }


    /**
     * 设置「加班费免赔额」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAllocationDTO setOvertimeDeductible(Integer overtimeDeductible) {
        this.overtimeDeductible = overtimeDeductible
        return this
    }


    /**
     * 设置「加班时间」值
     * @param val
     */
    HrLeaveAllocationDTO setOvertimeId(String overtimeId) {
        this.overtimeId = overtimeId
        return this
    }


    /**
     * 设置「第二次审批」值
     * @param val
     */
    HrLeaveAllocationDTO setSecondApproverId(String secondApproverId) {
        this.secondApproverId = secondApproverId
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    HrLeaveAllocationDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「类型 申请单位」值
     * 字典[类型 申请单位]
     * @param val
     */
    HrLeaveAllocationDTO setTypeRequestUnit(String typeRequestUnit) {
        this.typeRequestUnit = typeRequestUnit
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrLeaveAllocationDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveAllocationDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrLeaveAllocationDTO setYearlyAccruedAmount(Double yearlyAccruedAmount) {
        this.yearlyAccruedAmount = yearlyAccruedAmount
        return this
    }

}
