package service;

import pojo.Sketch;

import java.util.Map;

public interface SketchService {
    /**
     * 草图录入
     * @param map
     * @return
     */
    Map insertSketchs(Map<String,Object> map);

    /**
     * 更新草图路径
     * @param sketch
     * @return
     */
    Map updateSketch(Sketch sketch);

    Map deleteSelective(String buildNO ,Integer lineNo);

}
