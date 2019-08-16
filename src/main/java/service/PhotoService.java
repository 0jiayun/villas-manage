package service;

import pojo.Photo;

import java.util.Map;

public interface PhotoService {
    /**
     * 照片录入
     * @param map
     * @return
     */
    Map insertPhotos(Map<String,Object> map);

    /**
     * 更新图片路径
     * @param photo
     * @return
     */
    Map updatePhoto(Photo photo);

    Map deleteSelective(String buildNO ,Integer lineNo);
}
