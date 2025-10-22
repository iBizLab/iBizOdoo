package cn.ibizlab.ibizodoo.crm.crmleadlost

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmleadlost.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_LEAD_LOST]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmLeadLost extends GroovyDataEntityRuntime<CrmLeadLost,CrmLeadLostDTO,CrmLeadLostFilterDTO> {

    private static CrmLeadLost _instance
    void setInstance(CrmLeadLost instance) {
        _instance = instance
    }
    static CrmLeadLost getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmLeadLostDTO create(CrmLeadLostDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmLeadLostDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmLeadLostDTO update(CrmLeadLostDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmLeadLostDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    CrmLeadLostDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmLeadLostDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmLeadLostDTO getDraft(CrmLeadLostDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmLeadLostDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmLeadLostDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmLeadLostDTO save(CrmLeadLostDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmLeadLostDTO.class)
    }

}