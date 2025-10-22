# 工资结构类型(hr_payroll_structure_type)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|国家/地区|COUNTRY_ID|外键值|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|默认工作时间|DEFAULT_RESOURCE_CALENDAR_ID|外键值|100|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_CONTRACT_HISTORY_HR_PAYROLL_STRUCTURE_TYPE_STRUCTURE_TYPE_ID](der/DER1N_HR_CONTRACT_HISTORY_HR_PAYROLL_STRUCTURE_TYPE_STRUCTURE_TYPE_ID)|[合同历史(HR_CONTRACT_HISTORY)](module/hr/hr_contract_history)|1:N关系||
|[DER1N_HR_CONTRACT_HR_PAYROLL_STRUCTURE_TYPE_STRUCTURE_TYPE_ID](der/DER1N_HR_CONTRACT_HR_PAYROLL_STRUCTURE_TYPE_STRUCTURE_TYPE_ID)|[员工合同(HR_CONTRACT)](module/hr/hr_contract)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_PAYROLL_STRUCTURE_TYPE_RESOURCE_CALENDAR_DEFAULT_RESOURCE_CALENDAR_ID](der/DER1N_HR_PAYROLL_STRUCTURE_TYPE_RESOURCE_CALENDAR_DEFAULT_RESOURCE_CALENDAR_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||
|[DER1N_HR_PAYROLL_STRUCTURE_TYPE_RES_COUNTRY_COUNTRY_ID](der/DER1N_HR_PAYROLL_STRUCTURE_TYPE_RES_COUNTRY_COUNTRY_ID)|[国家/地区(RES_COUNTRY)](module/base/res_country)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_COUNTRY_ID_EQ|国家/地区|EQ||
|N_DEFAULT_RESOURCE_CALENDAR_ID_EQ|默认工作时间|EQ||
|N_ID_EQ|标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_payroll_structure_type?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_payroll_structure_type?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_payroll_structure_type?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_payroll_structure_type?id=搜索模式`">
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