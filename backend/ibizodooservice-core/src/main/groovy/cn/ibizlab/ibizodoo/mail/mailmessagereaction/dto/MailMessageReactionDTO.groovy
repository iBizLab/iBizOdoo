package cn.ibizlab.ibizodoo.mail.mailmessagereaction.dto

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
class MailMessageReactionDTO extends GroovyDTO<MailMessageReactionDTO> {

    /**
     * 「内容」
     */
    @JsonProperty("content")
    String content
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「反应的访客」
     */
    @JsonProperty("guest_id")
    String guestId
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
     * 「反应的伙伴」
     */
    @JsonProperty("partner_id")
    String partnerId

    /**
     * 设置「内容」值
     * @param val
     */
    MailMessageReactionDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailMessageReactionDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「反应的访客」值
     * @param val
     */
    MailMessageReactionDTO setGuestId(String guestId) {
        this.guestId = guestId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailMessageReactionDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「消息」值
     * @param val
     */
    MailMessageReactionDTO setMessageId(String messageId) {
        this.messageId = messageId
        return this
    }


    /**
     * 设置「反应的伙伴」值
     * @param val
     */
    MailMessageReactionDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }

}
