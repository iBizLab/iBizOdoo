package cn.ibizlab.ibizodoo.hr.hrholidayssummaryemployee.dto

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
class HrHolidaysSummaryEmployeeDTO extends GroovyDTO<HrHolidaysSummaryEmployeeDTO> {

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
     * 「来自」
     */
    @JsonProperty("date_from")
    Timestamp dateFrom
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「选择休假类别」
     * 字典[选择休假类别]
     */
    @JsonProperty("holiday_type")
    String holidayType
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
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
    HrHolidaysSummaryEmployeeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrHolidaysSummaryEmployeeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「来自」值
     * @param val
     */
    HrHolidaysSummaryEmployeeDTO setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrHolidaysSummaryEmployeeDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「选择休假类别」值
     * 字典[选择休假类别]
     * @param val
     */
    HrHolidaysSummaryEmployeeDTO setHolidayType(String holidayType) {
        this.holidayType = holidayType
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrHolidaysSummaryEmployeeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrHolidaysSummaryEmployeeDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrHolidaysSummaryEmployeeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
