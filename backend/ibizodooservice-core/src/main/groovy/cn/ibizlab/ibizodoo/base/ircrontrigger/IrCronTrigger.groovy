package cn.ibizlab.ibizodoo.base.ircrontrigger

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.ircrontrigger.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_CRON_TRIGGER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrCronTrigger extends GroovyDataEntityRuntime<IrCronTrigger,IrCronTriggerDTO,IrCronTriggerFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static IrCronTrigger _instance
    void setInstance(IrCronTrigger instance) {
        _instance = instance
    }
    static IrCronTrigger getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrCronTriggerDTO create(IrCronTriggerDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrCronTriggerDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrCronTriggerDTO update(IrCronTriggerDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrCronTriggerDTO.class)
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
    IrCronTriggerDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrCronTriggerDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrCronTriggerDTO getDraft(IrCronTriggerDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrCronTriggerDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrCronTriggerDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrCronTriggerDTO save(IrCronTriggerDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrCronTriggerDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrCronTriggerDTO> fetchDefault(IrCronTriggerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrCronTriggerDTO.class)
    }

}