# CRM线索挖掘需求(crm_iap_lead_mining_request)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|公司最大规模|COMPANY_SIZE_MAX|整型||是||
|尺寸|COMPANY_SIZE_MIN|整型||是||
|筛选于|CONTACT_FILTER_TYPE|[单项选择(文本值)](index/dictionary_index#crm_iap_lead_mining_request_contact_filter_type "筛选于")|60|是||
|联系人人数|CONTACT_NUMBER|整型||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|错误类型|ERROR_TYPE|[单项选择(文本值)](index/dictionary_index#crm_iap_lead_mining_request_error_type "错误类型")|60|是||
|根据规模过滤|FILTER_ON_SIZE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|线索联络点数|LEAD_CONTACTS_CREDITS|文本，可指定长度|500|是||
|生成线索的数量|LEAD_COUNT|整型||是||
|线索点数|LEAD_CREDITS|文本，可指定长度|500|是||
|线索数量|LEAD_NUMBER|整型||否||
|线索总点数|LEAD_TOTAL_CREDITS|文本，可指定长度|500|是||
|类型|LEAD_TYPE|[单项选择(文本值)](index/dictionary_index#crm_iap_lead_mining_request_lead_type "类型")|60|否||
|名称|NAME|文本，可指定长度|200|是||
|首选角色|PREFERRED_ROLE_ID|外键值|100|是||
|目标|SEARCH_TYPE|[单项选择(文本值)](index/dictionary_index#crm_iap_lead_mining_request_search_type "目标")|60|否||
|资历|SENIORITY_ID|外键值|100|是||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#crm_iap_lead_mining_request_state "状态")|60|否||
|销售团队|TEAM_ID|外键值|100|是||
|销售员|USER_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_CRM_LEAD_CRM_IAP_LEAD_MINING_REQUEST_LEAD_MINING_REQUEST_ID](der/DER1N_CRM_LEAD_CRM_IAP_LEAD_MINING_REQUEST_LEAD_MINING_REQUEST_ID)|[线索/商机(CRM_LEAD)](module/crm/crm_lead)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_CRM_IAP_LEAD_MINING_REQUEST_CRM_IAP_LEAD_ROLE_PREFERRED_ROLE_ID](der/DER1N_CRM_IAP_LEAD_MINING_REQUEST_CRM_IAP_LEAD_ROLE_PREFERRED_ROLE_ID)|[人物角色(CRM_IAP_LEAD_ROLE)](module/crm/crm_iap_lead_role)|1:N关系||
|[DER1N_CRM_IAP_LEAD_MINING_REQUEST_CRM_IAP_LEAD_SENIORITY_SENIORITY_ID](der/DER1N_CRM_IAP_LEAD_MINING_REQUEST_CRM_IAP_LEAD_SENIORITY_SENIORITY_ID)|[人员资历(CRM_IAP_LEAD_SENIORITY)](module/crm/crm_iap_lead_seniority)|1:N关系||
|[DER1N_CRM_IAP_LEAD_MINING_REQUEST_CRM_TEAM_TEAM_ID](der/DER1N_CRM_IAP_LEAD_MINING_REQUEST_CRM_TEAM_TEAM_ID)|[销售团队(CRM_TEAM)](module/crm/crm_team)|1:N关系||
|[DER1N_CRM_IAP_LEAD_MINING_REQUEST_RES_USERS_USER_ID](der/DER1N_CRM_IAP_LEAD_MINING_REQUEST_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|N_PREFERRED_ROLE_ID_EQ|首选角色|EQ||
|N_SENIORITY_ID_EQ|资历|EQ||
|N_TEAM_ID_EQ|销售团队|EQ||
|N_USER_ID_EQ|销售员|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/crm_iap_lead_mining_request?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_iap_lead_mining_request?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_iap_lead_mining_request?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_iap_lead_mining_request?id=搜索模式`">
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