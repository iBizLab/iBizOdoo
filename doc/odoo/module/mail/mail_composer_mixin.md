# 邮件编辑器混合(mail_composer_mixin)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|内容|BODY|HTML文本，没有长度限制|1048576|是||
|正文内容与模板相同|BODY_HAS_TEMPLATE_VALUE|是否逻辑||是||
|可以编辑主体|CAN_EDIT_BODY|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是编辑者|IS_MAIL_TEMPLATE_EDITOR|是否逻辑||是||
|语言|LANG|文本，可指定长度|500|是||
|名称|NAME|文本，可指定长度|200|是||
|渲染模型|RENDER_MODEL|文本，可指定长度|500|是||
|主旨|SUBJECT|文本，可指定长度|500|是||
|邮件模板|TEMPLATE_ID|外键值|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_COMPOSER_MIXIN_MAIL_TEMPLATE_TEMPLATE_ID](der/DER1N_MAIL_COMPOSER_MIXIN_MAIL_TEMPLATE_TEMPLATE_ID)|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)|1:N关系||

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
|N_TEMPLATE_ID_EQ|邮件模板|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_composer_mixin?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_composer_mixin?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_composer_mixin?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_composer_mixin?id=搜索模式`">
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