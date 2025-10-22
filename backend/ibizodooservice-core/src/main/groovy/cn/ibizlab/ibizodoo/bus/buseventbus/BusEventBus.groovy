package cn.ibizlab.ibizodoo.bus.buseventbus

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.bus.buseventbus.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[BUS_EVENT_BUS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class BusEventBus extends GroovyDataEntityRuntime<BusEventBus,BusEventBusDTO,BusEventBusFilterDTO> {

    public static final String ACTION_PUBLISH_EVENT = "publish_event"
    public static final String ACTION_RECIVE_EVENT = "recive_event"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static BusEventBus _instance
    void setInstance(BusEventBus instance) {
        _instance = instance
    }
    static BusEventBus getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    BusEventBusDTO create(BusEventBusDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, BusEventBusDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    BusEventBusDTO update(BusEventBusDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, BusEventBusDTO.class)
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
    BusEventBusDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, BusEventBusDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    BusEventBusDTO getDraft(BusEventBusDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, BusEventBusDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(BusEventBusDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    BusEventBusDTO save(BusEventBusDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, BusEventBusDTO.class)
    }

    /**
     * 行为：发布事件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PUBLISH_EVENT)
    def publishEvent(BusEventBusDTO dto) throws Throwable {
        this.execute(ACTION_PUBLISH_EVENT, dto, BusEventBusDTO.class)
    }

    /**
     * 行为：监听事件 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECIVE_EVENT)
    def reciveEvent(BusEventBusDTO dto) throws Throwable {
        this.execute(ACTION_RECIVE_EVENT, dto, BusEventBusDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<BusEventBusDTO> fetchDefault(BusEventBusFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, BusEventBusDTO.class)
    }

}