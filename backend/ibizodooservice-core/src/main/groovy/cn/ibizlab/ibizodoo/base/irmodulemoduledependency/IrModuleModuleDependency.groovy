package cn.ibizlab.ibizodoo.base.irmodulemoduledependency

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.irmodulemoduledependency.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODULE_MODULE_DEPENDENCY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModuleModuleDependency extends GroovyDataEntityRuntime<IrModuleModuleDependency,IrModuleModuleDependencyDTO,IrModuleModuleDependencyFilterDTO> {

    private static IrModuleModuleDependency _instance
    void setInstance(IrModuleModuleDependency instance) {
        _instance = instance
    }
    static IrModuleModuleDependency getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModuleModuleDependencyDTO create(IrModuleModuleDependencyDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModuleModuleDependencyDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModuleModuleDependencyDTO update(IrModuleModuleDependencyDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModuleModuleDependencyDTO.class)
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
    IrModuleModuleDependencyDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModuleModuleDependencyDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModuleModuleDependencyDTO getDraft(IrModuleModuleDependencyDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModuleModuleDependencyDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModuleModuleDependencyDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModuleModuleDependencyDTO save(IrModuleModuleDependencyDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModuleModuleDependencyDTO.class)
    }

}