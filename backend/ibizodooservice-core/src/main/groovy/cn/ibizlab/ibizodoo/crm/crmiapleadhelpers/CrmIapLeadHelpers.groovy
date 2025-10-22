package cn.ibizlab.ibizodoo.crm.crmiapleadhelpers

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmiapleadhelpers.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_IAP_LEAD_HELPERS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmIapLeadHelpers extends GroovyDataEntityRuntime<CrmIapLeadHelpers,CrmIapLeadHelpersDTO,CrmIapLeadHelpersFilterDTO> {

    private static CrmIapLeadHelpers _instance
    void setInstance(CrmIapLeadHelpers instance) {
        _instance = instance
    }
    static CrmIapLeadHelpers getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmIapLeadHelpersDTO create(CrmIapLeadHelpersDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmIapLeadHelpersDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmIapLeadHelpersDTO update(CrmIapLeadHelpersDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmIapLeadHelpersDTO.class)
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
    CrmIapLeadHelpersDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmIapLeadHelpersDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmIapLeadHelpersDTO getDraft(CrmIapLeadHelpersDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmIapLeadHelpersDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmIapLeadHelpersDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmIapLeadHelpersDTO save(CrmIapLeadHelpersDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmIapLeadHelpersDTO.class)
    }

}