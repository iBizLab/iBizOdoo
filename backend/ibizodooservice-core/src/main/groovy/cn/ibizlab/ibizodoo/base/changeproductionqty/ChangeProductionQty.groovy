package cn.ibizlab.ibizodoo.base.changeproductionqty

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.changeproductionqty.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CHANGE_PRODUCTION_QTY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ChangeProductionQty extends GroovyDataEntityRuntime<ChangeProductionQty,ChangeProductionQtyDTO,ChangeProductionQtyFilterDTO> {

    private static ChangeProductionQty _instance
    void setInstance(ChangeProductionQty instance) {
        _instance = instance
    }
    static ChangeProductionQty getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ChangeProductionQtyDTO create(ChangeProductionQtyDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ChangeProductionQtyDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ChangeProductionQtyDTO update(ChangeProductionQtyDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ChangeProductionQtyDTO.class)
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
    ChangeProductionQtyDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ChangeProductionQtyDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ChangeProductionQtyDTO getDraft(ChangeProductionQtyDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ChangeProductionQtyDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ChangeProductionQtyDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ChangeProductionQtyDTO save(ChangeProductionQtyDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ChangeProductionQtyDTO.class)
    }

}