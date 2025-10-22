package cn.ibizlab.ibizodoo.base.ircronprogress.dto

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
class IrCronProgressDTO extends GroovyDTO<IrCronProgressDTO> {

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
     * 「取消激活」
     * 字典[是否]
     */
    @JsonProperty("deactivate")
    Integer deactivate
    /**
     * 「完成」
     */
    @JsonProperty("done")
    Integer done
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「剩余」
     */
    @JsonProperty("remaining")
    Integer remaining
    /**
     * 「计数器超时」
     */
    @JsonProperty("timed_out_counter")
    Integer timedOutCounter
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
    IrCronProgressDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrCronProgressDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「取消激活」值
     * 字典[是否]
     * @param val
     */
    IrCronProgressDTO setDeactivate(Integer deactivate) {
        this.deactivate = deactivate
        return this
    }


    /**
     * 设置「完成」值
     * @param val
     */
    IrCronProgressDTO setDone(Integer done) {
        this.done = done
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrCronProgressDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「剩余」值
     * @param val
     */
    IrCronProgressDTO setRemaining(Integer remaining) {
        this.remaining = remaining
        return this
    }


    /**
     * 设置「计数器超时」值
     * @param val
     */
    IrCronProgressDTO setTimedOutCounter(Integer timedOutCounter) {
        this.timedOutCounter = timedOutCounter
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrCronProgressDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrCronProgressDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
