package cn.ibizlab.ibizodoo.mail.fetchmailserver.dto

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
class FetchmailServerDTO extends GroovyDTO<FetchmailServerDTO> {

    /**
     * 「创建新记录」
     * 字典[模型]
     */
    @JsonProperty("object_id")
    String objectId
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「保存附件」
     * 字典[是否]
     */
    @JsonProperty("attach")
    Integer attach
    /**
     * 「配置」
     */
    @JsonProperty("configuration")
    String configuration
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
     * 「最后收取日期」
     */
    @JsonProperty("date")
    Timestamp date
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
     * 「SSL/TLS」
     * 字典[是否]
     */
    @JsonProperty("is_ssl")
    Integer isSsl
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「保留原件」
     * 字典[是否]
     */
    @JsonProperty("original")
    Integer original
    /**
     * 「密码」
     */
    @JsonProperty("password")
    String password
    /**
     * 「端口」
     */
    @JsonProperty("port")
    Integer port
    /**
     * 「服务器优先级」
     */
    @JsonProperty("priority")
    Integer priority
    /**
     * 「脚本」
     */
    @JsonProperty("script")
    String script
    /**
     * 「服务器名称」
     */
    @JsonProperty("server")
    String server
    /**
     * 「服务器类型」
     * 字典[服务器类型]
     */
    @JsonProperty("server_type")
    String serverType
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「用户名」
     */
    @JsonProperty("user")
    String user
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
     * 设置「创建新记录」值
     * 字典[模型]
     * @param val
     */
    FetchmailServerDTO setObjectId(String objectId) {
        this.objectId = objectId
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    FetchmailServerDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「保存附件」值
     * 字典[是否]
     * @param val
     */
    FetchmailServerDTO setAttach(Integer attach) {
        this.attach = attach
        return this
    }


    /**
     * 设置「配置」值
     * @param val
     */
    FetchmailServerDTO setConfiguration(String configuration) {
        this.configuration = configuration
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    FetchmailServerDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    FetchmailServerDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「最后收取日期」值
     * @param val
     */
    FetchmailServerDTO setDate(Timestamp date) {
        this.date = date
        return this
    }


    /**
     * 设置「访问令牌」值
     * @param val
     */
    FetchmailServerDTO setGoogleGmailAccessToken(String googleGmailAccessToken) {
        this.googleGmailAccessToken = googleGmailAccessToken
        return this
    }


    /**
     * 设置「访问令牌到期时间戳」值
     * @param val
     */
    FetchmailServerDTO setGoogleGmailAccessTokenExpiration(Integer googleGmailAccessTokenExpiration) {
        this.googleGmailAccessTokenExpiration = googleGmailAccessTokenExpiration
        return this
    }


    /**
     * 设置「授权码」值
     * @param val
     */
    FetchmailServerDTO setGoogleGmailAuthorizationCode(String googleGmailAuthorizationCode) {
        this.googleGmailAuthorizationCode = googleGmailAuthorizationCode
        return this
    }


    /**
     * 设置「更新 Token」值
     * @param val
     */
    FetchmailServerDTO setGoogleGmailRefreshToken(String googleGmailRefreshToken) {
        this.googleGmailRefreshToken = googleGmailRefreshToken
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    FetchmailServerDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「SSL/TLS」值
     * 字典[是否]
     * @param val
     */
    FetchmailServerDTO setIsSsl(Integer isSsl) {
        this.isSsl = isSsl
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    FetchmailServerDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「保留原件」值
     * 字典[是否]
     * @param val
     */
    FetchmailServerDTO setOriginal(Integer original) {
        this.original = original
        return this
    }


    /**
     * 设置「密码」值
     * @param val
     */
    FetchmailServerDTO setPassword(String password) {
        this.password = password
        return this
    }


    /**
     * 设置「端口」值
     * @param val
     */
    FetchmailServerDTO setPort(Integer port) {
        this.port = port
        return this
    }


    /**
     * 设置「服务器优先级」值
     * @param val
     */
    FetchmailServerDTO setPriority(Integer priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「脚本」值
     * @param val
     */
    FetchmailServerDTO setScript(String script) {
        this.script = script
        return this
    }


    /**
     * 设置「服务器名称」值
     * @param val
     */
    FetchmailServerDTO setServer(String server) {
        this.server = server
        return this
    }


    /**
     * 设置「服务器类型」值
     * 字典[服务器类型]
     * @param val
     */
    FetchmailServerDTO setServerType(String serverType) {
        this.serverType = serverType
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    FetchmailServerDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「用户名」值
     * @param val
     */
    FetchmailServerDTO setUser(String user) {
        this.user = user
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    FetchmailServerDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    FetchmailServerDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
