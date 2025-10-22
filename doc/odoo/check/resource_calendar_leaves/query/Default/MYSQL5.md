```sql
SELECT
t1.`CALENDAR_ID`,
t11.`NAME` AS `CALENDAR_NAME`,
t1.`COMPANY_ID`,
t31.`NAME` AS `COMPANY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`HOLIDAY_ID`,
t41.`NAME` AS `HOLNAMEAY_NAME`,
t1.`ID`,
t1.`NAME`,
t1.`RESOURCE_ID`,
t21.`NAME` AS `RESOURCE_NAME`,
t1.`TIME_TYPE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `resource_calendar_leaves` t1 
LEFT JOIN `resource_calendar` t11 ON t1.`CALENDAR_ID` = t11.`ID` 
LEFT JOIN `resource_resource` t21 ON t1.`RESOURCE_ID` = t21.`ID` 
LEFT JOIN `res_company` t31 ON t1.`COMPANY_ID` = t31.`ID` 
LEFT JOIN `hr_leave` t41 ON t1.`HOLIDAY_ID` = t41.`ID` 


```