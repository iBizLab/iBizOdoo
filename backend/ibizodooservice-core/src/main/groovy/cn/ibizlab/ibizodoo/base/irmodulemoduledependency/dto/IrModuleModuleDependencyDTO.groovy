package cn.ibizlab.ibizodoo.base.irmodulemoduledependency.dto

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
class IrModuleModuleDependencyDTO extends GroovyDTO<IrModuleModuleDependencyDTO> {

    /**
     * 「需要自动安装」
     * 字典[是否]
     */
    @JsonProperty("auto_install_required")
    Integer autoInstallRequired
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「模块」
     */
    @JsonProperty("module_id")
    String moduleId
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name

    /**
     * 设置「需要自动安装」值
     * 字典[是否]
     * @param val
     */
    IrModuleModuleDependencyDTO setAutoInstallRequired(Integer autoInstallRequired) {
        this.autoInstallRequired = autoInstallRequired
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrModuleModuleDependencyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「模块」值
     * @param val
     */
    IrModuleModuleDependencyDTO setModuleId(String moduleId) {
        this.moduleId = moduleId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrModuleModuleDependencyDTO setName(String name) {
        this.name = name
        return this
    }

}
