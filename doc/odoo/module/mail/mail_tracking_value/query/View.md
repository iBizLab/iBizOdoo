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
> `FIELD_INFO(属性信息)`
>
> `NEW_VALUE_TEXT(新文本值)`
>
> `OLD_VALUE_TEXT(旧文本值)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`CURRENCY_ID`,
t1.`FIELD_ID`,
t1.`FIELD_INFO`,
t1.`ID`,
t1.`MAIL_MESSAGE_ID`,
t11.`MODEL`,
t1.`NEW_VALUE_CHAR`,
t1.`NEW_VALUE_DATETIME`,
t1.`NEW_VALUE_FLOAT`,
t1.`NEW_VALUE_INTEGER`,
t1.`NEW_VALUE_TEXT`,
t1.`OLD_VALUE_CHAR`,
t1.`OLD_VALUE_DATETIME`,
t1.`OLD_VALUE_FLOAT`,
t1.`OLD_VALUE_INTEGER`,
t1.`OLD_VALUE_TEXT`,
t11.`RES_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `mail_tracking_value` t1 
LEFT JOIN `mail_message` t11 ON t1.`MAIL_MESSAGE_ID` = t11.`ID` 


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