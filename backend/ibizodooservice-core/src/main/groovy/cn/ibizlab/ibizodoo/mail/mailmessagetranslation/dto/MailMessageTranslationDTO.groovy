package cn.ibizlab.ibizodoo.mail.mailmessagetranslation.dto

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
class MailMessageTranslationDTO extends GroovyDTO<MailMessageTranslationDTO> {

    /**
     * 「翻译正文」
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
     * 「消息」
     */
    @JsonProperty("message_id")
    String messageId
    /**
     * 「语言」
     */
    @JsonProperty("source_lang")
    String sourceLang
    /**
     * 「目标语言」
     */
    @JsonProperty("target_lang")
    String targetLang
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
     * 设置「翻译正文」值
     * @param val
     */
    MailMessageTranslationDTO setBody(String body) {
        this.body = body
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailMessageTranslationDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailMessageTranslationDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailMessageTranslationDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailMessageTranslationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「消息」值
     * @param val
     */
    MailMessageTranslationDTO setMessageId(String messageId) {
        this.messageId = messageId
        return this
    }


    /**
     * 设置「语言」值
     * @param val
     */
    MailMessageTranslationDTO setSourceLang(String sourceLang) {
        this.sourceLang = sourceLang
        return this
    }


    /**
     * 设置「目标语言」值
     * @param val
     */
    MailMessageTranslationDTO setTargetLang(String targetLang) {
        this.targetLang = targetLang
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailMessageTranslationDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailMessageTranslationDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
