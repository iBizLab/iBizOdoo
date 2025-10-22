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
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`CURRENCY_ID`,
t1.`DATE`,
t1.`EMPLOYEE_ID`,
t1.`ID`,
t1.`MESSAGE_MAIN_ATTACHMENT_ID`,
t1.`NAME`,
t1.`PAYMENT_MODE`,
t1.`PRICE_UNIT`,
t1.`QUANTITY`,
t1.`SHEET_ID`,
t1.`STATE`,
t1.`TAX_AMOUNT`,
t1.`TAX_AMOUNT_CURRENCY`,
t1.`TOTAL_AMOUNT`,
t1.`TOTAL_AMOUNT_CURRENCY`,
t1.`UNTAXED_AMOUNT_CURRENCY`,
t1.`VENDOR_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_expense` t1 


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