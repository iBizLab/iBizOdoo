package cn.ibizlab.ibizodoo.base.resuserssettings.dto

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
class ResUsersSettingsDTO extends GroovyDTO<ResUsersSettingsDTO> {

    /**
     * 「日历默认隐私」
     * 字典[日历默认隐私]
     */
    @JsonProperty("calendar_default_privacy")
    String calendarDefaultPrivacy
    /**
     * 「频道通知」
     * 字典[频道通知]
     */
    @JsonProperty("channel_notifications")
    String channelNotifications
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
     * 「是否打开讨论侧边栏类别聊天？」
     * 字典[是否]
     */
    @JsonProperty("is_discuss_sidebar_category_channel_open")
    Integer isDiscussSidebarCategoryChannelOpen
    /**
     * 「是否打开讨论侧边栏类别聊天？」
     * 字典[是否]
     */
    @JsonProperty("is_discuss_sidebar_category_chat_open")
    Integer isDiscussSidebarCategoryChatOpen
    /**
     * 「静音通知，直到」
     */
    @JsonProperty("mute_until_dt")
    Timestamp muteUntilDt
    /**
     * 「一键通话快捷方式」
     */
    @JsonProperty("push_to_talk_key")
    String pushToTalkKey
    /**
     * 「使用一键通话功能」
     * 字典[是否]
     */
    @JsonProperty("use_push_to_talk")
    Integer usePushToTalk
    /**
     * 「用户」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「语音活动的持续时间（毫秒）」
     */
    @JsonProperty("voice_active_duration")
    Integer voiceActiveDuration
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
     * 设置「日历默认隐私」值
     * 字典[日历默认隐私]
     * @param val
     */
    ResUsersSettingsDTO setCalendarDefaultPrivacy(String calendarDefaultPrivacy) {
        this.calendarDefaultPrivacy = calendarDefaultPrivacy
        return this
    }


    /**
     * 设置「频道通知」值
     * 字典[频道通知]
     * @param val
     */
    ResUsersSettingsDTO setChannelNotifications(String channelNotifications) {
        this.channelNotifications = channelNotifications
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResUsersSettingsDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResUsersSettingsDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResUsersSettingsDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResUsersSettingsDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是否打开讨论侧边栏类别聊天？」值
     * 字典[是否]
     * @param val
     */
    ResUsersSettingsDTO setIsDiscussSidebarCategoryChannelOpen(Integer isDiscussSidebarCategoryChannelOpen) {
        this.isDiscussSidebarCategoryChannelOpen = isDiscussSidebarCategoryChannelOpen
        return this
    }


    /**
     * 设置「是否打开讨论侧边栏类别聊天？」值
     * 字典[是否]
     * @param val
     */
    ResUsersSettingsDTO setIsDiscussSidebarCategoryChatOpen(Integer isDiscussSidebarCategoryChatOpen) {
        this.isDiscussSidebarCategoryChatOpen = isDiscussSidebarCategoryChatOpen
        return this
    }


    /**
     * 设置「静音通知，直到」值
     * @param val
     */
    ResUsersSettingsDTO setMuteUntilDt(Timestamp muteUntilDt) {
        this.muteUntilDt = muteUntilDt
        return this
    }


    /**
     * 设置「一键通话快捷方式」值
     * @param val
     */
    ResUsersSettingsDTO setPushToTalkKey(String pushToTalkKey) {
        this.pushToTalkKey = pushToTalkKey
        return this
    }


    /**
     * 设置「使用一键通话功能」值
     * 字典[是否]
     * @param val
     */
    ResUsersSettingsDTO setUsePushToTalk(Integer usePushToTalk) {
        this.usePushToTalk = usePushToTalk
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    ResUsersSettingsDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「语音活动的持续时间（毫秒）」值
     * @param val
     */
    ResUsersSettingsDTO setVoiceActiveDuration(Integer voiceActiveDuration) {
        this.voiceActiveDuration = voiceActiveDuration
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResUsersSettingsDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResUsersSettingsDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
