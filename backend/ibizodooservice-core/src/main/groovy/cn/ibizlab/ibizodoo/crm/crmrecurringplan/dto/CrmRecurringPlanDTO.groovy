package cn.ibizlab.ibizodoo.crm.crmrecurringplan.dto

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
class CrmRecurringPlanDTO extends GroovyDTO<CrmRecurringPlanDTO> {

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
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「月数」
     */
    @JsonProperty("number_of_months")
    Integer numberOfMonths
    /**
     * 「序号」
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
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    CrmRecurringPlanDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CrmRecurringPlanDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmRecurringPlanDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmRecurringPlanDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmRecurringPlanDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CrmRecurringPlanDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「月数」值
     * @param val
     */
    CrmRecurringPlanDTO setNumberOfMonths(Integer numberOfMonths) {
        this.numberOfMonths = numberOfMonths
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    CrmRecurringPlanDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmRecurringPlanDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmRecurringPlanDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
