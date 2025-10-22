package cn.ibizlab.ibizodoo.crm.crmiapleadseniority

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmiapleadseniority.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_IAP_LEAD_SENIORITY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmIapLeadSeniority extends GroovyDataEntityRuntime<CrmIapLeadSeniority,CrmIapLeadSeniorityDTO,CrmIapLeadSeniorityFilterDTO> {

    private static CrmIapLeadSeniority _instance
    void setInstance(CrmIapLeadSeniority instance) {
        _instance = instance
    }
    static CrmIapLeadSeniority getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmIapLeadSeniorityDTO create(CrmIapLeadSeniorityDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmIapLeadSeniorityDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmIapLeadSeniorityDTO update(CrmIapLeadSeniorityDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmIapLeadSeniorityDTO.class)
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
    CrmIapLeadSeniorityDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmIapLeadSeniorityDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmIapLeadSeniorityDTO getDraft(CrmIapLeadSeniorityDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmIapLeadSeniorityDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmIapLeadSeniorityDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmIapLeadSeniorityDTO save(CrmIapLeadSeniorityDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmIapLeadSeniorityDTO.class)
    }

}