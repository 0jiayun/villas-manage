package dao;

import pojo.test;

public interface testDao {
    int deleteByPrimaryKey(Integer id);

    int insert(test record);

    int insertSelective(test record);

    test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(test record);

    int updateByPrimaryKey(test record);
}