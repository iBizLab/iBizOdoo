package cn.ibizlab.ibizodoo.audit.auditrecord.dto

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
class AuditRecordDTO extends GroovyDTO<AuditRecordDTO> {

    /**
     * 「审计信息」
     */
    @JsonProperty("audit_info")
    String auditInfo
    /**
     * 「审计类型」
     */
    @JsonProperty("audit_type")
    String auditType
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「访问地址」
     */
    @JsonProperty("ip_address")
    String ipAddress
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「对象标识」
     */
    @JsonProperty("object_id")
    String objectId
    /**
     * 「对象类型」
     */
    @JsonProperty("object_type")
    String objectType
    /**
     * 「操作人」
     */
    @JsonProperty("op_person_id")
    String opPersonId
    /**
     * 「操作人」
     */
    @JsonProperty("op_person_name")
    String opPersonName

    /**
     * 设置「审计信息」值
     * @param val
     */
    AuditRecordDTO setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo
        return this
    }


    /**
     * 设置「审计类型」值
     * @param val
     */
    AuditRecordDTO setAuditType(String auditType) {
        this.auditType = auditType
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    AuditRecordDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「访问地址」值
     * @param val
     */
    AuditRecordDTO setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AuditRecordDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「对象标识」值
     * @param val
     */
    AuditRecordDTO setObjectId(String objectId) {
        this.objectId = objectId
        return this
    }


    /**
     * 设置「对象类型」值
     * @param val
     */
    AuditRecordDTO setObjectType(String objectType) {
        this.objectType = objectType
        return this
    }


    /**
     * 设置「操作人」值
     * @param val
     */
    AuditRecordDTO setOpPersonId(String opPersonId) {
        this.opPersonId = opPersonId
        return this
    }


    /**
     * 设置「操作人」值
     * @param val
     */
    AuditRecordDTO setOpPersonName(String opPersonName) {
        this.opPersonName = opPersonName
        return this
    }

}
