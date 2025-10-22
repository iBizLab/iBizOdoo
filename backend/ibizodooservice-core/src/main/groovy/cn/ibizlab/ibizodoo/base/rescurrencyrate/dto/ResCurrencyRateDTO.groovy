package cn.ibizlab.ibizodoo.base.rescurrencyrate.dto

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
class ResCurrencyRateDTO extends GroovyDTO<ResCurrencyRateDTO> {

    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「公司汇率」
     */
    @JsonProperty("company_rate")
    Double companyRate
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「公司逆利率」
     */
    @JsonProperty("inverse_company_rate")
    Double inverseCompanyRate
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「技术费率」
     */
    @JsonProperty("rate")
    Double rate
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
     * 设置「公司」值
     * @param val
     */
    ResCurrencyRateDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「公司汇率」值
     * @param val
     */
    ResCurrencyRateDTO setCompanyRate(Double companyRate) {
        this.companyRate = companyRate
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResCurrencyRateDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResCurrencyRateDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「币别」值
     * @param val
     */
    ResCurrencyRateDTO setCurrencyId(String currencyId) {
        this.currencyId = currencyId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResCurrencyRateDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResCurrencyRateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「公司逆利率」值
     * @param val
     */
    ResCurrencyRateDTO setInverseCompanyRate(Double inverseCompanyRate) {
        this.inverseCompanyRate = inverseCompanyRate
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResCurrencyRateDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「技术费率」值
     * @param val
     */
    ResCurrencyRateDTO setRate(Double rate) {
        this.rate = rate
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResCurrencyRateDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResCurrencyRateDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
