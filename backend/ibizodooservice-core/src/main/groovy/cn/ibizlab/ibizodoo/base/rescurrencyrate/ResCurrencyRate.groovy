package cn.ibizlab.ibizodoo.base.rescurrencyrate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.rescurrencyrate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_CURRENCY_RATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResCurrencyRate extends GroovyDataEntityRuntime<ResCurrencyRate,ResCurrencyRateDTO,ResCurrencyRateFilterDTO> {

    private static ResCurrencyRate _instance
    void setInstance(ResCurrencyRate instance) {
        _instance = instance
    }
    static ResCurrencyRate getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResCurrencyRateDTO create(ResCurrencyRateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResCurrencyRateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResCurrencyRateDTO update(ResCurrencyRateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResCurrencyRateDTO.class)
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
    ResCurrencyRateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResCurrencyRateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResCurrencyRateDTO getDraft(ResCurrencyRateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResCurrencyRateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResCurrencyRateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResCurrencyRateDTO save(ResCurrencyRateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResCurrencyRateDTO.class)
    }

}