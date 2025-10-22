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
> `ALIAS_DEFAULTS(默认值)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ALIAS_BOUNCED_CONTENT`,
t1.`ALIAS_CONTACT`,
t1.`ALIAS_DEFAULTS`,
t1.`ALIAS_DOMAIN_ID`,
t11.`NAME` AS `ALIAS_DOMAIN_NAME`,
t1.`ALIAS_FORCE_THREAD_ID`,
t1.`ALIAS_FULL_NAME`,
t1.`ALIAS_INCOMING_LOCAL`,
t1.`ALIAS_MODEL_ID`,
t1.`ALIAS_NAME`,
t1.`ALIAS_PARENT_MODEL_ID`,
t1.`ALIAS_PARENT_THREAD_ID`,
t1.`ALIAS_STATUS`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `mail_alias` t1 
LEFT JOIN `mail_alias_domain` t11 ON t1.`ALIAS_DOMAIN_ID` = t11.`ID` 


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