package cn.ibizlab.ibizodoo.hr.hrleavemandatoryday.dto

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
class HrLeaveMandatoryDayDTO extends GroovyDTO<HrLeaveMandatoryDayDTO> {

    /**
     * 「颜色」
     */
    @JsonProperty("color")
    Integer color
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
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
     * 「结束日期」
     */
    @JsonProperty("end_date")
    Timestamp endDate
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
     * 「工作时间」
     */
    @JsonProperty("resource_calendar_id")
    String resourceCalendarId
    /**
     * 「开始日期」
     */
    @JsonProperty("start_date")
    Timestamp startDate
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
     * 设置「颜色」值
     * @param val
     */
    HrLeaveMandatoryDayDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrLeaveMandatoryDayDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrLeaveMandatoryDayDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveMandatoryDayDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrLeaveMandatoryDayDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    HrLeaveMandatoryDayDTO setEndDate(Timestamp endDate) {
        this.endDate = endDate
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrLeaveMandatoryDayDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrLeaveMandatoryDayDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「工作时间」值
     * @param val
     */
    HrLeaveMandatoryDayDTO setResourceCalendarId(String resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId
        return this
    }


    /**
     * 设置「开始日期」值
     * @param val
     */
    HrLeaveMandatoryDayDTO setStartDate(Timestamp startDate) {
        this.startDate = startDate
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrLeaveMandatoryDayDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveMandatoryDayDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
