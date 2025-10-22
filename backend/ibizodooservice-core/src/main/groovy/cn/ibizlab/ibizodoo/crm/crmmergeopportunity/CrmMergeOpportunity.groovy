package cn.ibizlab.ibizodoo.crm.crmmergeopportunity

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmmergeopportunity.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_MERGE_OPPORTUNITY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmMergeOpportunity extends GroovyDataEntityRuntime<CrmMergeOpportunity,CrmMergeOpportunityDTO,CrmMergeOpportunityFilterDTO> {

    private static CrmMergeOpportunity _instance
    void setInstance(CrmMergeOpportunity instance) {
        _instance = instance
    }
    static CrmMergeOpportunity getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmMergeOpportunityDTO create(CrmMergeOpportunityDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmMergeOpportunityDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmMergeOpportunityDTO update(CrmMergeOpportunityDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmMergeOpportunityDTO.class)
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
    CrmMergeOpportunityDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmMergeOpportunityDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmMergeOpportunityDTO getDraft(CrmMergeOpportunityDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmMergeOpportunityDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmMergeOpportunityDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmMergeOpportunityDTO save(CrmMergeOpportunityDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmMergeOpportunityDTO.class)
    }

}