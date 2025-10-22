package cn.ibizlab.ibizodoo.crm.crmleadscoringfrequency.dto

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
class CrmLeadScoringFrequencyDTO extends GroovyDTO<CrmLeadScoringFrequencyDTO> {

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
     * 「丢失数量」
     */
    @JsonProperty("lost_count")
    Double lostCount
    /**
     * 「销售团队」
     */
    @JsonProperty("team_id")
    String teamId
    /**
     * 「值」
     */
    @JsonProperty("value")
    String value
    /**
     * 「可变」
     */
    @JsonProperty("variable")
    String variable
    /**
     * 「赢得数量」
     */
    @JsonProperty("won_count")
    Double wonCount
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
    CrmLeadScoringFrequencyDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmLeadScoringFrequencyDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmLeadScoringFrequencyDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmLeadScoringFrequencyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「丢失数量」值
     * @param val
     */
    CrmLeadScoringFrequencyDTO setLostCount(Double lostCount) {
        this.lostCount = lostCount
        return this
    }


    /**
     * 设置「销售团队」值
     * @param val
     */
    CrmLeadScoringFrequencyDTO setTeamId(String teamId) {
        this.teamId = teamId
        return this
    }


    /**
     * 设置「值」值
     * @param val
     */
    CrmLeadScoringFrequencyDTO setValue(String value) {
        this.value = value
        return this
    }


    /**
     * 设置「可变」值
     * @param val
     */
    CrmLeadScoringFrequencyDTO setVariable(String variable) {
        this.variable = variable
        return this
    }


    /**
     * 设置「赢得数量」值
     * @param val
     */
    CrmLeadScoringFrequencyDTO setWonCount(Double wonCount) {
        this.wonCount = wonCount
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmLeadScoringFrequencyDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmLeadScoringFrequencyDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
