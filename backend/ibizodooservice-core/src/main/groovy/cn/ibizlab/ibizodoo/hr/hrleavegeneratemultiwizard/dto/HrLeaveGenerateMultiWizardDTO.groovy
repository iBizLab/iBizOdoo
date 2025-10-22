package cn.ibizlab.ibizodoo.hr.hrleavegeneratemultiwizard.dto

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
class HrLeaveGenerateMultiWizardDTO extends GroovyDTO<HrLeaveGenerateMultiWizardDTO> {

    /**
     * 「分配模式」
     * 字典[分配模式]
     */
    @JsonProperty("allocation_mode")
    String allocationMode
    /**
     * 「员工标签」
     */
    @JsonProperty("category_id")
    String categoryId
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
     * 「开始日期」
     */
    @JsonProperty("date_from")
    Timestamp dateFrom
    /**
     * 「结束日期」
     */
    @JsonProperty("date_to")
    Timestamp dateTo
    /**
     * 「部门」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「休假类型」
     */
    @JsonProperty("holiday_status_id")
    String holidayStatusId
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
     * 设置「分配模式」值
     * 字典[分配模式]
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setAllocationMode(String allocationMode) {
        this.allocationMode = allocationMode
        return this
    }


    /**
     * 设置「员工标签」值
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setCategoryId(String categoryId) {
        this.categoryId = categoryId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「开始日期」值
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「休假类型」值
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setHolidayStatusId(String holidayStatusId) {
        this.holidayStatusId = holidayStatusId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveGenerateMultiWizardDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
