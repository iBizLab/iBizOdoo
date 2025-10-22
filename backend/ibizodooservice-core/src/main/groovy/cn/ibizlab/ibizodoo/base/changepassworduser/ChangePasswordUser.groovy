package cn.ibizlab.ibizodoo.base.changepassworduser

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.changepassworduser.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CHANGE_PASSWORD_USER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ChangePasswordUser extends GroovyDataEntityRuntime<ChangePasswordUser,ChangePasswordUserDTO,ChangePasswordUserFilterDTO> {

    private static ChangePasswordUser _instance
    void setInstance(ChangePasswordUser instance) {
        _instance = instance
    }
    static ChangePasswordUser getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ChangePasswordUserDTO create(ChangePasswordUserDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ChangePasswordUserDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ChangePasswordUserDTO update(ChangePasswordUserDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ChangePasswordUserDTO.class)
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
    ChangePasswordUserDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ChangePasswordUserDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ChangePasswordUserDTO getDraft(ChangePasswordUserDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ChangePasswordUserDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ChangePasswordUserDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ChangePasswordUserDTO save(ChangePasswordUserDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ChangePasswordUserDTO.class)
    }

}