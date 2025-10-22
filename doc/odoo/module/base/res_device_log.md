# 设备记录(res_device_log)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|浏览器|BROWSER|文本，可指定长度|500|是||
|城市|CITY|文本，可指定长度|500|是||
|国家/地区|COUNTRY|文本，可指定长度|500|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|设备类型|DEVICE_TYPE|[单项选择(文本值)](index/dictionary_index#res_device_log_device_type "设备类型")|60|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|首次活动|FIRST_ACTIVITY|日期时间型||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|IP地址|IP_ADDRESS|文本，可指定长度|500|是||
|当前设备|IS_CURRENT|是否逻辑||是||
|上个活动|LAST_ACTIVITY|日期时间型||是||
|已连接的 IP 地址|LINKED_IP_ADDRESSES|长文本，没有长度限制|1048576|是||
|平台|PLATFORM|文本，可指定长度|500|是||
|已撤销|REVOKED|是否逻辑||是||
|会话标识符|SESSION_IDENTIFIER|文本，可指定长度|500|否||
|用户|USER_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RES_DEVICE_LOG_RES_USERS_USER_ID](der/DER1N_RES_DEVICE_LOG_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|N_USER_ID_EQ|用户|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_device_log?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_device_log?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_device_log?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_device_log?id=搜索模式`">
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