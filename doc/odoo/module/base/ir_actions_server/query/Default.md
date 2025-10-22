## DEFAULT(Default) <!-- {docsify-ignore-all} -->



<p class="panel-title"><b>查看SQL语句</b></p>
<br>

<el-row>
&nbsp;<el-tag @click="MYSQL5 = true">MYSQL5</el-tag>
</el-row>

<br>
<p class="panel-title"><b>是否默认查询</b></p>

* `是`

<p class="panel-title"><b>是否权限使用</b></p>

* `否`

<p class="panel-title"><b>是否自定义SQL</b></p>

* `否`

<p class="panel-title"><b>查询列级别</b></p>

* `默认（全部查询列）`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTIVITY_DATE_DEADLINE_RANGE`,
t1.`ACTIVITY_DATE_DEADLINE_RANGE_TYPE`,
t1.`ACTIVITY_SUMMARY`,
t1.`ACTIVITY_TYPE_ID`,
t41.`NAME` AS `ACTIVITY_TYPE_NAME`,
t1.`ACTIVITY_USER_FIELD_NAME`,
t1.`ACTIVITY_USER_ID`,
t31.`NAME` AS `ACTIVITY_USER_NAME`,
t1.`ACTIVITY_USER_TYPE`,
t1.`BINDING_TYPE`,
t1.`BINDING_VIEW_TYPES`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`CRUD_MODEL_ID`,
t1.`EVALUATION_TYPE`,
t1.`ID`,
t1.`LINK_FIELD_ID`,
t1.`MAIL_POST_AUTOFOLLOW`,
t1.`MAIL_POST_METHOD`,
t1.`MODEL_ID`,
t1.`NAME`,
t1.`PATH`,
t1.`SEQUENCE`,
t1.`SMS_METHOD`,
t1.`STATE`,
t1.`TEMPLATE_ID`,
t11.`NAME` AS `TEMPLATE_NAME`,
t1.`TYPE`,
t1.`UPDATE_BOOLEAN_VALUE`,
t1.`UPDATE_FIELD_ID`,
t1.`UPDATE_M2M_OPERATION`,
t1.`UPDATE_PATH`,
t1.`UPDATE_RELATED_MODEL_ID`,
t1.`USAGE`,
t1.`WEBHOOK_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_actions_server` t1 
LEFT JOIN `mail_template` t11 ON t1.`TEMPLATE_ID` = t11.`ID` 
LEFT JOIN `res_users` t21 ON t1.`ACTIVITY_USER_ID` = t21.`ID` 
LEFT JOIN `res_partner` t31 ON t21.`PARTNER_ID` = t31.`ID` 
LEFT JOIN `mail_activity_type` t41 ON t1.`ACTIVITY_TYPE_ID` = t41.`ID` 


```

</el-dialog>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
                MYSQL5 : false
        
      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>