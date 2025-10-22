package cn.ibizlab.ibizodoo.hr.hrleaveaccruallevel.dto

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
class HrLeaveAccrualLevelDTO extends GroovyDTO<HrLeaveAccrualLevelDTO> {

    /**
     * 「应计方案」
     */
    @JsonProperty("accrual_plan_id")
    String accrualPlanId
    /**
     * 「累计有效期」
     * 字典[是否]
     */
    @JsonProperty("accrual_validity")
    Integer accrualValidity
    /**
     * 「累计有效数」
     */
    @JsonProperty("accrual_validity_count")
    Integer accrualValidityCount
    /**
     * 「累计有效类型」
     * 字典[累计有效类型]
     */
    @JsonProperty("accrual_validity_type")
    String accrualValidityType
    /**
     * 「结转」
     * 字典[结转]
     */
    @JsonProperty("action_with_unused_accruals")
    String actionWithUnusedAccruals
    /**
     * 「比率」
     */
    @JsonProperty("added_value")
    Double addedValue
    /**
     * 「附加值类型」
     * 字典[附加值类型]
     */
    @JsonProperty("added_value_type")
    String addedValueType
    /**
     * 「可修改值类型」
     * 字典[是否]
     */
    @JsonProperty("can_modify_value_type")
    Integer canModifyValueType
    /**
     * 「累计时间上限」
     * 字典[是否]
     */
    @JsonProperty("cap_accrued_time")
    Integer capAccruedTime
    /**
     * 「里程碑上限」
     * 字典[是否]
     */
    @JsonProperty("cap_accrued_time_yearly")
    Integer capAccruedTimeYearly
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
     * 「第一天」
     */
    @JsonProperty("first_day")
    Integer firstDay
    /**
     * 「第一个月」
     * 字典[第一个月]
     */
    @JsonProperty("first_month")
    String firstMonth
    /**
     * 「第一个月日」
     */
    @JsonProperty("first_month_day")
    Integer firstMonthDay
    /**
     * 「频率」
     * 字典[频率]
     */
    @JsonProperty("frequency")
    String frequency
    /**
     * 「频率 每小时 来源」
     * 字典[频率 每小时 来源]
     */
    @JsonProperty("frequency_hourly_source")
    String frequencyHourlySource
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「限制」
     */
    @JsonProperty("maximum_leave")
    Double maximumLeave
    /**
     * 「每年上限」
     */
    @JsonProperty("maximum_leave_yearly")
    Double maximumLeaveYearly
    /**
     * 「应计款项转出的最大金额」
     */
    @JsonProperty("postpone_max_days")
    Integer postponeMaxDays
    /**
     * 「第二天」
     */
    @JsonProperty("second_day")
    Integer secondDay
    /**
     * 「第二个月」
     * 字典[第二个月]
     */
    @JsonProperty("second_month")
    String secondMonth
    /**
     * 「第二个月日」
     */
    @JsonProperty("second_month_day")
    Integer secondMonthDay
    /**
     * 「顺序」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「之后开始」
     */
    @JsonProperty("start_count")
    Integer startCount
    /**
     * 「null」
     * 字典[null]
     */
    @JsonProperty("start_type")
    String startType
    /**
     * 「分配」
     * 字典[分配]
     */
    @JsonProperty("week_day")
    String weekDay
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
     * 「年度日」
     */
    @JsonProperty("yearly_day")
    Integer yearlyDay
    /**
     * 「年 月」
     * 字典[年 月]
     */
    @JsonProperty("yearly_month")
    String yearlyMonth

    /**
     * 设置「应计方案」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setAccrualPlanId(String accrualPlanId) {
        this.accrualPlanId = accrualPlanId
        return this
    }


    /**
     * 设置「累计有效期」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAccrualLevelDTO setAccrualValidity(Integer accrualValidity) {
        this.accrualValidity = accrualValidity
        return this
    }


    /**
     * 设置「累计有效数」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setAccrualValidityCount(Integer accrualValidityCount) {
        this.accrualValidityCount = accrualValidityCount
        return this
    }


    /**
     * 设置「累计有效类型」值
     * 字典[累计有效类型]
     * @param val
     */
    HrLeaveAccrualLevelDTO setAccrualValidityType(String accrualValidityType) {
        this.accrualValidityType = accrualValidityType
        return this
    }


