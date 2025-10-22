# 合作伙伴自动完成同步(res_partner_autocomplete_sync)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|合作伙伴|PARTNER_ID|外键值|100|是||
|是同步的|SYNCHED|是否逻辑||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RES_PARTNER_AUTOCOMPLETE_SYNC_RES_PARTNER_PARTNER_ID](der/DER1N_RES_PARTNER_AUTOCOMPLETE_SYNC_RES_PARTNER_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||

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
|N_PARTNER_ID_EQ|合作伙伴|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_partner_autocomplete_sync?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner_autocomplete_sync?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner_autocomplete_sync?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner_autocomplete_sync?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'minor',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>