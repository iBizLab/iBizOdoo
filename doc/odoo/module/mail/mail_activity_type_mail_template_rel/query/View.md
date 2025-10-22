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
t1.`ID`,
t1.`MAIL_ACTIVITY_TYPE_ID`,
t11.`NAME` AS `MAIL_ACTIVITY_TYPE_NAME`,
t1.`MAIL_TEMPLATE_ID`,
t21.`NAME` AS `MAIL_TEMPLATE_NAME`,
t1.`NAME`
FROM `mail_activity_type_mail_template_rel` t1 
LEFT JOIN `mail_activity_type` t11 ON t1.`MAIL_ACTIVITY_TYPE_ID` = t11.`ID` 
LEFT JOIN `mail_template` t21 ON t1.`MAIL_TEMPLATE_ID` = t21.`ID` 


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