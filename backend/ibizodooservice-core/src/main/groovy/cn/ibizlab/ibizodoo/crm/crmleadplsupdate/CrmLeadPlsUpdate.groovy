package cn.ibizlab.ibizodoo.crm.crmleadplsupdate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmleadplsupdate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_LEAD_PLS_UPDATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmLeadPlsUpdate extends GroovyDataEntityRuntime<CrmLeadPlsUpdate,CrmLeadPlsUpdateDTO,CrmLeadPlsUpdateFilterDTO> {

    private static CrmLeadPlsUpdate _instance
    void setInstance(CrmLeadPlsUpdate instance) {
        _instance = instance
    }
    static CrmLeadPlsUpdate getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmLeadPlsUpdateDTO create(CrmLeadPlsUpdateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmLeadPlsUpdateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmLeadPlsUpdateDTO update(CrmLeadPlsUpdateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmLeadPlsUpdateDTO.class)
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
    CrmLeadPlsUpdateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmLeadPlsUpdateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmLeadPlsUpdateDTO getDraft(CrmLeadPlsUpdateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmLeadPlsUpdateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmLeadPlsUpdateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmLeadPlsUpdateDTO save(CrmLeadPlsUpdateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmLeadPlsUpdateDTO.class)
    }

}