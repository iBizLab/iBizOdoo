package cn.ibizlab.ibizodoo.mail.mailresendmessage.dto

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
class MailResendMessageDTO extends GroovyDTO<MailResendMessageDTO> {

    /**
     * 「可以取消」
     * 字典[是否]
     */
    @JsonProperty("can_cancel")
    Integer canCancel
    /**
     * 「可以重新发送」
     * 字典[是否]
     */
    @JsonProperty("can_resend")
    Integer canResend
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
    @JsonProperty("mail_message_id")
    String mailMessageId
    /**
     * 「业务合作伙伴只读」
     * 字典[是否]
     */
    @JsonProperty("partner_readonly")
    Integer partnerReadonly
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
     * 设置「可以取消」值
     * 字典[是否]
     * @param val
     */
    MailResendMessageDTO setCanCancel(Integer canCancel) {
        this.canCancel = canCancel
        return this
    }


    /**
     * 设置「可以重新发送」值
     * 字典[是否]
     * @param val
     */
    MailResendMessageDTO setCanResend(Integer canResend) {
        this.canResend = canResend
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailResendMessageDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailResendMessageDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailResendMessageDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailResendMessageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「消息」值
     * @param val
     */
    MailResendMessageDTO setMailMessageId(String mailMessageId) {
        this.mailMessageId = mailMessageId
        return this
    }


    /**
     * 设置「业务合作伙伴只读」值
     * 字典[是否]
     * @param val
     */
    MailResendMessageDTO setPartnerReadonly(Integer partnerReadonly) {
        this.partnerReadonly = partnerReadonly
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailResendMessageDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailResendMessageDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
