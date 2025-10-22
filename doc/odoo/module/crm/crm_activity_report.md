# 客户关系管理活动分析(crm_activity_report)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|已指派给|AUTHOR_ID|外键值|100|是||
|活动描述|BODY|HTML文本，没有长度限制|1048576|是||
|公司|COMPANY_ID|外键值|100|是||
|国家/地区|COUNTRY_ID|外键值|100|是||
|完成日期|DATE|日期时间型||是||
|关闭日期|DATE_CLOSED|日期时间型||是||
|转化日期|DATE_CONVERSION|日期时间型||是||
|预期结束|DATE_DEADLINE|日期型||是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|创建日期|LEAD_CREATE_DATE|日期时间型||是||
|商机|LEAD_ID|外键值|100|是||
|类型|LEAD_TYPE|[单项选择(文本值)](index/dictionary_index#crm_activity_report_lead_type "类型")|60|是||
|活动类型|MAIL_ACTIVITY_TYPE_ID|外键值|100|是||
|客户|PARTNER_ID|外键值|100|是||
|阶段|STAGE_ID|外键值|100|是||
|子类型|SUBTYPE_ID|外键值|100|是||
|销售团队|TEAM_ID|外键值|100|是||
|销售人员|USER_ID|外键值|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_CRM_ACTIVITY_REPORT_CRM_LEAD_LEAD_ID](der/DER1N_CRM_ACTIVITY_REPORT_CRM_LEAD_LEAD_ID)|[线索/商机(CRM_LEAD)](module/crm/crm_lead)|1:N关系||
|[DER1N_CRM_ACTIVITY_REPORT_CRM_STAGE_STAGE_ID](der/DER1N_CRM_ACTIVITY_REPORT_CRM_STAGE_STAGE_ID)|[客户关系管理阶段(CRM_STAGE)](module/crm/crm_stage)|1:N关系||
|[DER1N_CRM_ACTIVITY_REPORT_CRM_TEAM_TEAM_ID](der/DER1N_CRM_ACTIVITY_REPORT_CRM_TEAM_TEAM_ID)|[销售团队(CRM_TEAM)](module/crm/crm_team)|1:N关系||
|[DER1N_CRM_ACTIVITY_REPORT_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_ID](der/DER1N_CRM_ACTIVITY_REPORT_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_CRM_ACTIVITY_REPORT_MAIL_MESSAGE_SUBTYPE_SUBTYPE_ID](der/DER1N_CRM_ACTIVITY_REPORT_MAIL_MESSAGE_SUBTYPE_SUBTYPE_ID)|[消息子类型(MAIL_MESSAGE_SUBTYPE)](module/mail/mail_message_subtype)|1:N关系||
|[DER1N_CRM_ACTIVITY_REPORT_RES_COMPANY_COMPANY_ID](der/DER1N_CRM_ACTIVITY_REPORT_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_CRM_ACTIVITY_REPORT_RES_COUNTRY_COUNTRY_ID](der/DER1N_CRM_ACTIVITY_REPORT_RES_COUNTRY_COUNTRY_ID)|[国家/地区(RES_COUNTRY)](module/base/res_country)|1:N关系||
|[DER1N_CRM_ACTIVITY_REPORT_RES_PARTNER_AUTHOR_ID](der/DER1N_CRM_ACTIVITY_REPORT_RES_PARTNER_AUTHOR_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_CRM_ACTIVITY_REPORT_RES_PARTNER_PARTNER_ID](der/DER1N_CRM_ACTIVITY_REPORT_RES_PARTNER_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_CRM_ACTIVITY_REPORT_RES_USERS_USER_ID](der/DER1N_CRM_ACTIVITY_REPORT_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_AUTHOR_ID_EQ|已指派给|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_COUNTRY_ID_EQ|国家/地区|EQ||
|N_ID_EQ|标识|EQ||
|N_LEAD_ID_EQ|商机|EQ||
|N_MAIL_ACTIVITY_TYPE_ID_EQ|活动类型|EQ||
|N_PARTNER_ID_EQ|客户|EQ||
|N_STAGE_ID_EQ|阶段|EQ||
|N_SUBTYPE_ID_EQ|子类型|EQ||
|N_TEAM_ID_EQ|销售团队|EQ||
|N_USER_ID_EQ|销售人员|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/crm_activity_report?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_activity_report?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_activity_report?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_activity_report?id=搜索模式`">
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