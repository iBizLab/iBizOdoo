```sql
SELECT
t1.`CALL_AT`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t11.`CRON_NAME` AS `CRON_CRON_NAME`,
t1.`CRON_ID`,
t1.`ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_cron_trigger` t1 
LEFT JOIN `ir_cron` t11 ON t1.`CRON_ID` = t11.`ID` 


```