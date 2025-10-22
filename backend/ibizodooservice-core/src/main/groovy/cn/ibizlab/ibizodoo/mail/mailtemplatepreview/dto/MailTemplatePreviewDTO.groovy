package cn.ibizlab.ibizodoo.mail.mailtemplatepreview.dto

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
class MailTemplatePreviewDTO extends GroovyDTO<MailTemplatePreviewDTO> {

    /**
     * 「正文」
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
     * 「来自」
     */
    @JsonProperty("email_from")
    String emailFrom
    /**
     * 「至」
     */
    @JsonProperty("email_to")
    String emailTo
    /**
     * 「错误消息」
     */
    @JsonProperty("error_msg")
    String errorMsg
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「相关的邮件模板」
     */
    @JsonProperty("mail_template_id")
    String mailTemplateId
    /**
     * 「没有记录」
     * 字典[是否]
     */
    @JsonProperty("no_record")
    Integer noRecord
    /**
     * 「回复 至」
     */
    @JsonProperty("reply_to")
    String replyTo
    /**
     * 「安排的日期」
     */
    @JsonProperty("scheduled_date")
    String scheduledDate
    /**
     * 「主旨」
     */
    @JsonProperty("subject")
    String subject
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
     * 设置「正文」值
     * @param val
     */
    MailTemplatePreviewDTO setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailTemplatePreviewDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailTemplatePreviewDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailTemplatePreviewDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「抄送」值
     * @param val
     */
    MailTemplatePreviewDTO setEmailCc(String emailCc) {
        this.emailCc = emailCc
        return this
    }


    /**
     * 设置「来自」值
     * @param val
     */
    MailTemplatePreviewDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「至」值
     * @param val
     */
    MailTemplatePreviewDTO setEmailTo(String emailTo) {
        this.emailTo = emailTo
        return this
    }


    /**
     * 设置「错误消息」值
     * @param val
     */
    MailTemplatePreviewDTO setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailTemplatePreviewDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「相关的邮件模板」值
     * @param val
     */
    MailTemplatePreviewDTO setMailTemplateId(String mailTemplateId) {
        this.mailTemplateId = mailTemplateId
        return this
    }


    /**
     * 设置「没有记录」值
     * 字典[是否]
     * @param val
     */
    MailTemplatePreviewDTO setNoRecord(Integer noRecord) {
        this.noRecord = noRecord
        return this
    }


    /**
     * 设置「回复 至」值
     * @param val
     */
    MailTemplatePreviewDTO setReplyTo(String replyTo) {
        this.replyTo = replyTo
        return this
    }


    /**
     * 设置「安排的日期」值
     * @param val
     */
    MailTemplatePreviewDTO setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate
        return this
    }


    /**
     * 设置「主旨」值
     * @param val
     */
    MailTemplatePreviewDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailTemplatePreviewDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailTemplatePreviewDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
