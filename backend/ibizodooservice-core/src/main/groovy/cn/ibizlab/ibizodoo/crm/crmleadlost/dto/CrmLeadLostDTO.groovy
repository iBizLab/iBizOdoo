package cn.ibizlab.ibizodoo.crm.crmleadlost.dto

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
class CrmLeadLostDTO extends GroovyDTO<CrmLeadLostDTO> {

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
     * 「关闭说明」
     */
    @JsonProperty("lost_feedback")
    String lostFeedback
    /**
     * 「丢失原因」
     */
    @JsonProperty("lost_reason_id")
    String lostReasonId
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
    CrmLeadLostDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmLeadLostDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmLeadLostDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmLeadLostDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「关闭说明」值
     * @param val
     */
    CrmLeadLostDTO setLostFeedback(String lostFeedback) {
        this.lostFeedback = lostFeedback
        return this
    }


    /**
     * 设置「丢失原因」值
     * @param val
     */
    CrmLeadLostDTO setLostReasonId(String lostReasonId) {
        this.lostReasonId = lostReasonId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmLeadLostDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CrmLeadLostDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
