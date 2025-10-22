package cn.ibizlab.ibizodoo.mail.mailthreadblacklist.dto

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
class MailThreadBlacklistDTO extends GroovyDTO<MailThreadBlacklistDTO> {

    /**
     * 「规范化邮件」
     */
    @JsonProperty("email_normalized")
    String emailNormalized
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
     * 「待处理」
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
     * 「名称」
     */
    @JsonProperty("name")
    String name

    /**
     * 设置「规范化邮件」值
     * @param val
     */
    MailThreadBlacklistDTO setEmailNormalized(String emailNormalized) {
        this.emailNormalized = emailNormalized
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    MailThreadBlacklistDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailThreadBlacklistDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「黑名单」值
     * 字典[是否]
     * @param val
     */
    MailThreadBlacklistDTO setIsBlacklisted(Integer isBlacklisted) {
        this.isBlacklisted = isBlacklisted
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    MailThreadBlacklistDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「退回」值
     * @param val
     */
    MailThreadBlacklistDTO setMessageBounce(Integer messageBounce) {
        this.messageBounce = messageBounce
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    MailThreadBlacklistDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    MailThreadBlacklistDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    MailThreadBlacklistDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    MailThreadBlacklistDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「待处理」值
     * 字典[是否]
     * @param val
     */
    MailThreadBlacklistDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    MailThreadBlacklistDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailThreadBlacklistDTO setName(String name) {
        this.name = name
        return this
    }

}
