package cn.ibizlab.ibizodoo.hr.hrleaveaccrualplan.dto

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
class HrLeaveAccrualPlanDTO extends GroovyDTO<HrLeaveAccrualPlanDTO> {

    /**
     * 「应计收益时间」
     * 字典[应计收益时间]
     */
    @JsonProperty("accrued_gain_time")
    String accruedGainTime
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「附加值类型」
     * 字典[附加值类型]
     */
    @JsonProperty("added_value_type")
    String addedValueType
    /**
     * 「结转时间」
     * 字典[结转时间]
     */
    @JsonProperty("carryover_date")
    String carryoverDate
    /**
     * 「结转日」
     */
    @JsonProperty("carryover_day")
    Integer carryoverDay
    /**
     * 「结转月」
     * 字典[结转月]
     */
    @JsonProperty("carryover_month")
    String carryoverMonth
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
     * 「员工」
     */
    @JsonProperty("employees_count")
    Integer employeesCount
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「按工作时间计算」
     * 字典[是否]
     */
    @JsonProperty("is_based_on_worked_time")
    Integer isBasedOnWorkedTime
    /**
     * 「等级」
     */
    @JsonProperty("level_count")
    Integer levelCount
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「显示过渡模式」
     * 字典[是否]
     */
    @JsonProperty("show_transition_mode")
    Integer showTransitionMode
    /**
     * 「休假类型」
     */
    @JsonProperty("time_off_type_id")
    String timeOffTypeId
    /**
     * 「里程碑式的过渡」
     * 字典[里程碑式的过渡]
     */
    @JsonProperty("transition_mode")
    String transitionMode
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
     * 设置「应计收益时间」值
     * 字典[应计收益时间]
     * @param val
     */
    HrLeaveAccrualPlanDTO setAccruedGainTime(String accruedGainTime) {
        this.accruedGainTime = accruedGainTime
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAccrualPlanDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「附加值类型」值
     * 字典[附加值类型]
     * @param val
     */
    HrLeaveAccrualPlanDTO setAddedValueType(String addedValueType) {
        this.addedValueType = addedValueType
        return this
    }


    /**
     * 设置「结转时间」值
     * 字典[结转时间]
     * @param val
     */
    HrLeaveAccrualPlanDTO setCarryoverDate(String carryoverDate) {
        this.carryoverDate = carryoverDate
        return this
    }


    /**
     * 设置「结转日」值
     * @param val
     */
    HrLeaveAccrualPlanDTO setCarryoverDay(Integer carryoverDay) {
        this.carryoverDay = carryoverDay
        return this
    }


    /**
     * 设置「结转月」值
     * 字典[结转月]
     * @param val
     */
    HrLeaveAccrualPlanDTO setCarryoverMonth(String carryoverMonth) {
        this.carryoverMonth = carryoverMonth
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrLeaveAccrualPlanDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrLeaveAccrualPlanDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveAccrualPlanDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrLeaveAccrualPlanDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrLeaveAccrualPlanDTO setEmployeesCount(Integer employeesCount) {
        this.employeesCount = employeesCount
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrLeaveAccrualPlanDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「按工作时间计算」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAccrualPlanDTO setIsBasedOnWorkedTime(Integer isBasedOnWorkedTime) {
        this.isBasedOnWorkedTime = isBasedOnWorkedTime
        return this
    }


    /**
     * 设置「等级」值
     * @param val
     */
    HrLeaveAccrualPlanDTO setLevelCount(Integer levelCount) {
        this.levelCount = levelCount
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrLeaveAccrualPlanDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「显示过渡模式」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAccrualPlanDTO setShowTransitionMode(Integer showTransitionMode) {
        this.showTransitionMode = showTransitionMode
        return this
    }


    /**
     * 设置「休假类型」值
     * @param val
     */
    HrLeaveAccrualPlanDTO setTimeOffTypeId(String timeOffTypeId) {
        this.timeOffTypeId = timeOffTypeId
        return this
    }


    /**
     * 设置「里程碑式的过渡」值
     * 字典[里程碑式的过渡]
     * @param val
     */
    HrLeaveAccrualPlanDTO setTransitionMode(String transitionMode) {
        this.transitionMode = transitionMode
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrLeaveAccrualPlanDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveAccrualPlanDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
