package cn.ibizlab.ibizodoo.hr.hrcandidate.dto

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
class HrCandidateDTO extends GroovyDTO<HrCandidateDTO> {

    /**
     * 「已接收录用通知的数目」
     */
    @JsonProperty("accepted_applications_count")
    Integer acceptedApplicationsCount
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
     * 「应用计数」
     */
    @JsonProperty("application_count")
    Integer applicationCount
    /**
     * 「# 期望薪资」
     */
    @JsonProperty("applications_count")
    Integer applicationsCount
    /**
     * 「附件数量」
     */
    @JsonProperty("attachment_count")
    Integer attachmentCount
    /**
     * 「可入职日期」
     */
    @JsonProperty("availability")
    Timestamp availability
    /**
     * 「颜色指标」
     */
    @JsonProperty("color")
    Integer color
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
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「邮件抄送」
     */
    @JsonProperty("email_cc")
    String emailCc
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
     * 「黑名单」
     * 字典[是否]
     */
    @JsonProperty("is_blacklisted")
    Integer isBlacklisted
    /**
     * 「LinkedIn个人资料」
     */
    @JsonProperty("linkedin_profile")
    String linkedinProfile
    /**
     * 「匹配分数（%）」
     */
    @JsonProperty("matching_score")
    Double matchingScore
    /**
     * 「会议显示日期」
     */
    @JsonProperty("meeting_display_date")
    Timestamp meetingDisplayDate
    /**
     * 「会议显示文本」
     */
    @JsonProperty("meeting_display_text")
    String meetingDisplayText
    /**
     * 「附件数量」
     */
    @JsonProperty("message_attachment_count")
    Integer messageAttachmentCount
    /**
     * 「弹跳」
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
     * 「手机黑名单」
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
     * 「联系人」
     */
    @JsonProperty("partner_id")
    String partnerId
    /**
     * 「候选人姓名」
     */
    @JsonProperty("partner_name")
    String partnerName
    /**
     * 「电话」
     */
    @JsonProperty("partner_phone")
    String partnerPhone
    /**
     * 「经过消毒的电话号码」
     */
    @JsonProperty("partner_phone_sanitized")
    String partnerPhoneSanitized
    /**
     * 「黑名单电话是电话」
     * 字典[是否]
     */
    @JsonProperty("phone_blacklisted")
    Integer phoneBlacklisted
    /**
     * 「电话/手机」
     */
    @JsonProperty("phone_mobile_search")
    String phoneMobileSearch
    /**
     * 「消毒编号」
     */
    @JsonProperty("phone_sanitized")
    String phoneSanitized
    /**
     * 「电话黑名单」
     * 字典[是否]
     */
    @JsonProperty("phone_sanitized_blacklisted")
    Integer phoneSanitizedBlacklisted
    /**
     * 「评估」
     * 字典[评估]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「已拒绝录用通知的数目」
     */
    @JsonProperty("refused_applications_count")
    Integer refusedApplicationsCount
    /**
     * 「相似候选人数」
     */
    @JsonProperty("similar_candidates_count")
    Integer similarCandidatesCount
    /**
     * 「学历」
     */
    @JsonProperty("type_id")
    String typeId
    /**
     * 「候选人管理员」
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
     * 设置「已接收录用通知的数目」值
     * @param val
     */
    HrCandidateDTO setAcceptedApplicationsCount(Integer acceptedApplicationsCount) {
        this.acceptedApplicationsCount = acceptedApplicationsCount
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    HrCandidateDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    HrCandidateDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    HrCandidateDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    HrCandidateDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    HrCandidateDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「应用计数」值
     * @param val
     */
    HrCandidateDTO setApplicationCount(Integer applicationCount) {
        this.applicationCount = applicationCount
        return this
    }


    /**
     * 设置「# 期望薪资」值
     * @param val
     */
    HrCandidateDTO setApplicationsCount(Integer applicationsCount) {
        this.applicationsCount = applicationsCount
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrCandidateDTO setAttachmentCount(Integer attachmentCount) {
        this.attachmentCount = attachmentCount
        return this
    }


    /**
     * 设置「可入职日期」值
     * @param val
     */
    HrCandidateDTO setAvailability(Timestamp availability) {
        this.availability = availability
        return this
    }


    /**
     * 设置「颜色指标」值
     * @param val
     */
    HrCandidateDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrCandidateDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrCandidateDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrCandidateDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrCandidateDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「邮件抄送」值
     * @param val
     */
    HrCandidateDTO setEmailCc(String emailCc) {
        this.emailCc = emailCc
        return this
    }


    /**
     * 设置「电子邮件」值
     * @param val
     */
    HrCandidateDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「规范化电子邮件」值
     * @param val
     */
    HrCandidateDTO setEmailNormalized(String emailNormalized) {
        this.emailNormalized = emailNormalized
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrCandidateDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    HrCandidateDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrCandidateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「黑名单」值
     * 字典[是否]
     * @param val
     */
    HrCandidateDTO setIsBlacklisted(Integer isBlacklisted) {
        this.isBlacklisted = isBlacklisted
        return this
    }


    /**
     * 设置「LinkedIn个人资料」值
     * @param val
     */
    HrCandidateDTO setLinkedinProfile(String linkedinProfile) {
        this.linkedinProfile = linkedinProfile
        return this
    }


    /**
     * 设置「匹配分数（%）」值
     * @param val
     */
    HrCandidateDTO setMatchingScore(Double matchingScore) {
        this.matchingScore = matchingScore
        return this
    }


    /**
     * 设置「会议显示日期」值
     * @param val
     */
    HrCandidateDTO setMeetingDisplayDate(Timestamp meetingDisplayDate) {
        this.meetingDisplayDate = meetingDisplayDate
        return this
    }


    /**
     * 设置「会议显示文本」值
     * @param val
     */
    HrCandidateDTO setMeetingDisplayText(String meetingDisplayText) {
        this.meetingDisplayText = meetingDisplayText
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrCandidateDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「弹跳」值
     * @param val
     */
    HrCandidateDTO setMessageBounce(Integer messageBounce) {
        this.messageBounce = messageBounce
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    HrCandidateDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    HrCandidateDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    HrCandidateDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    HrCandidateDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「主要附件」值
     * @param val
     */
    HrCandidateDTO setMessageMainAttachmentId(String messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    HrCandidateDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    HrCandidateDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「手机黑名单」值
     * 字典[是否]
     * @param val
     */
    HrCandidateDTO setMobileBlacklisted(Integer mobileBlacklisted) {
        this.mobileBlacklisted = mobileBlacklisted
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    HrCandidateDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「联系人」值
     * @param val
     */
    HrCandidateDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「候选人姓名」值
     * @param val
     */
    HrCandidateDTO setPartnerName(String partnerName) {
        this.partnerName = partnerName
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    HrCandidateDTO setPartnerPhone(String partnerPhone) {
        this.partnerPhone = partnerPhone
        return this
    }


    /**
     * 设置「经过消毒的电话号码」值
     * @param val
     */
    HrCandidateDTO setPartnerPhoneSanitized(String partnerPhoneSanitized) {
        this.partnerPhoneSanitized = partnerPhoneSanitized
        return this
    }


    /**
     * 设置「黑名单电话是电话」值
     * 字典[是否]
     * @param val
     */
    HrCandidateDTO setPhoneBlacklisted(Integer phoneBlacklisted) {
        this.phoneBlacklisted = phoneBlacklisted
        return this
    }


    /**
     * 设置「电话/手机」值
     * @param val
     */
    HrCandidateDTO setPhoneMobileSearch(String phoneMobileSearch) {
        this.phoneMobileSearch = phoneMobileSearch
        return this
    }


    /**
     * 设置「消毒编号」值
     * @param val
     */
    HrCandidateDTO setPhoneSanitized(String phoneSanitized) {
        this.phoneSanitized = phoneSanitized
        return this
    }


    /**
     * 设置「电话黑名单」值
     * 字典[是否]
     * @param val
     */
    HrCandidateDTO setPhoneSanitizedBlacklisted(Integer phoneSanitizedBlacklisted) {
        this.phoneSanitizedBlacklisted = phoneSanitizedBlacklisted
        return this
    }


    /**
     * 设置「评估」值
     * 字典[评估]
     * @param val
     */
    HrCandidateDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「已拒绝录用通知的数目」值
     * @param val
     */
    HrCandidateDTO setRefusedApplicationsCount(Integer refusedApplicationsCount) {
        this.refusedApplicationsCount = refusedApplicationsCount
        return this
    }


    /**
     * 设置「相似候选人数」值
     * @param val
     */
    HrCandidateDTO setSimilarCandidatesCount(Integer similarCandidatesCount) {
        this.similarCandidatesCount = similarCandidatesCount
        return this
    }


    /**
     * 设置「学历」值
     * @param val
     */
    HrCandidateDTO setTypeId(String typeId) {
        this.typeId = typeId
        return this
    }


    /**
     * 设置「候选人管理员」值
     * @param val
     */
    HrCandidateDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrCandidateDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrCandidateDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
