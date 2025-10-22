package cn.ibizlab.ibizodoo.base.resusersidentitycheck.dto

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
class ResUsersIdentitycheckDTO extends GroovyDTO<ResUsersIdentitycheckDTO> {

    /**
     * 「验证方式」
     * 字典[验证方式]
     */
    @JsonProperty("auth_method")
    String authMethod
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
     * 「密码」
     */
    @JsonProperty("password")
    String password
    /**
     * 「请求」
     */
    @JsonProperty("request")
    String request
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
     * 设置「验证方式」值
     * 字典[验证方式]
     * @param val
     */
    ResUsersIdentitycheckDTO setAuthMethod(String authMethod) {
        this.authMethod = authMethod
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResUsersIdentitycheckDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResUsersIdentitycheckDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResUsersIdentitycheckDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResUsersIdentitycheckDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「密码」值
     * @param val
     */
    ResUsersIdentitycheckDTO setPassword(String password) {
        this.password = password
        return this
    }


    /**
     * 设置「请求」值
     * @param val
     */
    ResUsersIdentitycheckDTO setRequest(String request) {
        this.request = request
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResUsersIdentitycheckDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResUsersIdentitycheckDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
