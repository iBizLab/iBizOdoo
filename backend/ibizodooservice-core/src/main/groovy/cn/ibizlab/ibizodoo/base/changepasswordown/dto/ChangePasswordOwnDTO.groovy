package cn.ibizlab.ibizodoo.base.changepasswordown.dto

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
class ChangePasswordOwnDTO extends GroovyDTO<ChangePasswordOwnDTO> {

    /**
     * 「新密码（确认）」
     */
    @JsonProperty("confirm_password")
    String confirmPassword
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
    @JsonProperty("new_password")
    String newPassword
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
     * 设置「新密码（确认）」值
     * @param val
     */
    ChangePasswordOwnDTO setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ChangePasswordOwnDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ChangePasswordOwnDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ChangePasswordOwnDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「新密码」值
     * @param val
     */
    ChangePasswordOwnDTO setNewPassword(String newPassword) {
        this.newPassword = newPassword
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ChangePasswordOwnDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ChangePasswordOwnDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
