# 员工的简历明细(hr_resume_line)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|结束日期|DATE_END|日期型||是||
|开始日期|DATE_START|日期型||否||
|部门|DEPARTMENT_ID|外键值|100|是||
|描述|DESCRIPTION|HTML文本，没有长度限制|1048576|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|显示类型|DISPLAY_TYPE|[单项选择(文本值)](index/dictionary_index#hr_resume_line_display_type "显示类型")|60|是||
|员工|EMPLOYEE_ID|外键值|100|否||
|到期状态|EXPIRATION_STATUS|[单项选择(文本值)](index/dictionary_index#hr_resume_line_expiration_status "到期状态")|60|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|类型|LINE_TYPE_ID|外键值|100|是||
|名称|NAME|文本，可指定长度|200|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_RESUME_LINE_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_RESUME_LINE_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_RESUME_LINE_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_RESUME_LINE_HR_EMPLOYEE_EMPLOYEE_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_RESUME_LINE_HR_RESUME_LINE_TYPE_LINE_TYPE_ID](der/DER1N_HR_RESUME_LINE_HR_RESUME_LINE_TYPE_LINE_TYPE_ID)|[简历明细的类型(HR_RESUME_LINE_TYPE)](module/hr/hr_resume_line_type)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_EMPLOYEE_ID_EQ|员工|EQ||
|N_ID_EQ|标识|EQ||
|N_LINE_TYPE_ID_EQ|类型|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_resume_line?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_resume_line?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_resume_line?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_resume_line?id=搜索模式`">
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