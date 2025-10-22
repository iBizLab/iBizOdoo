## 消息提醒(mail_message_notify) <!-- {docsify-ignore-all} -->



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

* `指定属性组`
*  **属性组：**[联系人标识](#)
  * `PARTNER_ID(相关的业务伙伴)`



### 查询条件

(`exists(select 1 from `mail_message` t2 where t1.	
res_model = t2.model and t2.id=#{ctx.webcontext.id})` AND `TYPE(关注类型)` EQ `'40'` AND `PARTNER_ID(相关的业务伙伴)` NOTEQ `用户上下文.srfpartnerid`)



### 查询连接
* **RES_PARTNER相关N:1（INNER JOIN）DER1N_MAIL_FOLLOWERS_RES_PARTNER_PARTNER_ID**<br>
连接关系：[DER1N_MAIL_FOLLOWERS_RES_PARTNER_PARTNER_ID](der/DER1N_MAIL_FOLLOWERS_RES_PARTNER_PARTNER_ID)<br>
连接实体：[联系人](module/base/res_partner)<br>
    * **RES_USERS左外联接 1:NDER1N_RES_USERS_RES_PARTNER_PARTNER_ID**<br>
连接关系：[DER1N_RES_USERS_RES_PARTNER_PARTNER_ID](der/DER1N_RES_USERS_RES_PARTNER_PARTNER_ID)<br>
连接实体：[联系人](module/base/res_partner)<br>
连接条件：(`ID(标识)` ISNOTNULL)<br>




<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ID`,
t1.`PARTNER_ID`,
t21.`ID` AS `USER_ID`
FROM `mail_followers` t1 
LEFT JOIN `res_partner` t11 ON t1.`PARTNER_ID` = t11.`ID` 
LEFT OUTER JOIN `res_users` t21 ON t11.`ID` = t21.`PARTNER_ID` 

WHERE ( t21.`ID` IS NOT NULL ) AND ( exists(select 1 from `mail_message` t2 where t1.	
res_model = t2.model and t2.id=#{ctx.webcontext.id})  AND  t1.`TYPE` = '40'  AND  t1.`PARTNER_ID` <> #{ctx.sessioncontext.srfpartnerid} )
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