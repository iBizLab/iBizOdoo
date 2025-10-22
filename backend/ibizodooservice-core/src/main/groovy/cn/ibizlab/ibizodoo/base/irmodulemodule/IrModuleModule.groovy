package cn.ibizlab.ibizodoo.base.irmodulemodule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.irmodulemodule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODULE_MODULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModuleModule extends GroovyDataEntityRuntime<IrModuleModule,IrModuleModuleDTO,IrModuleModuleFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_USER_APP = "cur_user_app"
    public static final String DATASET_INSTALLED = "installed"
    public static final String DATASET_INSTALLED_APP = "installed_app"
    private static IrModuleModule _instance
    void setInstance(IrModuleModule instance) {
        _instance = instance
    }
    static IrModuleModule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModuleModuleDTO create(IrModuleModuleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModuleModuleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModuleModuleDTO update(IrModuleModuleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModuleModuleDTO.class)
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
    IrModuleModuleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModuleModuleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModuleModuleDTO getDraft(IrModuleModuleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModuleModuleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModuleModuleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModuleModuleDTO save(IrModuleModuleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModuleModuleDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrModuleModuleDTO> fetchDefault(IrModuleModuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrModuleModuleDTO.class)
    }

    /**
     * 数据集：当前用户授权应用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_USER_APP)
    Page<IrModuleModuleDTO> fetchCurUserApp(IrModuleModuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER_APP, context, IrModuleModuleDTO.class)
    }

    /**
     * 数据集：已安装应用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_INSTALLED)
    Page<IrModuleModuleDTO> fetchInstalled(IrModuleModuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_INSTALLED, context, IrModuleModuleDTO.class)
    }

    /**
     * 数据集：已安装应用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_INSTALLED_APP)
    Page<IrModuleModuleDTO> fetchInstalledApp(IrModuleModuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_INSTALLED_APP, context, IrModuleModuleDTO.class)
    }

}