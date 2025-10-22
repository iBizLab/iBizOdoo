# 线索转化为商机（批量）(crm_lead2opportunity_partner_mass)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|相关客户|ACTION|[单项选择(文本值)](index/dictionary_index#crm_lead2opportunity_partner_mass_action "相关客户")|60|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|应用去重|DEDUPLICATE|是否逻辑||是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|强制指派|FORCE_ASSIGNMENT|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|关联线索|LEAD_ID|外键值|100|是||
|名称|NAME|文本，可指定长度|200|是||
|客户|PARTNER_ID|外键值|100|是||
|销售团队|TEAM_ID|外键值|100|是||
|销售人员|USER_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_MASS_CRM_LEAD_LEAD_ID](der/DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_MASS_CRM_LEAD_LEAD_ID)|[线索/商机(CRM_LEAD)](module/crm/crm_lead)|1:N关系||
|[DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_MASS_CRM_TEAM_TEAM_ID](der/DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_MASS_CRM_TEAM_TEAM_ID)|[销售团队(CRM_TEAM)](module/crm/crm_team)|1:N关系||
|[DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_MASS_RES_PARTNER_PARTNER_ID](der/DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_MASS_RES_PARTNER_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_MASS_RES_USERS_USER_ID](der/DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_MASS_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|N_LEAD_ID_EQ|关联线索|EQ||
|N_PARTNER_ID_EQ|客户|EQ||
|N_TEAM_ID_EQ|销售团队|EQ||
|N_USER_ID_EQ|销售人员|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/crm_lead2opportunity_partner_mass?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_lead2opportunity_partner_mass?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_lead2opportunity_partner_mass?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_lead2opportunity_partner_mass?id=搜索模式`">
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