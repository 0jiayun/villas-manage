package dao;

import pojo.Photo;

public interface PhotoDao {
    int insert(Photo record);

    Boolean insertSelective(Photo record);
}