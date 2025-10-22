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
t1.`ACTIVE`,
t11.`ACTIVITY_DATE_DEADLINE_RANGE`,
t11.`ACTIVITY_DATE_DEADLINE_RANGE_TYPE`,
t11.`ACTIVITY_SUMMARY`,
t11.`ACTIVITY_TYPE_ID`,
t21.`NAME` AS `ACTIVITY_TYPE_NAME`,
t11.`ACTIVITY_USER_FIELD_NAME`,
t11.`ACTIVITY_USER_ID`,
t41.`NAME` AS `ACTIVITY_USER_NAME`,
t11.`ACTIVITY_USER_TYPE`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`CRON_NAME`,
t11.`CRUD_MODEL_ID`,
t11.`EVALUATION_TYPE`,
t1.`FAILURE_COUNT`,
t1.`FIRST_FAILURE_DATE`,
t1.`ID`,
t1.`INTERVAL_NUMBER`,
t1.`INTERVAL_TYPE`,
t1.`IR_ACTIONS_SERVER_ID`,
t1.`LASTCALL`,
t11.`LINK_FIELD_ID`,
t11.`MAIL_POST_AUTOFOLLOW`,
t11.`MAIL_POST_METHOD`,
t1.`MODEL_ID`,
t11.`NAME`,
t1.`NEXTCALL`,
t1.`PRIORITY`,
t11.`SMS_METHOD`,
t11.`STATE`,
t11.`TEMPLATE_ID`,
t51.`NAME` AS `TEMPLATE_NAME`,
t11.`UPDATE_BOOLEAN_VALUE`,
t11.`UPDATE_FIELD_ID`,
t11.`UPDATE_PATH`,
t11.`UPDATE_RELATED_MODEL_ID`,
t11.`USAGE`,
t1.`USER_ID`,
t71.`NAME` AS `USER_NAME`,
t11.`WEBHOOK_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_cron` t1 
LEFT JOIN `ir_actions_server` t11 ON t1.`IR_ACTIONS_SERVER_ID` = t11.`ID` 
LEFT JOIN `mail_activity_type` t21 ON t11.`ACTIVITY_TYPE_ID` = t21.`ID` 
LEFT JOIN `res_users` t31 ON t11.`ACTIVITY_USER_ID` = t31.`ID` 
LEFT JOIN `res_partner` t41 ON t31.`PARTNER_ID` = t41.`ID` 
LEFT JOIN `mail_template` t51 ON t11.`TEMPLATE_ID` = t51.`ID` 
LEFT JOIN `res_users` t61 ON t1.`USER_ID` = t61.`ID` 
LEFT JOIN `res_partner` t71 ON t61.`PARTNER_ID` = t71.`ID` 


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