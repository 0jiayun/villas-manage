package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Test;

import java.util.Map;

public interface TestDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);

    Map<String,Object> getTest(@Param("id")int id);
}