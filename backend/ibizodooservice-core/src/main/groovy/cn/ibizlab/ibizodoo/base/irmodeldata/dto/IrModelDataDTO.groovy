package cn.ibizlab.ibizodoo.base.irmodeldata.dto

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
class IrModelDataDTO extends GroovyDTO<IrModelDataDTO> {

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
     * 「模型名称」
     */
    @JsonProperty("model")
    String model
    /**
     * 「模块」
     */
    @JsonProperty("module")
    String module
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「不可更新」
     * 字典[是否]
     */
    @JsonProperty("noupdate")
    Integer noupdate
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
    IrModelDataDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrModelDataDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrModelDataDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「模型名称」值
     * @param val
     */
    IrModelDataDTO setModel(String model) {
        this.model = model
        return this
    }


    /**
     * 设置「模块」值
     * @param val
     */
    IrModelDataDTO setModule(String module) {
        this.module = module
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrModelDataDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「不可更新」值
     * 字典[是否]
     * @param val
     */
    IrModelDataDTO setNoupdate(Integer noupdate) {
        this.noupdate = noupdate
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrModelDataDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrModelDataDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
