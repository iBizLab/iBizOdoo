package cn.ibizlab.ibizodoo.hr.hrdeparturewizard.dto

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
class HrDepartureWizardDTO extends GroovyDTO<HrDepartureWizardDTO> {

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
     * 「离职日期」
     */
    @JsonProperty("departure_date")
    Timestamp departureDate
    /**
     * 「其它信息」
     */
    @JsonProperty("departure_description")
    String departureDescription
    /**
     * 「离职原因」
     */
    @JsonProperty("departure_reason_id")
    String departureReasonId
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「员工」
     */
    @JsonProperty("employee_id")
    String employeeId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「公司车辆发布」
     * 字典[是否]
     */
    @JsonProperty("release_campany_car")
    Integer releaseCampanyCar
    /**
     * 「设置合同结束日期」
     * 字典[是否]
     */
    @JsonProperty("set_date_end")
    Integer setDateEnd
    /**
     * 「免费装备」
     * 字典[是否]
     */
    @JsonProperty("unassign_equipment")
    Integer unassignEquipment
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
    HrDepartureWizardDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrDepartureWizardDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「离职日期」值
     * @param val
     */
    HrDepartureWizardDTO setDepartureDate(Timestamp departureDate) {
        this.departureDate = departureDate
        return this
    }


    /**
     * 设置「其它信息」值
     * @param val
     */
    HrDepartureWizardDTO setDepartureDescription(String departureDescription) {
        this.departureDescription = departureDescription
        return this
    }


    /**
     * 设置「离职原因」值
     * @param val
     */
    HrDepartureWizardDTO setDepartureReasonId(String departureReasonId) {
        this.departureReasonId = departureReasonId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrDepartureWizardDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrDepartureWizardDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrDepartureWizardDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「公司车辆发布」值
     * 字典[是否]
     * @param val
     */
    HrDepartureWizardDTO setReleaseCampanyCar(Integer releaseCampanyCar) {
        this.releaseCampanyCar = releaseCampanyCar
        return this
    }


    /**
     * 设置「设置合同结束日期」值
     * 字典[是否]
     * @param val
     */
    HrDepartureWizardDTO setSetDateEnd(Integer setDateEnd) {
        this.setDateEnd = setDateEnd
        return this
    }


    /**
     * 设置「免费装备」值
     * 字典[是否]
     * @param val
     */
    HrDepartureWizardDTO setUnassignEquipment(Integer unassignEquipment) {
        this.unassignEquipment = unassignEquipment
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrDepartureWizardDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrDepartureWizardDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
