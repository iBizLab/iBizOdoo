## 已安装应用(installed_app) <!-- {docsify-ignore-all} -->



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



### 查询条件

(`STATE(状态)` EQ `'installed'` AND `APPLICATION(应用)` EQ `'1'`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`APPLICATION`,
t1.`APP_ID`,
t1.`AUTHOR`,
t1.`AUTO_INSTALL`,
t1.`CATEGORY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEMO`,
t1.`DISPLAY_NAME`,
t1.`ICON`,
t1.`ID`,
t1.`IMPORTED`,
t1.`LATEST_VERSION`,
t1.`LICENSE`,
t1.`MAINTAINER`,
t1.`MODULE_TYPE`,
t1.`NAME`,
t1.`ORDER`,
t1.`PUBLISHED_VERSION`,
t1.`RES_CODE`,
t1.`SEQUENCE`,
t1.`SHORTDESC`,
t1.`STATE`,
t1.`SUMMARY`,
t1.`TO_BUY`,
t1.`URL`,
t1.`WEBSITE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_module_module` t1 

WHERE ( t1.`STATE` = 'installed'  AND  t1.`APPLICATION` = 1 )
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