package cn.ibizlab.ibizodoo.mail.mailcomposemessage.dto

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
class MailComposeMessageDTO extends GroovyDTO<MailComposeMessageDTO> {

    /**
     * 「作者」
     */
    @JsonProperty("author_id")
    String authorId
    /**
     * 「删除邮件」
     * 字典[是否]
     */
    @JsonProperty("auto_delete")
    Integer autoDelete
    /**
     * 「保存消息副本」
     * 字典[是否]
     */
    @JsonProperty("auto_delete_keep_log")
    Integer autoDeleteKeepLog
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
     * 「批次组合」
     * 字典[是否]
     */
    @JsonProperty("composition_batch")
    Integer compositionBatch
    /**
     * 「写作模式」
     * 字典[写作模式]
     */
    @JsonProperty("composition_mode")
    String compositionMode
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
     * 「添加签名」
     * 字典[是否]
     */
    @JsonProperty("email_add_signature")
    Integer emailAddSignature
    /**
     * 「来自」
     */
    @JsonProperty("email_from")
    String emailFrom
    /**
     * 「电子邮件通知布局」
     */
    @JsonProperty("email_layout_xmlid")
    String emailLayoutXmlid
    /**
     * 「直接发送邮件或通知」
     * 字典[是否]
     */
    @JsonProperty("force_send")
    Integer forceSend
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
     * 「邮件活动类型」
     */
    @JsonProperty("mail_activity_type_id")
    String mailActivityTypeId
    /**
     * 「邮件标题」
     */
    @JsonProperty("mass_mailing_name")
    String massMailingName
    /**
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("message_type")
    String messageType
    /**
     * 「相关单据模型」
     */
    @JsonProperty("model")
    String model
    /**
     * 「已启用对话串」
     * 字典[是否]
     */
    @JsonProperty("model_is_thread")
    Integer modelIsThread
    /**
     * 「上级消息」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「别名域」
     */
    @JsonProperty("record_alias_domain_id")
    String recordAliasDomainId
    /**
     * 「公司」
     */
    @JsonProperty("record_company_id")
    String recordCompanyId
    /**
     * 「记录名称」
     */
    @JsonProperty("record_name")
    String recordName
    /**
     * 「渲染模型」
     */
    @JsonProperty("render_model")
    String renderModel
    /**
     * 「回复」
     */
    @JsonProperty("reply_to")
    String replyTo
    /**
     * 「视答案为新线程」
     * 字典[是否]
     */
    @JsonProperty("reply_to_force_new")
    Integer replyToForceNew
    /**
     * 「回复」
     * 字典[回复]
     */
    @JsonProperty("reply_to_mode")
    String replyToMode
    /**
     * 「有效的域」
     */
    @JsonProperty("res_domain")
    String resDomain
    /**
     * 「负责人」
     */
    @JsonProperty("res_domain_user_id")
    String resDomainUserId
    /**
     * 「相关文档 ID」
     */
    @JsonProperty("res_ids")
    String resIds
    /**
     * 「安排的日期」
     */
    @JsonProperty("scheduled_date")
    String scheduledDate
    /**
     * 「主旨」
     */
    @JsonProperty("subject")
    String subject
    /**
     * 「子类型」
     */
    @JsonProperty("subtype_id")
    String subtypeId
    /**
     * 「是系统日志」
     * 字典[是否]
     */
    @JsonProperty("subtype_is_log")
    Integer subtypeIsLog
    /**
     * 「使用模版」
     */
    @JsonProperty("template_id")
    String templateId
    /**
     * 「模板名称」
     */
    @JsonProperty("template_name")
    String templateName
    /**
     * 「检查排除清单」
     * 字典[是否]
     */
    @JsonProperty("use_exclusion_list")
    Integer useExclusionList
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
     * 设置「作者」值
     * @param val
     */
    MailComposeMessageDTO setAuthorId(String authorId) {
        this.authorId = authorId
        return this
    }


    /**
     * 设置「删除邮件」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setAutoDelete(Integer autoDelete) {
        this.autoDelete = autoDelete
        return this
    }


    /**
     * 设置「保存消息副本」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setAutoDeleteKeepLog(Integer autoDeleteKeepLog) {
        this.autoDeleteKeepLog = autoDeleteKeepLog
        return this
    }


    /**
     * 设置「内容」值
     * @param val
     */
    MailComposeMessageDTO setBody(String body) {
        this.body = body
        return this
    }


