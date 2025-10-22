package cn.ibizlab.ibizodoo.hr.hrpayrollstructuretype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrpayrollstructuretype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_PAYROLL_STRUCTURE_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrPayrollStructureType extends GroovyDataEntityRuntime<HrPayrollStructureType,HrPayrollStructureTypeDTO,HrPayrollStructureTypeFilterDTO> {

    private static HrPayrollStructureType _instance
    void setInstance(HrPayrollStructureType instance) {
        _instance = instance
    }
    static HrPayrollStructureType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrPayrollStructureTypeDTO create(HrPayrollStructureTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrPayrollStructureTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrPayrollStructureTypeDTO update(HrPayrollStructureTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrPayrollStructureTypeDTO.class)
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
    HrPayrollStructureTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrPayrollStructureTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrPayrollStructureTypeDTO getDraft(HrPayrollStructureTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrPayrollStructureTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrPayrollStructureTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrPayrollStructureTypeDTO save(HrPayrollStructureTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrPayrollStructureTypeDTO.class)
    }

}