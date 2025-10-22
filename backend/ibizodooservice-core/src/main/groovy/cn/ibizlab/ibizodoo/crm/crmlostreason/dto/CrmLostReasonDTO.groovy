package cn.ibizlab.ibizodoo.crm.crmlostreason.dto

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
class CrmLostReasonDTO extends GroovyDTO<CrmLostReasonDTO> {

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
     * 「线索数量」
     */
    @JsonProperty("leads_count")
    Integer leadsCount
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
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
    CrmLostReasonDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CrmLostReasonDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmLostReasonDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmLostReasonDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmLostReasonDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「线索数量」值
     * @param val
     */
    CrmLostReasonDTO setLeadsCount(Integer leadsCount) {
        this.leadsCount = leadsCount
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CrmLostReasonDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmLostReasonDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmLostReasonDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
