## 频道可邀请的联系人(channel_invite) <!-- {docsify-ignore-all} -->



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

* `默认（全部查询列）`




### 查询连接
* **DISCUSS_CHANNEL_MEMBER不存在1:N（NOT EXISTS (SELECT)）DER1N_DISCUSS_CHANNEL_MEMBER_RES_PARTNER_PARTNER_ID_A391AF**<br>
连接关系：[DER1N_DISCUSS_CHANNEL_MEMBER_RES_PARTNER_PARTNER_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_RES_PARTNER_PARTNER_ID)<br>
连接实体：[联系人](module/base/res_partner)<br>
连接条件：(`CHANNEL_ID(频道)` EQ `数据上下文.channel_id`)<br>




<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTIVE`,
t1.`ADDITIONAL_INFO`,
t1.`AUTOPOST_BILLS`,
t1.`BARCODE`,
t1.`BUYER_ID`,
t1.`CALENDAR_LAST_NOTIF_ACK`,
t1.`CITY`,
t1.`COLOR`,
t1.`COMMERCIAL_COMPANY_NAME`,
t1.`COMMERCIAL_PARTNER_ID`,
t1.`COMPANY_ID`,
t1.`COMPANY_NAME`,
t1.`COMPANY_REGISTRY`,
t1.`COMPLETE_NAME`,
t1.`COUNTRY_ID`,
t31.`NAME` AS `COUNTRY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`CREDIT_LIMIT`,
t1.`CUSTOMER_RANK`,
t1.`DEBIT_LIMIT`,
t1.`EMAIL`,
t1.`EMAIL_NORMALIZED`,
t1.`EMPLOYEE`,
t1.`FUNCTION`,
t1.`ID`,
t1.`IGNORE_ABNORMAL_INVOICE_AMOUNT`,
t1.`IGNORE_ABNORMAL_INVOICE_DATE`,
t1.`INDUSTRY_ID`,
t1.`INVOICE_EDI_FORMAT_STORE`,
t1.`INVOICE_SENDING_METHOD`,
t1.`INVOICE_WARN`,
t1.`IS_COMPANY`,
t1.`MESSAGE_BOUNCE`,
t1.`MOBILE`,
t1.`NAME`,
t1.`PARENT_ID`,
t11.`NAME` AS `PARENT_NAME`,
t1.`PARTNER_GID`,
t1.`PARTNER_LATITUDE`,
t1.`PARTNER_LONGITUDE`,
t1.`PARTNER_SHARE`,
t1.`PEPPOL_EAS`,
t1.`PEPPOL_ENDPOINT`,
t1.`PHONE`,
t1.`PHONE_SANITIZED`,
t1.`PICKING_WARN`,
t1.`PLAN_TO_CHANGE_BIKE`,
t1.`PLAN_TO_CHANGE_CAR`,
t1.`PROPERTY_PURCHASE_CURRENCY_ID`,
t1.`PURCHASE_WARN`,
t1.`RECEIPT_REMINDER_EMAIL`,
t1.`REF`,
t1.`REMINDER_DATE_BEFORE_RECEIPT`,
t1.`SALE_WARN`,
t1.`SIGNUP_TYPE`,
t1.`STATE_ID`,
t21.`NAME` AS `STATE_NAME`,
t1.`STREET`,
t1.`STREET2`,
t1.`SUPPLIER_RANK`,
t1.`TRUST`,
t1.`TYPE`,
t1.`TZ`,
t1.`USER_ID`,
t51.`NAME` AS `USER_NAME`,
t1.`VAT`,
t1.`WEBSITE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`,
t1.`ZIP`
FROM `res_partner` t1 
LEFT JOIN `res_partner` t11 ON t1.`PARENT_ID` = t11.`ID` 
LEFT JOIN `res_country_state` t21 ON t1.`STATE_ID` = t21.`ID` 
LEFT JOIN `res_country` t31 ON t1.`COUNTRY_ID` = t31.`ID` 
LEFT JOIN `res_users` t41 ON t1.`USER_ID` = t41.`ID` 
LEFT JOIN `res_partner` t51 ON t41.`PARTNER_ID` = t51.`ID` 

WHERE NOT(EXISTS(SELECT * FROM `discuss_channel_member` t61 
 WHERE 
 t1.`ID` = t61.`PARTNER_ID`  AND  ( t61.`CHANNEL_ID` = #{ctx.datacontext.channel_id} ) ))
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