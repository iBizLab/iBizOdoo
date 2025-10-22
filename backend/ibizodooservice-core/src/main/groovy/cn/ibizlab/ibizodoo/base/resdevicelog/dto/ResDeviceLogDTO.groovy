package cn.ibizlab.ibizodoo.base.resdevicelog.dto

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
class ResDeviceLogDTO extends GroovyDTO<ResDeviceLogDTO> {

    /**
     * 「浏览器」
     */
    @JsonProperty("browser")
    String browser
    /**
     * 「城市」
     */
    @JsonProperty("city")
    String city
    /**
     * 「国家/地区」
     */
    @JsonProperty("country")
    String country
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
     * 「设备类型」
     * 字典[设备类型]
     */
    @JsonProperty("device_type")
    String deviceType
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「首次活动」
     */
    @JsonProperty("first_activity")
    Timestamp firstActivity
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「IP地址」
     */
    @JsonProperty("ip_address")
    String ipAddress
    /**
     * 「当前设备」
     * 字典[是否]
     */
    @JsonProperty("is_current")
    Integer isCurrent
    /**
     * 「上个活动」
     */
    @JsonProperty("last_activity")
    Timestamp lastActivity
    /**
     * 「已连接的 IP 地址」
     */
    @JsonProperty("linked_ip_addresses")
    String linkedIpAddresses
    /**
     * 「平台」
     */
    @JsonProperty("platform")
    String platform
    /**
     * 「已撤销」
     * 字典[是否]
     */
    @JsonProperty("revoked")
    Integer revoked
    /**
     * 「会话标识符」
     */
    @JsonProperty("session_identifier")
    String sessionIdentifier
    /**
     * 「用户」
     */
    @JsonProperty("user_id")
    String userId
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
     * 设置「浏览器」值
     * @param val
     */
    ResDeviceLogDTO setBrowser(String browser) {
        this.browser = browser
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    ResDeviceLogDTO setCity(String city) {
        this.city = city
        return this
    }


    /**
     * 设置「国家/地区」值
     * @param val
     */
    ResDeviceLogDTO setCountry(String country) {
        this.country = country
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResDeviceLogDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResDeviceLogDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「设备类型」值
     * 字典[设备类型]
     * @param val
     */
    ResDeviceLogDTO setDeviceType(String deviceType) {
        this.deviceType = deviceType
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResDeviceLogDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「首次活动」值
     * @param val
     */
    ResDeviceLogDTO setFirstActivity(Timestamp firstActivity) {
        this.firstActivity = firstActivity
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResDeviceLogDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「IP地址」值
     * @param val
     */
    ResDeviceLogDTO setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress
        return this
    }


    /**
     * 设置「当前设备」值
     * 字典[是否]
     * @param val
     */
    ResDeviceLogDTO setIsCurrent(Integer isCurrent) {
        this.isCurrent = isCurrent
        return this
    }


    /**
     * 设置「上个活动」值
     * @param val
     */
    ResDeviceLogDTO setLastActivity(Timestamp lastActivity) {
        this.lastActivity = lastActivity
        return this
    }


    /**
     * 设置「已连接的 IP 地址」值
     * @param val
     */
    ResDeviceLogDTO setLinkedIpAddresses(String linkedIpAddresses) {
        this.linkedIpAddresses = linkedIpAddresses
        return this
    }


    /**
     * 设置「平台」值
     * @param val
     */
    ResDeviceLogDTO setPlatform(String platform) {
        this.platform = platform
        return this
    }


    /**
     * 设置「已撤销」值
     * 字典[是否]
     * @param val
     */
    ResDeviceLogDTO setRevoked(Integer revoked) {
        this.revoked = revoked
        return this
    }


    /**
     * 设置「会话标识符」值
     * @param val
     */
    ResDeviceLogDTO setSessionIdentifier(String sessionIdentifier) {
        this.sessionIdentifier = sessionIdentifier
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    ResDeviceLogDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResDeviceLogDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResDeviceLogDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
