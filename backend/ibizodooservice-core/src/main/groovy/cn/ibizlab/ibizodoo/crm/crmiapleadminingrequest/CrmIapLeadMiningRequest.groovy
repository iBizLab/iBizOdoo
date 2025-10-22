package cn.ibizlab.ibizodoo.crm.crmiapleadminingrequest

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmiapleadminingrequest.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_IAP_LEAD_MINING_REQUEST]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmIapLeadMiningRequest extends GroovyDataEntityRuntime<CrmIapLeadMiningRequest,CrmIapLeadMiningRequestDTO,CrmIapLeadMiningRequestFilterDTO> {

    private static CrmIapLeadMiningRequest _instance
    void setInstance(CrmIapLeadMiningRequest instance) {
        _instance = instance
    }
    static CrmIapLeadMiningRequest getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmIapLeadMiningRequestDTO create(CrmIapLeadMiningRequestDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmIapLeadMiningRequestDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmIapLeadMiningRequestDTO update(CrmIapLeadMiningRequestDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmIapLeadMiningRequestDTO.class)
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
    CrmIapLeadMiningRequestDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmIapLeadMiningRequestDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmIapLeadMiningRequestDTO getDraft(CrmIapLeadMiningRequestDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmIapLeadMiningRequestDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmIapLeadMiningRequestDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmIapLeadMiningRequestDTO save(CrmIapLeadMiningRequestDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmIapLeadMiningRequestDTO.class)
    }

}