    /**
     * 设置「正文内容与模板相同」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setBodyHasTemplateValue(Integer bodyHasTemplateValue) {
        this.bodyHasTemplateValue = bodyHasTemplateValue
        return this
    }


    /**
     * 设置「可以编辑主体」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setCanEditBody(Integer canEditBody) {
        this.canEditBody = canEditBody
        return this
    }


    /**
     * 设置「批次组合」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setCompositionBatch(Integer compositionBatch) {
        this.compositionBatch = compositionBatch
        return this
    }


    /**
     * 设置「写作模式」值
     * 字典[写作模式]
     * @param val
     */
    MailComposeMessageDTO setCompositionMode(String compositionMode) {
        this.compositionMode = compositionMode
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailComposeMessageDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailComposeMessageDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailComposeMessageDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「添加签名」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setEmailAddSignature(Integer emailAddSignature) {
        this.emailAddSignature = emailAddSignature
        return this
    }


    /**
     * 设置「来自」值
     * @param val
     */
    MailComposeMessageDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「电子邮件通知布局」值
     * @param val
     */
    MailComposeMessageDTO setEmailLayoutXmlid(String emailLayoutXmlid) {
        this.emailLayoutXmlid = emailLayoutXmlid
        return this
    }


    /**
     * 设置「直接发送邮件或通知」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setForceSend(Integer forceSend) {
        this.forceSend = forceSend
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailComposeMessageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是编辑者」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setIsMailTemplateEditor(Integer isMailTemplateEditor) {
        this.isMailTemplateEditor = isMailTemplateEditor
        return this
    }


    /**
     * 设置「语言」值
     * @param val
     */
    MailComposeMessageDTO setLang(String lang) {
        this.lang = lang
        return this
    }


    /**
     * 设置「邮件活动类型」值
     * @param val
     */
    MailComposeMessageDTO setMailActivityTypeId(String mailActivityTypeId) {
        this.mailActivityTypeId = mailActivityTypeId
        return this
    }


    /**
     * 设置「邮件标题」值
     * @param val
     */
    MailComposeMessageDTO setMassMailingName(String massMailingName) {
        this.massMailingName = massMailingName
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    MailComposeMessageDTO setMessageType(String messageType) {
        this.messageType = messageType
        return this
    }


    /**
     * 设置「相关单据模型」值
     * @param val
     */
    MailComposeMessageDTO setModel(String model) {
        this.model = model
        return this
    }


    /**
     * 设置「已启用对话串」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setModelIsThread(Integer modelIsThread) {
        this.modelIsThread = modelIsThread
        return this
    }


    /**
     * 设置「上级消息」值
     * @param val
     */
    MailComposeMessageDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「别名域」值
     * @param val
     */
    MailComposeMessageDTO setRecordAliasDomainId(String recordAliasDomainId) {
        this.recordAliasDomainId = recordAliasDomainId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    MailComposeMessageDTO setRecordCompanyId(String recordCompanyId) {
        this.recordCompanyId = recordCompanyId
        return this
    }


    /**
     * 设置「记录名称」值
     * @param val
     */
    MailComposeMessageDTO setRecordName(String recordName) {
        this.recordName = recordName
        return this
    }


    /**
     * 设置「渲染模型」值
     * @param val
     */
    MailComposeMessageDTO setRenderModel(String renderModel) {
        this.renderModel = renderModel
        return this
    }


    /**
     * 设置「回复」值
     * @param val
     */
    MailComposeMessageDTO setReplyTo(String replyTo) {
        this.replyTo = replyTo
        return this
    }


    /**
     * 设置「视答案为新线程」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setReplyToForceNew(Integer replyToForceNew) {
        this.replyToForceNew = replyToForceNew
        return this
    }


    /**
     * 设置「回复」值
     * 字典[回复]
     * @param val
     */
    MailComposeMessageDTO setReplyToMode(String replyToMode) {
        this.replyToMode = replyToMode
        return this
    }


    /**
     * 设置「有效的域」值
     * @param val
     */
    MailComposeMessageDTO setResDomain(String resDomain) {
        this.resDomain = resDomain
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    MailComposeMessageDTO setResDomainUserId(String resDomainUserId) {
        this.resDomainUserId = resDomainUserId
        return this
    }


    /**
     * 设置「相关文档 ID」值
     * @param val
     */
    MailComposeMessageDTO setResIds(String resIds) {
        this.resIds = resIds
        return this
    }


    /**
     * 设置「安排的日期」值
     * @param val
     */
    MailComposeMessageDTO setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate
        return this
    }


    /**
     * 设置「主旨」值
     * @param val
     */
    MailComposeMessageDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「子类型」值
     * @param val
     */
    MailComposeMessageDTO setSubtypeId(String subtypeId) {
        this.subtypeId = subtypeId
        return this
    }


    /**
     * 设置「是系统日志」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setSubtypeIsLog(Integer subtypeIsLog) {
        this.subtypeIsLog = subtypeIsLog
        return this
    }


    /**
     * 设置「使用模版」值
     * @param val
     */
    MailComposeMessageDTO setTemplateId(String templateId) {
        this.templateId = templateId
        return this
    }


    /**
     * 设置「模板名称」值
     * @param val
     */
    MailComposeMessageDTO setTemplateName(String templateName) {
        this.templateName = templateName
        return this
    }


    /**
     * 设置「检查排除清单」值
     * 字典[是否]
     * @param val
     */
    MailComposeMessageDTO setUseExclusionList(Integer useExclusionList) {
        this.useExclusionList = useExclusionList
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailComposeMessageDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailComposeMessageDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
