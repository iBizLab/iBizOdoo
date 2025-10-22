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