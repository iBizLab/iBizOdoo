# 应计方案(hr_leave_accrual_plan)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|应计收益时间|ACCRUED_GAIN_TIME|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_plan_accrued_gain_time "应计收益时间")|60|否||
|有效|ACTIVE|是否逻辑||是||
|附加值类型|ADDED_VALUE_TYPE|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_plan_added_value_type "附加值类型")|60|是||
|结转时间|CARRYOVER_DATE|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_plan_carryover_date "结转时间")|60|否||
|结转日|CARRYOVER_DAY|整型||是||
|结转月|CARRYOVER_MONTH|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_plan_carryover_month "结转月")|60|是||
|公司|COMPANY_ID|外键值|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|员工|EMPLOYEES_COUNT|整型||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|按工作时间计算|IS_BASED_ON_WORKED_TIME|是否逻辑||是||
|等级|LEVEL_COUNT|整型||是||
|名称|NAME|文本，可指定长度|200|是||
|显示过渡模式|SHOW_TRANSITION_MODE|是否逻辑||是||
|休假类型|TIME_OFF_TYPE_ID|外键值|100|是||
|里程碑式的过渡|TRANSITION_MODE|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_plan_transition_mode "里程碑式的过渡")|60|否||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_LEAVE_ACCRUAL_LEVEL_HR_LEAVE_ACCRUAL_PLAN_ACCRUAL_PLAN_ID](der/DER1N_HR_LEAVE_ACCRUAL_LEVEL_HR_LEAVE_ACCRUAL_PLAN_ACCRUAL_PLAN_ID)|[应计方案等级(HR_LEAVE_ACCRUAL_LEVEL)](module/hr/hr_leave_accrual_level)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_GENERATE_MULTI_WIZARD_HR_LEAVE_ACCRUAL_PLAN_ACCRUAL_PLAN_ID](der/DER1N_HR_LEAVE_ALLOCATION_GENERATE_MULTI_WIZARD_HR_LEAVE_ACCRUAL_PLAN_ACCRUAL_PLAN_ID)|[为多名员工生成休假时间分配(HR_LEAVE_ALLOCATION_GENERATE_MULTI_WIZARD)](module/hr/hr_leave_allocation_generate_multi_wizard)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_HR_LEAVE_ACCRUAL_PLAN_ACCRUAL_PLAN_ID](der/DER1N_HR_LEAVE_ALLOCATION_HR_LEAVE_ACCRUAL_PLAN_ACCRUAL_PLAN_ID)|[休息分配(HR_LEAVE_ALLOCATION)](module/hr/hr_leave_allocation)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_LEAVE_ACCRUAL_PLAN_HR_LEAVE_TYPE_TIME_OFF_TYPE_ID](der/DER1N_HR_LEAVE_ACCRUAL_PLAN_HR_LEAVE_TYPE_TIME_OFF_TYPE_ID)|[休假类型(HR_LEAVE_TYPE)](module/hr/hr_leave_type)|1:N关系||
|[DER1N_HR_LEAVE_ACCRUAL_PLAN_RES_COMPANY_COMPANY_ID](der/DER1N_HR_LEAVE_ACCRUAL_PLAN_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_COMPANY_ID_EQ|公司|EQ||
|N_ID_EQ|标识|EQ||
|N_TIME_OFF_TYPE_ID_EQ|休假类型|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_leave_accrual_plan?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_accrual_plan?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_accrual_plan?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_accrual_plan?id=搜索模式`">
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