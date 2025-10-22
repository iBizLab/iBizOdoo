package cn.ibizlab.ibizodoo.base.irconfigparameter.dto

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
class IrConfigParameterDTO extends GroovyDTO<IrConfigParameterDTO> {

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
     * 「密钥KEY」
     */
    @JsonProperty("key")
    String key
    /**
     * 「值」
     */
    @JsonProperty("value")
    String value
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
    IrConfigParameterDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrConfigParameterDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrConfigParameterDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「密钥KEY」值
     * @param val
     */
    IrConfigParameterDTO setKey(String key) {
        this.key = key
        return this
    }


    /**
     * 设置「值」值
     * @param val
     */
    IrConfigParameterDTO setValue(String value) {
        this.value = value
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrConfigParameterDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrConfigParameterDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
