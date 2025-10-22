package cn.ibizlab.ibizodoo.hr.hremployeeskill

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hremployeeskill.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EMPLOYEE_SKILL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrEmployeeSkill extends GroovyDataEntityRuntime<HrEmployeeSkill,HrEmployeeSkillDTO,HrEmployeeSkillFilterDTO> {

    private static HrEmployeeSkill _instance
    void setInstance(HrEmployeeSkill instance) {
        _instance = instance
    }
    static HrEmployeeSkill getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrEmployeeSkillDTO create(HrEmployeeSkillDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrEmployeeSkillDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrEmployeeSkillDTO update(HrEmployeeSkillDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrEmployeeSkillDTO.class)
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
    HrEmployeeSkillDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrEmployeeSkillDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrEmployeeSkillDTO getDraft(HrEmployeeSkillDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrEmployeeSkillDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrEmployeeSkillDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrEmployeeSkillDTO save(HrEmployeeSkillDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrEmployeeSkillDTO.class)
    }

}