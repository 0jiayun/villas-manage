package service;

import java.util.Map;

public interface SketchService {
    /**
     * 草图录入
     * @param map
     * @return
     */
    Map insertSketchs(Map<String,Object> map);

}
