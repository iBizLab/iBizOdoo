# EMail别名(mail_alias)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|自定义退回消息|ALIAS_BOUNCED_CONTENT|HTML文本，没有长度限制|1048576|是||
|别名授权于|ALIAS_CONTACT|[单项选择(文本值)](index/dictionary_index#mail_alias_alias_contact "别名授权于")|60|否||
|默认值|ALIAS_DEFAULTS|长文本，没有长度限制|1048576|否||
|别名域|ALIAS_DOMAIN_ID|外键值|100|是||
|别名域名称|ALIAS_DOMAIN_NAME|外键值文本|200|是||
|记录线索ID|ALIAS_FORCE_THREAD_ID|整型||是||
|别名电子邮件|ALIAS_FULL_NAME|文本，可指定长度|500|是||
|收件时检测本地的别名域|ALIAS_INCOMING_LOCAL|是否逻辑||是||
|模型别名|ALIAS_MODEL_ID|文本，可指定长度|100|是||
|别名|ALIAS_NAME|文本，可指定长度|500|是||
|上级模型|ALIAS_PARENT_MODEL_ID|文本，可指定长度|100|是||
|上级记录ID|ALIAS_PARENT_THREAD_ID|整型||是||
|别名状态|ALIAS_STATUS|[单项选择(文本值)](index/dictionary_index#mail_alias_alias_status "别名状态")|60|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_CRM_TEAM_MAIL_ALIAS_ALIAS_ID](der/DER1N_CRM_TEAM_MAIL_ALIAS_ALIAS_ID)|[销售团队(CRM_TEAM)](module/crm/crm_team)|1:N关系||
|[DER1N_HR_RECRUITMENT_SOURCE_MAIL_ALIAS_ALIAS_ID](der/DER1N_HR_RECRUITMENT_SOURCE_MAIL_ALIAS_ALIAS_ID)|[申请人来源(HR_RECRUITMENT_SOURCE)](module/hr/hr_recruitment_source)|1:N关系||
|[DER1N_MAIL_ALIAS_MIXIN_MAIL_ALIAS_ALIAS_ID](der/DER1N_MAIL_ALIAS_MIXIN_MAIL_ALIAS_ALIAS_ID)|[EMail别名 Mixin(MAIL_ALIAS_MIXIN)](module/mail/mail_alias_mixin)|1:N关系||
|[DER1N_MAIL_ALIAS_MIXIN_OPTIONAL_MAIL_ALIAS_ALIAS_ID](der/DER1N_MAIL_ALIAS_MIXIN_OPTIONAL_MAIL_ALIAS_ALIAS_ID)|[电子邮件别名混合素（轻型）(MAIL_ALIAS_MIXIN_OPTIONAL)](module/mail/mail_alias_mixin_optional)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_ALIAS_MAIL_ALIAS_DOMAIN_ALIAS_DOMAIN_ID](der/DER1N_MAIL_ALIAS_MAIL_ALIAS_DOMAIN_ALIAS_DOMAIN_ID)|[电子邮件域名(MAIL_ALIAS_DOMAIN)](module/mail/mail_alias_domain)|1:N关系||

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
|Update|Update|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/mail_alias/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_alias/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_alias/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ALIAS_CONTACT_EQ|别名授权于|EQ||
|N_ALIAS_DOMAIN_ID_EQ|别名域|EQ||
|N_ALIAS_DOMAIN_NAME_EQ|别名域名称|EQ||
|N_ALIAS_DOMAIN_NAME_LIKE|别名域名称|LIKE||
|N_ALIAS_STATUS_EQ|别名状态|EQ||
|N_ID_EQ|标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_alias?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_alias?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_alias?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_alias?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_alias?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_alias?id=搜索模式`">
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