package cn.ibizlab.ibizodoo.crm.crmiapleadindustry.dto

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
class CrmIapLeadIndustryDTO extends GroovyDTO<CrmIapLeadIndustryDTO> {

    /**
     * 「颜色指标」
     */
    @JsonProperty("color")
    Integer color
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
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「显示」
     */
    @JsonProperty("reveal_ids")
    String revealIds
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
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
     * 设置「颜色指标」值
     * @param val
     */
    CrmIapLeadIndustryDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CrmIapLeadIndustryDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmIapLeadIndustryDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmIapLeadIndustryDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmIapLeadIndustryDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CrmIapLeadIndustryDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「显示」值
     * @param val
     */
    CrmIapLeadIndustryDTO setRevealIds(String revealIds) {
        this.revealIds = revealIds
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    CrmIapLeadIndustryDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmIapLeadIndustryDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmIapLeadIndustryDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
