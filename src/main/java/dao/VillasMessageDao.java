package dao;

import org.apache.ibatis.annotations.Param;
import pojo.VillasMessage;

import java.util.List;
import java.util.Map;

public interface VillasMessageDao {
    int deleteByPrimaryKey(String buildNo);

    int insert(VillasMessage record);

    Boolean insertSelective(VillasMessage record);

    VillasMessage selectByPrimaryKey(String buildNo);

    int updateByPrimaryKeySelective(VillasMessage record);

    int updateByPrimaryKey(VillasMessage record);

    List<Map<String,Object>> getTodayVillas(@Param("date") String date);

    List<VillasMessage> getVillasMessages(VillasMessage villasMessage);

    Integer count(VillasMessage villasMessage);

}