package cn.ibizlab.ibizodoo.mail.mailactivitytodocreate.dto

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
class MailActivityTodoCreateDTO extends GroovyDTO<MailActivityTodoCreateDTO> {

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
     * 「截止日期」
     */
    @JsonProperty("date_deadline")
    Timestamp dateDeadline
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
     * 「注意」
     */
    @JsonProperty("note")
    String note
    /**
     * 「摘要」
     */
    @JsonProperty("summary")
    String summary
    /**
     * 「指派给」
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
     * 设置「建立时间」值
     * @param val
     */
    MailActivityTodoCreateDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailActivityTodoCreateDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「截止日期」值
     * @param val
     */
    MailActivityTodoCreateDTO setDateDeadline(Timestamp dateDeadline) {
        this.dateDeadline = dateDeadline
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailActivityTodoCreateDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailActivityTodoCreateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「注意」值
     * @param val
     */
    MailActivityTodoCreateDTO setNote(String note) {
        this.note = note
        return this
    }


    /**
     * 设置「摘要」值
     * @param val
     */
    MailActivityTodoCreateDTO setSummary(String summary) {
        this.summary = summary
        return this
    }


    /**
     * 设置「指派给」值
     * @param val
     */
    MailActivityTodoCreateDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailActivityTodoCreateDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailActivityTodoCreateDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
