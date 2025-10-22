package cn.ibizlab.ibizodoo.hr.hrleavereportcalendar.dto

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
class HrLeaveReportCalendarDTO extends GroovyDTO<HrLeaveReportCalendarDTO> {

    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「部门」
     */
    @JsonProperty("department_id")
    String departmentId
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
     * 「时长」
     */
    @JsonProperty("duration")
    Double duration
    /**
     * 「员工」
     */
    @JsonProperty("employee_id")
    String employeeId
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
     * 「已孵化」
     * 字典[是否]
     */
    @JsonProperty("is_hatched")
    Integer isHatched
    /**
     * 「管理员」
     * 字典[是否]
     */
    @JsonProperty("is_manager")
    Integer isManager
    /**
     * 「罢工」
     * 字典[是否]
     */
    @JsonProperty("is_striked")
    Integer isStriked
    /**
     * 「工作」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「离开」
     */
    @JsonProperty("leave_id")
    String leaveId
    /**
     * 「来自」
     */
    @JsonProperty("start_datetime")
    Timestamp startDatetime
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「至」
     */
    @JsonProperty("stop_datetime")
    Timestamp stopDatetime

    /**
     * 设置「公司」值
     * @param val
     */
    HrLeaveReportCalendarDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrLeaveReportCalendarDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    HrLeaveReportCalendarDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrLeaveReportCalendarDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「时长」值
     * @param val
     */
    HrLeaveReportCalendarDTO setDuration(Double duration) {
        this.duration = duration
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrLeaveReportCalendarDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「休假类型」值
     * @param val
     */
    HrLeaveReportCalendarDTO setHolidayStatusId(String holidayStatusId) {
        this.holidayStatusId = holidayStatusId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrLeaveReportCalendarDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「已孵化」值
     * 字典[是否]
     * @param val
     */
    HrLeaveReportCalendarDTO setIsHatched(Integer isHatched) {
        this.isHatched = isHatched
        return this
    }


    /**
     * 设置「管理员」值
     * 字典[是否]
     * @param val
     */
    HrLeaveReportCalendarDTO setIsManager(Integer isManager) {
        this.isManager = isManager
        return this
    }


    /**
     * 设置「罢工」值
     * 字典[是否]
     * @param val
     */
    HrLeaveReportCalendarDTO setIsStriked(Integer isStriked) {
        this.isStriked = isStriked
        return this
    }


    /**
     * 设置「工作」值
     * @param val
     */
    HrLeaveReportCalendarDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「离开」值
     * @param val
     */
    HrLeaveReportCalendarDTO setLeaveId(String leaveId) {
        this.leaveId = leaveId
        return this
    }


    /**
     * 设置「来自」值
     * @param val
     */
    HrLeaveReportCalendarDTO setStartDatetime(Timestamp startDatetime) {
        this.startDatetime = startDatetime
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    HrLeaveReportCalendarDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「至」值
     * @param val
     */
    HrLeaveReportCalendarDTO setStopDatetime(Timestamp stopDatetime) {
        this.stopDatetime = stopDatetime
        return this
    }

}
