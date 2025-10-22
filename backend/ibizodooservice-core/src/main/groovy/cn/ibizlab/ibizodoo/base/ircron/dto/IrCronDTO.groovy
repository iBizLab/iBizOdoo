package cn.ibizlab.ibizodoo.base.ircron.dto

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
class IrCronDTO extends GroovyDTO<IrCronDTO> {

    /**
     * 「模型」
     */
    @JsonProperty("model_id")
    String modelId
    /**
     * 「代码」
     */
    @JsonProperty("code")
    String code
    /**
     * 「值类型」
     * 字典[值类型]
     */
    @JsonProperty("evaluation_type")
    String evaluationType
    /**
     * 「字段更新路径」
     */
    @JsonProperty("update_path")
    String updatePath
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
     * 「值」
     */
    @JsonProperty("value")
    String value
    /**
     * 「布尔值」
     * 字典[布尔值]
     */
    @JsonProperty("update_boolean_value")
    String updateBooleanValue
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
     * 「发送短信为」
     * 字典[发送短信为]
     */
    @JsonProperty("sms_method")
    String smsMethod
    /**
     * 「EMail模板」
     */
    @JsonProperty("template_id")
    String templateId
    /**
     * 「订阅收件人」
     * 字典[是否]
     */
    @JsonProperty("mail_post_autofollow")
    Integer mailPostAutofollow
    /**
     * 「活动类型」
     */
    @JsonProperty("activity_type_id")
    String activityTypeId
    /**
     * 「用户类型」
     * 字典[用户类型]
     */
    @JsonProperty("activity_user_type")
    String activityUserType
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
     * 「备注」
     */
    @JsonProperty("activity_note")
    String activityNote
    /**
     * 「用途」
     * 字典[用途]
     */
    @JsonProperty("usage")
    String usage
    /**
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("state")
    String state
    /**
     * 「活动类型名称」
     */
    @JsonProperty("activity_type_name")
    String activityTypeName
    /**
     * 「负责人」
     */
    @JsonProperty("activity_user_name")
    String activityUserName
    /**
     * 「标题」
     */
    @JsonProperty("activity_summary")
    String activitySummary
    /**
     * 「到期类型」
     * 字典[到期类型]
     */
    @JsonProperty("activity_date_deadline_range_type")
    String activityDateDeadlineRangeType
    /**
     * 「截止日期至」
     */
    @JsonProperty("activity_date_deadline_range")
    Integer activityDateDeadlineRange
    /**
     * 「发送电子邮件」
     * 字典[发送电子邮件]
     */
    @JsonProperty("mail_post_method")
    String mailPostMethod
    /**
     * 「Webhook URL」
     */
    @JsonProperty("webhook_url")
    String webhookUrl
    /**
     * 「EMail模板」
     */
    @JsonProperty("template_name")
    String templateName
    /**
     * 「动作名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
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
     * 「名称」
     */
    @JsonProperty("cron_name")
    String cronName
    /**
     * 「失败次数」
     */
    @JsonProperty("failure_count")
    Integer failureCount
    /**
     * 「首次失败日期」
     */
    @JsonProperty("first_failure_date")
    Timestamp firstFailureDate
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「间隔数值」
     */
    @JsonProperty("interval_number")
    Integer intervalNumber
    /**
     * 「间隔单位」
     * 字典[间隔单位]
     */
    @JsonProperty("interval_type")
    String intervalType
    /**
     * 「服务器动作标识」
     */
    @JsonProperty("ir_actions_server_id")
    String irActionsServerId
    /**
     * 「最后执行日期」
     */
    @JsonProperty("lastcall")
    Timestamp lastcall
    /**
     * 「下一次执行日期」
     */
    @JsonProperty("nextcall")
    Timestamp nextcall
    /**
     * 「优先级」
     */
    @JsonProperty("priority")
    Integer priority
    /**
     * 「执行帐户」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「执行帐户」
     */
    @JsonProperty("user_name")
    String userName
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
    IrCronDTO setModelId(String modelId) {
        this.modelId = modelId
        return this
    }


    /**
     * 设置「代码」值
     * @param val
     */
    IrCronDTO setCode(String code) {
        this.code = code
        return this
    }


