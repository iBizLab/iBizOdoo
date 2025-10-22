package cn.ibizlab.ibizodoo.hr.hremployeepublic

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hremployeepublic.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EMPLOYEE_PUBLIC]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrEmployeePublic extends GroovyDataEntityRuntime<HrEmployeePublic,HrEmployeePublicDTO,HrEmployeePublicFilterDTO> {

    private static HrEmployeePublic _instance
    void setInstance(HrEmployeePublic instance) {
        _instance = instance
    }
    static HrEmployeePublic getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrEmployeePublicDTO create(HrEmployeePublicDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrEmployeePublicDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrEmployeePublicDTO update(HrEmployeePublicDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrEmployeePublicDTO.class)
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
    HrEmployeePublicDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrEmployeePublicDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrEmployeePublicDTO getDraft(HrEmployeePublicDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrEmployeePublicDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrEmployeePublicDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrEmployeePublicDTO save(HrEmployeePublicDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrEmployeePublicDTO.class)
    }

}