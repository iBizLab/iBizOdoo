package cn.ibizlab.ibizodoo.mail.mailtrackingdurationmixin.dto

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
class MailTrackingDurationMixinDTO extends GroovyDTO<MailTrackingDurationMixinDTO> {

    /**
     * 「状态时间」
     */
    @JsonProperty("duration_tracking")
    IEntity durationTracking
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
     * 设置「状态时间」值
     * @param val
     */
    MailTrackingDurationMixinDTO setDurationTracking(IEntity durationTracking) {
        this.durationTracking = durationTracking
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailTrackingDurationMixinDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailTrackingDurationMixinDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailTrackingDurationMixinDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailTrackingDurationMixinDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailTrackingDurationMixinDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailTrackingDurationMixinDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
