package cn.ibizlab.ibizodoo.mail.mailresendpartner.dto

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
class MailResendPartnerDTO extends GroovyDTO<MailResendPartnerDTO> {

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
     * 「错误消息」
     */
    @JsonProperty("message")
    String message
    /**
     * 「通知」
     */
    @JsonProperty("notification_id")
    String notificationId
    /**
     * 「重试」
     * 字典[是否]
     */
    @JsonProperty("resend")
    Integer resend
    /**
     * 「重发向导」
     */
    @JsonProperty("resend_wizard_id")
    String resendWizardId
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
    MailResendPartnerDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailResendPartnerDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailResendPartnerDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailResendPartnerDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「错误消息」值
     * @param val
     */
    MailResendPartnerDTO setMessage(String message) {
        this.message = message
        return this
    }


    /**
     * 设置「通知」值
     * @param val
     */
    MailResendPartnerDTO setNotificationId(String notificationId) {
        this.notificationId = notificationId
        return this
    }


    /**
     * 设置「重试」值
     * 字典[是否]
     * @param val
     */
    MailResendPartnerDTO setResend(Integer resend) {
        this.resend = resend
        return this
    }


    /**
     * 设置「重发向导」值
     * @param val
     */
    MailResendPartnerDTO setResendWizardId(String resendWizardId) {
        this.resendWizardId = resendWizardId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailResendPartnerDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailResendPartnerDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
