package cn.ibizlab.ibizodoo.crm.crmactivityreport.dto

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
class CrmActivityReportDTO extends GroovyDTO<CrmActivityReportDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「已指派给」
     */
    @JsonProperty("author_id")
    String authorId
    /**
     * 「活动描述」
     */
    @JsonProperty("body")
    String body
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「国家/地区」
     */
    @JsonProperty("country_id")
    String countryId
    /**
     * 「完成日期」
     */
    @JsonProperty("date")
    Timestamp date
    /**
     * 「关闭日期」
     */
    @JsonProperty("date_closed")
    Timestamp dateClosed
    /**
     * 「转化日期」
     */
    @JsonProperty("date_conversion")
    Timestamp dateConversion
    /**
     * 「预期结束」
     */
    @JsonProperty("date_deadline")
    Timestamp dateDeadline
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
     * 「创建日期」
     */
    @JsonProperty("lead_create_date")
    Timestamp leadCreateDate
    /**
     * 「商机」
     */
    @JsonProperty("lead_id")
    String leadId
    /**
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("lead_type")
    String leadType
    /**
     * 「活动类型」
     */
    @JsonProperty("mail_activity_type_id")
    String mailActivityTypeId
    /**
     * 「客户」
     */
    @JsonProperty("partner_id")
    String partnerId
    /**
     * 「阶段」
     */
    @JsonProperty("stage_id")
    String stageId
    /**
     * 「子类型」
     */
    @JsonProperty("subtype_id")
    String subtypeId
    /**
     * 「销售团队」
     */
    @JsonProperty("team_id")
    String teamId
    /**
     * 「销售人员」
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    CrmActivityReportDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「已指派给」值
     * @param val
     */
    CrmActivityReportDTO setAuthorId(String authorId) {
        this.authorId = authorId
        return this
    }


    /**
     * 设置「活动描述」值
     * @param val
     */
    CrmActivityReportDTO setBody(String body) {
        this.body = body
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    CrmActivityReportDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「国家/地区」值
     * @param val
     */
    CrmActivityReportDTO setCountryId(String countryId) {
        this.countryId = countryId
        return this
    }


    /**
     * 设置「完成日期」值
     * @param val
     */
    CrmActivityReportDTO setDate(Timestamp date) {
        this.date = date
        return this
    }


    /**
     * 设置「关闭日期」值
     * @param val
     */
    CrmActivityReportDTO setDateClosed(Timestamp dateClosed) {
        this.dateClosed = dateClosed
        return this
    }


    /**
     * 设置「转化日期」值
     * @param val
     */
    CrmActivityReportDTO setDateConversion(Timestamp dateConversion) {
        this.dateConversion = dateConversion
        return this
    }


    /**
     * 设置「预期结束」值
     * @param val
     */
    CrmActivityReportDTO setDateDeadline(Timestamp dateDeadline) {
        this.dateDeadline = dateDeadline
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmActivityReportDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmActivityReportDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「创建日期」值
     * @param val
     */
    CrmActivityReportDTO setLeadCreateDate(Timestamp leadCreateDate) {
        this.leadCreateDate = leadCreateDate
        return this
    }


    /**
     * 设置「商机」值
     * @param val
     */
    CrmActivityReportDTO setLeadId(String leadId) {
        this.leadId = leadId
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    CrmActivityReportDTO setLeadType(String leadType) {
        this.leadType = leadType
        return this
    }


    /**
     * 设置「活动类型」值
     * @param val
     */
    CrmActivityReportDTO setMailActivityTypeId(String mailActivityTypeId) {
        this.mailActivityTypeId = mailActivityTypeId
        return this
    }


    /**
     * 设置「客户」值
     * @param val
     */
    CrmActivityReportDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「阶段」值
     * @param val
     */
    CrmActivityReportDTO setStageId(String stageId) {
        this.stageId = stageId
        return this
    }


    /**
     * 设置「子类型」值
     * @param val
     */
    CrmActivityReportDTO setSubtypeId(String subtypeId) {
        this.subtypeId = subtypeId
        return this
    }


    /**
     * 设置「销售团队」值
     * @param val
     */
    CrmActivityReportDTO setTeamId(String teamId) {
        this.teamId = teamId
        return this
    }


    /**
     * 设置「销售人员」值
     * @param val
     */
    CrmActivityReportDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
