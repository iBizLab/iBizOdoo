package cn.ibizlab.ibizodoo.hr.hrapplicant.dto

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
class HrApplicantDTO extends GroovyDTO<HrApplicantDTO> {

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
     * 「申请人备注」
     */
    @JsonProperty("applicant_notes")
    String applicantNotes
    /**
     * 「表单状态」
     * 字典[表单状态]
     */
    @JsonProperty("application_status")
    String applicationStatus
    /**
     * 「附件数量」
     */
    @JsonProperty("attachment_number")
    Integer attachmentNumber
    /**
     * 「应聘人」
     */
    @JsonProperty("candidate_id")
    String candidateId
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
     * 「入职日期」
     */
    @JsonProperty("date_closed")
    Timestamp dateClosed
    /**
     * 「最后阶段更新」
     */
    @JsonProperty("date_last_stage_update")
    Timestamp dateLastStageUpdate
    /**
     * 「已指派」
     */
    @JsonProperty("date_open")
    Timestamp dateOpen
    /**
     * 「关闭日期」
     */
    @JsonProperty("day_close")
    Double dayClose
    /**
     * 「开启天数」
     */
    @JsonProperty("day_open")
    Double dayOpen
    /**
     * 「延迟关闭」
     */
    @JsonProperty("delay_close")
    Double delayClose
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
     * 「邮件抄送」
     */
    @JsonProperty("email_cc")
    String emailCc
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
     * 「最终阶段」
     */
    @JsonProperty("last_stage_id")
    String lastStageId
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
     * 「其他申请数目」
     */
    @JsonProperty("other_applications_count")
    Integer otherApplicationsCount
    /**
     * 「合作伙伴名称」
     */
    @JsonProperty("partner_name")
    String partnerName
    /**
     * 「评估」
     * 字典[评估]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「概率」
     */
    @JsonProperty("probability")
    Double probability
    /**
     * 「拒绝日期」
     */
    @JsonProperty("refuse_date")
    Timestamp refuseDate
    /**
     * 「拒绝理由」
     */
    @JsonProperty("refuse_reason_id")
    String refuseReasonId
    /**
     * 「期望薪资」
     */
    @JsonProperty("salary_expected")
    Double salaryExpected
    /**
     * 「期望工资」
     */
    @JsonProperty("salary_expected_extra")
    String salaryExpectedExtra
    /**
     * 「建议薪资」
     */
    @JsonProperty("salary_proposed")
    Double salaryProposed
    /**
     * 「工资标准」
     */
    @JsonProperty("salary_proposed_extra")
    String salaryProposedExtra
    /**
     * 「阶段」
     */
    @JsonProperty("stage_id")
    String stageId
    /**
     * 「招聘人员」
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
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    HrApplicantDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    HrApplicantDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    HrApplicantDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    HrApplicantDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    HrApplicantDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「申请人备注」值
     * @param val
     */
    HrApplicantDTO setApplicantNotes(String applicantNotes) {
        this.applicantNotes = applicantNotes
        return this
    }


    /**
     * 设置「表单状态」值
     * 字典[表单状态]
     * @param val
     */
    HrApplicantDTO setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrApplicantDTO setAttachmentNumber(Integer attachmentNumber) {
        this.attachmentNumber = attachmentNumber
        return this
    }


