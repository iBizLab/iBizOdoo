package cn.ibizlab.ibizodoo.mail.mailthreadcc.dto

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
class MailThreadCcDTO extends GroovyDTO<MailThreadCcDTO> {

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
     * 设置「邮件抄送」值
     * @param val
     */
    MailThreadCcDTO setEmailCc(String emailCc) {
        this.emailCc = emailCc
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    MailThreadCcDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailThreadCcDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    MailThreadCcDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    MailThreadCcDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    MailThreadCcDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    MailThreadCcDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    MailThreadCcDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「待处理」值
     * 字典[是否]
     * @param val
     */
    MailThreadCcDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    MailThreadCcDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailThreadCcDTO setName(String name) {
        this.name = name
        return this
    }

}
