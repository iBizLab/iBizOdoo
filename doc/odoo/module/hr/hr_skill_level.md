# 技能等级(hr_skill_level)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|默认等级|DEFAULT_LEVEL|是否逻辑||是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|进度|LEVEL_PROGRESS|整型||是||
|名称|NAME|文本，可指定长度|200|是||
|技能类型|SKILL_TYPE_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_CANDIDATE_SKILL_HR_SKILL_LEVEL_SKILL_LEVEL_ID](der/DER1N_HR_CANDIDATE_SKILL_HR_SKILL_LEVEL_SKILL_LEVEL_ID)|[候选人的技能水平(HR_CANDIDATE_SKILL)](module/hr/hr_candidate_skill)|1:N关系||
|[DER1N_HR_EMPLOYEE_SKILL_HR_SKILL_LEVEL_SKILL_LEVEL_ID](der/DER1N_HR_EMPLOYEE_SKILL_HR_SKILL_LEVEL_SKILL_LEVEL_ID)|[员工的技能等级(HR_EMPLOYEE_SKILL)](module/hr/hr_employee_skill)|1:N关系||
|[DER1N_HR_EMPLOYEE_SKILL_LOG_HR_SKILL_LEVEL_SKILL_LEVEL_ID](der/DER1N_HR_EMPLOYEE_SKILL_LOG_HR_SKILL_LEVEL_SKILL_LEVEL_ID)|[技能历史(HR_EMPLOYEE_SKILL_LOG)](module/hr/hr_employee_skill_log)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_SKILL_LEVEL_HR_SKILL_TYPE_SKILL_TYPE_ID](der/DER1N_HR_SKILL_LEVEL_HR_SKILL_TYPE_SKILL_TYPE_ID)|[技能类型(HR_SKILL_TYPE)](module/hr/hr_skill_type)|1:N关系||

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
|[DEFAULT](module/hr/hr_skill_level/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_skill_level/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_skill_level/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### hr_skill_level_employee :id=hr_skill_level-hr_skill_level_employee

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_SKILL_TYPE_ID_EQ|技能类型|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_skill_level?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_skill_level?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_skill_level?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_skill_level?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_skill_level?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_skill_level?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_skill_level?id=搜索模式`">
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