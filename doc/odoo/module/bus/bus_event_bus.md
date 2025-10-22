# 事件总线(bus_event_bus)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||


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
|发布事件|publish_event|用户自定义|默认|不支持|||手动推送事件|
|监听事件|recive_event|用户自定义|默认|不支持|||订阅事件后自动触发该壳方法，业务系统配置执行后附加可以执行事件逻辑|

## 功能配置
| 中文名col200    | 功能类型col150    | 功能实体col200 |  备注col700|
| --------  | :----:    | ---- |----- |
|消息总线|用户自定义|[总线事件记录(BUS_EVENT_RECORD)](module/bus/bus_event_record)|类似审计|

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/bus/bus_event_bus/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/bus/bus_event_bus/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/bus/bus_event_bus/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/bus/bus_event_bus?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/bus/bus_event_bus?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/bus/bus_event_bus?id=功能配置`">
  功能配置
</el-anchor-link>
<el-anchor-link :href="`#/module/bus/bus_event_bus?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/bus/bus_event_bus?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/bus/bus_event_bus?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {



      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>