# 模块(ir_module_module)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|应用|APPLICATION|是否逻辑||是||
|应用标识|APP_ID|文本，可指定长度|200|是||
|作者|AUTHOR|文本，可指定长度|250|是||
|自动安装|AUTO_INSTALL|是否逻辑||是||
|类别|CATEGORY_ID|外键值|100|是||
|协作者|CONTRIBUTORS|长文本，没有长度限制|1048576|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|演示数据|DEMO|是否逻辑||是||
|描述|DESCRIPTION|长文本，没有长度限制|1048576|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|图标网址|ICON|文本，可指定长度|250|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|导入的模块|IMPORTED|是否逻辑||是||
|已安装版本|LATEST_VERSION|文本，可指定长度|250|是||
|许可证|LICENSE|[单项选择(文本值)](index/dictionary_index#ir_module_module_license "许可证")|60|是||
|维护者|MAINTAINER|文本，可指定长度|250|是||
|菜单|MENUS_BY_MODULE|长文本，没有长度限制|1048576|是||
|模块类型|MODULE_TYPE|[单项选择(文本值)](index/dictionary_index#ir_module_module_module_type "模块类型")|60|是||
|名称|NAME|文本，可指定长度|200|是||
|排序值|ORDER|整型||是||
|出版版本|PUBLISHED_VERSION|文本，可指定长度|250|是||
|报表|REPORTS_BY_MODULE|长文本，没有长度限制|1048576|是||
|资源标识|RES_CODE|文本，可指定长度|200|是||
|序列|SEQUENCE|整型||是||
|模块名|SHORTDESC|文本，可指定长度|250|是||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#ir_module_module_state "状态")|60|是||
|摘要|SUMMARY|文本，可指定长度|250|是||
|ERP 企业版专属模块|TO_BUY|是否逻辑||是||
|URL|URL|文本，可指定长度|250|是||
|视图|VIEWS_BY_MODULE|长文本，没有长度限制|1048576|是||
|网站|WEBSITE|文本，可指定长度|250|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_IR_MODULE_MODULE_DEPENDENCY_IR_MODULE_MODULE_MODULE_ID](der/DER1N_IR_MODULE_MODULE_DEPENDENCY_IR_MODULE_MODULE_MODULE_ID)|[模块依赖性(IR_MODULE_MODULE_DEPENDENCY)](module/base/ir_module_module_dependency)|1:N关系||
|[DER1N_IR_MODULE_MODULE_EXCLUSION_IR_MODULE_MODULE_MODULE_ID](der/DER1N_IR_MODULE_MODULE_EXCLUSION_IR_MODULE_MODULE_MODULE_ID)|[模块排除(IR_MODULE_MODULE_EXCLUSION)](module/base/ir_module_module_exclusion)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_IR_MODULE_MODULE_IR_MODULE_CATEGORY_CATEGORY_ID](der/DER1N_IR_MODULE_MODULE_IR_MODULE_CATEGORY_CATEGORY_ID)|[应用(IR_MODULE_CATEGORY)](module/base/ir_module_category)|1:N关系||

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

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[cur_user_app](module/base/ir_module_module/logic/cur_user_app)|cur_user_app|无||包含校验权限|

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/ir_module_module/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/ir_module_module/query/View)|VIEW|否|否 |否 ||
|[已安装(installed)](module/base/ir_module_module/query/installed)|installed|否|否 |否 ||
|[已安装应用(installed_app)](module/base/ir_module_module/query/installed_app)|installed_app|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/ir_module_module/dataset/Default)|DEFAULT|数据查询|是|||
|[当前用户授权应用(cur_user_app)](module/base/ir_module_module/dataset/cur_user_app)|cur_user_app|[实体逻辑](module/base/ir_module_module/logic/cur_user_app)|否|||
|[已安装应用(installed)](module/base/ir_module_module/dataset/installed)|installed|数据查询|否|||
|[已安装应用(installed_app)](module/base/ir_module_module/dataset/installed_app)|installed_app|数据查询|否|||

## 数据权限

##### 全部数据 :id=ir_module_module-all

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CATEGORY_ID_EQ|类别|EQ||
|N_ID_EQ|标识|EQ||
|N_LICENSE_EQ|许可证|EQ||
|N_MODULE_TYPE_EQ|模块类型|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_STATE_EQ|状态|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/ir_module_module?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_module?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_module?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_module?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_module?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_module?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_module?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_module_module?id=搜索模式`">
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