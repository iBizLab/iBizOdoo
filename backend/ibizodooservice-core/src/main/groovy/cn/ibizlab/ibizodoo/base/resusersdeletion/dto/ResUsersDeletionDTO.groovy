package cn.ibizlab.ibizodoo.base.resusersdeletion.dto

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
class ResUsersDeletionDTO extends GroovyDTO<ResUsersDeletionDTO> {

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
     * 「省/州」
     * 字典[省/州]
     */
    @JsonProperty("state")
    String state
    /**
     * 「用户」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「用户ID」
     */
    @JsonProperty("user_id_int")
    Integer userIdInt
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
    ResUsersDeletionDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResUsersDeletionDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResUsersDeletionDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResUsersDeletionDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「省/州」值
     * 字典[省/州]
     * @param val
     */
    ResUsersDeletionDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    ResUsersDeletionDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「用户ID」值
     * @param val
     */
    ResUsersDeletionDTO setUserIdInt(Integer userIdInt) {
        this.userIdInt = userIdInt
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResUsersDeletionDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResUsersDeletionDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
