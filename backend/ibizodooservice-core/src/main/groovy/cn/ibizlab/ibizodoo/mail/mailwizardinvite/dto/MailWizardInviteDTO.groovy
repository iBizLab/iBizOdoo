package cn.ibizlab.ibizodoo.mail.mailwizardinvite.dto

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
class MailWizardInviteDTO extends GroovyDTO<MailWizardInviteDTO> {

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
     * 「消息」
     */
    @JsonProperty("message")
    String message
    /**
     * 「通知收件人」
     * 字典[是否]
     */
    @JsonProperty("notify")
    Integer notify
    /**
     * 「相关单据ID」
     */
    @JsonProperty("res_id")
    Integer resId
    /**
     * 「相关单据模型」
     */
    @JsonProperty("res_model")
    String resModel
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
    MailWizardInviteDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailWizardInviteDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailWizardInviteDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailWizardInviteDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「消息」值
     * @param val
     */
    MailWizardInviteDTO setMessage(String message) {
        this.message = message
        return this
    }


    /**
     * 设置「通知收件人」值
     * 字典[是否]
     * @param val
     */
    MailWizardInviteDTO setNotify(Integer notify) {
        this.notify = notify
        return this
    }


    /**
     * 设置「相关单据ID」值
     * @param val
     */
    MailWizardInviteDTO setResId(Integer resId) {
        this.resId = resId
        return this
    }


    /**
     * 设置「相关单据模型」值
     * @param val
     */
    MailWizardInviteDTO setResModel(String resModel) {
        this.resModel = resModel
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailWizardInviteDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailWizardInviteDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
