package cn.ibizlab.ibizodoo.base.irmailserver

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.irmailserver.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MAIL_SERVER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrMailServer extends GroovyDataEntityRuntime<IrMailServer,IrMailServerDTO,IrMailServerFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static IrMailServer _instance
    void setInstance(IrMailServer instance) {
        _instance = instance
    }
    static IrMailServer getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrMailServerDTO create(IrMailServerDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrMailServerDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrMailServerDTO update(IrMailServerDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrMailServerDTO.class)
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
    IrMailServerDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrMailServerDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrMailServerDTO getDraft(IrMailServerDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrMailServerDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrMailServerDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrMailServerDTO save(IrMailServerDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrMailServerDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrMailServerDTO> fetchDefault(IrMailServerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrMailServerDTO.class)
    }

}