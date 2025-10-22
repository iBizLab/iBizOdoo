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
t1.`AUTHOR_ID`,
t1.`FAILURE_TYPE`,
t1.`ID`,
t1.`IS_READ`,
t1.`MAIL_MAIL_ID`,
t1.`MAIL_MESSAGE_ID`,
t11.`RECORD_NAME` AS `MAIL_MESSAGE_RECORD_NAME`,
t11.`BODY` AS `MESSAGE_CONTENT`,
t1.`NOTIFICATION_STATUS`,
t1.`NOTIFICATION_TYPE`,
t1.`READ_DATE`,
t1.`RES_PARTNER_ID`,
t21.`NAME` AS `RES_PARTNER_NAME`,
t1.`SMS_ID_INT`,
t1.`SMS_NUMBER`
FROM `mail_notification` t1 
LEFT JOIN `mail_message` t11 ON t1.`MAIL_MESSAGE_ID` = t11.`ID` 
LEFT JOIN `res_partner` t21 ON t1.`RES_PARTNER_ID` = t21.`ID` 


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