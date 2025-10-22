# 邮件服务器(ir_mail_server)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|FROM 过滤|FROM_FILTER|文本，可指定长度|250|是||
|访问令牌|GOOGLE_GMAIL_ACCESS_TOKEN|文本，可指定长度|250|是||
|访问令牌到期时间戳|GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION|整型||是||
|授权码|GOOGLE_GMAIL_AUTHORIZATION_CODE|文本，可指定长度|250|是||
|更新 Token|GOOGLE_GMAIL_REFRESH_TOKEN|文本，可指定长度|250|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|最大电子邮件大小|MAX_EMAIL_SIZE|浮点||是||
|名称|NAME|文本，可指定长度|200|是||
|优先级|SEQUENCE|整型||是||
|验证|SMTP_AUTHENTICATION|[单项选择(文本值)](index/dictionary_index#ir_mail_server_smtp_authentication "验证")|60|否||
|调试|SMTP_DEBUG|是否逻辑||是||
|连接加密|SMTP_ENCRYPTION|[单项选择(文本值)](index/dictionary_index#ir_mail_server_smtp_encryption "连接加密")|60|否||
|SMTP服务器|SMTP_HOST|文本，可指定长度|250|是||
|密码|SMTP_PASS|文本，可指定长度|250|是||
|SMTP端口|SMTP_PORT|整型||是||
|用户名|SMTP_USER|文本，可指定长度|250|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


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

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/ir_mail_server/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/ir_mail_server/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/ir_mail_server/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_SMTP_AUTHENTICATION_EQ|验证|EQ||
|N_SMTP_ENCRYPTION_EQ|连接加密|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/ir_mail_server?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_mail_server?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_mail_server?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_mail_server?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_mail_server?id=搜索模式`">
  搜索模式
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