package cn.ibizlab.ibizodoo.crm.crmmergeopportunity.dto

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
class CrmMergeOpportunityDTO extends GroovyDTO<CrmMergeOpportunityDTO> {

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
     * 设置「建立时间」值
     * @param val
     */
    CrmMergeOpportunityDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmMergeOpportunityDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmMergeOpportunityDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmMergeOpportunityDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「销售团队」值
     * @param val
     */
    CrmMergeOpportunityDTO setTeamId(String teamId) {
        this.teamId = teamId
        return this
    }


    /**
     * 设置「销售人员」值
     * @param val
     */
    CrmMergeOpportunityDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmMergeOpportunityDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmMergeOpportunityDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
