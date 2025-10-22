# 电子邮件域名(mail_alias_domain)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|弹跳别名|BOUNCE_ALIAS|文本，可指定长度|500|否||
|退件电子邮件|BOUNCE_EMAIL|文本，可指定长度|500|是||
|全部别名|CATCHALL_ALIAS|文本，可指定长度|500|否||
|预设邮件|CATCHALL_EMAIL|文本，可指定长度|500|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|默认发件人别名|DEFAULT_FROM|文本，可指定长度|500|是||
|默认从|DEFAULT_FROM_EMAIL|文本，可指定长度|500|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|序列|SEQUENCE|整型||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_MAIL_ALIAS_MAIL_ALIAS_DOMAIN_ALIAS_DOMAIN_ID](der/DER1N_MAIL_ALIAS_MAIL_ALIAS_DOMAIN_ALIAS_DOMAIN_ID)|[EMail别名(MAIL_ALIAS)](module/mail/mail_alias)|1:N关系||
|[DER1N_MAIL_COMPOSE_MESSAGE_MAIL_ALIAS_DOMAIN_RECORD_ALIAS_DOMAIN_ID](der/DER1N_MAIL_COMPOSE_MESSAGE_MAIL_ALIAS_DOMAIN_RECORD_ALIAS_DOMAIN_ID)|[EMail撰写向导(MAIL_COMPOSE_MESSAGE)](module/mail/mail_compose_message)|1:N关系||
|[DER1N_MAIL_MESSAGE_MAIL_ALIAS_DOMAIN_RECORD_ALIAS_DOMAIN_ID](der/DER1N_MAIL_MESSAGE_MAIL_ALIAS_DOMAIN_RECORD_ALIAS_DOMAIN_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||
|[DER1N_RES_COMPANY_MAIL_ALIAS_DOMAIN_ALIAS_DOMAIN_ID](der/DER1N_RES_COMPANY_MAIL_ALIAS_DOMAIN_ALIAS_DOMAIN_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||


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
|移动位置|MoveOrder|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[compute_bounce_email](module/mail/mail_alias_domain/logic/compute_bounce_email)|compute_bounce_email|属性逻辑|||
|[compute_catchall_email](module/mail/mail_alias_domain/logic/compute_catchall_email)|compute_catchall_email|属性逻辑|||
|[compute_default_from_email](module/mail/mail_alias_domain/logic/compute_default_from_email)|compute_default_from_email|属性逻辑|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/mail_alias_domain/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_alias_domain/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_alias_domain/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_alias_domain?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_alias_domain?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_alias_domain?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_alias_domain?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_alias_domain?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_alias_domain?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_alias_domain?id=搜索模式`">
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