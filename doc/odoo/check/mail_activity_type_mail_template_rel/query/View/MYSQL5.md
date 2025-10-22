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