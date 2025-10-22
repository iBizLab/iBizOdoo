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
> `APPLICANT_PROPERTIES_DEFINITION(申请人物业)`
>
> `REQUIREMENTS(要求)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTIVE`,
t1.`ADDRESS_ID`,
t1.`APPLICANT_PROPERTIES_DEFINITION`,
t1.`COLOR`,
t1.`COMPANY_ID`,
t1.`CONTRACT_TYPE_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_ID`,
t1.`DESCRIPTION`,
t1.`EXPECTED_EMPLOYEES`,
t1.`ID`,
t1.`INDUSTRY_ID`,
t1.`MANAGER_ID`,
t1.`NAME`,
t1.`NO_OF_EMPLOYEE`,
t1.`NO_OF_HIRED_EMPLOYEE`,
t1.`NO_OF_RECRUITMENT`,
t1.`REQUIREMENTS`,
t1.`SEQUENCE`,
t1.`USER_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_job` t1 


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