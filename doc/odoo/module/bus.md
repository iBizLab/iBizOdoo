# 总线(bus) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[事件总线(BUS_EVENT_BUS)](module/bus/bus_event_bus)|bus_event_bus|抽象实体|无存储||否|否|自控制|否||
|[总线事件记录(BUS_EVENT_RECORD)](module/bus/bus_event_record)|bus_event_record|主实体|SQL|T_BUS_EVENT_RECORD|否|否|自控制|否||

