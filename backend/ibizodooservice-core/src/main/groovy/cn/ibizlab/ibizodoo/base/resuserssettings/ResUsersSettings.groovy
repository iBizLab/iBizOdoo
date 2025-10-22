package cn.ibizlab.ibizodoo.base.resuserssettings

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.resuserssettings.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_USERS_SETTINGS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResUsersSettings extends GroovyDataEntityRuntime<ResUsersSettings,ResUsersSettingsDTO,ResUsersSettingsFilterDTO> {

    private static ResUsersSettings _instance
    void setInstance(ResUsersSettings instance) {
        _instance = instance
    }
    static ResUsersSettings getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResUsersSettingsDTO create(ResUsersSettingsDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResUsersSettingsDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResUsersSettingsDTO update(ResUsersSettingsDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResUsersSettingsDTO.class)
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
    ResUsersSettingsDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResUsersSettingsDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResUsersSettingsDTO getDraft(ResUsersSettingsDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResUsersSettingsDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResUsersSettingsDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResUsersSettingsDTO save(ResUsersSettingsDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResUsersSettingsDTO.class)
    }

}