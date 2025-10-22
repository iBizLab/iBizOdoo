package cn.ibizlab.ibizodoo.mail.mailpushdevice.dto

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
class MailPushDeviceDTO extends GroovyDTO<MailPushDeviceDTO> {

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
     * 「浏览器端点」
     */
    @JsonProperty("endpoint")
    String endpoint
    /**
     * 「到期令牌日期」
     */
    @JsonProperty("expiration_time")
    Timestamp expirationTime
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「浏览器按键」
     */
    @JsonProperty("keys")
    String keys
    /**
     * 「合作伙伴」
     */
    @JsonProperty("partner_id")
    String partnerId
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
    MailPushDeviceDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailPushDeviceDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailPushDeviceDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「浏览器端点」值
     * @param val
     */
    MailPushDeviceDTO setEndpoint(String endpoint) {
        this.endpoint = endpoint
        return this
    }


    /**
     * 设置「到期令牌日期」值
     * @param val
     */
    MailPushDeviceDTO setExpirationTime(Timestamp expirationTime) {
        this.expirationTime = expirationTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailPushDeviceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「浏览器按键」值
     * @param val
     */
    MailPushDeviceDTO setKeys(String keys) {
        this.keys = keys
        return this
    }


    /**
     * 设置「合作伙伴」值
     * @param val
     */
    MailPushDeviceDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailPushDeviceDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailPushDeviceDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
