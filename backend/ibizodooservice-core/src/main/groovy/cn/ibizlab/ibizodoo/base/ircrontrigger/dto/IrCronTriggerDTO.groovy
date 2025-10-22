package cn.ibizlab.ibizodoo.base.ircrontrigger.dto

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
class IrCronTriggerDTO extends GroovyDTO<IrCronTriggerDTO> {

    /**
     * 「调用时间」
     */
    @JsonProperty("call_at")
    Timestamp callAt
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
    @JsonProperty("cron_cron_name")
    String cronCronName
    /**
     * 「标识」
     */
    @JsonProperty("cron_id")
    String cronId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
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
     * 设置「调用时间」值
     * @param val
     */
    IrCronTriggerDTO setCallAt(Timestamp callAt) {
        this.callAt = callAt
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IrCronTriggerDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrCronTriggerDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrCronTriggerDTO setCronCronName(String cronCronName) {
        this.cronCronName = cronCronName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrCronTriggerDTO setCronId(String cronId) {
        this.cronId = cronId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrCronTriggerDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrCronTriggerDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrCronTriggerDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
