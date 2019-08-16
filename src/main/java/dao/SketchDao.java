package dao;

import pojo.Sketch;

import java.util.List;

public interface SketchDao {
    int insert(Sketch record);

    Boolean insertSelective(Sketch record);

    Integer findMaxLineNo(String buildNo);

    List<Sketch> getSketchs(String buildNo);
}