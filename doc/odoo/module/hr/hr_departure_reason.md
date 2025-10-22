# 离职原因(hr_departure_reason)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|理由代码|REASON_CODE|整型||是||
|序列|SEQUENCE|整型||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_DEPARTURE_WIZARD_HR_DEPARTURE_REASON_DEPARTURE_REASON_ID](der/DER1N_HR_DEPARTURE_WIZARD_HR_DEPARTURE_REASON_DEPARTURE_REASON_ID)|[离职向导(HR_DEPARTURE_WIZARD)](module/hr/hr_departure_wizard)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_DEPARTURE_REASON_DEPARTURE_REASON_ID](der/DER1N_HR_EMPLOYEE_HR_DEPARTURE_REASON_DEPARTURE_REASON_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||


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

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/hr/hr_departure_reason/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_departure_reason/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_departure_reason/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 表格新建行_脚本 | newRow | 新建行 |无数据|<details><summary>打开视图或向导（模态）</summary></details>|通用界面行为,通过脚本新建表格行|

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[表格新建行](module/hr/hr_departure_reason/uilogic/new_row)|new_row||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_departure_reason?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_departure_reason?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_departure_reason?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_departure_reason?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_departure_reason?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_departure_reason?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_departure_reason?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_departure_reason?id=界面逻辑`">
  界面逻辑
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