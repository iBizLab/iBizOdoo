package cn.ibizlab.ibizodoo.hr.hrexpense.dto

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
class HrExpenseDTO extends GroovyDTO<HrExpenseDTO> {

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
     * 「分析精度」
     */
    @JsonProperty("analytic_precision")
    Integer analyticPrecision
    /**
     * 「可重开结算单」
     * 字典[是否]
     */
    @JsonProperty("can_be_reinvoiced")
    Integer canBeReinvoiced
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
     * 「汇率」
     */
    @JsonProperty("currency_rate")
    Double currencyRate
    /**
     * 「费用日期」
     */
    @JsonProperty("date")
    Timestamp date
    /**
     * 「内部说明」
     */
    @JsonProperty("description")
    String description
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
     * 「可由当前用户编辑」
     * 字典[是否]
     */
    @JsonProperty("is_editable")
    Integer isEditable
    /**
     * 「currency_id是否与company_currency_id不同？」
     * 字典[是否]
     */
    @JsonProperty("is_multiple_currency")
    Integer isMultipleCurrency
    /**
     * 「标签币别汇率」
     */
    @JsonProperty("label_currency_rate")
    String labelCurrencyRate
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
     * 「附件数量」
     */
    @JsonProperty("nb_attachment")
    Integer nbAttachment
    /**
     * 「支付」
     * 字典[支付]
     */
    @JsonProperty("payment_mode")
    String paymentMode
    /**
     * 「单价」
     */
    @JsonProperty("price_unit")
    Double priceUnit
    /**
     * 「产品说明」
     */
    @JsonProperty("product_description")
    String productDescription
    /**
     * 「产品有成本」
     * 字典[是否]
     */
    @JsonProperty("product_has_cost")
    Integer productHasCost
    /**
     * 「是否对所选产品定义税费」
     * 字典[是否]
     */
    @JsonProperty("product_has_tax")
    Integer productHasTax
    /**
     * 「数量」
     */
    @JsonProperty("quantity")
    Double quantity
    /**
     * 「费用报表」
     */
    @JsonProperty("sheet_id")
    String sheetId
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「税金金额」
     */
    @JsonProperty("tax_amount")
    BigDecimal taxAmount
    /**
     * 「以币别计的税额」
     */
    @JsonProperty("tax_amount_currency")
    BigDecimal taxAmountCurrency
    /**
     * 「总计」
     */
    @JsonProperty("total_amount")
    BigDecimal totalAmount
    /**
     * 「按币别合计」
     */
    @JsonProperty("total_amount_currency")
    BigDecimal totalAmountCurrency
    /**
     * 「以币别计算的未税总额」
     */
    @JsonProperty("untaxed_amount_currency")
    BigDecimal untaxedAmountCurrency
    /**
     * 「供应商」
     */
    @JsonProperty("vendor_id")
    String vendorId
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
     * 设置「下一活动截止日期」值
     * @param val
     */
    HrExpenseDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    HrExpenseDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    HrExpenseDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    HrExpenseDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「分析精度」值
     * @param val
     */
    HrExpenseDTO setAnalyticPrecision(Integer analyticPrecision) {
        this.analyticPrecision = analyticPrecision
        return this
    }


    /**
     * 设置「可重开结算单」值
     * 字典[是否]
     * @param val
     */
    HrExpenseDTO setCanBeReinvoiced(Integer canBeReinvoiced) {
        this.canBeReinvoiced = canBeReinvoiced
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrExpenseDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrExpenseDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrExpenseDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「币别」值
     * @param val
     */
    HrExpenseDTO setCurrencyId(String currencyId) {
        this.currencyId = currencyId
        return this
    }


    /**
     * 设置「汇率」值
     * @param val
     */
    HrExpenseDTO setCurrencyRate(Double currencyRate) {
        this.currencyRate = currencyRate
        return this
    }


    /**
     * 设置「费用日期」值
     * @param val
     */
    HrExpenseDTO setDate(Timestamp date) {
        this.date = date
        return this
    }


    /**
     * 设置「内部说明」值
     * @param val
     */
    HrExpenseDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrExpenseDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrExpenseDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    HrExpenseDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrExpenseDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「可由当前用户编辑」值
     * 字典[是否]
     * @param val
     */
    HrExpenseDTO setIsEditable(Integer isEditable) {
        this.isEditable = isEditable
        return this
    }


    /**
     * 设置「currency_id是否与company_currency_id不同？」值
     * 字典[是否]
     * @param val
     */
    HrExpenseDTO setIsMultipleCurrency(Integer isMultipleCurrency) {
        this.isMultipleCurrency = isMultipleCurrency
        return this
    }


    /**
     * 设置「标签币别汇率」值
     * @param val
     */
    HrExpenseDTO setLabelCurrencyRate(String labelCurrencyRate) {
        this.labelCurrencyRate = labelCurrencyRate
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrExpenseDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    HrExpenseDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    HrExpenseDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    HrExpenseDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    HrExpenseDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「主要附件」值
     * @param val
     */
    HrExpenseDTO setMessageMainAttachmentId(String messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    HrExpenseDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    HrExpenseDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    HrExpenseDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrExpenseDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrExpenseDTO setNbAttachment(Integer nbAttachment) {
        this.nbAttachment = nbAttachment
        return this
    }


    /**
     * 设置「支付」值
     * 字典[支付]
     * @param val
     */
    HrExpenseDTO setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode
        return this
    }


    /**
     * 设置「单价」值
     * @param val
     */
    HrExpenseDTO setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit
        return this
    }


    /**
     * 设置「产品说明」值
     * @param val
     */
    HrExpenseDTO setProductDescription(String productDescription) {
        this.productDescription = productDescription
        return this
    }


    /**
     * 设置「产品有成本」值
     * 字典[是否]
     * @param val
     */
    HrExpenseDTO setProductHasCost(Integer productHasCost) {
        this.productHasCost = productHasCost
        return this
    }


    /**
     * 设置「是否对所选产品定义税费」值
     * 字典[是否]
     * @param val
     */
    HrExpenseDTO setProductHasTax(Integer productHasTax) {
        this.productHasTax = productHasTax
        return this
    }


    /**
     * 设置「数量」值
     * @param val
     */
    HrExpenseDTO setQuantity(Double quantity) {
        this.quantity = quantity
        return this
    }


    /**
     * 设置「费用报表」值
     * @param val
     */
    HrExpenseDTO setSheetId(String sheetId) {
        this.sheetId = sheetId
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    HrExpenseDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「税金金额」值
     * @param val
     */
    HrExpenseDTO setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount
        return this
    }


    /**
     * 设置「以币别计的税额」值
     * @param val
     */
    HrExpenseDTO setTaxAmountCurrency(BigDecimal taxAmountCurrency) {
        this.taxAmountCurrency = taxAmountCurrency
        return this
    }


    /**
     * 设置「总计」值
     * @param val
     */
    HrExpenseDTO setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount
        return this
    }


    /**
     * 设置「按币别合计」值
     * @param val
     */
    HrExpenseDTO setTotalAmountCurrency(BigDecimal totalAmountCurrency) {
        this.totalAmountCurrency = totalAmountCurrency
        return this
    }


    /**
     * 设置「以币别计算的未税总额」值
     * @param val
     */
    HrExpenseDTO setUntaxedAmountCurrency(BigDecimal untaxedAmountCurrency) {
        this.untaxedAmountCurrency = untaxedAmountCurrency
        return this
    }


    /**
     * 设置「供应商」值
     * @param val
     */
    HrExpenseDTO setVendorId(String vendorId) {
        this.vendorId = vendorId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrExpenseDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrExpenseDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
