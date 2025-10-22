package cn.ibizlab.ibizodoo.hr.hremployeecategory

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hremployeecategory.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EMPLOYEE_CATEGORY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrEmployeeCategory extends GroovyDataEntityRuntime<HrEmployeeCategory,HrEmployeeCategoryDTO,HrEmployeeCategoryFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrEmployeeCategory _instance
    void setInstance(HrEmployeeCategory instance) {
        _instance = instance
    }
    static HrEmployeeCategory getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrEmployeeCategoryDTO create(HrEmployeeCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrEmployeeCategoryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrEmployeeCategoryDTO update(HrEmployeeCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrEmployeeCategoryDTO.class)
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
    HrEmployeeCategoryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrEmployeeCategoryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrEmployeeCategoryDTO getDraft(HrEmployeeCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrEmployeeCategoryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrEmployeeCategoryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrEmployeeCategoryDTO save(HrEmployeeCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrEmployeeCategoryDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrEmployeeCategoryDTO> fetchDefault(HrEmployeeCategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrEmployeeCategoryDTO.class)
    }

}