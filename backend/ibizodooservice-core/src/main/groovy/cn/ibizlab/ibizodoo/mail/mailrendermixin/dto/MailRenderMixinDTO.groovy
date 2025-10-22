package cn.ibizlab.ibizodoo.mail.mailrendermixin.dto

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
class MailRenderMixinDTO extends GroovyDTO<MailRenderMixinDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「语言」
     */
    @JsonProperty("lang")
    String lang
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「渲染模型」
     */
    @JsonProperty("render_model")
    String renderModel

    /**
     * 设置「标识」值
     * @param val
     */
    MailRenderMixinDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「语言」值
     * @param val
     */
    MailRenderMixinDTO setLang(String lang) {
        this.lang = lang
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailRenderMixinDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「渲染模型」值
     * @param val
     */
    MailRenderMixinDTO setRenderModel(String renderModel) {
        this.renderModel = renderModel
        return this
    }

}
