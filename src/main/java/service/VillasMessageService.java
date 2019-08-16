package service;

import pojo.VillasMessage;

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

    /**
     * 查找祠堂信息
     * @param villasMessage
     * @return
     */
    Map getVillasMessages(VillasMessage villasMessage);

    /**
     * 获取祠堂详细信息
     * @param buildNo
     * @return
     */
    Map getContentVilla(String buildNo);


}
