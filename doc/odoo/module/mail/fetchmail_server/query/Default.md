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
t1.`ATTACH`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE`,
t1.`GOOGLE_GMAIL_ACCESS_TOKEN`,
t1.`GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION`,
t1.`GOOGLE_GMAIL_AUTHORIZATION_CODE`,
t1.`GOOGLE_GMAIL_REFRESH_TOKEN`,
t1.`ID`,
t1.`IS_SSL`,
t1.`NAME`,
t1.`OBJECT_ID`,
t1.`ORIGINAL`,
t1.`PASSWORD`,
t1.`PORT`,
t1.`PRIORITY`,
t1.`SCRIPT`,
t1.`SERVER`,
t1.`SERVER_TYPE`,
t1.`STATE`,
t1.`USER`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `fetchmail_server` t1 


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