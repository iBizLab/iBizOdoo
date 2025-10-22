# 审计记录(audit_record)  <!-- {docsify-ignore-all} -->


后续通过runtime默认挂载审计方法至基类


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|审计信息|AUDIT_INFO|长文本，没有长度限制|1048576|是||
|审计类型|AUDIT_TYPE|文本，可指定长度|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|访问地址|IP_ADDRESS|文本，可指定长度|500|是||
|名称|NAME|文本，可指定长度|200|是||
|对象标识|OBJECT_ID|文本，可指定长度|100|是||
|对象类型|OBJECT_TYPE|文本，可指定长度|100|是||
|操作人|OP_PERSON_ID|文本，可指定长度|100|是||
|操作人|OP_PERSON_NAME|文本，可指定长度|100|是||


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
|[DEFAULT](module/audit/audit_record/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/audit/audit_record/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/audit/audit_record/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/audit/audit_record?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/audit/audit_record?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/audit/audit_record?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/audit/audit_record?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/audit/audit_record?id=搜索模式`">
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