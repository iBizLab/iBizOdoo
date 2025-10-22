package cn.ibizlab.ibizodoo.hr.hrleavereport.dto

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
class HrLeaveReportDTO extends GroovyDTO<HrLeaveReportDTO> {

    /**
     * 「分配申请」
     */
    @JsonProperty("allocation_id")
    String allocationId
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
     * 「拥有部门经理访问权限」
     * 字典[是否]
     */
    @JsonProperty("has_department_manager_access")
    Integer hasDepartmentManagerAccess
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
     * 「休假要求」
     */
    @JsonProperty("leave_id")
    String leaveId
    /**
     * 「申请类型」
     * 字典[申请类型]
     */
    @JsonProperty("leave_type")
    String leaveType
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
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
     * 设置「分配申请」值
     * @param val
     */
    HrLeaveReportDTO setAllocationId(String allocationId) {
        this.allocationId = allocationId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrLeaveReportDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「开始日期」值
     * @param val
     */
    HrLeaveReportDTO setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    HrLeaveReportDTO setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrLeaveReportDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrLeaveReportDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrLeaveReportDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「拥有部门经理访问权限」值
     * 字典[是否]
     * @param val
     */
    HrLeaveReportDTO setHasDepartmentManagerAccess(Integer hasDepartmentManagerAccess) {
        this.hasDepartmentManagerAccess = hasDepartmentManagerAccess
        return this
    }


    /**
     * 设置「休假类型」值
     * @param val
     */
    HrLeaveReportDTO setHolidayStatusId(String holidayStatusId) {
        this.holidayStatusId = holidayStatusId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrLeaveReportDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「休假要求」值
     * @param val
     */
    HrLeaveReportDTO setLeaveId(String leaveId) {
        this.leaveId = leaveId
        return this
    }


    /**
     * 设置「申请类型」值
     * 字典[申请类型]
     * @param val
     */
    HrLeaveReportDTO setLeaveType(String leaveType) {
        this.leaveType = leaveType
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrLeaveReportDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「天数」值
     * @param val
     */
    HrLeaveReportDTO setNumberOfDays(Double numberOfDays) {
        this.numberOfDays = numberOfDays
        return this
    }


    /**
     * 设置「工时数」值
     * @param val
     */
    HrLeaveReportDTO setNumberOfHours(Double numberOfHours) {
        this.numberOfHours = numberOfHours
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    HrLeaveReportDTO setState(String state) {
        this.state = state
        return this
    }

}
