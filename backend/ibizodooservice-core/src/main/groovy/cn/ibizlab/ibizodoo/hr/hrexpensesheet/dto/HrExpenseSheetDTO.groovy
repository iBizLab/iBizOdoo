package cn.ibizlab.ibizodoo.hr.hrexpensesheet.dto

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
class HrExpenseSheetDTO extends GroovyDTO<HrExpenseSheetDTO> {

    /**
     * 「费用报表日期」
     */
    @JsonProperty("accounting_date")
    Timestamp accountingDate
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
     * 「到期金额」
     */
    @JsonProperty("amount_residual")
    BigDecimal amountResidual
    /**
     * 「审批日期」
     */
    @JsonProperty("approval_date")
    Timestamp approvalDate
    /**
     * 「审批状态」
     * 字典[审批状态]
     */
    @JsonProperty("approval_state")
    String approvalState
    /**
     * 「能批准」
     * 字典[是否]
     */
    @JsonProperty("can_approve")
    Integer canApprove
    /**
     * 「可重置」
     * 字典[是否]
     */
    @JsonProperty("can_reset")
    Integer canReset
    /**
     * 「无法批准原因」
     */
    @JsonProperty("cannot_approve_reason")
    String cannotApproveReason
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
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
     * 「币别」
     */
    @JsonProperty("currency_id")
    String currencyId
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「当前用户可编辑费用项目」
     * 字典[是否]
     */
    @JsonProperty("is_editable")
    Integer isEditable
    /**
     * 「处理明细中有不同的币别」
     * 字典[是否]
     */
    @JsonProperty("is_multiple_currency")
    Integer isMultipleCurrency
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
     * 「主要附件」
     */
    @JsonProperty("message_main_attachment_id")
    String messageMainAttachmentId
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
     * 「日记账分录编码」
     */
    @JsonProperty("nb_account_move")
    Integer nbAccountMove
    /**
     * 「费用的数量」
     */
    @JsonProperty("nb_expense")
    Integer nbExpense
    /**
     * 「销售订单计数」
     */
    @JsonProperty("sale_order_count")
    Integer saleOrderCount
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「总计」
     */
    @JsonProperty("total_amount")
    BigDecimal totalAmount
    /**
     * 「税项」
     */
    @JsonProperty("total_tax_amount")
    BigDecimal totalTaxAmount
    /**
     * 「未税金额」
     */
    @JsonProperty("untaxed_amount")
    BigDecimal untaxedAmount
    /**
     * 「管理员」
     */
    @JsonProperty("user_id")
    String userId
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
     * 设置「费用报表日期」值
     * @param val
     */
    HrExpenseSheetDTO setAccountingDate(Timestamp accountingDate) {
        this.accountingDate = accountingDate
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    HrExpenseSheetDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    HrExpenseSheetDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    HrExpenseSheetDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    HrExpenseSheetDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「到期金额」值
     * @param val
     */
    HrExpenseSheetDTO setAmountResidual(BigDecimal amountResidual) {
        this.amountResidual = amountResidual
        return this
    }


    /**
     * 设置「审批日期」值
     * @param val
     */
    HrExpenseSheetDTO setApprovalDate(Timestamp approvalDate) {
        this.approvalDate = approvalDate
        return this
    }


    /**
     * 设置「审批状态」值
     * 字典[审批状态]
     * @param val
     */
    HrExpenseSheetDTO setApprovalState(String approvalState) {
        this.approvalState = approvalState
        return this
    }


    /**
     * 设置「能批准」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSheetDTO setCanApprove(Integer canApprove) {
        this.canApprove = canApprove
        return this
    }


    /**
     * 设置「可重置」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSheetDTO setCanReset(Integer canReset) {
        this.canReset = canReset
        return this
    }


    /**
     * 设置「无法批准原因」值
     * @param val
     */
    HrExpenseSheetDTO setCannotApproveReason(String cannotApproveReason) {
        this.cannotApproveReason = cannotApproveReason
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrExpenseSheetDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrExpenseSheetDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrExpenseSheetDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「币别」值
     * @param val
     */
    HrExpenseSheetDTO setCurrencyId(String currencyId) {
        this.currencyId = currencyId
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrExpenseSheetDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrExpenseSheetDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrExpenseSheetDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSheetDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrExpenseSheetDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「当前用户可编辑费用项目」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSheetDTO setIsEditable(Integer isEditable) {
        this.isEditable = isEditable
        return this
    }


    /**
     * 设置「处理明细中有不同的币别」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSheetDTO setIsMultipleCurrency(Integer isMultipleCurrency) {
        this.isMultipleCurrency = isMultipleCurrency
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrExpenseSheetDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSheetDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    HrExpenseSheetDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSheetDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSheetDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「主要附件」值
     * @param val
     */
    HrExpenseSheetDTO setMessageMainAttachmentId(String messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSheetDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    HrExpenseSheetDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    HrExpenseSheetDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrExpenseSheetDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「日记账分录编码」值
     * @param val
     */
    HrExpenseSheetDTO setNbAccountMove(Integer nbAccountMove) {
        this.nbAccountMove = nbAccountMove
        return this
    }


    /**
     * 设置「费用的数量」值
     * @param val
     */
    HrExpenseSheetDTO setNbExpense(Integer nbExpense) {
        this.nbExpense = nbExpense
        return this
    }


    /**
     * 设置「销售订单计数」值
     * @param val
     */
    HrExpenseSheetDTO setSaleOrderCount(Integer saleOrderCount) {
        this.saleOrderCount = saleOrderCount
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    HrExpenseSheetDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「总计」值
     * @param val
     */
    HrExpenseSheetDTO setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount
        return this
    }


    /**
     * 设置「税项」值
     * @param val
     */
    HrExpenseSheetDTO setTotalTaxAmount(BigDecimal totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount
        return this
    }


    /**
     * 设置「未税金额」值
     * @param val
     */
    HrExpenseSheetDTO setUntaxedAmount(BigDecimal untaxedAmount) {
        this.untaxedAmount = untaxedAmount
        return this
    }


    /**
     * 设置「管理员」值
     * @param val
     */
    HrExpenseSheetDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrExpenseSheetDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrExpenseSheetDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
