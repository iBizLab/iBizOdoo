# 模型(ir_model)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|信息|INFO|长文本，没有长度限制|1048576|是||
|有邮件活动|IS_MAIL_ACTIVITY|是否逻辑||是||
|有邮件黑名单|IS_MAIL_BLACKLIST|是否逻辑||是||
|有邮件会话|IS_MAIL_THREAD|是否逻辑||是||
|模型|MODEL|文本，可指定长度|250|否||
|名称|NAME|文本，可指定长度|200|是||
|排序|ORDER|文本，可指定长度|250|是||
|类型|STATE|[单项选择(文本值)](index/dictionary_index#ir_model_state "类型")|60|是||
|瞬态模型|TRANSIENT|是否逻辑||是||
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

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/ir_model/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/ir_model/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/ir_model/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_STATE_EQ|类型|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/ir_model?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_model?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_model?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_model?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_model?id=搜索模式`">
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