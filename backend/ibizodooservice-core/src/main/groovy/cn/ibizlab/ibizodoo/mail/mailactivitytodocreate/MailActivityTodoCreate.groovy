package cn.ibizlab.ibizodoo.mail.mailactivitytodocreate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailactivitytodocreate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ACTIVITY_TODO_CREATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailActivityTodoCreate extends GroovyDataEntityRuntime<MailActivityTodoCreate,MailActivityTodoCreateDTO,MailActivityTodoCreateFilterDTO> {

    private static MailActivityTodoCreate _instance
    void setInstance(MailActivityTodoCreate instance) {
        _instance = instance
    }
    static MailActivityTodoCreate getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailActivityTodoCreateDTO create(MailActivityTodoCreateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailActivityTodoCreateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailActivityTodoCreateDTO update(MailActivityTodoCreateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailActivityTodoCreateDTO.class)
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
    MailActivityTodoCreateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailActivityTodoCreateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailActivityTodoCreateDTO getDraft(MailActivityTodoCreateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailActivityTodoCreateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailActivityTodoCreateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailActivityTodoCreateDTO save(MailActivityTodoCreateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailActivityTodoCreateDTO.class)
    }

}