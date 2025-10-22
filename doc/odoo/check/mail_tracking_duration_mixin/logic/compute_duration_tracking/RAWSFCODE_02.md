<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
// 获取默认参数对象
def _default = logic.param("Default").getReal()
def resultList = logic.param("resultList").getReal()
def tracking_field = logic.param("tracking_field").getReal()
def durationMap = [:]
def trackValueList = []
trackValueList.addAll(resultList)
 // 添加当前值的“假”跟踪记录
 if(_default.get(tracking_field)){
    trackValueList.add([
        create_date: net.ibizsys.runtime.util.DateUtils.getCurTime(),
        old_value_char: _default.get(tracking_field)
    ])
}
def previousDate = _default.get("create_date").toLocalDateTime()
// 计算每个阶段的持续时间
trackValueList.each { tracking ->
    def oldId = tracking.old_value_char
    def createDate = tracking.create_date.toLocalDateTime()

    long duration = java.time.temporal.ChronoUnit.SECONDS.between(previousDate, createDate)
    durationMap.putIfAbsent(oldId, 0L)
    durationMap[oldId] += duration

    previousDate = createDate
}
_default.set("duration_tracking",durationMap)

```
