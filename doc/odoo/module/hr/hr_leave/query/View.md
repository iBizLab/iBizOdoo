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

> [!ATTENTION|label:存在长文本属性]
>
> `NOTES(理由)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_ID`,
t1.`DURATION_DISPLAY`,
t1.`EMPLOYEE_COMPANY_ID`,
t1.`EMPLOYEE_ID`,
t1.`FIRST_APPROVER_ID`,
t1.`HOLIDAY_STATUS_ID`,
t1.`ID`,
t1.`MANAGER_ID`,
t1.`MESSAGE_MAIN_ATTACHMENT_ID`,
t1.`NAME`,
t1.`NOTES`,
t1.`NUMBER_OF_DAYS`,
t1.`NUMBER_OF_HOURS`,
t1.`OVERTIME_ID`,
t1.`PRIVATE_NAME`,
t1.`REQUEST_DATE_FROM`,
t1.`REQUEST_DATE_FROM_PERIOD`,
t1.`REQUEST_DATE_TO`,
t1.`REQUEST_HOUR_FROM`,
t1.`REQUEST_HOUR_TO`,
t1.`REQUEST_UNIT_HALF`,
t1.`REQUEST_UNIT_HOURS`,
t1.`RESOURCE_CALENDAR_ID`,
t1.`SECOND_APPROVER_ID`,
t1.`STATE`,
t1.`USER_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_leave` t1 


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