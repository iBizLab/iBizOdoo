package cn.ibizlab.ibizodoo.hr.hrexpensesplit.dto

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
class HrExpenseSplitDTO extends GroovyDTO<HrExpenseSplitDTO> {

    /**
     * 「分析精度」
     */
    @JsonProperty("analytic_precision")
    Integer analyticPrecision
    /**
     * 「可重开结算单」
     * 字典[是否]
     */
    @JsonProperty("can_be_reinvoiced")
    Integer canBeReinvoiced
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
     * 「币别」
     */
    @JsonProperty("currency_id")
    String currencyId
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
     * 「费用」
     */
    @JsonProperty("expense_id")
    String expenseId
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
     * 「是否选择非零成本的产品」
     * 字典[是否]
     */
    @JsonProperty("product_has_cost")
    Integer productHasCost
    /**
     * 「是否对所选产品定义税费」
     * 字典[是否]
     */
    @JsonProperty("product_has_tax")
    Integer productHasTax
    /**
     * 「以币别计的税额」
     */
    @JsonProperty("tax_amount_currency")
    BigDecimal taxAmountCurrency
    /**
     * 「按币别合计」
     */
    @JsonProperty("total_amount_currency")
    BigDecimal totalAmountCurrency
    /**
     * 「向导」
     */
    @JsonProperty("wizard_id")
    String wizardId
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
     * 设置「分析精度」值
     * @param val
     */
    HrExpenseSplitDTO setAnalyticPrecision(Integer analyticPrecision) {
        this.analyticPrecision = analyticPrecision
        return this
    }


    /**
     * 设置「可重开结算单」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSplitDTO setCanBeReinvoiced(Integer canBeReinvoiced) {
        this.canBeReinvoiced = canBeReinvoiced
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrExpenseSplitDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrExpenseSplitDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrExpenseSplitDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「币别」值
     * @param val
     */
    HrExpenseSplitDTO setCurrencyId(String currencyId) {
        this.currencyId = currencyId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrExpenseSplitDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrExpenseSplitDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「费用」值
     * @param val
     */
    HrExpenseSplitDTO setExpenseId(String expenseId) {
        this.expenseId = expenseId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrExpenseSplitDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrExpenseSplitDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「是否选择非零成本的产品」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSplitDTO setProductHasCost(Integer productHasCost) {
        this.productHasCost = productHasCost
        return this
    }


    /**
     * 设置「是否对所选产品定义税费」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSplitDTO setProductHasTax(Integer productHasTax) {
        this.productHasTax = productHasTax
        return this
    }


    /**
     * 设置「以币别计的税额」值
     * @param val
     */
    HrExpenseSplitDTO setTaxAmountCurrency(BigDecimal taxAmountCurrency) {
        this.taxAmountCurrency = taxAmountCurrency
        return this
    }


    /**
     * 设置「按币别合计」值
     * @param val
     */
    HrExpenseSplitDTO setTotalAmountCurrency(BigDecimal totalAmountCurrency) {
        this.totalAmountCurrency = totalAmountCurrency
        return this
    }


    /**
     * 设置「向导」值
     * @param val
     */
    HrExpenseSplitDTO setWizardId(String wizardId) {
        this.wizardId = wizardId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrExpenseSplitDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrExpenseSplitDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
