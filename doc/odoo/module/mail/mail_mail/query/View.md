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
> `BODY_HTML(文本内容)`
>
> `EMAIL_TO(至)`
>
> `FAILURE_REASON(失败原因)`
>
> `HEADERS(请求头)`
>
> `REFERENCES(参考)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`AUTO_DELETE`,
t1.`BODY_HTML`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EMAIL_CC`,
t1.`EMAIL_TO`,
t1.`FAILURE_REASON`,
t1.`FAILURE_TYPE`,
t1.`HEADERS`,
t1.`ID`,
t1.`IS_NOTIFICATION`,
t1.`MAIL_MESSAGE_ID`,
t1.`REFERENCES`,
t1.`SCHEDULED_DATE`,
t1.`STATE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `mail_mail` t1 


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