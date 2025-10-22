package cn.ibizlab.ibizodoo.mail.mailaliasmixin.dto

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
class MailAliasMixinDTO extends GroovyDTO<MailAliasMixinDTO> {

    /**
     * 「电子邮件别名」
     */
    @JsonProperty("alias_email")
    String aliasEmail
    /**
     * 「别名」
     */
    @JsonProperty("alias_id")
    String aliasId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name

    /**
     * 设置「电子邮件别名」值
     * @param val
     */
    MailAliasMixinDTO setAliasEmail(String aliasEmail) {
        this.aliasEmail = aliasEmail
        return this
    }


    /**
     * 设置「别名」值
     * @param val
     */
    MailAliasMixinDTO setAliasId(String aliasId) {
        this.aliasId = aliasId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailAliasMixinDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailAliasMixinDTO setName(String name) {
        this.name = name
        return this
    }

}
