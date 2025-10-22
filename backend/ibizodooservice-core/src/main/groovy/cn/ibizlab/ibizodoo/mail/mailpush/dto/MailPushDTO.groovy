package cn.ibizlab.ibizodoo.mail.mailpush.dto

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
class MailPushDTO extends GroovyDTO<MailPushDTO> {

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
     * 「设备」
     */
    @JsonProperty("mail_push_device_id")
    String mailPushDeviceId
    /**
     * 「负载」
     */
    @JsonProperty("payload")
    String payload
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
    MailPushDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailPushDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailPushDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailPushDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「设备」值
     * @param val
     */
    MailPushDTO setMailPushDeviceId(String mailPushDeviceId) {
        this.mailPushDeviceId = mailPushDeviceId
        return this
    }


    /**
     * 设置「负载」值
     * @param val
     */
    MailPushDTO setPayload(String payload) {
        this.payload = payload
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailPushDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailPushDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
