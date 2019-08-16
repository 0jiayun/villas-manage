package dao;

import pojo.Photo;

import java.util.List;

public interface PhotoDao {
    int insert(Photo record);

    Boolean insertSelective(Photo record);

    Integer findMaxLineNo(String buildNo);

    List<Photo> getPhotos(String buildNo);
}