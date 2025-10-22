package cn.ibizlab.ibizodoo.hr.hrleaveemployeetypereport.dto

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
class HrLeaveEmployeeTypeReportDTO extends GroovyDTO<HrLeaveEmployeeTypeReportDTO> {

    /**
     * 「在职员工」
     * 字典[是否]
     */
    @JsonProperty("active_employee")
    Integer activeEmployee
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
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
     * 「员工」
     */
    @JsonProperty("employee_id")
    String employeeId
    /**
     * 「假期状况」
     * 字典[假期状况]
     */
    @JsonProperty("holiday_status")
    String holidayStatus
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「天数」
     */
    @JsonProperty("number_of_days")
    Double numberOfDays
    /**
     * 「工时数」
     */
    @JsonProperty("number_of_hours")
    Double numberOfHours
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state

    /**
     * 设置「在职员工」值
     * 字典[是否]
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setActiveEmployee(Integer activeEmployee) {
        this.activeEmployee = activeEmployee
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「开始日期」值
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「假期状况」值
     * 字典[假期状况]
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setHolidayStatus(String holidayStatus) {
        this.holidayStatus = holidayStatus
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「天数」值
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setNumberOfDays(Double numberOfDays) {
        this.numberOfDays = numberOfDays
        return this
    }


    /**
     * 设置「工时数」值
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setNumberOfHours(Double numberOfHours) {
        this.numberOfHours = numberOfHours
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    HrLeaveEmployeeTypeReportDTO setState(String state) {
        this.state = state
        return this
    }

}
