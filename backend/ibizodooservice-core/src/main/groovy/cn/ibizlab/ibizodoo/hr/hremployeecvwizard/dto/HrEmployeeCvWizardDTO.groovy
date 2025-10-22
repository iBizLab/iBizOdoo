package cn.ibizlab.ibizodoo.hr.hremployeecvwizard.dto

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
class HrEmployeeCvWizardDTO extends GroovyDTO<HrEmployeeCvWizardDTO> {

    /**
     * 「能展示其他」
     * 字典[是否]
     */
    @JsonProperty("can_show_others")
    Integer canShowOthers
    /**
     * 「能展示技能」
     * 字典[是否]
     */
    @JsonProperty("can_show_skills")
    Integer canShowSkills
    /**
     * 「主要颜色」
     */
    @JsonProperty("color_primary")
    String colorPrimary
    /**
     * 「次要颜色」
     */
    @JsonProperty("color_secondary")
    String colorSecondary
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
     * 「联系信息」
     * 字典[是否]
     */
    @JsonProperty("show_contact")
    Integer showContact
    /**
     * 「其它」
     * 字典[是否]
     */
    @JsonProperty("show_others")
    Integer showOthers
    /**
     * 「技能」
     * 字典[是否]
     */
    @JsonProperty("show_skills")
    Integer showSkills
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
     * 设置「能展示其他」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeCvWizardDTO setCanShowOthers(Integer canShowOthers) {
        this.canShowOthers = canShowOthers
        return this
    }


    /**
     * 设置「能展示技能」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeCvWizardDTO setCanShowSkills(Integer canShowSkills) {
        this.canShowSkills = canShowSkills
        return this
    }


    /**
     * 设置「主要颜色」值
     * @param val
     */
    HrEmployeeCvWizardDTO setColorPrimary(String colorPrimary) {
        this.colorPrimary = colorPrimary
        return this
    }


    /**
     * 设置「次要颜色」值
     * @param val
     */
    HrEmployeeCvWizardDTO setColorSecondary(String colorSecondary) {
        this.colorSecondary = colorSecondary
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrEmployeeCvWizardDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrEmployeeCvWizardDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrEmployeeCvWizardDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrEmployeeCvWizardDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「联系信息」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeCvWizardDTO setShowContact(Integer showContact) {
        this.showContact = showContact
        return this
    }


    /**
     * 设置「其它」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeCvWizardDTO setShowOthers(Integer showOthers) {
        this.showOthers = showOthers
        return this
    }


    /**
     * 设置「技能」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeCvWizardDTO setShowSkills(Integer showSkills) {
        this.showSkills = showSkills
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrEmployeeCvWizardDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrEmployeeCvWizardDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
