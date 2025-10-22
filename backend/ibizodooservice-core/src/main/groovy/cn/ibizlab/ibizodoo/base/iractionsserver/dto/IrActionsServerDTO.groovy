package cn.ibizlab.ibizodoo.base.iractionsserver.dto

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
class IrActionsServerDTO extends GroovyDTO<IrActionsServerDTO> {

    /**
     * 「模型」
     */
    @JsonProperty("model_id")
    String modelId
    /**
     * 「要更新的字段」
     */
    @JsonProperty("update_field_id")
    String updateFieldId
    /**
     * 「更新相关模型」
     */
    @JsonProperty("update_related_model_id")
    String updateRelatedModelId
    /**
     * 「创建记录」
     * 字典[模型]
     */
    @JsonProperty("crud_model_id")
    String crudModelId
    /**
     * 「链接字段」
     */
    @JsonProperty("link_field_id")
    String linkFieldId
    /**
     * 「截止日期至」
     */
    @JsonProperty("activity_date_deadline_range")
    Integer activityDateDeadlineRange
    /**
     * 「到期类型」
     * 字典[到期类型]
     */
    @JsonProperty("activity_date_deadline_range_type")
    String activityDateDeadlineRangeType
    /**
     * 「备注」
     */
    @JsonProperty("activity_note")
    String activityNote
    /**
     * 「标题」
     */
    @JsonProperty("activity_summary")
    String activitySummary
    /**
     * 「活动类型」
     */
    @JsonProperty("activity_type_id")
    String activityTypeId
    /**
     * 「活动类型名称」
     */
    @JsonProperty("activity_type_name")
    String activityTypeName
    /**
     * 「用户字段」
     */
    @JsonProperty("activity_user_field_name")
    String activityUserFieldName
    /**
     * 「负责人」
     */
    @JsonProperty("activity_user_id")
    String activityUserId
    /**
     * 「负责人」
     */
    @JsonProperty("activity_user_name")
    String activityUserName
    /**
     * 「用户类型」
     * 字典[用户类型]
     */
    @JsonProperty("activity_user_type")
    String activityUserType
    /**
     * 「绑定类型」
     * 字典[绑定类型]
     */
    @JsonProperty("binding_type")
    String bindingType
    /**
     * 「绑定视图类型」
     */
    @JsonProperty("binding_view_types")
    String bindingViewTypes
    /**
     * 「Python 代码」
     */
    @JsonProperty("code")
    String code
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
     * 「值类型」
     * 字典[值类型]
     */
    @JsonProperty("evaluation_type")
    String evaluationType
    /**
     * 「动作描述」
     */
    @JsonProperty("help")
    String help
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「订阅收件人」
     * 字典[是否]
     */
    @JsonProperty("mail_post_autofollow")
    Integer mailPostAutofollow
    /**
     * 「发送电子邮件」
     * 字典[发送电子邮件]
     */
    @JsonProperty("mail_post_method")
    String mailPostMethod
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「网站中显示的路径」
     */
    @JsonProperty("path")
    String path
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「发送短信为」
     * 字典[发送短信为]
     */
    @JsonProperty("sms_method")
    String smsMethod
    /**
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("state")
    String state
    /**
     * 「EMail模板」
     */
    @JsonProperty("template_id")
    String templateId
    /**
     * 「EMail模板」
     */
    @JsonProperty("template_name")
    String templateName
    /**
     * 「动作类型」
     */
    @JsonProperty("type")
    String type
    /**
     * 「布尔值」
     * 字典[布尔值]
     */
    @JsonProperty("update_boolean_value")
    String updateBooleanValue
    /**
     * 「Many2many 业务」
     * 字典[Many2many 业务]
     */
    @JsonProperty("update_m2m_operation")
    String updateM2mOperation
    /**
     * 「字段更新路径」
     */
    @JsonProperty("update_path")
    String updatePath
    /**
     * 「用途」
     * 字典[用途]
     */
    @JsonProperty("usage")
    String usage
    /**
     * 「值」
     */
    @JsonProperty("value")
    String value
    /**
     * 「Webhook URL」
     */
    @JsonProperty("webhook_url")
    String webhookUrl
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
     * 设置「模型」值
     * @param val
     */
    IrActionsServerDTO setModelId(String modelId) {
        this.modelId = modelId
        return this
    }


    /**
     * 设置「要更新的字段」值
     * @param val
     */
    IrActionsServerDTO setUpdateFieldId(String updateFieldId) {
        this.updateFieldId = updateFieldId
        return this
    }


    /**
     * 设置「更新相关模型」值
     * @param val
     */
    IrActionsServerDTO setUpdateRelatedModelId(String updateRelatedModelId) {
        this.updateRelatedModelId = updateRelatedModelId
        return this
    }


    /**
     * 设置「创建记录」值
     * 字典[模型]
     * @param val
     */
    IrActionsServerDTO setCrudModelId(String crudModelId) {
        this.crudModelId = crudModelId
        return this
    }


    /**
     * 设置「链接字段」值
     * @param val
     */
    IrActionsServerDTO setLinkFieldId(String linkFieldId) {
        this.linkFieldId = linkFieldId
        return this
    }


