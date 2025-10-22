# EMail撰写向导(mail_compose_message)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|作者|AUTHOR_ID|外键值|100|是||
|删除邮件|AUTO_DELETE|是否逻辑||是||
|保存消息副本|AUTO_DELETE_KEEP_LOG|是否逻辑||是||
|内容|BODY|HTML文本，没有长度限制|1048576|是||
|正文内容与模板相同|BODY_HAS_TEMPLATE_VALUE|是否逻辑||是||
|可以编辑主体|CAN_EDIT_BODY|是否逻辑||是||
|批次组合|COMPOSITION_BATCH|是否逻辑||是||
|写作模式|COMPOSITION_MODE|[单项选择(文本值)](index/dictionary_index#mail_compose_message_composition_mode "写作模式")|60|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|添加签名|EMAIL_ADD_SIGNATURE|是否逻辑||是||
|来自|EMAIL_FROM|文本，可指定长度|500|是||
|电子邮件通知布局|EMAIL_LAYOUT_XMLID|文本，可指定长度|500|是||
|直接发送邮件或通知|FORCE_SEND|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是编辑者|IS_MAIL_TEMPLATE_EDITOR|是否逻辑||是||
|语言|LANG|文本，可指定长度|500|是||
|邮件活动类型|MAIL_ACTIVITY_TYPE_ID|外键值|100|是||
|邮件标题|MASS_MAILING_NAME|文本，可指定长度|500|是||
|类型|MESSAGE_TYPE|[单项选择(文本值)](index/dictionary_index#mail_compose_message_message_type "类型")|60|否||
|相关单据模型|MODEL|文本，可指定长度|500|是||
|已启用对话串|MODEL_IS_THREAD|是否逻辑||是||
|上级消息|PARENT_ID|外键值|100|是||
|别名域|RECORD_ALIAS_DOMAIN_ID|外键值|100|是||
|公司|RECORD_COMPANY_ID|外键值|100|是||
|记录名称|RECORD_NAME|文本，可指定长度|500|是||
|渲染模型|RENDER_MODEL|文本，可指定长度|500|是||
|回复|REPLY_TO|文本，可指定长度|500|是||
|视答案为新线程|REPLY_TO_FORCE_NEW|是否逻辑||是||
|回复|REPLY_TO_MODE|[单项选择(文本值)](index/dictionary_index#mail_compose_message_reply_to_mode "回复")|200|是||
|有效的域|RES_DOMAIN|长文本，没有长度限制|1048576|是||
|负责人|RES_DOMAIN_USER_ID|外键值|100|是||
|相关文档 ID|RES_IDS|长文本，没有长度限制|1048576|是||
|安排的日期|SCHEDULED_DATE|文本，可指定长度|500|是||
|主旨|SUBJECT|文本，可指定长度|500|是||
|子类型|SUBTYPE_ID|外键值|100|是||
|是系统日志|SUBTYPE_IS_LOG|是否逻辑||是||
|使用模版|TEMPLATE_ID|外键值|100|是||
|模板名称|TEMPLATE_NAME|文本，可指定长度|500|是||
|检查排除清单|USE_EXCLUSION_LIST|是否逻辑||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_COMPOSE_MESSAGE_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_ID](der/DER1N_MAIL_COMPOSE_MESSAGE_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_MAIL_COMPOSE_MESSAGE_MAIL_ALIAS_DOMAIN_RECORD_ALIAS_DOMAIN_ID](der/DER1N_MAIL_COMPOSE_MESSAGE_MAIL_ALIAS_DOMAIN_RECORD_ALIAS_DOMAIN_ID)|[电子邮件域名(MAIL_ALIAS_DOMAIN)](module/mail/mail_alias_domain)|1:N关系||
|[DER1N_MAIL_COMPOSE_MESSAGE_MAIL_MESSAGE_PARENT_ID](der/DER1N_MAIL_COMPOSE_MESSAGE_MAIL_MESSAGE_PARENT_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||
|[DER1N_MAIL_COMPOSE_MESSAGE_MAIL_MESSAGE_SUBTYPE_SUBTYPE_ID](der/DER1N_MAIL_COMPOSE_MESSAGE_MAIL_MESSAGE_SUBTYPE_SUBTYPE_ID)|[消息子类型(MAIL_MESSAGE_SUBTYPE)](module/mail/mail_message_subtype)|1:N关系||
|[DER1N_MAIL_COMPOSE_MESSAGE_MAIL_TEMPLATE_TEMPLATE_ID](der/DER1N_MAIL_COMPOSE_MESSAGE_MAIL_TEMPLATE_TEMPLATE_ID)|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)|1:N关系||
|[DER1N_MAIL_COMPOSE_MESSAGE_RES_COMPANY_RECORD_COMPANY_ID](der/DER1N_MAIL_COMPOSE_MESSAGE_RES_COMPANY_RECORD_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_MAIL_COMPOSE_MESSAGE_RES_PARTNER_AUTHOR_ID](der/DER1N_MAIL_COMPOSE_MESSAGE_RES_PARTNER_AUTHOR_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_MAIL_COMPOSE_MESSAGE_RES_USERS_RES_DOMAIN_USER_ID](der/DER1N_MAIL_COMPOSE_MESSAGE_RES_USERS_RES_DOMAIN_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_AUTHOR_ID_EQ|作者|EQ||
|N_ID_EQ|标识|EQ||
|N_MAIL_ACTIVITY_TYPE_ID_EQ|邮件活动类型|EQ||
|N_PARENT_ID_EQ|上级消息|EQ||
|N_RECORD_ALIAS_DOMAIN_ID_EQ|别名域|EQ||
|N_RECORD_COMPANY_ID_EQ|公司|EQ||
|N_RES_DOMAIN_USER_ID_EQ|负责人|EQ||
|N_SUBTYPE_ID_EQ|子类型|EQ||
|N_TEMPLATE_ID_EQ|使用模版|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_compose_message?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_compose_message?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_compose_message?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_compose_message?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'minor',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>