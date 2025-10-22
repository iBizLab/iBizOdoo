package cn.ibizlab.ibizodoo.crm.crmleadscoringfrequency

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmleadscoringfrequency.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_LEAD_SCORING_FREQUENCY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmLeadScoringFrequency extends GroovyDataEntityRuntime<CrmLeadScoringFrequency,CrmLeadScoringFrequencyDTO,CrmLeadScoringFrequencyFilterDTO> {

    private static CrmLeadScoringFrequency _instance
    void setInstance(CrmLeadScoringFrequency instance) {
        _instance = instance
    }
    static CrmLeadScoringFrequency getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmLeadScoringFrequencyDTO create(CrmLeadScoringFrequencyDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmLeadScoringFrequencyDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmLeadScoringFrequencyDTO update(CrmLeadScoringFrequencyDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmLeadScoringFrequencyDTO.class)
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
    CrmLeadScoringFrequencyDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmLeadScoringFrequencyDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmLeadScoringFrequencyDTO getDraft(CrmLeadScoringFrequencyDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmLeadScoringFrequencyDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmLeadScoringFrequencyDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmLeadScoringFrequencyDTO save(CrmLeadScoringFrequencyDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmLeadScoringFrequencyDTO.class)
    }

}