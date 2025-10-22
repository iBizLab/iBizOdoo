package cn.ibizlab.ibizodoo.crm.crmiapleadindustry

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmiapleadindustry.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_IAP_LEAD_INDUSTRY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmIapLeadIndustry extends GroovyDataEntityRuntime<CrmIapLeadIndustry,CrmIapLeadIndustryDTO,CrmIapLeadIndustryFilterDTO> {

    private static CrmIapLeadIndustry _instance
    void setInstance(CrmIapLeadIndustry instance) {
        _instance = instance
    }
    static CrmIapLeadIndustry getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmIapLeadIndustryDTO create(CrmIapLeadIndustryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmIapLeadIndustryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmIapLeadIndustryDTO update(CrmIapLeadIndustryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmIapLeadIndustryDTO.class)
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
    CrmIapLeadIndustryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmIapLeadIndustryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmIapLeadIndustryDTO getDraft(CrmIapLeadIndustryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmIapLeadIndustryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmIapLeadIndustryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmIapLeadIndustryDTO save(CrmIapLeadIndustryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmIapLeadIndustryDTO.class)
    }

}