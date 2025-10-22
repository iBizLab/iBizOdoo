package cn.ibizlab.ibizodoo.hr.hrleavegeneratemultiwizard

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrleavegeneratemultiwizard.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_LEAVE_GENERATE_MULTI_WIZARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrLeaveGenerateMultiWizard extends GroovyDataEntityRuntime<HrLeaveGenerateMultiWizard,HrLeaveGenerateMultiWizardDTO,HrLeaveGenerateMultiWizardFilterDTO> {

    private static HrLeaveGenerateMultiWizard _instance
    void setInstance(HrLeaveGenerateMultiWizard instance) {
        _instance = instance
    }
    static HrLeaveGenerateMultiWizard getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrLeaveGenerateMultiWizardDTO create(HrLeaveGenerateMultiWizardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrLeaveGenerateMultiWizardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrLeaveGenerateMultiWizardDTO update(HrLeaveGenerateMultiWizardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrLeaveGenerateMultiWizardDTO.class)
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
    HrLeaveGenerateMultiWizardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrLeaveGenerateMultiWizardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrLeaveGenerateMultiWizardDTO getDraft(HrLeaveGenerateMultiWizardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrLeaveGenerateMultiWizardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrLeaveGenerateMultiWizardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrLeaveGenerateMultiWizardDTO save(HrLeaveGenerateMultiWizardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrLeaveGenerateMultiWizardDTO.class)
    }

}