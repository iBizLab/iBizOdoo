package cn.ibizlab.ibizodoo.mail.mailactivitytypemailtemplaterel.dto

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
class MailActivityTypeMailTemplateRelDTO extends GroovyDTO<MailActivityTypeMailTemplateRelDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「标识」
     */
    @JsonProperty("mail_activity_type_id")
    String mailActivityTypeId
    /**
     * 「名称」
     */
    @JsonProperty("mail_activity_type_name")
    String mailActivityTypeName
    /**
     * 「标识」
     */
    @JsonProperty("mail_template_id")
    String mailTemplateId
    /**
     * 「名称」
     */
    @JsonProperty("mail_template_name")
    String mailTemplateName
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name

    /**
     * 设置「标识」值
     * @param val
     */
    MailActivityTypeMailTemplateRelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailActivityTypeMailTemplateRelDTO setMailActivityTypeId(String mailActivityTypeId) {
        this.mailActivityTypeId = mailActivityTypeId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailActivityTypeMailTemplateRelDTO setMailActivityTypeName(String mailActivityTypeName) {
        this.mailActivityTypeName = mailActivityTypeName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailActivityTypeMailTemplateRelDTO setMailTemplateId(String mailTemplateId) {
        this.mailTemplateId = mailTemplateId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailActivityTypeMailTemplateRelDTO setMailTemplateName(String mailTemplateName) {
        this.mailTemplateName = mailTemplateName
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailActivityTypeMailTemplateRelDTO setName(String name) {
        this.name = name
        return this
    }

}
