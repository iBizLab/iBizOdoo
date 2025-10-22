package cn.ibizlab.ibizodoo.base.iractionsserver

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.iractionsserver.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_ACTIONS_SERVER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrActionsServer extends GroovyDataEntityRuntime<IrActionsServer,IrActionsServerDTO,IrActionsServerFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static IrActionsServer _instance
    void setInstance(IrActionsServer instance) {
        _instance = instance
    }
    static IrActionsServer getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrActionsServerDTO create(IrActionsServerDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrActionsServerDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrActionsServerDTO update(IrActionsServerDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrActionsServerDTO.class)
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
    IrActionsServerDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrActionsServerDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrActionsServerDTO getDraft(IrActionsServerDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrActionsServerDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrActionsServerDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrActionsServerDTO save(IrActionsServerDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrActionsServerDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrActionsServerDTO> fetchDefault(IrActionsServerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrActionsServerDTO.class)
    }

}