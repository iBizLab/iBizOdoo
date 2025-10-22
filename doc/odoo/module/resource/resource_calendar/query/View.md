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
t1.`COMPANY_ID`,
t11.`NAME` AS `COMPANY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`FLEXIBLE_HOURS`,
t1.`FULL_TIME_REQUIRED_HOURS`,
t1.`HOURS_PER_DAY`,
t1.`ID`,
t1.`NAME`,
t1.`TWO_WEEKS_CALENDAR`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `resource_calendar` t1 
LEFT JOIN `res_company` t11 ON t1.`COMPANY_ID` = t11.`ID` 


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