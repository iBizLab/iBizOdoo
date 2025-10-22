package cn.ibizlab.ibizodoo.bus.buseventrecord

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.bus.buseventrecord.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[BUS_EVENT_RECORD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class BusEventRecord extends GroovyDataEntityRuntime<BusEventRecord,BusEventRecordDTO,BusEventRecordFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static BusEventRecord _instance
    void setInstance(BusEventRecord instance) {
        _instance = instance
    }
    static BusEventRecord getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    BusEventRecordDTO create(BusEventRecordDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, BusEventRecordDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    BusEventRecordDTO update(BusEventRecordDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, BusEventRecordDTO.class)
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
    BusEventRecordDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, BusEventRecordDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    BusEventRecordDTO getDraft(BusEventRecordDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, BusEventRecordDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(BusEventRecordDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    BusEventRecordDTO save(BusEventRecordDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, BusEventRecordDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<BusEventRecordDTO> fetchDefault(BusEventRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, BusEventRecordDTO.class)
    }

}