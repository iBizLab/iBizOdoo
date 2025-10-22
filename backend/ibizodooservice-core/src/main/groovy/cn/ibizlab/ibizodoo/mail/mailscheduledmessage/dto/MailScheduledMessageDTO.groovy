package cn.ibizlab.ibizodoo.mail.mailscheduledmessage.dto

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
class MailScheduledMessageDTO extends GroovyDTO<MailScheduledMessageDTO> {

    /**
     * 「作者」
     */
    @JsonProperty("author_id")
    String authorId
    /**
     * 「内容」
     */
    @JsonProperty("body")
    String body
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「是备注」
     * 字典[是否]
     */
    @JsonProperty("is_note")
    Integer isNote
    /**
     * 「相关单据模型」
     */
    @JsonProperty("model")
    String model
    /**
     * 「通知参数」
     */
    @JsonProperty("notification_parameters")
    String notificationParameters
    /**
     * 「安排的日期」
     */
    @JsonProperty("scheduled_date")
    Timestamp scheduledDate
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
     * 设置「作者」值
     * @param val
     */
    MailScheduledMessageDTO setAuthorId(String authorId) {
        this.authorId = authorId
        return this
    }


    /**
     * 设置「内容」值
     * @param val
     */
    MailScheduledMessageDTO setBody(String body) {
        this.body = body
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailScheduledMessageDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailScheduledMessageDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailScheduledMessageDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailScheduledMessageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是备注」值
     * 字典[是否]
     * @param val
     */
    MailScheduledMessageDTO setIsNote(Integer isNote) {
        this.isNote = isNote
        return this
    }


    /**
     * 设置「相关单据模型」值
     * @param val
     */
    MailScheduledMessageDTO setModel(String model) {
        this.model = model
        return this
    }


    /**
     * 设置「通知参数」值
     * @param val
     */
    MailScheduledMessageDTO setNotificationParameters(String notificationParameters) {
        this.notificationParameters = notificationParameters
        return this
    }


    /**
     * 设置「安排的日期」值
     * @param val
     */
    MailScheduledMessageDTO setScheduledDate(Timestamp scheduledDate) {
        this.scheduledDate = scheduledDate
        return this
    }


    /**
     * 设置「主旨」值
     * @param val
     */
    MailScheduledMessageDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailScheduledMessageDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailScheduledMessageDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
