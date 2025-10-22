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
t1.`CALENDAR_ID`,
t11.`NAME` AS `CALENDAR_NAME`,
t1.`COMPANY_ID`,
t31.`NAME` AS `COMPANY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`HOLIDAY_ID`,
t41.`NAME` AS `HOLNAMEAY_NAME`,
t1.`ID`,
t1.`NAME`,
t1.`RESOURCE_ID`,
t21.`NAME` AS `RESOURCE_NAME`,
t1.`TIME_TYPE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `resource_calendar_leaves` t1 
LEFT JOIN `resource_calendar` t11 ON t1.`CALENDAR_ID` = t11.`ID` 
LEFT JOIN `resource_resource` t21 ON t1.`RESOURCE_ID` = t21.`ID` 
LEFT JOIN `res_company` t31 ON t1.`COMPANY_ID` = t31.`ID` 
LEFT JOIN `hr_leave` t41 ON t1.`HOLIDAY_ID` = t41.`ID` 


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