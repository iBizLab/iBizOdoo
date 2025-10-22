package cn.ibizlab.ibizodoo.mail.mailiceserver.dto

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
class MailIceServerDTO extends GroovyDTO<MailIceServerDTO> {

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
     * 「凭据」
     */
    @JsonProperty("credential")
    String credential
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
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("server_type")
    String serverType
    /**
     * 「URI」
     */
    @JsonProperty("uri")
    String uri
    /**
     * 「用户名」
     */
    @JsonProperty("username")
    String username
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
    MailIceServerDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailIceServerDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「凭据」值
     * @param val
     */
    MailIceServerDTO setCredential(String credential) {
        this.credential = credential
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailIceServerDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailIceServerDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    MailIceServerDTO setServerType(String serverType) {
        this.serverType = serverType
        return this
    }


    /**
     * 设置「URI」值
     * @param val
     */
    MailIceServerDTO setUri(String uri) {
        this.uri = uri
        return this
    }


    /**
     * 设置「用户名」值
     * @param val
     */
    MailIceServerDTO setUsername(String username) {
        this.username = username
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailIceServerDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailIceServerDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
