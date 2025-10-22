# EMail模板(mail_template)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|自动删除|AUTO_DELETE|是否逻辑||是||
|正文|BODY_HTML|HTML文本，没有长度限制|1048576|是||
|可写|CAN_WRITE|是否逻辑||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|模板描述|DESCRIPTION|长文本，没有长度限制|1048576|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|抄送|EMAIL_CC|文本，可指定长度|500|是||
|来自|EMAIL_FROM|文本，可指定长度|500|是||
|电子邮件通知布局|EMAIL_LAYOUT_XMLID|文本，可指定长度|500|是||
|至（EMail）|EMAIL_TO|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是模板编辑器|IS_TEMPLATE_EDITOR|是否逻辑||是||
|语言|LANG|文本，可指定长度|500|是||
|名称|NAME|文本，可指定长度|200|是||
|至（合作伙伴）|PARTNER_TO|文本，可指定长度|500|是||
|渲染模型|RENDER_MODEL|文本，可指定长度|500|是||
|回复|REPLY_TO|文本，可指定长度|500|是||
|安排的日期|SCHEDULED_DATE|文本，可指定长度|500|是||
|主旨|SUBJECT|文本，可指定长度|500|是||
|模板类别|TEMPLATE_CATEGORY|[单项选择(文本值)](index/dictionary_index#mail_template_template_category "模板类别")|200|是||
|模板文件名|TEMPLATE_FS|文本，可指定长度|500|是||
|用户|USER_ID|外键值|100|是||
|默认收件人|USE_DEFAULT_TO|是否逻辑||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_REFUSE_REASON_MAIL_TEMPLATE_TEMPLATE_ID](der/DER1N_HR_APPLICANT_REFUSE_REASON_MAIL_TEMPLATE_TEMPLATE_ID)|[拒绝原因 申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_RECRUITMENT_STAGE_MAIL_TEMPLATE_TEMPLATE_ID](der/DER1N_HR_RECRUITMENT_STAGE_MAIL_TEMPLATE_TEMPLATE_ID)|[招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage)|1:N关系||
|[DER1N_IR_ACTIONS_SERVER_MAIL_TEMPLATE_TEMPLATE_ID](der/DER1N_IR_ACTIONS_SERVER_MAIL_TEMPLATE_TEMPLATE_ID)|[服务器动作(IR_ACTIONS_SERVER)](module/base/ir_actions_server)|1:N关系||
|[DER1N_MAIL_ACTIVITY_TYPE_MAIL_TEMPLATE_REL_MAIL_TEMPLATE_MAIL_TEMPLATE_ID](der/DER1N_MAIL_ACTIVITY_TYPE_MAIL_TEMPLATE_REL_MAIL_TEMPLATE_MAIL_TEMPLATE_ID)|[活动类型模板(MAIL_ACTIVITY_TYPE_MAIL_TEMPLATE_REL)](module/mail/mail_activity_type_mail_template_rel)|1:N关系||
|[DER1N_MAIL_COMPOSER_MIXIN_MAIL_TEMPLATE_TEMPLATE_ID](der/DER1N_MAIL_COMPOSER_MIXIN_MAIL_TEMPLATE_TEMPLATE_ID)|[邮件编辑器混合(MAIL_COMPOSER_MIXIN)](module/mail/mail_composer_mixin)|1:N关系||
|[DER1N_MAIL_COMPOSE_MESSAGE_MAIL_TEMPLATE_TEMPLATE_ID](der/DER1N_MAIL_COMPOSE_MESSAGE_MAIL_TEMPLATE_TEMPLATE_ID)|[EMail撰写向导(MAIL_COMPOSE_MESSAGE)](module/mail/mail_compose_message)|1:N关系||
|[DER1N_MAIL_TEMPLATE_PREVIEW_MAIL_TEMPLATE_MAIL_TEMPLATE_ID](der/DER1N_MAIL_TEMPLATE_PREVIEW_MAIL_TEMPLATE_MAIL_TEMPLATE_ID)|[EMail模板预览(MAIL_TEMPLATE_PREVIEW)](module/mail/mail_template_preview)|1:N关系||
|[DER1N_RES_COMPANY_MAIL_TEMPLATE_STOCK_MAIL_CONFIRMATION_TEMPLATE_ID](der/DER1N_RES_COMPANY_MAIL_TEMPLATE_STOCK_MAIL_CONFIRMATION_TEMPLATE_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_CONFIG_SETTINGS_MAIL_TEMPLATE_INVOICE_MAIL_TEMPLATE_ID](der/DER1N_RES_CONFIG_SETTINGS_MAIL_TEMPLATE_INVOICE_MAIL_TEMPLATE_ID)|[配置设定(RES_CONFIG_SETTINGS)](module/base/res_config_settings)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_TEMPLATE_RES_USERS_USER_ID](der/DER1N_MAIL_TEMPLATE_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#mail_template_Update)|||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[刷新消息模板缓存](module/mail/mail_template/logic/refresh_cache)|refresh_cache|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/mail_template/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_template/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_template/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### mail_template :id=mail_template-mail_template

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `READ`
* `UPDATE`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_TEMPLATE_CATEGORY_EQ|模板类别|EQ||
|N_USER_ID_EQ|用户|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_template?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_template?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_template?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_template?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_template?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_template?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_template?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_template?id=搜索模式`">
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