# 招聘阶段(hr_recruitment_stage)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|折叠看板|FOLD|是否逻辑||是||
|雇佣阶段|HIRED_STAGE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|警告是否清晰可见|IS_WARNING_VISIBLE|是否逻辑||是||
|红色的看板标签|LEGEND_BLOCKED|文本，可指定长度|500|否||
|绿色看板标签|LEGEND_DONE|文本，可指定长度|500|否||
|灰色看板标签|LEGEND_NORMAL|文本，可指定长度|500|否||
|名称|NAME|文本，可指定长度|200|是||
|要求|REQUIREMENTS|长文本，没有长度限制|1048576|是||
|序列|SEQUENCE|整型||是||
|EMail模板|TEMPLATE_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_LAST_STAGE_ID](der/DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_LAST_STAGE_ID)|[申请人(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||
|[DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_STAGE_ID](der/DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_STAGE_ID)|[申请人(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_RECRUITMENT_STAGE_MAIL_TEMPLATE_TEMPLATE_ID](der/DER1N_HR_RECRUITMENT_STAGE_MAIL_TEMPLATE_TEMPLATE_ID)|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_TEMPLATE_ID_EQ|EMail模板|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=搜索模式`">
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