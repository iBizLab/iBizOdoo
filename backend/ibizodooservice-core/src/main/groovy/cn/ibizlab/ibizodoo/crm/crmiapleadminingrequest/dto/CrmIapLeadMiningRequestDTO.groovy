package cn.ibizlab.ibizodoo.crm.crmiapleadminingrequest.dto

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
class CrmIapLeadMiningRequestDTO extends GroovyDTO<CrmIapLeadMiningRequestDTO> {

    /**
     * 「公司最大规模」
     */
    @JsonProperty("company_size_max")
    Integer companySizeMax
    /**
     * 「尺寸」
     */
    @JsonProperty("company_size_min")
    Integer companySizeMin
    /**
     * 「筛选于」
     * 字典[筛选于]
     */
    @JsonProperty("contact_filter_type")
    String contactFilterType
    /**
     * 「联系人人数」
     */
    @JsonProperty("contact_number")
    Integer contactNumber
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
     * 「错误类型」
     * 字典[错误类型]
     */
    @JsonProperty("error_type")
    String errorType
    /**
     * 「根据规模过滤」
     * 字典[是否]
     */
    @JsonProperty("filter_on_size")
    Integer filterOnSize
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「线索联络点数」
     */
    @JsonProperty("lead_contacts_credits")
    String leadContactsCredits
    /**
     * 「生成线索的数量」
     */
    @JsonProperty("lead_count")
    Integer leadCount
    /**
     * 「线索点数」
     */
    @JsonProperty("lead_credits")
    String leadCredits
    /**
     * 「线索数量」
     */
    @JsonProperty("lead_number")
    Integer leadNumber
    /**
     * 「线索总点数」
     */
    @JsonProperty("lead_total_credits")
    String leadTotalCredits
    /**
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("lead_type")
    String leadType
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「首选角色」
     */
    @JsonProperty("preferred_role_id")
    String preferredRoleId
    /**
     * 「目标」
     * 字典[目标]
     */
    @JsonProperty("search_type")
    String searchType
    /**
     * 「资历」
     */
    @JsonProperty("seniority_id")
    String seniorityId
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「销售团队」
     */
    @JsonProperty("team_id")
    String teamId
    /**
     * 「销售员」
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
     * 设置「公司最大规模」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setCompanySizeMax(Integer companySizeMax) {
        this.companySizeMax = companySizeMax
        return this
    }


    /**
     * 设置「尺寸」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setCompanySizeMin(Integer companySizeMin) {
        this.companySizeMin = companySizeMin
        return this
    }


    /**
     * 设置「筛选于」值
     * 字典[筛选于]
     * @param val
     */
    CrmIapLeadMiningRequestDTO setContactFilterType(String contactFilterType) {
        this.contactFilterType = contactFilterType
        return this
    }


    /**
     * 设置「联系人人数」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmIapLeadMiningRequestDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「错误类型」值
     * 字典[错误类型]
     * @param val
     */
    CrmIapLeadMiningRequestDTO setErrorType(String errorType) {
        this.errorType = errorType
        return this
    }


    /**
     * 设置「根据规模过滤」值
     * 字典[是否]
     * @param val
     */
    CrmIapLeadMiningRequestDTO setFilterOnSize(Integer filterOnSize) {
        this.filterOnSize = filterOnSize
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「线索联络点数」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setLeadContactsCredits(String leadContactsCredits) {
        this.leadContactsCredits = leadContactsCredits
        return this
    }


    /**
     * 设置「生成线索的数量」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setLeadCount(Integer leadCount) {
        this.leadCount = leadCount
        return this
    }


    /**
     * 设置「线索点数」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setLeadCredits(String leadCredits) {
        this.leadCredits = leadCredits
        return this
    }


    /**
     * 设置「线索数量」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setLeadNumber(Integer leadNumber) {
        this.leadNumber = leadNumber
        return this
    }


    /**
     * 设置「线索总点数」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setLeadTotalCredits(String leadTotalCredits) {
        this.leadTotalCredits = leadTotalCredits
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    CrmIapLeadMiningRequestDTO setLeadType(String leadType) {
        this.leadType = leadType
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「首选角色」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setPreferredRoleId(String preferredRoleId) {
        this.preferredRoleId = preferredRoleId
        return this
    }


    /**
     * 设置「目标」值
     * 字典[目标]
     * @param val
     */
    CrmIapLeadMiningRequestDTO setSearchType(String searchType) {
        this.searchType = searchType
        return this
    }


    /**
     * 设置「资历」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setSeniorityId(String seniorityId) {
        this.seniorityId = seniorityId
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    CrmIapLeadMiningRequestDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「销售团队」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setTeamId(String teamId) {
        this.teamId = teamId
        return this
    }


    /**
     * 设置「销售员」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmIapLeadMiningRequestDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmIapLeadMiningRequestDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
