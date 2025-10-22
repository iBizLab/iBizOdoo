package cn.ibizlab.ibizodoo.crm.crmteammember.dto

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
class CrmTeamMemberDTO extends GroovyDTO<CrmTeamMemberDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「指派域名」
     */
    @JsonProperty("assignment_domain")
    String assignmentDomain
    /**
     * 「平均处理线索能力（30 天）」
     */
    @JsonProperty("assignment_max")
    Integer assignmentMax
    /**
     * 「跳过自动分配」
     * 字典[是否]
     */
    @JsonProperty("assignment_optout")
    Integer assignmentOptout
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
     * 「销售团队」
     */
    @JsonProperty("crm_team_id")
    String crmTeamId
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
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
     * 「允许多个会员资格」
     * 字典[是否]
     */
    @JsonProperty("is_membership_multi")
    Integer isMembershipMulti
    /**
     * 「销售线索（过去 24 小时）」
     */
    @JsonProperty("lead_day_count")
    Integer leadDayCount
    /**
     * 「线索（30天）」
     */
    @JsonProperty("lead_month_count")
    Integer leadMonthCount
    /**
     * 「会员警告」
     */
    @JsonProperty("member_warning")
    String memberWarning
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
     * 「销售员」
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
    CrmTeamMemberDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「指派域名」值
     * @param val
     */
    CrmTeamMemberDTO setAssignmentDomain(String assignmentDomain) {
        this.assignmentDomain = assignmentDomain
        return this
    }


    /**
     * 设置「平均处理线索能力（30 天）」值
     * @param val
     */
    CrmTeamMemberDTO setAssignmentMax(Integer assignmentMax) {
        this.assignmentMax = assignmentMax
        return this
    }


    /**
     * 设置「跳过自动分配」值
     * 字典[是否]
     * @param val
     */
    CrmTeamMemberDTO setAssignmentOptout(Integer assignmentOptout) {
        this.assignmentOptout = assignmentOptout
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CrmTeamMemberDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmTeamMemberDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「销售团队」值
     * @param val
     */
    CrmTeamMemberDTO setCrmTeamId(String crmTeamId) {
        this.crmTeamId = crmTeamId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmTeamMemberDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    CrmTeamMemberDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmTeamMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「允许多个会员资格」值
     * 字典[是否]
     * @param val
     */
    CrmTeamMemberDTO setIsMembershipMulti(Integer isMembershipMulti) {
        this.isMembershipMulti = isMembershipMulti
        return this
    }


    /**
     * 设置「销售线索（过去 24 小时）」值
     * @param val
     */
    CrmTeamMemberDTO setLeadDayCount(Integer leadDayCount) {
        this.leadDayCount = leadDayCount
        return this
    }


    /**
     * 设置「线索（30天）」值
     * @param val
     */
    CrmTeamMemberDTO setLeadMonthCount(Integer leadMonthCount) {
        this.leadMonthCount = leadMonthCount
        return this
    }


    /**
     * 设置「会员警告」值
     * @param val
     */
    CrmTeamMemberDTO setMemberWarning(String memberWarning) {
        this.memberWarning = memberWarning
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    CrmTeamMemberDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    CrmTeamMemberDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    CrmTeamMemberDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    CrmTeamMemberDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    CrmTeamMemberDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    CrmTeamMemberDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    CrmTeamMemberDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「销售员」值
     * @param val
     */
    CrmTeamMemberDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmTeamMemberDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmTeamMemberDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
