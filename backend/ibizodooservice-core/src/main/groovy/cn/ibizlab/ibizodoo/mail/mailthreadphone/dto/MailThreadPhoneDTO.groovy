package cn.ibizlab.ibizodoo.mail.mailthreadphone.dto

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
class MailThreadPhoneDTO extends GroovyDTO<MailThreadPhoneDTO> {

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
     * 「所需操作」
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
     * 「列入黑名单的手机是移动的」
     * 字典[是否]
     */
    @JsonProperty("mobile_blacklisted")
    Integer mobileBlacklisted
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「列入黑名单的电话是电话」
     * 字典[是否]
     */
    @JsonProperty("phone_blacklisted")
    Integer phoneBlacklisted
    /**
     * 「电话/手机」
     */
    @JsonProperty("phone_mobile_search")
    String phoneMobileSearch
    /**
     * 「净化数量」
     */
    @JsonProperty("phone_sanitized")
    String phoneSanitized
    /**
     * 「电话号码被列入黑名单」
     * 字典[是否]
     */
    @JsonProperty("phone_sanitized_blacklisted")
    Integer phoneSanitizedBlacklisted

    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    MailThreadPhoneDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailThreadPhoneDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    MailThreadPhoneDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    MailThreadPhoneDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    MailThreadPhoneDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    MailThreadPhoneDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    MailThreadPhoneDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    MailThreadPhoneDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    MailThreadPhoneDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「列入黑名单的手机是移动的」值
     * 字典[是否]
     * @param val
     */
    MailThreadPhoneDTO setMobileBlacklisted(Integer mobileBlacklisted) {
        this.mobileBlacklisted = mobileBlacklisted
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailThreadPhoneDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「列入黑名单的电话是电话」值
     * 字典[是否]
     * @param val
     */
    MailThreadPhoneDTO setPhoneBlacklisted(Integer phoneBlacklisted) {
        this.phoneBlacklisted = phoneBlacklisted
        return this
    }


    /**
     * 设置「电话/手机」值
     * @param val
     */
    MailThreadPhoneDTO setPhoneMobileSearch(String phoneMobileSearch) {
        this.phoneMobileSearch = phoneMobileSearch
        return this
    }


    /**
     * 设置「净化数量」值
     * @param val
     */
    MailThreadPhoneDTO setPhoneSanitized(String phoneSanitized) {
        this.phoneSanitized = phoneSanitized
        return this
    }


    /**
     * 设置「电话号码被列入黑名单」值
     * 字典[是否]
     * @param val
     */
    MailThreadPhoneDTO setPhoneSanitizedBlacklisted(Integer phoneSanitizedBlacklisted) {
        this.phoneSanitizedBlacklisted = phoneSanitizedBlacklisted
        return this
    }

}
