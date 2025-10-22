package cn.ibizlab.ibizodoo.base.ircron

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.ircron.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_CRON]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrCron extends GroovyDataEntityRuntime<IrCron,IrCronDTO,IrCronFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static IrCron _instance
    void setInstance(IrCron instance) {
        _instance = instance
    }
    static IrCron getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrCronDTO create(IrCronDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrCronDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrCronDTO update(IrCronDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrCronDTO.class)
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
    IrCronDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrCronDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrCronDTO getDraft(IrCronDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrCronDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrCronDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrCronDTO save(IrCronDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrCronDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrCronDTO> fetchDefault(IrCronFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrCronDTO.class)
    }

}