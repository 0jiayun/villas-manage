package service;

import java.util.Map;

public interface VillasMessageService {
    /**
     * 生成编号
     * @return
     */
    String getBuildNo();

    /**
     * 新增祠堂信息
     * @param map
     * @return
     */
    Map insertVilla(Map<String,Object> map);
}
