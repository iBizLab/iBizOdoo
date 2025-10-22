package cn.ibizlab.ibizodoo.crm.crmlead2opportunitypartner.dto

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
class CrmLead2opportunityPartnerDTO extends GroovyDTO<CrmLead2opportunityPartnerDTO> {

    /**
     * 「相关客户」
     * 字典[相关客户]
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
     * 「强制指派」
     * 字典[是否]
     */
    @JsonProperty("force_assignment")
    Integer forceAssignment
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
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「客户」
     */
    @JsonProperty("partner_id")
    String partnerId
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
     * 设置「相关客户」值
     * 字典[相关客户]
     * @param val
     */
    CrmLead2opportunityPartnerDTO setAction(String action) {
        this.action = action
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CrmLead2opportunityPartnerDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmLead2opportunityPartnerDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmLead2opportunityPartnerDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「强制指派」值
     * 字典[是否]
     * @param val
     */
    CrmLead2opportunityPartnerDTO setForceAssignment(Integer forceAssignment) {
        this.forceAssignment = forceAssignment
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmLead2opportunityPartnerDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「关联线索」值
     * @param val
     */
    CrmLead2opportunityPartnerDTO setLeadId(String leadId) {
        this.leadId = leadId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CrmLead2opportunityPartnerDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「客户」值
     * @param val
     */
    CrmLead2opportunityPartnerDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「销售团队」值
     * @param val
     */
    CrmLead2opportunityPartnerDTO setTeamId(String teamId) {
        this.teamId = teamId
        return this
    }


    /**
     * 设置「销售人员」值
     * @param val
     */
    CrmLead2opportunityPartnerDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmLead2opportunityPartnerDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmLead2opportunityPartnerDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
