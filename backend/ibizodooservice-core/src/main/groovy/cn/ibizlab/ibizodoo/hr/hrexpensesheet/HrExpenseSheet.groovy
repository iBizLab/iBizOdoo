package cn.ibizlab.ibizodoo.hr.hrexpensesheet

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrexpensesheet.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EXPENSE_SHEET]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrExpenseSheet extends GroovyDataEntityRuntime<HrExpenseSheet,HrExpenseSheetDTO,HrExpenseSheetFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrExpenseSheet _instance
    void setInstance(HrExpenseSheet instance) {
        _instance = instance
    }
    static HrExpenseSheet getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrExpenseSheetDTO create(HrExpenseSheetDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrExpenseSheetDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrExpenseSheetDTO update(HrExpenseSheetDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrExpenseSheetDTO.class)
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
    HrExpenseSheetDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrExpenseSheetDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrExpenseSheetDTO getDraft(HrExpenseSheetDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrExpenseSheetDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrExpenseSheetDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrExpenseSheetDTO save(HrExpenseSheetDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrExpenseSheetDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrExpenseSheetDTO> fetchDefault(HrExpenseSheetFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrExpenseSheetDTO.class)
    }

}