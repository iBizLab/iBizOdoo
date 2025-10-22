package cn.ibizlab.ibizodoo.hr.hrleaveallocationgeneratemultiwizard

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrleaveallocationgeneratemultiwizard.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_LEAVE_ALLOCATION_GENERATE_MULTI_WIZARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrLeaveAllocationGenerateMultiWizard extends GroovyDataEntityRuntime<HrLeaveAllocationGenerateMultiWizard,HrLeaveAllocationGenerateMultiWizardDTO,HrLeaveAllocationGenerateMultiWizardFilterDTO> {

    private static HrLeaveAllocationGenerateMultiWizard _instance
    void setInstance(HrLeaveAllocationGenerateMultiWizard instance) {
        _instance = instance
    }
    static HrLeaveAllocationGenerateMultiWizard getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrLeaveAllocationGenerateMultiWizardDTO create(HrLeaveAllocationGenerateMultiWizardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrLeaveAllocationGenerateMultiWizardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrLeaveAllocationGenerateMultiWizardDTO update(HrLeaveAllocationGenerateMultiWizardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrLeaveAllocationGenerateMultiWizardDTO.class)
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
    HrLeaveAllocationGenerateMultiWizardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrLeaveAllocationGenerateMultiWizardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrLeaveAllocationGenerateMultiWizardDTO getDraft(HrLeaveAllocationGenerateMultiWizardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrLeaveAllocationGenerateMultiWizardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrLeaveAllocationGenerateMultiWizardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrLeaveAllocationGenerateMultiWizardDTO save(HrLeaveAllocationGenerateMultiWizardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrLeaveAllocationGenerateMultiWizardDTO.class)
    }

}