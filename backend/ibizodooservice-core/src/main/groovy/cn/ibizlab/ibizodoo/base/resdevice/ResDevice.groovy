package cn.ibizlab.ibizodoo.base.resdevice

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.resdevice.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_DEVICE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResDevice extends GroovyDataEntityRuntime<ResDevice,ResDeviceDTO,ResDeviceFilterDTO> {

    private static ResDevice _instance
    void setInstance(ResDevice instance) {
        _instance = instance
    }
    static ResDevice getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResDeviceDTO create(ResDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResDeviceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResDeviceDTO update(ResDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResDeviceDTO.class)
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
    ResDeviceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResDeviceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResDeviceDTO getDraft(ResDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResDeviceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResDeviceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResDeviceDTO save(ResDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResDeviceDTO.class)
    }

}