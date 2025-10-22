package cn.ibizlab.ibizodoo.hr.hremployeeskillreport.dto

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
class HrEmployeeSkillReportDTO extends GroovyDTO<HrEmployeeSkillReportDTO> {

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
     * 「等级进度」
     */
    @JsonProperty("level_progress")
    Double levelProgress
    /**
     * 「技能」
     */
    @JsonProperty("skill_id")
    String skillId
    /**
     * 「技能等级」
     */
    @JsonProperty("skill_level")
    String skillLevel
    /**
     * 「技能类型」
     */
    @JsonProperty("skill_type_id")
    String skillTypeId

    /**
     * 设置「公司」值
     * @param val
     */
    HrEmployeeSkillReportDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrEmployeeSkillReportDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrEmployeeSkillReportDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「拥有部门经理访问权限」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeSkillReportDTO setHasDepartmentManagerAccess(Integer hasDepartmentManagerAccess) {
        this.hasDepartmentManagerAccess = hasDepartmentManagerAccess
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrEmployeeSkillReportDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「等级进度」值
     * @param val
     */
    HrEmployeeSkillReportDTO setLevelProgress(Double levelProgress) {
        this.levelProgress = levelProgress
        return this
    }


    /**
     * 设置「技能」值
     * @param val
     */
    HrEmployeeSkillReportDTO setSkillId(String skillId) {
        this.skillId = skillId
        return this
    }


    /**
     * 设置「技能等级」值
     * @param val
     */
    HrEmployeeSkillReportDTO setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel
        return this
    }


    /**
     * 设置「技能类型」值
     * @param val
     */
    HrEmployeeSkillReportDTO setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId
        return this
    }

}
