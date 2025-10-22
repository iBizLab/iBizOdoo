# 应用(ir_module_category)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|描述|DESCRIPTION|长文本，没有长度限制|1048576|是||
|专属|EXCLUSIVE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|父应用|PARENT_ID|外键值|100|是||
|父应用名称|PARENT_NAME|外键值文本|200|是||
|序列|SEQUENCE|整型||是||
|显示|VISIBLE|是否逻辑||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_IR_MODULE_CATEGORY_IR_MODULE_CATEGORY_PARENT_ID](der/DER1N_IR_MODULE_CATEGORY_IR_MODULE_CATEGORY_PARENT_ID)|[应用(IR_MODULE_CATEGORY)](module/base/ir_module_category)|1:N关系||
|[DER1N_IR_MODULE_MODULE_IR_MODULE_CATEGORY_CATEGORY_ID](der/DER1N_IR_MODULE_MODULE_IR_MODULE_CATEGORY_CATEGORY_ID)|[模块(IR_MODULE_MODULE)](module/base/ir_module_module)|1:N关系||
|[DER1N_RES_GROUPS_IR_MODULE_CATEGORY_CATEGORY_ID](der/DER1N_RES_GROUPS_IR_MODULE_CATEGORY_CATEGORY_ID)|[权限组(RES_GROUPS)](module/base/res_groups)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_IR_MODULE_CATEGORY_IR_MODULE_CATEGORY_PARENT_ID](der/DER1N_IR_MODULE_CATEGORY_IR_MODULE_CATEGORY_PARENT_ID)|[应用(IR_MODULE_CATEGORY)](module/base/ir_module_category)|1:N关系||

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
|[DEFAULT](module/base/ir_module_category/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/ir_module_category/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/ir_module_category/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARENT_ID_EQ|父应用|EQ||
|N_PARENT_NAME_EQ|父应用名称|EQ||
|N_PARENT_NAME_LIKE|父应用名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/ir_module_category?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_category?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_category?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_category?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_category?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_category?id=搜索模式`">
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