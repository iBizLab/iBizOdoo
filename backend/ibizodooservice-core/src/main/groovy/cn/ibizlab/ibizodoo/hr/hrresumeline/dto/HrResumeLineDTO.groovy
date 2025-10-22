package cn.ibizlab.ibizodoo.hr.hrresumeline.dto

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
class HrResumeLineDTO extends GroovyDTO<HrResumeLineDTO> {

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
     * 「结束日期」
     */
    @JsonProperty("date_end")
    Timestamp dateEnd
    /**
     * 「开始日期」
     */
    @JsonProperty("date_start")
    Timestamp dateStart
    /**
     * 「部门」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「显示类型」
     * 字典[显示类型]
     */
    @JsonProperty("display_type")
    String displayType
    /**
     * 「员工」
     */
    @JsonProperty("employee_id")
    String employeeId
    /**
     * 「到期状态」
     * 字典[到期状态]
     */
    @JsonProperty("expiration_status")
    String expirationStatus
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「类型」
     */
    @JsonProperty("line_type_id")
    String lineTypeId
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
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
    HrResumeLineDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrResumeLineDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    HrResumeLineDTO setDateEnd(Timestamp dateEnd) {
        this.dateEnd = dateEnd
        return this
    }


    /**
     * 设置「开始日期」值
     * @param val
     */
    HrResumeLineDTO setDateStart(Timestamp dateStart) {
        this.dateStart = dateStart
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrResumeLineDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    HrResumeLineDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrResumeLineDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「显示类型」值
     * 字典[显示类型]
     * @param val
     */
    HrResumeLineDTO setDisplayType(String displayType) {
        this.displayType = displayType
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrResumeLineDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「到期状态」值
     * 字典[到期状态]
     * @param val
     */
    HrResumeLineDTO setExpirationStatus(String expirationStatus) {
        this.expirationStatus = expirationStatus
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrResumeLineDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「类型」值
     * @param val
     */
    HrResumeLineDTO setLineTypeId(String lineTypeId) {
        this.lineTypeId = lineTypeId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrResumeLineDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrResumeLineDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrResumeLineDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
