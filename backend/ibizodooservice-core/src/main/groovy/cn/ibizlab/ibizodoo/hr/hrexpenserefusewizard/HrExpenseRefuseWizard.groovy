package cn.ibizlab.ibizodoo.hr.hrexpenserefusewizard

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrexpenserefusewizard.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EXPENSE_REFUSE_WIZARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrExpenseRefuseWizard extends GroovyDataEntityRuntime<HrExpenseRefuseWizard,HrExpenseRefuseWizardDTO,HrExpenseRefuseWizardFilterDTO> {

    private static HrExpenseRefuseWizard _instance
    void setInstance(HrExpenseRefuseWizard instance) {
        _instance = instance
    }
    static HrExpenseRefuseWizard getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrExpenseRefuseWizardDTO create(HrExpenseRefuseWizardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrExpenseRefuseWizardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrExpenseRefuseWizardDTO update(HrExpenseRefuseWizardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrExpenseRefuseWizardDTO.class)
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
    HrExpenseRefuseWizardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrExpenseRefuseWizardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrExpenseRefuseWizardDTO getDraft(HrExpenseRefuseWizardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrExpenseRefuseWizardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrExpenseRefuseWizardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrExpenseRefuseWizardDTO save(HrExpenseRefuseWizardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrExpenseRefuseWizardDTO.class)
    }

}