package dao;

import pojo.Investigate;

public interface InvestigateDao {
    int insert(Investigate record);

    int insertSelective(Investigate record);
}