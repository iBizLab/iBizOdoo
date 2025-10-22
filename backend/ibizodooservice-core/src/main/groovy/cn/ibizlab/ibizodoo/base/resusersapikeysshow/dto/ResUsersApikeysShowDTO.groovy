package cn.ibizlab.ibizodoo.base.resusersapikeysshow.dto

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
class ResUsersApikeysShowDTO extends GroovyDTO<ResUsersApikeysShowDTO> {

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
     * 设置「标识」值
     * @param val
     */
    ResUsersApikeysShowDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「密钥KEY」值
     * @param val
     */
    ResUsersApikeysShowDTO setKey(String key) {
        this.key = key
        return this
    }

}
