# 预设回复(mail_canned_response)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|描述|DESCRIPTION|文本，可指定长度|500|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|确定当前用户是否可以编辑预制回复|IS_EDITABLE|是否逻辑||是||
|确定预设回复当前是否与其他用户共享|IS_SHARED|是否逻辑||是||
|上次使用|LAST_USED|日期时间型||是||
|快捷|SOURCE|文本，可指定长度|500|否||
|替换|SUBSTITUTION|长文本，没有长度限制|1048576|否||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_canned_response?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_canned_response?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_canned_response?id=搜索模式`">
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