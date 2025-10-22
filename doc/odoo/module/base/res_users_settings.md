# 用户设置(res_users_settings)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|日历默认隐私|CALENDAR_DEFAULT_PRIVACY|[单项选择(文本值)](index/dictionary_index#res_users_settings_calendar_default_privacy "日历默认隐私")|60|否||
|频道通知|CHANNEL_NOTIFICATIONS|[单项选择(文本值)](index/dictionary_index#res_users_settings_channel_notifications "频道通知")|60|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是否打开讨论侧边栏类别聊天？|IS_DISCUSS_SIDEBAR_CATEGORY_CHANNEL_OPEN|是否逻辑||是||
|是否打开讨论侧边栏类别聊天？|IS_DISCUSS_SIDEBAR_CATEGORY_CHAT_OPEN|是否逻辑||是||
|静音通知，直到|MUTE_UNTIL_DT|日期时间型||是||
|一键通话快捷方式|PUSH_TO_TALK_KEY|文本，可指定长度|500|是||
|用户|USER_ID|外键值|100|否||
|使用一键通话功能|USE_PUSH_TO_TALK|是否逻辑||是||
|语音活动的持续时间（毫秒）|VOICE_ACTIVE_DURATION|整型||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_RES_USERS_SETTINGS_VOLUMES_RES_USERS_SETTINGS_USER_SETTING_ID](der/DER1N_RES_USERS_SETTINGS_VOLUMES_RES_USERS_SETTINGS_USER_SETTING_ID)|[用户设置数量(RES_USERS_SETTINGS_VOLUMES)](module/base/res_users_settings_volumes)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RES_USERS_SETTINGS_RES_USERS_USER_ID](der/DER1N_RES_USERS_SETTINGS_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_USER_ID_EQ|用户|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_users_settings?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users_settings?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users_settings?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users_settings?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>