    /**
     * 设置「结转」值
     * 字典[结转]
     * @param val
     */
    HrLeaveAccrualLevelDTO setActionWithUnusedAccruals(String actionWithUnusedAccruals) {
        this.actionWithUnusedAccruals = actionWithUnusedAccruals
        return this
    }


    /**
     * 设置「比率」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setAddedValue(Double addedValue) {
        this.addedValue = addedValue
        return this
    }


    /**
     * 设置「附加值类型」值
     * 字典[附加值类型]
     * @param val
     */
    HrLeaveAccrualLevelDTO setAddedValueType(String addedValueType) {
        this.addedValueType = addedValueType
        return this
    }


    /**
     * 设置「可修改值类型」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAccrualLevelDTO setCanModifyValueType(Integer canModifyValueType) {
        this.canModifyValueType = canModifyValueType
        return this
    }


    /**
     * 设置「累计时间上限」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAccrualLevelDTO setCapAccruedTime(Integer capAccruedTime) {
        this.capAccruedTime = capAccruedTime
        return this
    }


    /**
     * 设置「里程碑上限」值
     * 字典[是否]
     * @param val
     */
    HrLeaveAccrualLevelDTO setCapAccruedTimeYearly(Integer capAccruedTimeYearly) {
        this.capAccruedTimeYearly = capAccruedTimeYearly
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveAccrualLevelDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「第一天」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setFirstDay(Integer firstDay) {
        this.firstDay = firstDay
        return this
    }


    /**
     * 设置「第一个月」值
     * 字典[第一个月]
     * @param val
     */
    HrLeaveAccrualLevelDTO setFirstMonth(String firstMonth) {
        this.firstMonth = firstMonth
        return this
    }


    /**
     * 设置「第一个月日」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setFirstMonthDay(Integer firstMonthDay) {
        this.firstMonthDay = firstMonthDay
        return this
    }


    /**
     * 设置「频率」值
     * 字典[频率]
     * @param val
     */
    HrLeaveAccrualLevelDTO setFrequency(String frequency) {
        this.frequency = frequency
        return this
    }


    /**
     * 设置「频率 每小时 来源」值
     * 字典[频率 每小时 来源]
     * @param val
     */
    HrLeaveAccrualLevelDTO setFrequencyHourlySource(String frequencyHourlySource) {
        this.frequencyHourlySource = frequencyHourlySource
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「限制」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setMaximumLeave(Double maximumLeave) {
        this.maximumLeave = maximumLeave
        return this
    }


    /**
     * 设置「每年上限」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setMaximumLeaveYearly(Double maximumLeaveYearly) {
        this.maximumLeaveYearly = maximumLeaveYearly
        return this
    }


    /**
     * 设置「应计款项转出的最大金额」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setPostponeMaxDays(Integer postponeMaxDays) {
        this.postponeMaxDays = postponeMaxDays
        return this
    }


    /**
     * 设置「第二天」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setSecondDay(Integer secondDay) {
        this.secondDay = secondDay
        return this
    }


    /**
     * 设置「第二个月」值
     * 字典[第二个月]
     * @param val
     */
    HrLeaveAccrualLevelDTO setSecondMonth(String secondMonth) {
        this.secondMonth = secondMonth
        return this
    }


    /**
     * 设置「第二个月日」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setSecondMonthDay(Integer secondMonthDay) {
        this.secondMonthDay = secondMonthDay
        return this
    }


    /**
     * 设置「顺序」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「之后开始」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setStartCount(Integer startCount) {
        this.startCount = startCount
        return this
    }


    /**
     * 设置「null」值
     * 字典[null]
     * @param val
     */
    HrLeaveAccrualLevelDTO setStartType(String startType) {
        this.startType = startType
        return this
    }


    /**
     * 设置「分配」值
     * 字典[分配]
     * @param val
     */
    HrLeaveAccrualLevelDTO setWeekDay(String weekDay) {
        this.weekDay = weekDay
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveAccrualLevelDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「年度日」值
     * @param val
     */
    HrLeaveAccrualLevelDTO setYearlyDay(Integer yearlyDay) {
        this.yearlyDay = yearlyDay
        return this
    }


    /**
     * 设置「年 月」值
     * 字典[年 月]
     * @param val
     */
    HrLeaveAccrualLevelDTO setYearlyMonth(String yearlyMonth) {
        this.yearlyMonth = yearlyMonth
        return this
    }

}
