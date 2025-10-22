package cn.ibizlab.ibizodoo.base.changepasswordwizard

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.changepasswordwizard.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CHANGE_PASSWORD_WIZARD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ChangePasswordWizard extends GroovyDataEntityRuntime<ChangePasswordWizard,ChangePasswordWizardDTO,ChangePasswordWizardFilterDTO> {

    private static ChangePasswordWizard _instance
    void setInstance(ChangePasswordWizard instance) {
        _instance = instance
    }
    static ChangePasswordWizard getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ChangePasswordWizardDTO create(ChangePasswordWizardDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ChangePasswordWizardDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ChangePasswordWizardDTO update(ChangePasswordWizardDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ChangePasswordWizardDTO.class)
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
    ChangePasswordWizardDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ChangePasswordWizardDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ChangePasswordWizardDTO getDraft(ChangePasswordWizardDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ChangePasswordWizardDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ChangePasswordWizardDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ChangePasswordWizardDTO save(ChangePasswordWizardDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ChangePasswordWizardDTO.class)
    }

}