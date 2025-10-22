package cn.ibizlab.ibizodoo.crm.crmlead.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.ibizodoo.mail.mailactivity.dto.MailActivityDTO
import cn.ibizlab.ibizodoo.base.irattachment.dto.IrAttachmentDTO
import cn.ibizlab.ibizodoo.mail.mailfollowers.dto.MailFollowersDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class CrmLeadDTO extends GroovyDTO<CrmLeadDTO> {

    /**
     * 「状态时间」
     */
    @JsonProperty("duration_tracking")
    IEntity durationTracking
    /**
     * 「活动集合」
     */
    @JsonProperty("activities")
    List<MailActivityDTO> activities
    /**
     * 「附件集合」
     */
    @JsonProperty("attachments")
    List<IrAttachmentDTO> attachments
    /**
     * 「关注者」
     */
    @JsonProperty("followers")
    List<MailFollowersDTO> followers
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
     * 「自动概率」
     */
    @JsonProperty("automated_probability")
    Double automatedProbability
    /**
     * 「城市」
     */
    @JsonProperty("city")
    String city
    /**
     * 「颜色索引」
     */
    @JsonProperty("color")
    Integer color
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「联系人姓名」
     */
    @JsonProperty("contact_name")
    String contactName
    /**
     * 「国家/地区」
     */
    @JsonProperty("country_id")
    String countryId
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
     * 「最后操作」
     */
    @JsonProperty("date_automation_last")
    Timestamp dateAutomationLast
    /**
     * 「关闭日期」
     */
    @JsonProperty("date_closed")
    Timestamp dateClosed
    /**
     * 「转化日期」
     */
    @JsonProperty("date_conversion")
    Timestamp dateConversion
    /**
     * 「预期结束」
     */
    @JsonProperty("date_deadline")
    Timestamp dateDeadline
    /**
     * 「最后阶段更新」
     */
    @JsonProperty("date_last_stage_update")
    Timestamp dateLastStageUpdate
    /**
     * 「指派日期」
     */
    @JsonProperty("date_open")
    Timestamp dateOpen
    /**
     * 「待关闭天数」
     */
    @JsonProperty("day_close")
    Double dayClose
    /**
     * 「待分配天数」
     */
    @JsonProperty("day_open")
    Double dayOpen
    /**
     * 「备注」
     */
    @JsonProperty("description")
    String description
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「潜在的重复线索数量」
     */
    @JsonProperty("duplicate_lead_count")
    Integer duplicateLeadCount
    /**
     * 「电子邮件抄送」
     */
    @JsonProperty("email_cc")
    String emailCc
    /**
     * 「电子邮箱域名标准」
     */
    @JsonProperty("email_domain_criterion")
    String emailDomainCriterion
    /**
     * 「电子邮件」
     */
    @JsonProperty("email_from")
    String emailFrom
    /**
     * 「规范化电子邮件」
     */
    @JsonProperty("email_normalized")
    String emailNormalized
    /**
     * 「电子邮件质量」
     * 字典[电子邮件质量]
     */
    @JsonProperty("email_state")
    String emailState
    /**
     * 「预期收入」
     */
    @JsonProperty("expected_revenue")
    BigDecimal expectedRevenue
    /**
     * 「工作岗位」
     */
    @JsonProperty("function")
    String function
    /**
     * 「有消息」
     * 字典[是否]
     */
    @JsonProperty("has_message")
    Integer hasMessage
    /**
     * 「丰富结束」
     * 字典[是否]
     */
    @JsonProperty("iap_enrich_done")
    Integer iapEnrichDone
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「是自动概率？」
     * 字典[是否]
     */
    @JsonProperty("is_automated_probability")
    Integer isAutomatedProbability
    /**
     * 「黑名单」
     * 字典[是否]
     */
    @JsonProperty("is_blacklisted")
    Integer isBlacklisted
    /**
     * 「是可见合作伙伴」
     * 字典[是否]
     */
    @JsonProperty("is_partner_visible")
    Integer isPartnerVisible
    /**
     * 「有效语言数量」
     */
    @JsonProperty("lang_active_count")
    Integer langActiveCount
    /**
     * 「语言」
     */
    @JsonProperty("lang_id")
    String langId
    /**
     * 「线索挖掘申请」
     */
    @JsonProperty("lead_mining_request_id")
    String leadMiningRequestId
    /**
     * 「丢失原因」
     */
    @JsonProperty("lost_reason_id")
    String lostReasonId
    /**
     * 「会议显示日期」
     */
    @JsonProperty("meeting_display_date")
    Timestamp meetingDisplayDate
    /**
     * 「会议显示标签」
     */
    @JsonProperty("meeting_display_label")
    String meetingDisplayLabel
    /**
     * 「附件数量」
     */
    @JsonProperty("message_attachment_count")
    Integer messageAttachmentCount
    /**
     * 「退回」
     */
    @JsonProperty("message_bounce")
    Integer messageBounce
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
     * 「手机号码」
     */
    @JsonProperty("mobile")
    String mobile
    /**
     * 「列入黑名单的电话号码是手机号码」
     * 字典[是否]
     */
    @JsonProperty("mobile_blacklisted")
    Integer mobileBlacklisted
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
     * 「合作伙伴电子邮箱将更新」
     * 字典[是否]
     */
    @JsonProperty("partner_email_update")
    Integer partnerEmailUpdate
    /**
     * 「客户」
     */
    @JsonProperty("partner_id")
    String partnerId
    /**
     * 「公司名称」
     */
    @JsonProperty("partner_name")
    String partnerName
    /**
     * 「合作伙伴电话号码将更新」
     * 字典[是否]
     */
    @JsonProperty("partner_phone_update")
    Integer partnerPhoneUpdate
    /**
     * 「电话号码」
     */
    @JsonProperty("phone")
    String phone
    /**
     * 「列入黑名单的电话是电话」
     * 字典[是否]
     */
    @JsonProperty("phone_blacklisted")
    Integer phoneBlacklisted
    /**
     * 「电话号码/手机号码」
     */
    @JsonProperty("phone_mobile_search")
    String phoneMobileSearch
    /**
     * 「已净化号码」
     */
    @JsonProperty("phone_sanitized")
    String phoneSanitized
    /**
     * 「电话号码已被列入黑名单」
     * 字典[是否]
     */
    @JsonProperty("phone_sanitized_blacklisted")
    Integer phoneSanitizedBlacklisted
    /**
     * 「电话号码质量」
     * 字典[电话号码质量]
     */
    @JsonProperty("phone_state")
    String phoneState
    /**
     * 「优先级」
     * 字典[优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「概率」
     */
    @JsonProperty("probability")
    Double probability
    /**
     * 「按比例分配的收入」
     */
    @JsonProperty("prorated_revenue")
    BigDecimal proratedRevenue
    /**
     * 「报价的数量」
     */
    @JsonProperty("quotation_count")
    Integer quotationCount
    /**
     * 「经常性收入」
     */
    @JsonProperty("recurring_revenue")
    BigDecimal recurringRevenue
    /**
     * 「预期 MRR」
     */
    @JsonProperty("recurring_revenue_monthly")
    BigDecimal recurringRevenueMonthly
    /**
     * 「按比例分配的 MRR」
     */
    @JsonProperty("recurring_revenue_monthly_prorated")
    BigDecimal recurringRevenueMonthlyProrated
    /**
     * 「按比例分配的经常性收入」
     */
    @JsonProperty("recurring_revenue_prorated")
    BigDecimal recurringRevenueProrated
    /**
     * 「推荐人」
     */
    @JsonProperty("referred")
    String referred
    /**
     * 「显示 ID」
     */
    @JsonProperty("reveal_id")
    String revealId
    /**
     * 「销售订单的总数」
     */
    @JsonProperty("sale_amount_total")
    BigDecimal saleAmountTotal
    /**
     * 「销售订单数量」
     */
    @JsonProperty("sale_order_count")
    Integer saleOrderCount
    /**
     * 「允许手动丰富」
     * 字典[是否]
     */
    @JsonProperty("show_enrich_button")
    Integer showEnrichButton
    /**
     * 「阶段」
     */
    @JsonProperty("stage_id")
    String stageId
    /**
     * 「省/州」
     */
    @JsonProperty("state_id")
    String stateId
    /**
     * 「街道」
     */
    @JsonProperty("street")
    String street
    /**
     * 「街道2」
     */
    @JsonProperty("street2")
    String street2
    /**
     * 「销售团队」
     */
    @JsonProperty("team_id")
    String teamId
    /**
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「销售人员」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「网站」
     */
    @JsonProperty("website")
    String website
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
     * 「邮编」
     */
    @JsonProperty("zip")
    String zip
    /**
     * 「文件」
     */
    @JsonProperty("file")
    String file
    /**
     * 「图片」
     */
    @JsonProperty("image")
    String image

    /**
     * 设置「状态时间」值
     * @param val
     */
    CrmLeadDTO setDurationTracking(IEntity durationTracking) {
        this.durationTracking = durationTracking
        return this
    }


    /**
     * 设置「活动集合」值
     * @param val
     */
    CrmLeadDTO setActivities(List<MailActivityDTO> activities) {
        this.activities = activities
        return this
    }


    /**
     * 设置「附件集合」值
     * @param val
     */
    CrmLeadDTO setAttachments(List<IrAttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「关注者」值
     * @param val
     */
    CrmLeadDTO setFollowers(List<MailFollowersDTO> followers) {
        this.followers = followers
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    CrmLeadDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    CrmLeadDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    CrmLeadDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    CrmLeadDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「自动概率」值
     * @param val
     */
    CrmLeadDTO setAutomatedProbability(Double automatedProbability) {
        this.automatedProbability = automatedProbability
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    CrmLeadDTO setCity(String city) {
        this.city = city
        return this
    }


    /**
     * 设置「颜色索引」值
     * @param val
     */
    CrmLeadDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    CrmLeadDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「联系人姓名」值
     * @param val
     */
    CrmLeadDTO setContactName(String contactName) {
        this.contactName = contactName
        return this
    }


    /**
     * 设置「国家/地区」值
     * @param val
     */
    CrmLeadDTO setCountryId(String countryId) {
        this.countryId = countryId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CrmLeadDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmLeadDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「最后操作」值
     * @param val
     */
    CrmLeadDTO setDateAutomationLast(Timestamp dateAutomationLast) {
        this.dateAutomationLast = dateAutomationLast
        return this
    }


    /**
     * 设置「关闭日期」值
     * @param val
     */
    CrmLeadDTO setDateClosed(Timestamp dateClosed) {
        this.dateClosed = dateClosed
        return this
    }


    /**
     * 设置「转化日期」值
     * @param val
     */
    CrmLeadDTO setDateConversion(Timestamp dateConversion) {
        this.dateConversion = dateConversion
        return this
    }


    /**
     * 设置「预期结束」值
     * @param val
     */
    CrmLeadDTO setDateDeadline(Timestamp dateDeadline) {
        this.dateDeadline = dateDeadline
        return this
    }


    /**
     * 设置「最后阶段更新」值
     * @param val
     */
    CrmLeadDTO setDateLastStageUpdate(Timestamp dateLastStageUpdate) {
        this.dateLastStageUpdate = dateLastStageUpdate
        return this
    }


    /**
     * 设置「指派日期」值
     * @param val
     */
    CrmLeadDTO setDateOpen(Timestamp dateOpen) {
        this.dateOpen = dateOpen
        return this
    }


    /**
     * 设置「待关闭天数」值
     * @param val
     */
    CrmLeadDTO setDayClose(Double dayClose) {
        this.dayClose = dayClose
        return this
    }


    /**
     * 设置「待分配天数」值
     * @param val
     */
    CrmLeadDTO setDayOpen(Double dayOpen) {
        this.dayOpen = dayOpen
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    CrmLeadDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmLeadDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「潜在的重复线索数量」值
     * @param val
     */
    CrmLeadDTO setDuplicateLeadCount(Integer duplicateLeadCount) {
        this.duplicateLeadCount = duplicateLeadCount
        return this
    }


    /**
     * 设置「电子邮件抄送」值
     * @param val
     */
    CrmLeadDTO setEmailCc(String emailCc) {
        this.emailCc = emailCc
        return this
    }


    /**
     * 设置「电子邮箱域名标准」值
     * @param val
     */
    CrmLeadDTO setEmailDomainCriterion(String emailDomainCriterion) {
        this.emailDomainCriterion = emailDomainCriterion
        return this
    }


    /**
     * 设置「电子邮件」值
     * @param val
     */
    CrmLeadDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「规范化电子邮件」值
     * @param val
     */
    CrmLeadDTO setEmailNormalized(String emailNormalized) {
        this.emailNormalized = emailNormalized
        return this
    }


    /**
     * 设置「电子邮件质量」值
     * 字典[电子邮件质量]
     * @param val
     */
    CrmLeadDTO setEmailState(String emailState) {
        this.emailState = emailState
        return this
    }


    /**
     * 设置「预期收入」值
     * @param val
     */
    CrmLeadDTO setExpectedRevenue(BigDecimal expectedRevenue) {
        this.expectedRevenue = expectedRevenue
        return this
    }


    /**
     * 设置「工作岗位」值
     * @param val
     */
    CrmLeadDTO setFunction(String function) {
        this.function = function
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「丰富结束」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setIapEnrichDone(Integer iapEnrichDone) {
        this.iapEnrichDone = iapEnrichDone
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmLeadDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是自动概率？」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setIsAutomatedProbability(Integer isAutomatedProbability) {
        this.isAutomatedProbability = isAutomatedProbability
        return this
    }


    /**
     * 设置「黑名单」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setIsBlacklisted(Integer isBlacklisted) {
        this.isBlacklisted = isBlacklisted
        return this
    }


    /**
     * 设置「是可见合作伙伴」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setIsPartnerVisible(Integer isPartnerVisible) {
        this.isPartnerVisible = isPartnerVisible
        return this
    }


    /**
     * 设置「有效语言数量」值
     * @param val
     */
    CrmLeadDTO setLangActiveCount(Integer langActiveCount) {
        this.langActiveCount = langActiveCount
        return this
    }


    /**
     * 设置「语言」值
     * @param val
     */
    CrmLeadDTO setLangId(String langId) {
        this.langId = langId
        return this
    }


    /**
     * 设置「线索挖掘申请」值
     * @param val
     */
    CrmLeadDTO setLeadMiningRequestId(String leadMiningRequestId) {
        this.leadMiningRequestId = leadMiningRequestId
        return this
    }


    /**
     * 设置「丢失原因」值
     * @param val
     */
    CrmLeadDTO setLostReasonId(String lostReasonId) {
        this.lostReasonId = lostReasonId
        return this
    }


    /**
     * 设置「会议显示日期」值
     * @param val
     */
    CrmLeadDTO setMeetingDisplayDate(Timestamp meetingDisplayDate) {
        this.meetingDisplayDate = meetingDisplayDate
        return this
    }


    /**
     * 设置「会议显示标签」值
     * @param val
     */
    CrmLeadDTO setMeetingDisplayLabel(String meetingDisplayLabel) {
        this.meetingDisplayLabel = meetingDisplayLabel
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    CrmLeadDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「退回」值
     * @param val
     */
    CrmLeadDTO setMessageBounce(Integer messageBounce) {
        this.messageBounce = messageBounce
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    CrmLeadDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    CrmLeadDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「手机号码」值
     * @param val
     */
    CrmLeadDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「列入黑名单的电话号码是手机号码」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setMobileBlacklisted(Integer mobileBlacklisted) {
        this.mobileBlacklisted = mobileBlacklisted
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    CrmLeadDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CrmLeadDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「合作伙伴电子邮箱将更新」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setPartnerEmailUpdate(Integer partnerEmailUpdate) {
        this.partnerEmailUpdate = partnerEmailUpdate
        return this
    }


    /**
     * 设置「客户」值
     * @param val
     */
    CrmLeadDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「公司名称」值
     * @param val
     */
    CrmLeadDTO setPartnerName(String partnerName) {
        this.partnerName = partnerName
        return this
    }


    /**
     * 设置「合作伙伴电话号码将更新」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setPartnerPhoneUpdate(Integer partnerPhoneUpdate) {
        this.partnerPhoneUpdate = partnerPhoneUpdate
        return this
    }


    /**
     * 设置「电话号码」值
     * @param val
     */
    CrmLeadDTO setPhone(String phone) {
        this.phone = phone
        return this
    }


    /**
     * 设置「列入黑名单的电话是电话」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setPhoneBlacklisted(Integer phoneBlacklisted) {
        this.phoneBlacklisted = phoneBlacklisted
        return this
    }


    /**
     * 设置「电话号码/手机号码」值
     * @param val
     */
    CrmLeadDTO setPhoneMobileSearch(String phoneMobileSearch) {
        this.phoneMobileSearch = phoneMobileSearch
        return this
    }


    /**
     * 设置「已净化号码」值
     * @param val
     */
    CrmLeadDTO setPhoneSanitized(String phoneSanitized) {
        this.phoneSanitized = phoneSanitized
        return this
    }


    /**
     * 设置「电话号码已被列入黑名单」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setPhoneSanitizedBlacklisted(Integer phoneSanitizedBlacklisted) {
        this.phoneSanitizedBlacklisted = phoneSanitizedBlacklisted
        return this
    }


    /**
     * 设置「电话号码质量」值
     * 字典[电话号码质量]
     * @param val
     */
    CrmLeadDTO setPhoneState(String phoneState) {
        this.phoneState = phoneState
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[优先级]
     * @param val
     */
    CrmLeadDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「概率」值
     * @param val
     */
    CrmLeadDTO setProbability(Double probability) {
        this.probability = probability
        return this
    }


    /**
     * 设置「按比例分配的收入」值
     * @param val
     */
    CrmLeadDTO setProratedRevenue(BigDecimal proratedRevenue) {
        this.proratedRevenue = proratedRevenue
        return this
    }


    /**
     * 设置「报价的数量」值
     * @param val
     */
    CrmLeadDTO setQuotationCount(Integer quotationCount) {
        this.quotationCount = quotationCount
        return this
    }


    /**
     * 设置「经常性收入」值
     * @param val
     */
    CrmLeadDTO setRecurringRevenue(BigDecimal recurringRevenue) {
        this.recurringRevenue = recurringRevenue
        return this
    }


    /**
     * 设置「预期 MRR」值
     * @param val
     */
    CrmLeadDTO setRecurringRevenueMonthly(BigDecimal recurringRevenueMonthly) {
        this.recurringRevenueMonthly = recurringRevenueMonthly
        return this
    }


    /**
     * 设置「按比例分配的 MRR」值
     * @param val
     */
    CrmLeadDTO setRecurringRevenueMonthlyProrated(BigDecimal recurringRevenueMonthlyProrated) {
        this.recurringRevenueMonthlyProrated = recurringRevenueMonthlyProrated
        return this
    }


    /**
     * 设置「按比例分配的经常性收入」值
     * @param val
     */
    CrmLeadDTO setRecurringRevenueProrated(BigDecimal recurringRevenueProrated) {
        this.recurringRevenueProrated = recurringRevenueProrated
        return this
    }


    /**
     * 设置「推荐人」值
     * @param val
     */
    CrmLeadDTO setReferred(String referred) {
        this.referred = referred
        return this
    }


    /**
     * 设置「显示 ID」值
     * @param val
     */
    CrmLeadDTO setRevealId(String revealId) {
        this.revealId = revealId
        return this
    }


    /**
     * 设置「销售订单的总数」值
     * @param val
     */
    CrmLeadDTO setSaleAmountTotal(BigDecimal saleAmountTotal) {
        this.saleAmountTotal = saleAmountTotal
        return this
    }


    /**
     * 设置「销售订单数量」值
     * @param val
     */
    CrmLeadDTO setSaleOrderCount(Integer saleOrderCount) {
        this.saleOrderCount = saleOrderCount
        return this
    }


    /**
     * 设置「允许手动丰富」值
     * 字典[是否]
     * @param val
     */
    CrmLeadDTO setShowEnrichButton(Integer showEnrichButton) {
        this.showEnrichButton = showEnrichButton
        return this
    }


    /**
     * 设置「阶段」值
     * @param val
     */
    CrmLeadDTO setStageId(String stageId) {
        this.stageId = stageId
        return this
    }


    /**
     * 设置「省/州」值
     * @param val
     */
    CrmLeadDTO setStateId(String stateId) {
        this.stateId = stateId
        return this
    }


    /**
     * 设置「街道」值
     * @param val
     */
    CrmLeadDTO setStreet(String street) {
        this.street = street
        return this
    }


    /**
     * 设置「街道2」值
     * @param val
     */
    CrmLeadDTO setStreet2(String street2) {
        this.street2 = street2
        return this
    }


    /**
     * 设置「销售团队」值
     * @param val
     */
    CrmLeadDTO setTeamId(String teamId) {
        this.teamId = teamId
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    CrmLeadDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「销售人员」值
     * @param val
     */
    CrmLeadDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「网站」值
     * @param val
     */
    CrmLeadDTO setWebsite(String website) {
        this.website = website
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmLeadDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmLeadDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「邮编」值
     * @param val
     */
    CrmLeadDTO setZip(String zip) {
        this.zip = zip
        return this
    }


    /**
     * 设置「文件」值
     * @param val
     */
    CrmLeadDTO setFile(String file) {
        this.file = file
        return this
    }


    /**
     * 设置「图片」值
     * @param val
     */
    CrmLeadDTO setImage(String image) {
        this.image = image
        return this
    }

}
