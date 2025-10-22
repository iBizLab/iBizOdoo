package cn.ibizlab.ibizodoo.base.respartnercategory.dto

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
class ResPartnerCategoryDTO extends GroovyDTO<ResPartnerCategoryDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「颜色」
     */
    @JsonProperty("color")
    Integer color
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
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
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
     * 「类别」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「上级路径」
     */
    @JsonProperty("parent_path")
    String parentPath
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
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    ResPartnerCategoryDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「颜色」值
     * @param val
     */
    ResPartnerCategoryDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResPartnerCategoryDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResPartnerCategoryDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResPartnerCategoryDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResPartnerCategoryDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResPartnerCategoryDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    ResPartnerCategoryDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「上级路径」值
     * @param val
     */
    ResPartnerCategoryDTO setParentPath(String parentPath) {
        this.parentPath = parentPath
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResPartnerCategoryDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResPartnerCategoryDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
