package cn.ibizlab.ibizodoo.base.changepassworduser.dto

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
class ChangePasswordUserDTO extends GroovyDTO<ChangePasswordUserDTO> {

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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「新密码」
     */
    @JsonProperty("new_passwd")
    String newPasswd
    /**
     * 「用户登录」
     */
    @JsonProperty("user_login")
    String userLogin
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
    ChangePasswordUserDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ChangePasswordUserDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ChangePasswordUserDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「新密码」值
     * @param val
     */
    ChangePasswordUserDTO setNewPasswd(String newPasswd) {
        this.newPasswd = newPasswd
        return this
    }


    /**
     * 设置「用户登录」值
     * @param val
     */
    ChangePasswordUserDTO setUserLogin(String userLogin) {
        this.userLogin = userLogin
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ChangePasswordUserDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ChangePasswordUserDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
