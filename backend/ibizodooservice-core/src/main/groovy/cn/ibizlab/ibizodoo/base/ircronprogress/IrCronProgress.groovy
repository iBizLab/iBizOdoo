package cn.ibizlab.ibizodoo.base.ircronprogress

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.ircronprogress.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_CRON_PROGRESS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrCronProgress extends GroovyDataEntityRuntime<IrCronProgress,IrCronProgressDTO,IrCronProgressFilterDTO> {

    private static IrCronProgress _instance
    void setInstance(IrCronProgress instance) {
        _instance = instance
    }
    static IrCronProgress getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrCronProgressDTO create(IrCronProgressDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrCronProgressDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrCronProgressDTO update(IrCronProgressDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrCronProgressDTO.class)
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
    IrCronProgressDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrCronProgressDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrCronProgressDTO getDraft(IrCronProgressDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrCronProgressDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrCronProgressDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrCronProgressDTO save(IrCronProgressDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrCronProgressDTO.class)
    }

}