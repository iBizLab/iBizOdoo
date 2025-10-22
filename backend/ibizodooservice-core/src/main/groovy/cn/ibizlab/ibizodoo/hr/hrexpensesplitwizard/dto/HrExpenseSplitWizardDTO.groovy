package cn.ibizlab.ibizodoo.hr.hrexpensesplitwizard.dto

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
class HrExpenseSplitWizardDTO extends GroovyDTO<HrExpenseSplitWizardDTO> {

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
     * 「拆分可能」
     * 字典[是否]
     */
    @JsonProperty("split_possible")
    Integer splitPossible
    /**
     * 「税项」
     */
    @JsonProperty("tax_amount_currency")
    BigDecimal taxAmountCurrency
    /**
     * 「金额总计」
     */
    @JsonProperty("total_amount_currency")
    BigDecimal totalAmountCurrency
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
    HrExpenseSplitWizardDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrExpenseSplitWizardDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrExpenseSplitWizardDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「费用」值
     * @param val
     */
    HrExpenseSplitWizardDTO setExpenseId(String expenseId) {
        this.expenseId = expenseId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrExpenseSplitWizardDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「拆分可能」值
     * 字典[是否]
     * @param val
     */
    HrExpenseSplitWizardDTO setSplitPossible(Integer splitPossible) {
        this.splitPossible = splitPossible
        return this
    }


    /**
     * 设置「税项」值
     * @param val
     */
    HrExpenseSplitWizardDTO setTaxAmountCurrency(BigDecimal taxAmountCurrency) {
        this.taxAmountCurrency = taxAmountCurrency
        return this
    }


    /**
     * 设置「金额总计」值
     * @param val
     */
    HrExpenseSplitWizardDTO setTotalAmountCurrency(BigDecimal totalAmountCurrency) {
        this.totalAmountCurrency = totalAmountCurrency
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrExpenseSplitWizardDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrExpenseSplitWizardDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
