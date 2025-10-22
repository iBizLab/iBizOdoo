package cn.ibizlab.ibizodoo.base.irmodelinherit

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.irmodelinherit.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODEL_INHERIT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModelInherit extends GroovyDataEntityRuntime<IrModelInherit,IrModelInheritDTO,IrModelInheritFilterDTO> {

    private static IrModelInherit _instance
    void setInstance(IrModelInherit instance) {
        _instance = instance
    }
    static IrModelInherit getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModelInheritDTO create(IrModelInheritDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModelInheritDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModelInheritDTO update(IrModelInheritDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModelInheritDTO.class)
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
    IrModelInheritDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModelInheritDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModelInheritDTO getDraft(IrModelInheritDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModelInheritDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModelInheritDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModelInheritDTO save(IrModelInheritDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModelInheritDTO.class)
    }

}