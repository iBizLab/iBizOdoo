package cn.ibizlab.ibizodoo.base.reslang

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.reslang.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_LANG]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResLang extends GroovyDataEntityRuntime<ResLang,ResLangDTO,ResLangFilterDTO> {

    private static ResLang _instance
    void setInstance(ResLang instance) {
        _instance = instance
    }
    static ResLang getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResLangDTO create(ResLangDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResLangDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResLangDTO update(ResLangDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResLangDTO.class)
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
    ResLangDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResLangDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResLangDTO getDraft(ResLangDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResLangDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResLangDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResLangDTO save(ResLangDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResLangDTO.class)
    }

}