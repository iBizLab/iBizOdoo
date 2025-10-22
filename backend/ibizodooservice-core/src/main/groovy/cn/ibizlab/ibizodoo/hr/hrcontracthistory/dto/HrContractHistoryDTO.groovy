package cn.ibizlab.ibizodoo.hr.hrcontracthistory.dto

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
class HrContractHistoryDTO extends GroovyDTO<HrContractHistoryDTO> {

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
     * 「# 合同」
     */
    @JsonProperty("contract_count")
    Integer contractCount
    /**
     * 「合同」
     */
    @JsonProperty("contract_id")
    String contractId
    /**
     * 「合同类型」
     */
    @JsonProperty("contract_type_id")
    String contractTypeId
    /**
     * 「结束日期」
     */
    @JsonProperty("date_end")
    Timestamp dateEnd
    /**
     * 「入职日期」
     */
    @JsonProperty("date_hired")
    Timestamp dateHired
    /**
     * 「开始日期」
     */
    @JsonProperty("date_start")
    Timestamp dateStart
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
     * 「人力资源主管」
     */
    @JsonProperty("hr_responsible_id")
    String hrResponsibleId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「目前正在签约中」
     * 字典[是否]
     */
    @JsonProperty("is_under_contract")
    Integer isUnderContract
    /**
     * 「工作岗位」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「工作安排」
     */
    @JsonProperty("resource_calendar_id")
    String resourceCalendarId
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「工资结构类型」
     */
    @JsonProperty("structure_type_id")
    String structureTypeId
    /**
     * 「合同状态」
     * 字典[合同状态]
     */
    @JsonProperty("under_contract_state")
    String underContractState
    /**
     * 「工资」
     */
    @JsonProperty("wage")
    BigDecimal wage

    /**
     * 设置「在职员工」值
     * 字典[是否]
     * @param val
     */
    HrContractHistoryDTO setActiveEmployee(Integer activeEmployee) {
        this.activeEmployee = activeEmployee
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrContractHistoryDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「# 合同」值
     * @param val
     */
    HrContractHistoryDTO setContractCount(Integer contractCount) {
        this.contractCount = contractCount
        return this
    }


    /**
     * 设置「合同」值
     * @param val
     */
    HrContractHistoryDTO setContractId(String contractId) {
        this.contractId = contractId
        return this
    }


    /**
     * 设置「合同类型」值
     * @param val
     */
    HrContractHistoryDTO setContractTypeId(String contractTypeId) {
        this.contractTypeId = contractTypeId
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    HrContractHistoryDTO setDateEnd(Timestamp dateEnd) {
        this.dateEnd = dateEnd
        return this
    }


    /**
     * 设置「入职日期」值
     * @param val
     */
    HrContractHistoryDTO setDateHired(Timestamp dateHired) {
        this.dateHired = dateHired
        return this
    }


    /**
     * 设置「开始日期」值
     * @param val
     */
    HrContractHistoryDTO setDateStart(Timestamp dateStart) {
        this.dateStart = dateStart
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrContractHistoryDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrContractHistoryDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrContractHistoryDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「人力资源主管」值
     * @param val
     */
    HrContractHistoryDTO setHrResponsibleId(String hrResponsibleId) {
        this.hrResponsibleId = hrResponsibleId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrContractHistoryDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「目前正在签约中」值
     * 字典[是否]
     * @param val
     */
    HrContractHistoryDTO setIsUnderContract(Integer isUnderContract) {
        this.isUnderContract = isUnderContract
        return this
    }


    /**
     * 设置「工作岗位」值
     * @param val
     */
    HrContractHistoryDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrContractHistoryDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「工作安排」值
     * @param val
     */
    HrContractHistoryDTO setResourceCalendarId(String resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    HrContractHistoryDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「工资结构类型」值
     * @param val
     */
    HrContractHistoryDTO setStructureTypeId(String structureTypeId) {
        this.structureTypeId = structureTypeId
        return this
    }


    /**
     * 设置「合同状态」值
     * 字典[合同状态]
     * @param val
     */
    HrContractHistoryDTO setUnderContractState(String underContractState) {
        this.underContractState = underContractState
        return this
    }


    /**
     * 设置「工资」值
     * @param val
     */
    HrContractHistoryDTO setWage(BigDecimal wage) {
        this.wage = wage
        return this
    }

}
