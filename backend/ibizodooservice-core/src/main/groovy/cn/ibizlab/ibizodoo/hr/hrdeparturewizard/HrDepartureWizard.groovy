package cn.ibizlab.ibizodoo.hr.hrdeparturewizard

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrdeparturewizard.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_DEPARTURE_WIZARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrDepartureWizard extends GroovyDataEntityRuntime<HrDepartureWizard,HrDepartureWizardDTO,HrDepartureWizardFilterDTO> {

    private static HrDepartureWizard _instance
    void setInstance(HrDepartureWizard instance) {
        _instance = instance
    }
    static HrDepartureWizard getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrDepartureWizardDTO create(HrDepartureWizardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrDepartureWizardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrDepartureWizardDTO update(HrDepartureWizardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrDepartureWizardDTO.class)
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
    HrDepartureWizardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrDepartureWizardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrDepartureWizardDTO getDraft(HrDepartureWizardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrDepartureWizardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrDepartureWizardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrDepartureWizardDTO save(HrDepartureWizardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrDepartureWizardDTO.class)
    }

}