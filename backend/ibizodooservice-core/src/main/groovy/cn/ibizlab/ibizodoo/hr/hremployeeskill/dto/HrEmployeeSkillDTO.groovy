package cn.ibizlab.ibizodoo.hr.hremployeeskill.dto

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
class HrEmployeeSkillDTO extends GroovyDTO<HrEmployeeSkillDTO> {

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
    HrEmployeeSkillDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrEmployeeSkillDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrEmployeeSkillDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrEmployeeSkillDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrEmployeeSkillDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「技能」值
     * @param val
     */
    HrEmployeeSkillDTO setSkillId(String skillId) {
        this.skillId = skillId
        return this
    }


    /**
     * 设置「技能等级」值
     * @param val
     */
    HrEmployeeSkillDTO setSkillLevelId(String skillLevelId) {
        this.skillLevelId = skillLevelId
        return this
    }


    /**
     * 设置「技能类型」值
     * @param val
     */
    HrEmployeeSkillDTO setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrEmployeeSkillDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrEmployeeSkillDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
