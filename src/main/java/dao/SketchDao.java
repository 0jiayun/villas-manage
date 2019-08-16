package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Sketch;

import java.util.List;

public interface SketchDao {
    int insert(Sketch record);

    Boolean insertSelective(Sketch record);

    Integer findMaxLineNo(String buildNo);

    List<Sketch> getSketchs(String buildNo);

    Boolean updateSketch(Sketch sketch);

    Boolean deleteAll(String buildNo);

    Boolean deleteSelective(@Param("buildNo") String buildNo,@Param("lineNo") Integer lineNo);
}