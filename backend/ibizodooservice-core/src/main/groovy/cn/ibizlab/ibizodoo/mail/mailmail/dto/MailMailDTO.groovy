package cn.ibizlab.ibizodoo.mail.mailmail.dto

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
class MailMailDTO extends GroovyDTO<MailMailDTO> {

    /**
     * 「自动删除」
     * 字典[是否]
     */
    @JsonProperty("auto_delete")
    Integer autoDelete
    /**
     * 「富文本内容」
     */
    @JsonProperty("body_content")
    String bodyContent
    /**
     * 「文本内容」
     */
    @JsonProperty("body_html")
    String bodyHtml
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
     * 「抄送」
     */
    @JsonProperty("email_cc")
    String emailCc
    /**
     * 「至」
     */
    @JsonProperty("email_to")
    String emailTo
    /**
     * 「失败原因」
     */
    @JsonProperty("failure_reason")
    String failureReason
    /**
     * 「失败类型」
     * 字典[失败类型]
     */
    @JsonProperty("failure_type")
    String failureType
    /**
     * 「请求头」
     */
    @JsonProperty("headers")
    String headers
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「通知电子邮件」
     * 字典[是否]
     */
    @JsonProperty("is_notification")
    Integer isNotification
    /**
     * 「消息」
     */
    @JsonProperty("mail_message_id")
    String mailMessageId
    /**
     * 「邮件消息 ID 整型」
     */
    @JsonProperty("mail_message_id_int")
    Integer mailMessageIdInt
    /**
     * 「参考」
     */
    @JsonProperty("references")
    String references
    /**
     * 「受限制的附件」
     */
    @JsonProperty("restricted_attachment_count")
    Integer restrictedAttachmentCount
    /**
     * 「安排的发送日期」
     */
    @JsonProperty("scheduled_date")
    Timestamp scheduledDate
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
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
     * 设置「自动删除」值
     * 字典[是否]
     * @param val
     */
    MailMailDTO setAutoDelete(Integer autoDelete) {
        this.autoDelete = autoDelete
        return this
    }


    /**
     * 设置「富文本内容」值
     * @param val
     */
    MailMailDTO setBodyContent(String bodyContent) {
        this.bodyContent = bodyContent
        return this
    }


    /**
     * 设置「文本内容」值
     * @param val
     */
    MailMailDTO setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailMailDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailMailDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailMailDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「抄送」值
     * @param val
     */
    MailMailDTO setEmailCc(String emailCc) {
        this.emailCc = emailCc
        return this
    }


    /**
     * 设置「至」值
     * @param val
     */
    MailMailDTO setEmailTo(String emailTo) {
        this.emailTo = emailTo
        return this
    }


    /**
     * 设置「失败原因」值
     * @param val
     */
    MailMailDTO setFailureReason(String failureReason) {
        this.failureReason = failureReason
        return this
    }


    /**
     * 设置「失败类型」值
     * 字典[失败类型]
     * @param val
     */
    MailMailDTO setFailureType(String failureType) {
        this.failureType = failureType
        return this
    }


    /**
     * 设置「请求头」值
     * @param val
     */
    MailMailDTO setHeaders(String headers) {
        this.headers = headers
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailMailDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「通知电子邮件」值
     * 字典[是否]
     * @param val
     */
    MailMailDTO setIsNotification(Integer isNotification) {
        this.isNotification = isNotification
        return this
    }


    /**
     * 设置「消息」值
     * @param val
     */
    MailMailDTO setMailMessageId(String mailMessageId) {
        this.mailMessageId = mailMessageId
        return this
    }


    /**
     * 设置「邮件消息 ID 整型」值
     * @param val
     */
    MailMailDTO setMailMessageIdInt(Integer mailMessageIdInt) {
        this.mailMessageIdInt = mailMessageIdInt
        return this
    }


    /**
     * 设置「参考」值
     * @param val
     */
    MailMailDTO setReferences(String references) {
        this.references = references
        return this
    }


    /**
     * 设置「受限制的附件」值
     * @param val
     */
    MailMailDTO setRestrictedAttachmentCount(Integer restrictedAttachmentCount) {
        this.restrictedAttachmentCount = restrictedAttachmentCount
        return this
    }


    /**
     * 设置「安排的发送日期」值
     * @param val
     */
    MailMailDTO setScheduledDate(Timestamp scheduledDate) {
        this.scheduledDate = scheduledDate
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    MailMailDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailMailDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailMailDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
