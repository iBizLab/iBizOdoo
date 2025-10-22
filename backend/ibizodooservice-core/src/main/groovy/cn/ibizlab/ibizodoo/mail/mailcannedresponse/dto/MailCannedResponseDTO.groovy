package cn.ibizlab.ibizodoo.mail.mailcannedresponse.dto

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
class MailCannedResponseDTO extends GroovyDTO<MailCannedResponseDTO> {

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
     * 「描述」
     */
    @JsonProperty("description")
    String description
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
     * 「确定当前用户是否可以编辑预制回复」
     * 字典[是否]
     */
    @JsonProperty("is_editable")
    Integer isEditable
    /**
     * 「确定预设回复当前是否与其他用户共享」
     * 字典[是否]
     */
    @JsonProperty("is_shared")
    Integer isShared
    /**
     * 「上次使用」
     */
    @JsonProperty("last_used")
    Timestamp lastUsed
    /**
     * 「快捷」
     */
    @JsonProperty("source")
    String source
    /**
     * 「替换」
     */
    @JsonProperty("substitution")
    String substitution
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
    MailCannedResponseDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailCannedResponseDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    MailCannedResponseDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailCannedResponseDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailCannedResponseDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「确定当前用户是否可以编辑预制回复」值
     * 字典[是否]
     * @param val
     */
    MailCannedResponseDTO setIsEditable(Integer isEditable) {
        this.isEditable = isEditable
        return this
    }


    /**
     * 设置「确定预设回复当前是否与其他用户共享」值
     * 字典[是否]
     * @param val
     */
    MailCannedResponseDTO setIsShared(Integer isShared) {
        this.isShared = isShared
        return this
    }


    /**
     * 设置「上次使用」值
     * @param val
     */
    MailCannedResponseDTO setLastUsed(Timestamp lastUsed) {
        this.lastUsed = lastUsed
        return this
    }


    /**
     * 设置「快捷」值
     * @param val
     */
    MailCannedResponseDTO setSource(String source) {
        this.source = source
        return this
    }


    /**
     * 设置「替换」值
     * @param val
     */
    MailCannedResponseDTO setSubstitution(String substitution) {
        this.substitution = substitution
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailCannedResponseDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailCannedResponseDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
