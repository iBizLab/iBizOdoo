# 收件服务器(fetchmail_server)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|保存附件|ATTACH|是否逻辑||是||
|配置|CONFIGURATION|长文本，没有长度限制|1048576|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|最后收取日期|DATE|日期时间型||是||
|访问令牌|GOOGLE_GMAIL_ACCESS_TOKEN|文本，可指定长度|250|是||
|访问令牌到期时间戳|GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION|整型||是||
|授权码|GOOGLE_GMAIL_AUTHORIZATION_CODE|文本，可指定长度|250|是||
|更新 Token|GOOGLE_GMAIL_REFRESH_TOKEN|文本，可指定长度|250|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|SSL/TLS|IS_SSL|是否逻辑||是||
|名称|NAME|文本，可指定长度|200|是||
|创建新记录|OBJECT_ID|文本，可指定长度|100|是||
|保留原件|ORIGINAL|是否逻辑||是||
|密码|PASSWORD|文本，可指定长度|250|是||
|端口|PORT|整型||是||
|服务器优先级|PRIORITY|整型||是||
|脚本|SCRIPT|文本，可指定长度|250|是||
|服务器名称|SERVER|文本，可指定长度|250|是||
|服务器类型|SERVER_TYPE|[单项选择(文本值)](index/dictionary_index#fetchmail_server_server_type "服务器类型")|60|否||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#fetchmail_server_state "状态")|60|是||
|用户名|USER|文本，可指定长度|250|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


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
|fetch_mail|fetch_mail|用户自定义|默认|不支持||||
|重置确认|set_draft|[实体处理逻辑](module/mail/fetchmail_server/logic/set_draft "重置确认")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[重置确认](module/mail/fetchmail_server/logic/set_draft)|set_draft|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/fetchmail_server/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/fetchmail_server/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/fetchmail_server/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_SERVER_TYPE_EQ|服务器类型|EQ||
|N_STATE_EQ|状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 现在收取 | fetch_mail | 现在收取 |单项数据|<details><summary>后台调用</summary>[Get](#行为)||
| 测试和确认 | button_confirm_login | 测试和确认 |单项数据（主键）|<details><summary>后台调用</summary>[Get](#行为)||
| 重置确认 | set_draft | 重置确认 |单项数据|<details><summary>后台调用</summary>[set_draft](#行为)||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/fetchmail_server?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/fetchmail_server?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/fetchmail_server?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/fetchmail_server?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/fetchmail_server?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/fetchmail_server?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/fetchmail_server?id=界面行为`">
  界面行为
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {



      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>