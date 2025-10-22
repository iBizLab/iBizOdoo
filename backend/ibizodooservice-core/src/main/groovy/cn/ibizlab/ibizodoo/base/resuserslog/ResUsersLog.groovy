package cn.ibizlab.ibizodoo.base.resuserslog

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.resuserslog.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_USERS_LOG]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResUsersLog extends GroovyDataEntityRuntime<ResUsersLog,ResUsersLogDTO,ResUsersLogFilterDTO> {

    private static ResUsersLog _instance
    void setInstance(ResUsersLog instance) {
        _instance = instance
    }
    static ResUsersLog getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResUsersLogDTO create(ResUsersLogDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResUsersLogDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResUsersLogDTO update(ResUsersLogDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResUsersLogDTO.class)
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
    ResUsersLogDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResUsersLogDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResUsersLogDTO getDraft(ResUsersLogDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResUsersLogDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResUsersLogDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResUsersLogDTO save(ResUsersLogDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResUsersLogDTO.class)
    }

}