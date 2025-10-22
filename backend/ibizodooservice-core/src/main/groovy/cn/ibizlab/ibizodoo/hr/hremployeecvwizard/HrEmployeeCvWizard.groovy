package cn.ibizlab.ibizodoo.hr.hremployeecvwizard

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hremployeecvwizard.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EMPLOYEE_CV_WIZARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrEmployeeCvWizard extends GroovyDataEntityRuntime<HrEmployeeCvWizard,HrEmployeeCvWizardDTO,HrEmployeeCvWizardFilterDTO> {

    private static HrEmployeeCvWizard _instance
    void setInstance(HrEmployeeCvWizard instance) {
        _instance = instance
    }
    static HrEmployeeCvWizard getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrEmployeeCvWizardDTO create(HrEmployeeCvWizardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrEmployeeCvWizardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrEmployeeCvWizardDTO update(HrEmployeeCvWizardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrEmployeeCvWizardDTO.class)
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
    HrEmployeeCvWizardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrEmployeeCvWizardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrEmployeeCvWizardDTO getDraft(HrEmployeeCvWizardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrEmployeeCvWizardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrEmployeeCvWizardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrEmployeeCvWizardDTO save(HrEmployeeCvWizardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrEmployeeCvWizardDTO.class)
    }

}