package dao;

import pojo.VillasMessage;

public interface VillasMessageDao {
    int deleteByPrimaryKey(String buildNo);

    int insert(VillasMessage record);

    int insertSelective(VillasMessage record);

    VillasMessage selectByPrimaryKey(String buildNo);

    int updateByPrimaryKeySelective(VillasMessage record);

    int updateByPrimaryKey(VillasMessage record);
}