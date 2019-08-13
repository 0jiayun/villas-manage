package dao;

import pojo.Photo;

public interface PhotoDao {
    int insert(Photo record);

    int insertSelective(Photo record);
}