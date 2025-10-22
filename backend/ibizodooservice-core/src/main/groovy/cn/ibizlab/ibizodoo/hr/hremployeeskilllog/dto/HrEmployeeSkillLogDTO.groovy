package cn.ibizlab.ibizodoo.hr.hremployeeskilllog.dto

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
class HrEmployeeSkillLogDTO extends GroovyDTO<HrEmployeeSkillLogDTO> {

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
     * 「日期」
     */
    @JsonProperty("date")
    Timestamp date
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「技能」
     */
    @JsonProperty("skill_id")
    String skillId
    /**
     * 「技能等级」
     */
    @JsonProperty("skill_level_id")
    String skillLevelId
    /**
     * 「技能类型」
     */
    @JsonProperty("skill_type_id")
    String skillTypeId
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
    HrEmployeeSkillLogDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrEmployeeSkillLogDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「日期」值
     * @param val
     */
    HrEmployeeSkillLogDTO setDate(Timestamp date) {
        this.date = date
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrEmployeeSkillLogDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrEmployeeSkillLogDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrEmployeeSkillLogDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrEmployeeSkillLogDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「技能」值
     * @param val
     */
    HrEmployeeSkillLogDTO setSkillId(String skillId) {
        this.skillId = skillId
        return this
    }


    /**
     * 设置「技能等级」值
     * @param val
     */
    HrEmployeeSkillLogDTO setSkillLevelId(String skillLevelId) {
        this.skillLevelId = skillLevelId
        return this
    }


    /**
     * 设置「技能类型」值
     * @param val
     */
    HrEmployeeSkillLogDTO setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrEmployeeSkillLogDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrEmployeeSkillLogDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
