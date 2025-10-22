package cn.ibizlab.ibizodoo.mail.mailtrackingvalue.dto

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
class MailTrackingValueDTO extends GroovyDTO<MailTrackingValueDTO> {

    /**
     * 「属性标识」
     */
    @JsonProperty("field_id")
    String fieldId
    /**
     * 「属性信息」
     */
    @JsonProperty("field_info")
    String fieldInfo
    /**
     * 「相关模型」
     */
    @JsonProperty("model")
    String model
    /**
     * 「资源标识」
     */
    @JsonProperty("res_id")
    String resId
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
     * 「币别」
     */
    @JsonProperty("currency_id")
    String currencyId
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
     * 「消息ID」
     */
    @JsonProperty("mail_message_id")
    String mailMessageId
    /**
     * 「新字符值」
     */
    @JsonProperty("new_value_char")
    String newValueChar
    /**
     * 「新日期时间值」
     */
    @JsonProperty("new_value_datetime")
    Timestamp newValueDatetime
    /**
     * 「新浮点值」
     */
    @JsonProperty("new_value_float")
    Double newValueFloat
    /**
     * 「新整数值」
     */
    @JsonProperty("new_value_integer")
    Integer newValueInteger
    /**
     * 「新文本值」
     */
    @JsonProperty("new_value_text")
    String newValueText
    /**
     * 「旧字符值」
     */
    @JsonProperty("old_value_char")
    String oldValueChar
    /**
     * 「旧日期时间值」
     */
    @JsonProperty("old_value_datetime")
    Timestamp oldValueDatetime
    /**
     * 「旧浮点值」
     */
    @JsonProperty("old_value_float")
    Double oldValueFloat
    /**
     * 「旧整数值」
     */
    @JsonProperty("old_value_integer")
    Integer oldValueInteger
    /**
     * 「旧文本值」
     */
    @JsonProperty("old_value_text")
    String oldValueText
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
     * 设置「属性标识」值
     * @param val
     */
    MailTrackingValueDTO setFieldId(String fieldId) {
        this.fieldId = fieldId
        return this
    }


    /**
     * 设置「属性信息」值
     * @param val
     */
    MailTrackingValueDTO setFieldInfo(String fieldInfo) {
        this.fieldInfo = fieldInfo
        return this
    }


    /**
     * 设置「相关模型」值
     * @param val
     */
    MailTrackingValueDTO setModel(String model) {
        this.model = model
        return this
    }


    /**
     * 设置「资源标识」值
     * @param val
     */
    MailTrackingValueDTO setResId(String resId) {
        this.resId = resId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailTrackingValueDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailTrackingValueDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「币别」值
     * @param val
     */
    MailTrackingValueDTO setCurrencyId(String currencyId) {
        this.currencyId = currencyId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailTrackingValueDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailTrackingValueDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「消息ID」值
     * @param val
     */
    MailTrackingValueDTO setMailMessageId(String mailMessageId) {
        this.mailMessageId = mailMessageId
        return this
    }


    /**
     * 设置「新字符值」值
     * @param val
     */
    MailTrackingValueDTO setNewValueChar(String newValueChar) {
        this.newValueChar = newValueChar
        return this
    }


    /**
     * 设置「新日期时间值」值
     * @param val
     */
    MailTrackingValueDTO setNewValueDatetime(Timestamp newValueDatetime) {
        this.newValueDatetime = newValueDatetime
        return this
    }


    /**
     * 设置「新浮点值」值
     * @param val
     */
    MailTrackingValueDTO setNewValueFloat(Double newValueFloat) {
        this.newValueFloat = newValueFloat
        return this
    }


    /**
     * 设置「新整数值」值
     * @param val
     */
    MailTrackingValueDTO setNewValueInteger(Integer newValueInteger) {
        this.newValueInteger = newValueInteger
        return this
    }


    /**
     * 设置「新文本值」值
     * @param val
     */
    MailTrackingValueDTO setNewValueText(String newValueText) {
        this.newValueText = newValueText
        return this
    }


    /**
     * 设置「旧字符值」值
     * @param val
     */
    MailTrackingValueDTO setOldValueChar(String oldValueChar) {
        this.oldValueChar = oldValueChar
        return this
    }


    /**
     * 设置「旧日期时间值」值
     * @param val
     */
    MailTrackingValueDTO setOldValueDatetime(Timestamp oldValueDatetime) {
        this.oldValueDatetime = oldValueDatetime
        return this
    }


    /**
     * 设置「旧浮点值」值
     * @param val
     */
    MailTrackingValueDTO setOldValueFloat(Double oldValueFloat) {
        this.oldValueFloat = oldValueFloat
        return this
    }


    /**
     * 设置「旧整数值」值
     * @param val
     */
    MailTrackingValueDTO setOldValueInteger(Integer oldValueInteger) {
        this.oldValueInteger = oldValueInteger
        return this
    }


    /**
     * 设置「旧文本值」值
     * @param val
     */
    MailTrackingValueDTO setOldValueText(String oldValueText) {
        this.oldValueText = oldValueText
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailTrackingValueDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailTrackingValueDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
