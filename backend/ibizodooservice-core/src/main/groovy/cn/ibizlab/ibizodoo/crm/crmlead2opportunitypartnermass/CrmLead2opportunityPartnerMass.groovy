package cn.ibizlab.ibizodoo.crm.crmlead2opportunitypartnermass

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmlead2opportunitypartnermass.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_LEAD2OPPORTUNITY_PARTNER_MASS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmLead2opportunityPartnerMass extends GroovyDataEntityRuntime<CrmLead2opportunityPartnerMass,CrmLead2opportunityPartnerMassDTO,CrmLead2opportunityPartnerMassFilterDTO> {

    private static CrmLead2opportunityPartnerMass _instance
    void setInstance(CrmLead2opportunityPartnerMass instance) {
        _instance = instance
    }
    static CrmLead2opportunityPartnerMass getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmLead2opportunityPartnerMassDTO create(CrmLead2opportunityPartnerMassDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmLead2opportunityPartnerMassDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmLead2opportunityPartnerMassDTO update(CrmLead2opportunityPartnerMassDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmLead2opportunityPartnerMassDTO.class)
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
    CrmLead2opportunityPartnerMassDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmLead2opportunityPartnerMassDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmLead2opportunityPartnerMassDTO getDraft(CrmLead2opportunityPartnerMassDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmLead2opportunityPartnerMassDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmLead2opportunityPartnerMassDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmLead2opportunityPartnerMassDTO save(CrmLead2opportunityPartnerMassDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmLead2opportunityPartnerMassDTO.class)
    }

}