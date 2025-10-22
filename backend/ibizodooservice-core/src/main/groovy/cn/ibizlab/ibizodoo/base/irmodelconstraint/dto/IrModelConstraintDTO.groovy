package cn.ibizlab.ibizodoo.base.irmodelconstraint.dto

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
class IrModelConstraintDTO extends GroovyDTO<IrModelConstraintDTO> {

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
     * 「定义」
     */
    @JsonProperty("definition")
    String definition
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「信息」
     */
    @JsonProperty("message")
    String message
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「约束类型」
     */
    @JsonProperty("type")
    String type
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
    IrModelConstraintDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrModelConstraintDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「定义」值
     * @param val
     */
    IrModelConstraintDTO setDefinition(String definition) {
        this.definition = definition
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrModelConstraintDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「信息」值
     * @param val
     */
    IrModelConstraintDTO setMessage(String message) {
        this.message = message
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrModelConstraintDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「约束类型」值
     * @param val
     */
    IrModelConstraintDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrModelConstraintDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrModelConstraintDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
