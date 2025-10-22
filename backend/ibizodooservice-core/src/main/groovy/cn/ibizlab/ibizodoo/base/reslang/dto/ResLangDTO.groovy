package cn.ibizlab.ibizodoo.base.reslang.dto

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
class ResLangDTO extends GroovyDTO<ResLangDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「语言环境代码」
     */
    @JsonProperty("code")
    String code
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
     * 「日期格式」
     */
    @JsonProperty("date_format")
    String dateFormat
    /**
     * 「小数分隔符」
     */
    @JsonProperty("decimal_point")
    String decimalPoint
    /**
     * 「方向」
     * 字典[方向]
     */
    @JsonProperty("direction")
    String direction
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「旗帜图片网址」
     */
    @JsonProperty("flag_image_url")
    String flagImageUrl
    /**
     * 「分隔符格式」
     */
    @JsonProperty("grouping")
    String grouping
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「ISO 代码」
     */
    @JsonProperty("iso_code")
    String isoCode
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「短时间格式」
     */
    @JsonProperty("short_time_format")
    String shortTimeFormat
    /**
     * 「千位分隔符」
     */
    @JsonProperty("thousands_sep")
    String thousandsSep
    /**
     * 「时间格式」
     */
    @JsonProperty("time_format")
    String timeFormat
    /**
     * 「URL 代码」
     */
    @JsonProperty("url_code")
    String urlCode
    /**
     * 「一周的第一天」
     * 字典[一周的第一天]
     */
    @JsonProperty("week_start")
    String weekStart
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
    ResLangDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「语言环境代码」值
     * @param val
     */
    ResLangDTO setCode(String code) {
        this.code = code
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResLangDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResLangDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「日期格式」值
     * @param val
     */
    ResLangDTO setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat
        return this
    }


    /**
     * 设置「小数分隔符」值
     * @param val
     */
    ResLangDTO setDecimalPoint(String decimalPoint) {
        this.decimalPoint = decimalPoint
        return this
    }


    /**
     * 设置「方向」值
     * 字典[方向]
     * @param val
     */
    ResLangDTO setDirection(String direction) {
        this.direction = direction
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResLangDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「旗帜图片网址」值
     * @param val
     */
    ResLangDTO setFlagImageUrl(String flagImageUrl) {
        this.flagImageUrl = flagImageUrl
        return this
    }


    /**
     * 设置「分隔符格式」值
     * @param val
     */
    ResLangDTO setGrouping(String grouping) {
        this.grouping = grouping
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResLangDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「ISO 代码」值
     * @param val
     */
    ResLangDTO setIsoCode(String isoCode) {
        this.isoCode = isoCode
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResLangDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「短时间格式」值
     * @param val
     */
    ResLangDTO setShortTimeFormat(String shortTimeFormat) {
        this.shortTimeFormat = shortTimeFormat
        return this
    }


    /**
     * 设置「千位分隔符」值
     * @param val
     */
    ResLangDTO setThousandsSep(String thousandsSep) {
        this.thousandsSep = thousandsSep
        return this
    }


    /**
     * 设置「时间格式」值
     * @param val
     */
    ResLangDTO setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat
        return this
    }


    /**
     * 设置「URL 代码」值
     * @param val
     */
    ResLangDTO setUrlCode(String urlCode) {
        this.urlCode = urlCode
        return this
    }


    /**
     * 设置「一周的第一天」值
     * 字典[一周的第一天]
     * @param val
     */
    ResLangDTO setWeekStart(String weekStart) {
        this.weekStart = weekStart
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResLangDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResLangDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
