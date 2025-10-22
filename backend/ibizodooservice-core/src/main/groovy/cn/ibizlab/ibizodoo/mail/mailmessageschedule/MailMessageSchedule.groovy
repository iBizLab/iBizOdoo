package cn.ibizlab.ibizodoo.mail.mailmessageschedule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailmessageschedule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_MESSAGE_SCHEDULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailMessageSchedule extends GroovyDataEntityRuntime<MailMessageSchedule,MailMessageScheduleDTO,MailMessageScheduleFilterDTO> {

    private static MailMessageSchedule _instance
    void setInstance(MailMessageSchedule instance) {
        _instance = instance
    }
    static MailMessageSchedule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailMessageScheduleDTO create(MailMessageScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailMessageScheduleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailMessageScheduleDTO update(MailMessageScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailMessageScheduleDTO.class)
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
    MailMessageScheduleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailMessageScheduleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailMessageScheduleDTO getDraft(MailMessageScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailMessageScheduleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailMessageScheduleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailMessageScheduleDTO save(MailMessageScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailMessageScheduleDTO.class)
    }

}