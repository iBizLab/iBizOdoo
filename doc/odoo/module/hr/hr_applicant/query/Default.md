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
t1.`CANDIDATE_ID`,
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_CLOSED`,
t1.`DATE_LAST_STAGE_UPDATE`,
t1.`DATE_OPEN`,
t1.`DELAY_CLOSE`,
t1.`DEPARTMENT_ID`,
t1.`EMAIL_CC`,
t1.`ID`,
t1.`JOB_ID`,
t1.`KANBAN_STATE`,
t1.`LAST_STAGE_ID`,
t1.`MESSAGE_MAIN_ATTACHMENT_ID`,
t1.`PRIORITY`,
t1.`PROBABILITY`,
t1.`REFUSE_DATE`,
t1.`REFUSE_REASON_ID`,
t1.`SALARY_EXPECTED`,
t1.`SALARY_EXPECTED_EXTRA`,
t1.`SALARY_PROPOSED`,
t1.`SALARY_PROPOSED_EXTRA`,
t1.`STAGE_ID`,
t1.`USER_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_applicant` t1 


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