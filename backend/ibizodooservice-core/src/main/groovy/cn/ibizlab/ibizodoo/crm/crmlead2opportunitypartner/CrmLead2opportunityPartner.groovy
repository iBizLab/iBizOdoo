package cn.ibizlab.ibizodoo.crm.crmlead2opportunitypartner

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmlead2opportunitypartner.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_LEAD2OPPORTUNITY_PARTNER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmLead2opportunityPartner extends GroovyDataEntityRuntime<CrmLead2opportunityPartner,CrmLead2opportunityPartnerDTO,CrmLead2opportunityPartnerFilterDTO> {

    private static CrmLead2opportunityPartner _instance
    void setInstance(CrmLead2opportunityPartner instance) {
        _instance = instance
    }
    static CrmLead2opportunityPartner getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmLead2opportunityPartnerDTO create(CrmLead2opportunityPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmLead2opportunityPartnerDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmLead2opportunityPartnerDTO update(CrmLead2opportunityPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmLead2opportunityPartnerDTO.class)
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
    CrmLead2opportunityPartnerDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmLead2opportunityPartnerDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmLead2opportunityPartnerDTO getDraft(CrmLead2opportunityPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmLead2opportunityPartnerDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmLead2opportunityPartnerDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmLead2opportunityPartnerDTO save(CrmLead2opportunityPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmLead2opportunityPartnerDTO.class)
    }

}