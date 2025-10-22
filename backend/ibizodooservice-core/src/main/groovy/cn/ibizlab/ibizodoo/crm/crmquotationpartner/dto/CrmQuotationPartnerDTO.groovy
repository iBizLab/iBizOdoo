package cn.ibizlab.ibizodoo.crm.crmquotationpartner.dto

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
class CrmQuotationPartnerDTO extends GroovyDTO<CrmQuotationPartnerDTO> {

    /**
     * 「报价给客户」
     * 字典[报价给客户]
     */
    @JsonProperty("action")
    String action
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「关联线索」
     */
    @JsonProperty("lead_id")
    String leadId
    /**
     * 「客户」
     */
    @JsonProperty("partner_id")
    String partnerId
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
     * 设置「报价给客户」值
     * 字典[报价给客户]
     * @param val
     */
    CrmQuotationPartnerDTO setAction(String action) {
        this.action = action
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CrmQuotationPartnerDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmQuotationPartnerDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmQuotationPartnerDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmQuotationPartnerDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「关联线索」值
     * @param val
     */
    CrmQuotationPartnerDTO setLeadId(String leadId) {
        this.leadId = leadId
        return this
    }


    /**
     * 设置「客户」值
     * @param val
     */
    CrmQuotationPartnerDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmQuotationPartnerDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmQuotationPartnerDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
