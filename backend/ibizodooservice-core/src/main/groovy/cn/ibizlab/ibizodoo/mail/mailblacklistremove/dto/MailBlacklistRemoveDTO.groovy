package cn.ibizlab.ibizodoo.mail.mailblacklistremove.dto

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
class MailBlacklistRemoveDTO extends GroovyDTO<MailBlacklistRemoveDTO> {

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
     * 「电子邮件」
     */
    @JsonProperty("email")
    String email
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「原因」
     */
    @JsonProperty("reason")
    String reason
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
    MailBlacklistRemoveDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailBlacklistRemoveDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailBlacklistRemoveDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「电子邮件」值
     * @param val
     */
    MailBlacklistRemoveDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailBlacklistRemoveDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「原因」值
     * @param val
     */
    MailBlacklistRemoveDTO setReason(String reason) {
        this.reason = reason
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailBlacklistRemoveDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailBlacklistRemoveDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
