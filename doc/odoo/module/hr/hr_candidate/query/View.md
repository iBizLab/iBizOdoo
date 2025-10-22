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
t1.`AVAILABILITY`,
t1.`COLOR`,
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EMAIL_CC`,
t1.`EMAIL_FROM`,
t1.`EMAIL_NORMALIZED`,
t1.`EMPLOYEE_ID`,
t1.`ID`,
t1.`LINKEDIN_PROFILE`,
t1.`MESSAGE_BOUNCE`,
t1.`MESSAGE_MAIN_ATTACHMENT_ID`,
t1.`PARTNER_ID`,
t1.`PARTNER_NAME`,
t1.`PARTNER_PHONE`,
t1.`PARTNER_PHONE_SANITIZED`,
t1.`PHONE_SANITIZED`,
t1.`PRIORITY`,
t1.`TYPE_ID`,
t1.`USER_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate` t1 


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