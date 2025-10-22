package cn.ibizlab.ibizodoo.bus.buseventrecord.dto

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
class BusEventRecordDTO extends GroovyDTO<BusEventRecordDTO> {

    /**
     * 「事件」
     */
    @JsonProperty("event")
    String event
    /**
     * 「对象数据」
     */
    @JsonProperty("data")
    String data
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
     * 「资源模型」
     */
    @JsonProperty("res_model")
    String resModel
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
     * 设置「事件」值
     * @param val
     */
    BusEventRecordDTO setEvent(String event) {
        this.event = event
        return this
    }


    /**
     * 设置「对象数据」值
     * @param val
     */
    BusEventRecordDTO setData(String data) {
        this.data = data
        return this
    }


    /**
     * 设置「资源标识」值
     * @param val
     */
    BusEventRecordDTO setResId(String resId) {
        this.resId = resId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    BusEventRecordDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    BusEventRecordDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    BusEventRecordDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    BusEventRecordDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「资源模型」值
     * @param val
     */
    BusEventRecordDTO setResModel(String resModel) {
        this.resModel = resModel
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    BusEventRecordDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    BusEventRecordDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
