# 实体处理逻辑(PSDELogic)  <!-- {docsify-ignore-all} -->


实体处理逻辑


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|扩展状态|APPLYFLAG|[单项选择(数值)](index/dictionary_index#extension_status "扩展状态")||是||
|附加到指定行为|ATTACHTOPSDEACTIONID|文本，可指定长度|100|是||
|附加到指定行为|ATTACHTOPSDEACTIONNAME|文本，可指定长度|100|是||
|附加到指定数据集|ATTACHTOPSDEDATASETID|文本，可指定长度|100|是||
|附加到指定数据集|ATTACHTOPSDEDATASETNAME|文本，可指定长度|100|是||
|代码标识|CODENAME|文本，可指定长度|60|是||
|建立时间|CREATEDATE|日期时间型|8|否||
|建立人|CREATEMAN|文本，可指定长度|60|否||
|建立时间|CREATE_TIME|日期时间型||是||
|扩展模型|DYNAMODELFLAG|是否逻辑||是||
|事件模型|EVENTMODEL|长文本，没有长度限制|1048576|是||
|监控事件|EVENTS|[多项选择(文本值)](index/dictionary_index#enable_action "可供选择的触发器")|500|是||
|扩展标记|EXTENSION_TAG|文本，可指定长度|200|是||
|扩展标记2|EXTENSION_TAG2|文本，可指定长度|200|是||
|扩展标记3|EXTENSION_TAG3|文本，可指定长度|200|是||
|扩展标记4|EXTENSION_TAG4|文本，可指定长度|200|是||
|失败率|FAILURE_PER|数值||是||
|失败率|FAILURE_RATE|数值||是||
|忽略异常|IGNOREEXCEPTION|是否逻辑||是||
|最后运行时间|LAST_START_AT|日期时间型||是||
|最后运行状态|LAST_STATE|[单项选择(文本值)](index/dictionary_index#log_state "日志状态")|200|是||
|逻辑子类|LOGICSUBTYPE|[单项选择(文本值)](index/dictionary_index#DELogicSubType "逻辑子类")|30|否||
|逻辑标记|LOGICTAG|文本，可指定长度|60|是||
|逻辑标记2|LOGICTAG2|文本，可指定长度|60|是||
|逻辑标记3|LOGICTAG3|文本，可指定长度|60|是||
|逻辑标记4|LOGICTAG4|文本，可指定长度|60|是||
|逻辑类型|LOGICTYPE|文本，可指定长度|50|是||
|备注|MEMO|长文本，长度1000|2000|是||
|附加次序|ORDERVALUE|整型||是||
|实体|PSDEID|文本，可指定长度|100|否||
|实体处理逻辑标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|PSDELOGICID|全局唯一标识，文本类型，用户不可见|100|否||
|规则名称|PSDELOGICNAME|文本，可指定长度|200|否||
|逻辑参数|PSDELOGICPARAMS|一对多动态对象|1048576|是||
|实体|PSDENAME|文本，可指定长度|100|是||
|成功率|SUCCESS_PER|数值||是||
|成功率|SUCCESS_RATE|数值||是||
|线程模式|THREADMODE|文本，可指定长度|100|是||
|定时触发策略|TIMERPOLICY|文本，可指定长度|100|是||
|更新时间|UPDATEDATE|日期时间型|8|否||
|更新人|UPDATEMAN|文本，可指定长度|60|否||
|更新时间|UPDATE_TIME|日期时间型||是||
|用户标记|USERTAG|文本，可指定长度|200|是||
|用户标记2|USERTAG2|文本，可指定长度|200|是||
|用户标记3|USERTAG3|文本，可指定长度|50|是||
|用户标记4|USERTAG4|文本，可指定长度|50|是||
|启用|VALIDFLAG|是否逻辑||是||
|WebHook地址|WEBHOOKURL|长文本，没有长度限制|1048576|是||


## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|CreateTemp|CreateTemp|内置方法|默认|不支持||||
|CreateTempMajor|CreateTempMajor|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|GetDraftTemp|GetDraftTemp|内置方法|默认|不支持||||
|GetDraftTempMajor|GetDraftTempMajor|内置方法|默认|不支持||||
|GetTemp|GetTemp|内置方法|默认|不支持||||
|GetTempMajor|GetTempMajor|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|RemoveTemp|RemoveTemp|内置方法|默认|支持||||
|RemoveTempMajor|RemoveTempMajor|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|UpdateTemp|UpdateTemp|内置方法|默认|不支持||||
|UpdateTempMajor|UpdateTempMajor|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/extension/PSDELogic/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/extension/PSDELogic/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/extension/PSDELogic/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_APPLYFLAG_EQ|扩展状态|EQ||
|N_LAST_STATE_EQ|最后运行状态|EQ||
|N_LOGICSUBTYPE_EQ|逻辑子类|EQ||
|N_PSDELOGICID_EQ|实体处理逻辑标识|EQ||
|N_PSDELOGICNAME_LIKE|规则名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/extension/PSDELogic?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/extension/PSDELogic?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/extension/PSDELogic?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/extension/PSDELogic?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/extension/PSDELogic?id=搜索模式`">
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