    /**
     * 设置「值类型」值
     * 字典[值类型]
     * @param val
     */
    IrCronDTO setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType
        return this
    }


    /**
     * 设置「字段更新路径」值
     * @param val
     */
    IrCronDTO setUpdatePath(String updatePath) {
        this.updatePath = updatePath
        return this
    }


    /**
     * 设置「要更新的字段」值
     * @param val
     */
    IrCronDTO setUpdateFieldId(String updateFieldId) {
        this.updateFieldId = updateFieldId
        return this
    }


    /**
     * 设置「更新相关模型」值
     * @param val
     */
    IrCronDTO setUpdateRelatedModelId(String updateRelatedModelId) {
        this.updateRelatedModelId = updateRelatedModelId
        return this
    }


    /**
     * 设置「值」值
     * @param val
     */
    IrCronDTO setValue(String value) {
        this.value = value
        return this
    }


    /**
     * 设置「布尔值」值
     * 字典[布尔值]
     * @param val
     */
    IrCronDTO setUpdateBooleanValue(String updateBooleanValue) {
        this.updateBooleanValue = updateBooleanValue
        return this
    }


    /**
     * 设置「创建记录」值
     * 字典[模型]
     * @param val
     */
    IrCronDTO setCrudModelId(String crudModelId) {
        this.crudModelId = crudModelId
        return this
    }


    /**
     * 设置「链接字段」值
     * @param val
     */
    IrCronDTO setLinkFieldId(String linkFieldId) {
        this.linkFieldId = linkFieldId
        return this
    }


    /**
     * 设置「发送短信为」值
     * 字典[发送短信为]
     * @param val
     */
    IrCronDTO setSmsMethod(String smsMethod) {
        this.smsMethod = smsMethod
        return this
    }


    /**
     * 设置「EMail模板」值
     * @param val
     */
    IrCronDTO setTemplateId(String templateId) {
        this.templateId = templateId
        return this
    }


    /**
     * 设置「订阅收件人」值
     * 字典[是否]
     * @param val
     */
    IrCronDTO setMailPostAutofollow(Integer mailPostAutofollow) {
        this.mailPostAutofollow = mailPostAutofollow
        return this
    }


    /**
     * 设置「活动类型」值
     * @param val
     */
    IrCronDTO setActivityTypeId(String activityTypeId) {
        this.activityTypeId = activityTypeId
        return this
    }


    /**
     * 设置「用户类型」值
     * 字典[用户类型]
     * @param val
     */
    IrCronDTO setActivityUserType(String activityUserType) {
        this.activityUserType = activityUserType
        return this
    }


    /**
     * 设置「用户字段」值
     * @param val
     */
    IrCronDTO setActivityUserFieldName(String activityUserFieldName) {
        this.activityUserFieldName = activityUserFieldName
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    IrCronDTO setActivityUserId(String activityUserId) {
        this.activityUserId = activityUserId
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    IrCronDTO setActivityNote(String activityNote) {
        this.activityNote = activityNote
        return this
    }


    /**
     * 设置「用途」值
     * 字典[用途]
     * @param val
     */
    IrCronDTO setUsage(String usage) {
        this.usage = usage
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    IrCronDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「活动类型名称」值
     * @param val
     */
    IrCronDTO setActivityTypeName(String activityTypeName) {
        this.activityTypeName = activityTypeName
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    IrCronDTO setActivityUserName(String activityUserName) {
        this.activityUserName = activityUserName
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    IrCronDTO setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary
        return this
    }


    /**
     * 设置「到期类型」值
     * 字典[到期类型]
     * @param val
     */
    IrCronDTO setActivityDateDeadlineRangeType(String activityDateDeadlineRangeType) {
        this.activityDateDeadlineRangeType = activityDateDeadlineRangeType
        return this
    }


    /**
     * 设置「截止日期至」值
     * @param val
     */
    IrCronDTO setActivityDateDeadlineRange(Integer activityDateDeadlineRange) {
        this.activityDateDeadlineRange = activityDateDeadlineRange
        return this
    }


    /**
     * 设置「发送电子邮件」值
     * 字典[发送电子邮件]
     * @param val
     */
    IrCronDTO setMailPostMethod(String mailPostMethod) {
        this.mailPostMethod = mailPostMethod
        return this
    }


    /**
     * 设置「Webhook URL」值
     * @param val
     */
    IrCronDTO setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl
        return this
    }


    /**
     * 设置「EMail模板」值
     * @param val
     */
    IrCronDTO setTemplateName(String templateName) {
        this.templateName = templateName
        return this
    }


    /**
     * 设置「动作名称」值
     * @param val
     */
    IrCronDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    IrCronDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IrCronDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrCronDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrCronDTO setCronName(String cronName) {
        this.cronName = cronName
        return this
    }


    /**
     * 设置「失败次数」值
     * @param val
     */
    IrCronDTO setFailureCount(Integer failureCount) {
        this.failureCount = failureCount
        return this
    }


    /**
     * 设置「首次失败日期」值
     * @param val
     */
    IrCronDTO setFirstFailureDate(Timestamp firstFailureDate) {
        this.firstFailureDate = firstFailureDate
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrCronDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「间隔数值」值
     * @param val
     */
    IrCronDTO setIntervalNumber(Integer intervalNumber) {
        this.intervalNumber = intervalNumber
        return this
    }


    /**
     * 设置「间隔单位」值
     * 字典[间隔单位]
     * @param val
     */
    IrCronDTO setIntervalType(String intervalType) {
        this.intervalType = intervalType
        return this
    }


    /**
     * 设置「服务器动作标识」值
     * @param val
     */
    IrCronDTO setIrActionsServerId(String irActionsServerId) {
        this.irActionsServerId = irActionsServerId
        return this
    }


    /**
     * 设置「最后执行日期」值
     * @param val
     */
    IrCronDTO setLastcall(Timestamp lastcall) {
        this.lastcall = lastcall
        return this
    }


    /**
     * 设置「下一次执行日期」值
     * @param val
     */
    IrCronDTO setNextcall(Timestamp nextcall) {
        this.nextcall = nextcall
        return this
    }


    /**
     * 设置「优先级」值
     * @param val
     */
    IrCronDTO setPriority(Integer priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「执行帐户」值
     * @param val
     */
    IrCronDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「执行帐户」值
     * @param val
     */
    IrCronDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrCronDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrCronDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
