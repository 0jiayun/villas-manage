package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Photo;

import java.util.List;

public interface PhotoDao {
    int insert(Photo record);

    Boolean insertSelective(Photo record);

    Integer findMaxLineNo(String buildNo);

    List<Photo> getPhotos(String buildNo);

    Boolean updatePhoto(Photo photo);

    Boolean deleteAll(String buildNo);

    Boolean deleteSelective(@Param("buildNo") String buildNo, @Param("lineNo") Integer lineNo);
}