# 应计方案等级(hr_leave_accrual_level)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|应计方案|ACCRUAL_PLAN_ID|外键值|100|否||
|累计有效期|ACCRUAL_VALIDITY|是否逻辑||是||
|累计有效数|ACCRUAL_VALIDITY_COUNT|整型||是||
|累计有效类型|ACCRUAL_VALIDITY_TYPE|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_level_accrual_validity_type "累计有效类型")|60|否||
|结转|ACTION_WITH_UNUSED_ACCRUALS|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_level_action_with_unused_accruals "结转")|60|否||
|比率|ADDED_VALUE|浮点||否||
|附加值类型|ADDED_VALUE_TYPE|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_level_added_value_type "附加值类型")|60|否||
|可修改值类型|CAN_MODIFY_VALUE_TYPE|是否逻辑||是||
|累计时间上限|CAP_ACCRUED_TIME|是否逻辑||是||
|里程碑上限|CAP_ACCRUED_TIME_YEARLY|是否逻辑||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|第一天|FIRST_DAY|整型||是||
|第一个月|FIRST_MONTH|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_level_first_month "第一个月")|60|是||
|第一个月日|FIRST_MONTH_DAY|整型||是||
|频率|FREQUENCY|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_level_frequency "频率")|60|否||
|频率 每小时 来源|FREQUENCY_HOURLY_SOURCE|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_level_frequency_hourly_source "频率 每小时 来源")|60|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|限制|MAXIMUM_LEAVE|浮点||是||
|每年上限|MAXIMUM_LEAVE_YEARLY|浮点||是||
|应计款项转出的最大金额|POSTPONE_MAX_DAYS|整型||是||
|第二天|SECOND_DAY|整型||是||
|第二个月|SECOND_MONTH|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_level_second_month "第二个月")|60|是||
|第二个月日|SECOND_MONTH_DAY|整型||是||
|顺序|SEQUENCE|整型||是||
|之后开始|START_COUNT|整型||是||
|null|START_TYPE|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_level_start_type "null")|60|否||
|分配|WEEK_DAY|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_level_week_day "分配")|60|否||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||
|年度日|YEARLY_DAY|整型||是||
|年 月|YEARLY_MONTH|[单项选择(文本值)](index/dictionary_index#hr_leave_accrual_level_yearly_month "年 月")|60|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_LEAVE_ACCRUAL_LEVEL_HR_LEAVE_ACCRUAL_PLAN_ACCRUAL_PLAN_ID](der/DER1N_HR_LEAVE_ACCRUAL_LEVEL_HR_LEAVE_ACCRUAL_PLAN_ACCRUAL_PLAN_ID)|[应计方案(HR_LEAVE_ACCRUAL_PLAN)](module/hr/hr_leave_accrual_plan)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACCRUAL_PLAN_ID_EQ|应计方案|EQ||
|N_ID_EQ|标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_leave_accrual_level?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_accrual_level?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_accrual_level?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_accrual_level?id=搜索模式`">
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