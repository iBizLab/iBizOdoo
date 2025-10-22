<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def installedModules = logic.param('installed_modules').getReal();
def accessModules = logic.param('access_modules').getReal();

def accessManager = sys.getSystemAccessManager();
def currentUser = sys.user();

accessModules = installedModules?.findAll { module ->
    def resCode = module?.get("res_code")
    resCode == null || accessManager.testSysUniRes(currentUser, resCode)
} ?: []
```
