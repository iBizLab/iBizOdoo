package cn.ibizlab.ibizodoo.base.irmodelconstraint

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.irmodelconstraint.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODEL_CONSTRAINT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModelConstraint extends GroovyDataEntityRuntime<IrModelConstraint,IrModelConstraintDTO,IrModelConstraintFilterDTO> {

    private static IrModelConstraint _instance
    void setInstance(IrModelConstraint instance) {
        _instance = instance
    }
    static IrModelConstraint getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModelConstraintDTO create(IrModelConstraintDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModelConstraintDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModelConstraintDTO update(IrModelConstraintDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModelConstraintDTO.class)
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
    IrModelConstraintDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModelConstraintDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModelConstraintDTO getDraft(IrModelConstraintDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModelConstraintDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModelConstraintDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModelConstraintDTO save(IrModelConstraintDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModelConstraintDTO.class)
    }

}