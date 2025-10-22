package cn.ibizlab.ibizodoo.mail.mailgatewayallowed.dto

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
class MailGatewayAllowedDTO extends GroovyDTO<MailGatewayAllowedDTO> {

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
     * 「Email地址」
     */
    @JsonProperty("email")
    String email
    /**
     * 「规范化邮件」
     */
    @JsonProperty("email_normalized")
    String emailNormalized
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
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
    MailGatewayAllowedDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailGatewayAllowedDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailGatewayAllowedDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「Email地址」值
     * @param val
     */
    MailGatewayAllowedDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「规范化邮件」值
     * @param val
     */
    MailGatewayAllowedDTO setEmailNormalized(String emailNormalized) {
        this.emailNormalized = emailNormalized
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailGatewayAllowedDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailGatewayAllowedDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailGatewayAllowedDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