    /**
     * 设置「截止日期至」值
     * @param val
     */
    IrActionsServerDTO setActivityDateDeadlineRange(Integer activityDateDeadlineRange) {
        this.activityDateDeadlineRange = activityDateDeadlineRange
        return this
    }


    /**
     * 设置「到期类型」值
     * 字典[到期类型]
     * @param val
     */
    IrActionsServerDTO setActivityDateDeadlineRangeType(String activityDateDeadlineRangeType) {
        this.activityDateDeadlineRangeType = activityDateDeadlineRangeType
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    IrActionsServerDTO setActivityNote(String activityNote) {
        this.activityNote = activityNote
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    IrActionsServerDTO setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary
        return this
    }


    /**
     * 设置「活动类型」值
     * @param val
     */
    IrActionsServerDTO setActivityTypeId(String activityTypeId) {
        this.activityTypeId = activityTypeId
        return this
    }


    /**
     * 设置「活动类型名称」值
     * @param val
     */
    IrActionsServerDTO setActivityTypeName(String activityTypeName) {
        this.activityTypeName = activityTypeName
        return this
    }


    /**
     * 设置「用户字段」值
     * @param val
     */
    IrActionsServerDTO setActivityUserFieldName(String activityUserFieldName) {
        this.activityUserFieldName = activityUserFieldName
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    IrActionsServerDTO setActivityUserId(String activityUserId) {
        this.activityUserId = activityUserId
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    IrActionsServerDTO setActivityUserName(String activityUserName) {
        this.activityUserName = activityUserName
        return this
    }


    /**
     * 设置「用户类型」值
     * 字典[用户类型]
     * @param val
     */
    IrActionsServerDTO setActivityUserType(String activityUserType) {
        this.activityUserType = activityUserType
        return this
    }


    /**
     * 设置「绑定类型」值
     * 字典[绑定类型]
     * @param val
     */
    IrActionsServerDTO setBindingType(String bindingType) {
        this.bindingType = bindingType
        return this
    }


    /**
     * 设置「绑定视图类型」值
     * @param val
     */
    IrActionsServerDTO setBindingViewTypes(String bindingViewTypes) {
        this.bindingViewTypes = bindingViewTypes
        return this
    }


    /**
     * 设置「Python 代码」值
     * @param val
     */
    IrActionsServerDTO setCode(String code) {
        this.code = code
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IrActionsServerDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrActionsServerDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「值类型」值
     * 字典[值类型]
     * @param val
     */
    IrActionsServerDTO setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType
        return this
    }


    /**
     * 设置「动作描述」值
     * @param val
     */
    IrActionsServerDTO setHelp(String help) {
        this.help = help
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrActionsServerDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「订阅收件人」值
     * 字典[是否]
     * @param val
     */
    IrActionsServerDTO setMailPostAutofollow(Integer mailPostAutofollow) {
        this.mailPostAutofollow = mailPostAutofollow
        return this
    }


    /**
     * 设置「发送电子邮件」值
     * 字典[发送电子邮件]
     * @param val
     */
    IrActionsServerDTO setMailPostMethod(String mailPostMethod) {
        this.mailPostMethod = mailPostMethod
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrActionsServerDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「网站中显示的路径」值
     * @param val
     */
    IrActionsServerDTO setPath(String path) {
        this.path = path
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    IrActionsServerDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「发送短信为」值
     * 字典[发送短信为]
     * @param val
     */
    IrActionsServerDTO setSmsMethod(String smsMethod) {
        this.smsMethod = smsMethod
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    IrActionsServerDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「EMail模板」值
     * @param val
     */
    IrActionsServerDTO setTemplateId(String templateId) {
        this.templateId = templateId
        return this
    }


    /**
     * 设置「EMail模板」值
     * @param val
     */
    IrActionsServerDTO setTemplateName(String templateName) {
        this.templateName = templateName
        return this
    }


    /**
     * 设置「动作类型」值
     * @param val
     */
    IrActionsServerDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「布尔值」值
     * 字典[布尔值]
     * @param val
     */
    IrActionsServerDTO setUpdateBooleanValue(String updateBooleanValue) {
        this.updateBooleanValue = updateBooleanValue
        return this
    }


    /**
     * 设置「Many2many 业务」值
     * 字典[Many2many 业务]
     * @param val
     */
    IrActionsServerDTO setUpdateM2mOperation(String updateM2mOperation) {
        this.updateM2mOperation = updateM2mOperation
        return this
    }


    /**
     * 设置「字段更新路径」值
     * @param val
     */
    IrActionsServerDTO setUpdatePath(String updatePath) {
        this.updatePath = updatePath
        return this
    }


    /**
     * 设置「用途」值
     * 字典[用途]
     * @param val
     */
    IrActionsServerDTO setUsage(String usage) {
        this.usage = usage
        return this
    }


    /**
     * 设置「值」值
     * @param val
     */
    IrActionsServerDTO setValue(String value) {
        this.value = value
        return this
    }


    /**
     * 设置「Webhook URL」值
     * @param val
     */
    IrActionsServerDTO setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrActionsServerDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrActionsServerDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
