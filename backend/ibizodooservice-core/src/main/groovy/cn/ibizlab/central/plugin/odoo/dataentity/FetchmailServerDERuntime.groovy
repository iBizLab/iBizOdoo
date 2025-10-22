package cn.ibizlab.central.plugin.odoo.dataentity

import net.ibizsys.central.dataentity.DataEntityRuntime
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.annotation.DEAction
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import java.util.concurrent.ConcurrentHashMap;

public class FetchmailServerDERuntime extends OdooDataEntityRuntime {

    @DEAction("fetch_mail")
    protected Object doFetchMail(IEntityDTO iEntityDTO) throws Throwable {
        println "执行fetchmail...";
    }

}