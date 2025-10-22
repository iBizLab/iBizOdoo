package cn.ibizlab.ibizodoo.mail.mailcomposermixin.dto

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
class MailComposerMixinDTO extends GroovyDTO<MailComposerMixinDTO> {

    /**
     * 「内容」
     */
    @JsonProperty("body")
    String body
    /**
     * 「正文内容与模板相同」
     * 字典[是否]
     */
    @JsonProperty("body_has_template_value")
    Integer bodyHasTemplateValue
    /**
     * 「可以编辑主体」
     * 字典[是否]
     */
    @JsonProperty("can_edit_body")
    Integer canEditBody
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「是编辑者」
     * 字典[是否]
     */
    @JsonProperty("is_mail_template_editor")
    Integer isMailTemplateEditor
    /**
     * 「语言」
     */
    @JsonProperty("lang")
    String lang
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「渲染模型」
     */
    @JsonProperty("render_model")
    String renderModel
    /**
     * 「主旨」
     */
    @JsonProperty("subject")
    String subject
    /**
     * 「邮件模板」
     */
    @JsonProperty("template_id")
    String templateId

    /**
     * 设置「内容」值
     * @param val
     */
    MailComposerMixinDTO setBody(String body) {
        this.body = body
        return this
    }


    /**
     * 设置「正文内容与模板相同」值
     * 字典[是否]
     * @param val
     */
    MailComposerMixinDTO setBodyHasTemplateValue(Integer bodyHasTemplateValue) {
        this.bodyHasTemplateValue = bodyHasTemplateValue
        return this
    }


    /**
     * 设置「可以编辑主体」值
     * 字典[是否]
     * @param val
     */
    MailComposerMixinDTO setCanEditBody(Integer canEditBody) {
        this.canEditBody = canEditBody
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailComposerMixinDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是编辑者」值
     * 字典[是否]
     * @param val
     */
    MailComposerMixinDTO setIsMailTemplateEditor(Integer isMailTemplateEditor) {
        this.isMailTemplateEditor = isMailTemplateEditor
        return this
    }


    /**
     * 设置「语言」值
     * @param val
     */
    MailComposerMixinDTO setLang(String lang) {
        this.lang = lang
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailComposerMixinDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「渲染模型」值
     * @param val
     */
    MailComposerMixinDTO setRenderModel(String renderModel) {
        this.renderModel = renderModel
        return this
    }


    /**
     * 设置「主旨」值
     * @param val
     */
    MailComposerMixinDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「邮件模板」值
     * @param val
     */
    MailComposerMixinDTO setTemplateId(String templateId) {
        this.templateId = templateId
        return this
    }

}
