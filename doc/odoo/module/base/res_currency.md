# 币别(res_currency)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|币别小组|CURRENCY_SUBUNIT_LABEL|文本，可指定长度|500|是||
|币别单位|CURRENCY_UNIT_LABEL|文本，可指定长度|500|是||
|日期|DATE|日期型||是||
|小数位数|DECIMAL_PLACES|整型||是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|显示舍入警告信息|DISPLAY_ROUNDING_WARNING|是否逻辑||是||
|会计所在国家/地区代码|FISCAL_COUNTRY_CODES|文本，可指定长度|500|是||
|名称|FULL_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|汇率|INVERSE_RATE|浮点||是||
|币别的数字代码。|ISO_NUMERIC|整型||是||
|是当前的公司币别|IS_CURRENT_COMPANY_CURRENCY|是否逻辑||是||
|名称|NAME|文本，可指定长度|200|是||
|符号位置|POSITION|[单项选择(文本值)](index/dictionary_index#res_currency_position "符号位置")|60|是||
|当前汇率|RATE|浮点||是||
|费率字符串|RATE_STRING|文本，可指定长度|500|是||
|四舍五入系数|ROUNDING|浮点||是||
|符号|SYMBOL|文本，可指定长度|500|否||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_EXPENSE_RES_CURRENCY_CURRENCY_ID](der/DER1N_HR_EXPENSE_RES_CURRENCY_CURRENCY_ID)|[费用(HR_EXPENSE)](module/hr/hr_expense)|1:N关系||
|[DER1N_HR_EXPENSE_SHEET_RES_CURRENCY_CURRENCY_ID](der/DER1N_HR_EXPENSE_SHEET_RES_CURRENCY_CURRENCY_ID)|[费用报表(HR_EXPENSE_SHEET)](module/hr/hr_expense_sheet)|1:N关系||
|[DER1N_HR_EXPENSE_SPLIT_RES_CURRENCY_CURRENCY_ID](der/DER1N_HR_EXPENSE_SPLIT_RES_CURRENCY_CURRENCY_ID)|[费用分摊(HR_EXPENSE_SPLIT)](module/hr/hr_expense_split)|1:N关系||
|[DER1N_MAIL_TRACKING_VALUE_RES_CURRENCY_CURRENCY_ID](der/DER1N_MAIL_TRACKING_VALUE_RES_CURRENCY_CURRENCY_ID)|[邮件跟踪值(MAIL_TRACKING_VALUE)](module/mail/mail_tracking_value)|1:N关系||
|[DER1N_RES_COMPANY_RES_CURRENCY_CURRENCY_ID](der/DER1N_RES_COMPANY_RES_CURRENCY_CURRENCY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_COUNTRY_RES_CURRENCY_CURRENCY_ID](der/DER1N_RES_COUNTRY_RES_CURRENCY_CURRENCY_ID)|[国家/地区(RES_COUNTRY)](module/base/res_country)|1:N关系||
|[DER1N_RES_CURRENCY_RATE_RES_CURRENCY_CURRENCY_ID](der/DER1N_RES_CURRENCY_RATE_RES_CURRENCY_CURRENCY_ID)|[汇率(RES_CURRENCY_RATE)](module/base/res_currency_rate)|1:N关系||
|[DER1N_RES_PARTNER_BANK_RES_CURRENCY_CURRENCY_ID](der/DER1N_RES_PARTNER_BANK_RES_CURRENCY_CURRENCY_ID)|[银行账号(RES_PARTNER_BANK)](module/base/res_partner_bank)|1:N关系||
|[DER1N_RES_PARTNER_RES_CURRENCY_PROPERTY_PURCHASE_CURRENCY_ID](der/DER1N_RES_PARTNER_RES_CURRENCY_PROPERTY_PURCHASE_CURRENCY_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||


</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/res_currency/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/res_currency/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/res_currency/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### res_currency_group_all :id=res_currency-res_currency_group_all

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_POSITION_EQ|符号位置|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_currency?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_currency?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_currency?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_currency?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_currency?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_currency?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_currency?id=搜索模式`">
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