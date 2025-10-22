package cn.ibizlab.ibizodoo.hr.hrexpensesplitwizard

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrexpensesplitwizard.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EXPENSE_SPLIT_WIZARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrExpenseSplitWizard extends GroovyDataEntityRuntime<HrExpenseSplitWizard,HrExpenseSplitWizardDTO,HrExpenseSplitWizardFilterDTO> {

    private static HrExpenseSplitWizard _instance
    void setInstance(HrExpenseSplitWizard instance) {
        _instance = instance
    }
    static HrExpenseSplitWizard getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrExpenseSplitWizardDTO create(HrExpenseSplitWizardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrExpenseSplitWizardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrExpenseSplitWizardDTO update(HrExpenseSplitWizardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrExpenseSplitWizardDTO.class)
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
    HrExpenseSplitWizardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrExpenseSplitWizardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrExpenseSplitWizardDTO getDraft(HrExpenseSplitWizardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrExpenseSplitWizardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrExpenseSplitWizardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrExpenseSplitWizardDTO save(HrExpenseSplitWizardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrExpenseSplitWizardDTO.class)
    }

}