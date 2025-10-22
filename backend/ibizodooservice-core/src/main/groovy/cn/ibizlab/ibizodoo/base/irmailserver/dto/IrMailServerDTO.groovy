package cn.ibizlab.ibizodoo.base.irmailserver.dto

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
class IrMailServerDTO extends GroovyDTO<IrMailServerDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
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
     * 「FROM 过滤」
     */
    @JsonProperty("from_filter")
    String fromFilter
    /**
     * 「访问令牌」
     */
    @JsonProperty("google_gmail_access_token")
    String googleGmailAccessToken
    /**
     * 「访问令牌到期时间戳」
     */
    @JsonProperty("google_gmail_access_token_expiration")
    Integer googleGmailAccessTokenExpiration
    /**
     * 「授权码」
     */
    @JsonProperty("google_gmail_authorization_code")
    String googleGmailAuthorizationCode
    /**
     * 「更新 Token」
     */
    @JsonProperty("google_gmail_refresh_token")
    String googleGmailRefreshToken
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「最大电子邮件大小」
     */
    @JsonProperty("max_email_size")
    Double maxEmailSize
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「优先级」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「验证」
     * 字典[验证]
     */
    @JsonProperty("smtp_authentication")
    String smtpAuthentication
    /**
     * 「调试」
     * 字典[是否]
     */
    @JsonProperty("smtp_debug")
    Integer smtpDebug
    /**
     * 「连接加密」
     * 字典[连接加密]
     */
    @JsonProperty("smtp_encryption")
    String smtpEncryption
    /**
     * 「SMTP服务器」
     */
    @JsonProperty("smtp_host")
    String smtpHost
    /**
     * 「密码」
     */
    @JsonProperty("smtp_pass")
    String smtpPass
    /**
     * 「SMTP端口」
     */
    @JsonProperty("smtp_port")
    Integer smtpPort
    /**
     * 「用户名」
     */
    @JsonProperty("smtp_user")
    String smtpUser
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
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    IrMailServerDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IrMailServerDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrMailServerDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「FROM 过滤」值
     * @param val
     */
    IrMailServerDTO setFromFilter(String fromFilter) {
        this.fromFilter = fromFilter
        return this
    }


    /**
     * 设置「访问令牌」值
     * @param val
     */
    IrMailServerDTO setGoogleGmailAccessToken(String googleGmailAccessToken) {
        this.googleGmailAccessToken = googleGmailAccessToken
        return this
    }


    /**
     * 设置「访问令牌到期时间戳」值
     * @param val
     */
    IrMailServerDTO setGoogleGmailAccessTokenExpiration(Integer googleGmailAccessTokenExpiration) {
        this.googleGmailAccessTokenExpiration = googleGmailAccessTokenExpiration
        return this
    }


    /**
     * 设置「授权码」值
     * @param val
     */
    IrMailServerDTO setGoogleGmailAuthorizationCode(String googleGmailAuthorizationCode) {
        this.googleGmailAuthorizationCode = googleGmailAuthorizationCode
        return this
    }


    /**
     * 设置「更新 Token」值
     * @param val
     */
    IrMailServerDTO setGoogleGmailRefreshToken(String googleGmailRefreshToken) {
        this.googleGmailRefreshToken = googleGmailRefreshToken
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrMailServerDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「最大电子邮件大小」值
     * @param val
     */
    IrMailServerDTO setMaxEmailSize(Double maxEmailSize) {
        this.maxEmailSize = maxEmailSize
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrMailServerDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「优先级」值
     * @param val
     */
    IrMailServerDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「验证」值
     * 字典[验证]
     * @param val
     */
    IrMailServerDTO setSmtpAuthentication(String smtpAuthentication) {
        this.smtpAuthentication = smtpAuthentication
        return this
    }


    /**
     * 设置「调试」值
     * 字典[是否]
     * @param val
     */
    IrMailServerDTO setSmtpDebug(Integer smtpDebug) {
        this.smtpDebug = smtpDebug
        return this
    }


    /**
     * 设置「连接加密」值
     * 字典[连接加密]
     * @param val
     */
    IrMailServerDTO setSmtpEncryption(String smtpEncryption) {
        this.smtpEncryption = smtpEncryption
        return this
    }


    /**
     * 设置「SMTP服务器」值
     * @param val
     */
    IrMailServerDTO setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost
        return this
    }


    /**
     * 设置「密码」值
     * @param val
     */
    IrMailServerDTO setSmtpPass(String smtpPass) {
        this.smtpPass = smtpPass
        return this
    }


    /**
     * 设置「SMTP端口」值
     * @param val
     */
    IrMailServerDTO setSmtpPort(Integer smtpPort) {
        this.smtpPort = smtpPort
        return this
    }


    /**
     * 设置「用户名」值
     * @param val
     */
    IrMailServerDTO setSmtpUser(String smtpUser) {
        this.smtpUser = smtpUser
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrMailServerDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrMailServerDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
