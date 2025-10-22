package cn.ibizlab.ibizodoo.base.resusersapikeys.dto

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
class ResUsersApikeysDTO extends GroovyDTO<ResUsersApikeysDTO> {

    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「有效期」
     */
    @JsonProperty("expiration_date")
    Timestamp expirationDate
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「范围」
     */
    @JsonProperty("scope")
    String scope
    /**
     * 「用户」
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「建立时间」值
     * @param val
     */
    ResUsersApikeysDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResUsersApikeysDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「有效期」值
     * @param val
     */
    ResUsersApikeysDTO setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResUsersApikeysDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResUsersApikeysDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「范围」值
     * @param val
     */
    ResUsersApikeysDTO setScope(String scope) {
        this.scope = scope
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    ResUsersApikeysDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
