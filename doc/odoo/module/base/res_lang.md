# 语言(res_lang)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|语言环境代码|CODE|文本，可指定长度|500|否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|日期格式|DATE_FORMAT|文本，可指定长度|500|否||
|小数分隔符|DECIMAL_POINT|文本，可指定长度|500|否||
|方向|DIRECTION|[单项选择(文本值)](index/dictionary_index#res_lang_direction "方向")|60|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|旗帜图片网址|FLAG_IMAGE_URL|文本，可指定长度|500|是||
|分隔符格式|GROUPING|文本，可指定长度|500|否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|ISO 代码|ISO_CODE|文本，可指定长度|500|是||
|名称|NAME|文本，可指定长度|200|是||
|短时间格式|SHORT_TIME_FORMAT|文本，可指定长度|500|否||
|千位分隔符|THOUSANDS_SEP|文本，可指定长度|500|是||
|时间格式|TIME_FORMAT|文本，可指定长度|500|否||
|URL 代码|URL_CODE|文本，可指定长度|500|否||
|一周的第一天|WEEK_START|[单项选择(文本值)](index/dictionary_index#res_lang_week_start "一周的第一天")|60|否||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_CRM_LEAD_RES_LANG_LANG_ID](der/DER1N_CRM_LEAD_RES_LANG_LANG_ID)|[线索/商机(CRM_LEAD)](module/crm/crm_lead)|1:N关系||


</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_lang?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_lang?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_lang?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_lang?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>