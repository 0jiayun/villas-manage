package service;

import java.util.Map;

public interface PhotoService {
    /**
     * 照片录入
     * @param map
     * @return
     */
    Map insertPhotos(Map<String,Object> map);
}