    /**
     * 设置「应聘人」值
     * @param val
     */
    HrApplicantDTO setCandidateId(String candidateId) {
        this.candidateId = candidateId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrApplicantDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrApplicantDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrApplicantDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「入职日期」值
     * @param val
     */
    HrApplicantDTO setDateClosed(Timestamp dateClosed) {
        this.dateClosed = dateClosed
        return this
    }


    /**
     * 设置「最后阶段更新」值
     * @param val
     */
    HrApplicantDTO setDateLastStageUpdate(Timestamp dateLastStageUpdate) {
        this.dateLastStageUpdate = dateLastStageUpdate
        return this
    }


    /**
     * 设置「已指派」值
     * @param val
     */
    HrApplicantDTO setDateOpen(Timestamp dateOpen) {
        this.dateOpen = dateOpen
        return this
    }


    /**
     * 设置「关闭日期」值
     * @param val
     */
    HrApplicantDTO setDayClose(Double dayClose) {
        this.dayClose = dayClose
        return this
    }


    /**
     * 设置「开启天数」值
     * @param val
     */
    HrApplicantDTO setDayOpen(Double dayOpen) {
        this.dayOpen = dayOpen
        return this
    }


    /**
     * 设置「延迟关闭」值
     * @param val
     */
    HrApplicantDTO setDelayClose(Double delayClose) {
        this.delayClose = delayClose
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrApplicantDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrApplicantDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「邮件抄送」值
     * @param val
     */
    HrApplicantDTO setEmailCc(String emailCc) {
        this.emailCc = emailCc
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    HrApplicantDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrApplicantDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「工作岗位」值
     * @param val
     */
    HrApplicantDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「看板状态」值
     * 字典[看板状态]
     * @param val
     */
    HrApplicantDTO setKanbanState(String kanbanState) {
        this.kanbanState = kanbanState
        return this
    }


    /**
     * 设置「最终阶段」值
     * @param val
     */
    HrApplicantDTO setLastStageId(String lastStageId) {
        this.lastStageId = lastStageId
        return this
    }


    /**
     * 设置「会议显示日期」值
     * @param val
     */
    HrApplicantDTO setMeetingDisplayDate(Timestamp meetingDisplayDate) {
        this.meetingDisplayDate = meetingDisplayDate
        return this
    }


    /**
     * 设置「会议显示文本」值
     * @param val
     */
    HrApplicantDTO setMeetingDisplayText(String meetingDisplayText) {
        this.meetingDisplayText = meetingDisplayText
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrApplicantDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    HrApplicantDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    HrApplicantDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    HrApplicantDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    HrApplicantDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「主要附件」值
     * @param val
     */
    HrApplicantDTO setMessageMainAttachmentId(String messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    HrApplicantDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    HrApplicantDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    HrApplicantDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「其他申请数目」值
     * @param val
     */
    HrApplicantDTO setOtherApplicationsCount(Integer otherApplicationsCount) {
        this.otherApplicationsCount = otherApplicationsCount
        return this
    }


    /**
     * 设置「合作伙伴名称」值
     * @param val
     */
    HrApplicantDTO setPartnerName(String partnerName) {
        this.partnerName = partnerName
        return this
    }


    /**
     * 设置「评估」值
     * 字典[评估]
     * @param val
     */
    HrApplicantDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「概率」值
     * @param val
     */
    HrApplicantDTO setProbability(Double probability) {
        this.probability = probability
        return this
    }


    /**
     * 设置「拒绝日期」值
     * @param val
     */
    HrApplicantDTO setRefuseDate(Timestamp refuseDate) {
        this.refuseDate = refuseDate
        return this
    }


    /**
     * 设置「拒绝理由」值
     * @param val
     */
    HrApplicantDTO setRefuseReasonId(String refuseReasonId) {
        this.refuseReasonId = refuseReasonId
        return this
    }


    /**
     * 设置「期望薪资」值
     * @param val
     */
    HrApplicantDTO setSalaryExpected(Double salaryExpected) {
        this.salaryExpected = salaryExpected
        return this
    }


    /**
     * 设置「期望工资」值
     * @param val
     */
    HrApplicantDTO setSalaryExpectedExtra(String salaryExpectedExtra) {
        this.salaryExpectedExtra = salaryExpectedExtra
        return this
    }


    /**
     * 设置「建议薪资」值
     * @param val
     */
    HrApplicantDTO setSalaryProposed(Double salaryProposed) {
        this.salaryProposed = salaryProposed
        return this
    }


    /**
     * 设置「工资标准」值
     * @param val
     */
    HrApplicantDTO setSalaryProposedExtra(String salaryProposedExtra) {
        this.salaryProposedExtra = salaryProposedExtra
        return this
    }


    /**
     * 设置「阶段」值
     * @param val
     */
    HrApplicantDTO setStageId(String stageId) {
        this.stageId = stageId
        return this
    }


    /**
     * 设置「招聘人员」值
     * @param val
     */
    HrApplicantDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrApplicantDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrApplicantDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
