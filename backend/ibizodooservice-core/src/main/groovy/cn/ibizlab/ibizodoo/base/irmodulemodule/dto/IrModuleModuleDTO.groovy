package cn.ibizlab.ibizodoo.base.irmodulemodule.dto

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
class IrModuleModuleDTO extends GroovyDTO<IrModuleModuleDTO> {

    /**
     * 「应用标识」
     */
    @JsonProperty("app_id")
    String appId
    /**
     * 「排序值」
     */
    @JsonProperty("order")
    Integer order
    /**
     * 「资源标识」
     */
    @JsonProperty("res_code")
    String resCode
    /**
     * 「应用」
     * 字典[是否]
     */
    @JsonProperty("application")
    Integer application
    /**
     * 「作者」
     */
    @JsonProperty("author")
    String author
    /**
     * 「自动安装」
     * 字典[是否]
     */
    @JsonProperty("auto_install")
    Integer autoInstall
    /**
     * 「类别」
     */
    @JsonProperty("category_id")
    String categoryId
    /**
     * 「协作者」
     */
    @JsonProperty("contributors")
    String contributors
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
     * 「演示数据」
     * 字典[是否]
     */
    @JsonProperty("demo")
    Integer demo
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「图标网址」
     */
    @JsonProperty("icon")
    String icon
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「导入的模块」
     * 字典[是否]
     */
    @JsonProperty("imported")
    Integer imported
    /**
     * 「已安装版本」
     */
    @JsonProperty("latest_version")
    String latestVersion
    /**
     * 「许可证」
     * 字典[许可证]
     */
    @JsonProperty("license")
    String license
    /**
     * 「维护者」
     */
    @JsonProperty("maintainer")
    String maintainer
    /**
     * 「菜单」
     */
    @JsonProperty("menus_by_module")
    String menusByModule
    /**
     * 「模块类型」
     * 字典[模块类型]
     */
    @JsonProperty("module_type")
    String moduleType
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「出版版本」
     */
    @JsonProperty("published_version")
    String publishedVersion
    /**
     * 「报表」
     */
    @JsonProperty("reports_by_module")
    String reportsByModule
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「模块名」
     */
    @JsonProperty("shortdesc")
    String shortdesc
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「摘要」
     */
    @JsonProperty("summary")
    String summary
    /**
     * 「ERP 企业版专属模块」
     * 字典[是否]
     */
    @JsonProperty("to_buy")
    Integer toBuy
    /**
     * 「URL」
     */
    @JsonProperty("url")
    String url
    /**
     * 「视图」
     */
    @JsonProperty("views_by_module")
    String viewsByModule
    /**
     * 「网站」
     */
    @JsonProperty("website")
    String website
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
     * 设置「应用标识」值
     * @param val
     */
    IrModuleModuleDTO setAppId(String appId) {
        this.appId = appId
        return this
    }


    /**
     * 设置「排序值」值
     * @param val
     */
    IrModuleModuleDTO setOrder(Integer order) {
        this.order = order
        return this
    }


    /**
     * 设置「资源标识」值
     * @param val
     */
    IrModuleModuleDTO setResCode(String resCode) {
        this.resCode = resCode
        return this
    }


    /**
     * 设置「应用」值
     * 字典[是否]
     * @param val
     */
    IrModuleModuleDTO setApplication(Integer application) {
        this.application = application
        return this
    }


    /**
     * 设置「作者」值
     * @param val
     */
    IrModuleModuleDTO setAuthor(String author) {
        this.author = author
        return this
    }


    /**
     * 设置「自动安装」值
     * 字典[是否]
     * @param val
     */
    IrModuleModuleDTO setAutoInstall(Integer autoInstall) {
        this.autoInstall = autoInstall
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    IrModuleModuleDTO setCategoryId(String categoryId) {
        this.categoryId = categoryId
        return this
    }


    /**
     * 设置「协作者」值
     * @param val
     */
    IrModuleModuleDTO setContributors(String contributors) {
        this.contributors = contributors
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IrModuleModuleDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrModuleModuleDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「演示数据」值
     * 字典[是否]
     * @param val
     */
    IrModuleModuleDTO setDemo(Integer demo) {
        this.demo = demo
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    IrModuleModuleDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    IrModuleModuleDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「图标网址」值
     * @param val
     */
    IrModuleModuleDTO setIcon(String icon) {
        this.icon = icon
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrModuleModuleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「导入的模块」值
     * 字典[是否]
     * @param val
     */
    IrModuleModuleDTO setImported(Integer imported) {
        this.imported = imported
        return this
    }


    /**
     * 设置「已安装版本」值
     * @param val
     */
    IrModuleModuleDTO setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion
        return this
    }


    /**
     * 设置「许可证」值
     * 字典[许可证]
     * @param val
     */
    IrModuleModuleDTO setLicense(String license) {
        this.license = license
        return this
    }


    /**
     * 设置「维护者」值
     * @param val
     */
    IrModuleModuleDTO setMaintainer(String maintainer) {
        this.maintainer = maintainer
        return this
    }


    /**
     * 设置「菜单」值
     * @param val
     */
    IrModuleModuleDTO setMenusByModule(String menusByModule) {
        this.menusByModule = menusByModule
        return this
    }


    /**
     * 设置「模块类型」值
     * 字典[模块类型]
     * @param val
     */
    IrModuleModuleDTO setModuleType(String moduleType) {
        this.moduleType = moduleType
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrModuleModuleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「出版版本」值
     * @param val
     */
    IrModuleModuleDTO setPublishedVersion(String publishedVersion) {
        this.publishedVersion = publishedVersion
        return this
    }


    /**
     * 设置「报表」值
     * @param val
     */
    IrModuleModuleDTO setReportsByModule(String reportsByModule) {
        this.reportsByModule = reportsByModule
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    IrModuleModuleDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「模块名」值
     * @param val
     */
    IrModuleModuleDTO setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    IrModuleModuleDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「摘要」值
     * @param val
     */
    IrModuleModuleDTO setSummary(String summary) {
        this.summary = summary
        return this
    }


    /**
     * 设置「ERP 企业版专属模块」值
     * 字典[是否]
     * @param val
     */
    IrModuleModuleDTO setToBuy(Integer toBuy) {
        this.toBuy = toBuy
        return this
    }


    /**
     * 设置「URL」值
     * @param val
     */
    IrModuleModuleDTO setUrl(String url) {
        this.url = url
        return this
    }


    /**
     * 设置「视图」值
     * @param val
     */
    IrModuleModuleDTO setViewsByModule(String viewsByModule) {
        this.viewsByModule = viewsByModule
        return this
    }


    /**
     * 设置「网站」值
     * @param val
     */
    IrModuleModuleDTO setWebsite(String website) {
        this.website = website
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrModuleModuleDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    IrModuleModuleDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
