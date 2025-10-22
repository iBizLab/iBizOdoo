package cn.ibizlab.ibizodoo.crm.crmstage.dto

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
class CrmStageDTO extends GroovyDTO<CrmStageDTO> {

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
     * 「在渠道中折叠」
     * 字典[是否]
     */
    @JsonProperty("fold")
    Integer fold
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「是赢得阶段？」
     * 字典[是否]
     */
    @JsonProperty("is_won")
    Integer isWon
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「要求」
     */
    @JsonProperty("requirements")
    String requirements
    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「team_count」
     */
    @JsonProperty("team_count")
    Integer teamCount
    /**
     * 「销售团队」
     */
    @JsonProperty("team_id")
    String teamId
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
    CrmStageDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmStageDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmStageDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「在渠道中折叠」值
     * 字典[是否]
     * @param val
     */
    CrmStageDTO setFold(Integer fold) {
        this.fold = fold
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmStageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是赢得阶段？」值
     * 字典[是否]
     * @param val
     */
    CrmStageDTO setIsWon(Integer isWon) {
        this.isWon = isWon
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CrmStageDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「要求」值
     * @param val
     */
    CrmStageDTO setRequirements(String requirements) {
        this.requirements = requirements
        return this
    }


    /**
     * 设置「序号」值
     * @param val
     */
    CrmStageDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「team_count」值
     * @param val
     */
    CrmStageDTO setTeamCount(Integer teamCount) {
        this.teamCount = teamCount
        return this
    }


    /**
     * 设置「销售团队」值
     * @param val
     */
    CrmStageDTO setTeamId(String teamId) {
        this.teamId = teamId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmStageDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmStageDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
