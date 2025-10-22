package cn.ibizlab.ibizodoo.mail.mailnotification.dto

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
class MailNotificationDTO extends GroovyDTO<MailNotificationDTO> {

    /**
     * 「消息内容」
     */
    @JsonProperty("message_content")
    String messageContent
    /**
     * 「作者」
     */
    @JsonProperty("author_id")
    String authorId
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「已读」
     * 字典[是否]
     */
    @JsonProperty("is_read")
    Integer isRead
    /**
     * 「邮件」
     */
    @JsonProperty("mail_mail_id")
    String mailMailId
    /**
     * 「消息」
     */
    @JsonProperty("mail_message_id")
    String mailMessageId
    /**
     * 「消息记录名称」
     */
    @JsonProperty("mail_message_record_name")
    String mailMessageRecordName
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("notification_status")
    String notificationStatus
    /**
     * 「通知类型」
     * 字典[通知类型]
     */
    @JsonProperty("notification_type")
    String notificationType
    /**
     * 「读取日期」
     */
    @JsonProperty("read_date")
    Timestamp readDate
    /**
     * 「收件人」
     */
    @JsonProperty("res_partner_id")
    String resPartnerId
    /**
     * 「收件人名称」
     */
    @JsonProperty("res_partner_name")
    String resPartnerName
    /**
     * 「短信 ID」
     */
    @JsonProperty("sms_id_int")
    Integer smsIdInt
    /**
     * 「短信息号码」
     */
    @JsonProperty("sms_number")
    String smsNumber

    /**
     * 设置「消息内容」值
     * @param val
     */
    MailNotificationDTO setMessageContent(String messageContent) {
        this.messageContent = messageContent
        return this
    }


    /**
     * 设置「作者」值
     * @param val
     */
    MailNotificationDTO setAuthorId(String authorId) {
        this.authorId = authorId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailNotificationDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「失败原因」值
     * @param val
     */
    MailNotificationDTO setFailureReason(String failureReason) {
        this.failureReason = failureReason
        return this
    }


    /**
     * 设置「失败类型」值
     * 字典[失败类型]
     * @param val
     */
    MailNotificationDTO setFailureType(String failureType) {
        this.failureType = failureType
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailNotificationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「已读」值
     * 字典[是否]
     * @param val
     */
    MailNotificationDTO setIsRead(Integer isRead) {
        this.isRead = isRead
        return this
    }


    /**
     * 设置「邮件」值
     * @param val
     */
    MailNotificationDTO setMailMailId(String mailMailId) {
        this.mailMailId = mailMailId
        return this
    }


    /**
     * 设置「消息」值
     * @param val
     */
    MailNotificationDTO setMailMessageId(String mailMessageId) {
        this.mailMessageId = mailMessageId
        return this
    }


    /**
     * 设置「消息记录名称」值
     * @param val
     */
    MailNotificationDTO setMailMessageRecordName(String mailMessageRecordName) {
        this.mailMessageRecordName = mailMessageRecordName
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    MailNotificationDTO setNotificationStatus(String notificationStatus) {
        this.notificationStatus = notificationStatus
        return this
    }


    /**
     * 设置「通知类型」值
     * 字典[通知类型]
     * @param val
     */
    MailNotificationDTO setNotificationType(String notificationType) {
        this.notificationType = notificationType
        return this
    }


    /**
     * 设置「读取日期」值
     * @param val
     */
    MailNotificationDTO setReadDate(Timestamp readDate) {
        this.readDate = readDate
        return this
    }


    /**
     * 设置「收件人」值
     * @param val
     */
    MailNotificationDTO setResPartnerId(String resPartnerId) {
        this.resPartnerId = resPartnerId
        return this
    }


    /**
     * 设置「收件人名称」值
     * @param val
     */
    MailNotificationDTO setResPartnerName(String resPartnerName) {
        this.resPartnerName = resPartnerName
        return this
    }


    /**
     * 设置「短信 ID」值
     * @param val
     */
    MailNotificationDTO setSmsIdInt(Integer smsIdInt) {
        this.smsIdInt = smsIdInt
        return this
    }


    /**
     * 设置「短信息号码」值
     * @param val
     */
    MailNotificationDTO setSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber
        return this
    }

}
