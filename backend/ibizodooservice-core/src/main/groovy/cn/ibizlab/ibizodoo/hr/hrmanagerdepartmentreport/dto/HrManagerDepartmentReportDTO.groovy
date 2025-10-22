package cn.ibizlab.ibizodoo.hr.hrmanagerdepartmentreport.dto

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
class HrManagerDepartmentReportDTO extends GroovyDTO<HrManagerDepartmentReportDTO> {

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
     * 设置「员工」值
     * @param val
     */
    HrManagerDepartmentReportDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「拥有部门经理访问权限」值
     * 字典[是否]
     * @param val
     */
    HrManagerDepartmentReportDTO setHasDepartmentManagerAccess(Integer hasDepartmentManagerAccess) {
        this.hasDepartmentManagerAccess = hasDepartmentManagerAccess
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrManagerDepartmentReportDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrManagerDepartmentReportDTO setName(String name) {
        this.name = name
        return this
    }

}
