package cn.ibizlab.ibizodoo.mail.maillinkpreview.dto

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
class MailLinkPreviewDTO extends GroovyDTO<MailLinkPreviewDTO> {

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
     * 「图像哑剧类型」
     */
    @JsonProperty("image_mimetype")
    String imageMimetype
    /**
     * 「已隐藏」
     * 字典[是否]
     */
    @JsonProperty("is_hidden")
    Integer isHidden
    /**
     * 「消息」
     */
    @JsonProperty("message_id")
    String messageId
    /**
     * 「描述」
     */
    @JsonProperty("og_description")
    String ogDescription
    /**
     * 「图像」
     */
    @JsonProperty("og_image")
    String ogImage
    /**
     * 「MIME 类型」
     */
    @JsonProperty("og_mimetype")
    String ogMimetype
    /**
     * 「网站名称」
     */
    @JsonProperty("og_site_name")
    String ogSiteName
    /**
     * 「标题」
     */
    @JsonProperty("og_title")
    String ogTitle
    /**
     * 「类型」
     */
    @JsonProperty("og_type")
    String ogType
    /**
     * 「网址」
     */
    @JsonProperty("source_url")
    String sourceUrl
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
    MailLinkPreviewDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailLinkPreviewDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailLinkPreviewDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailLinkPreviewDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「图像哑剧类型」值
     * @param val
     */
    MailLinkPreviewDTO setImageMimetype(String imageMimetype) {
        this.imageMimetype = imageMimetype
        return this
    }


    /**
     * 设置「已隐藏」值
     * 字典[是否]
     * @param val
     */
    MailLinkPreviewDTO setIsHidden(Integer isHidden) {
        this.isHidden = isHidden
        return this
    }


    /**
     * 设置「消息」值
     * @param val
     */
    MailLinkPreviewDTO setMessageId(String messageId) {
        this.messageId = messageId
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    MailLinkPreviewDTO setOgDescription(String ogDescription) {
        this.ogDescription = ogDescription
        return this
    }


    /**
     * 设置「图像」值
     * @param val
     */
    MailLinkPreviewDTO setOgImage(String ogImage) {
        this.ogImage = ogImage
        return this
    }


    /**
     * 设置「MIME 类型」值
     * @param val
     */
    MailLinkPreviewDTO setOgMimetype(String ogMimetype) {
        this.ogMimetype = ogMimetype
        return this
    }


    /**
     * 设置「网站名称」值
     * @param val
     */
    MailLinkPreviewDTO setOgSiteName(String ogSiteName) {
        this.ogSiteName = ogSiteName
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    MailLinkPreviewDTO setOgTitle(String ogTitle) {
        this.ogTitle = ogTitle
        return this
    }


    /**
     * 设置「类型」值
     * @param val
     */
    MailLinkPreviewDTO setOgType(String ogType) {
        this.ogType = ogType
        return this
    }


    /**
     * 设置「网址」值
     * @param val
     */
    MailLinkPreviewDTO setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailLinkPreviewDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MailLinkPreviewDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
