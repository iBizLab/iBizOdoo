## 默认（全部数据）(View) <!-- {docsify-ignore-all} -->



<p class="panel-title"><b>查看SQL语句</b></p>
<br>

<el-row>
&nbsp;<el-tag @click="MYSQL5 = true">MYSQL5</el-tag>
</el-row>

<br>
<p class="panel-title"><b>是否默认查询</b></p>

* `否`

<p class="panel-title"><b>是否权限使用</b></p>

* `否`

<p class="panel-title"><b>是否自定义SQL</b></p>

* `否`

<p class="panel-title"><b>查询列级别</b></p>

* `全部数据`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTIVE`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`FROM_FILTER`,
t1.`GOOGLE_GMAIL_ACCESS_TOKEN`,
t1.`GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION`,
t1.`GOOGLE_GMAIL_AUTHORIZATION_CODE`,
t1.`GOOGLE_GMAIL_REFRESH_TOKEN`,
t1.`ID`,
t1.`MAX_EMAIL_SIZE`,
t1.`NAME`,
t1.`SEQUENCE`,
t1.`SMTP_AUTHENTICATION`,
t1.`SMTP_DEBUG`,
t1.`SMTP_ENCRYPTION`,
t1.`SMTP_HOST`,
t1.`SMTP_PASS`,
t1.`SMTP_PORT`,
t1.`SMTP_USER`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_mail_server` t1 


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