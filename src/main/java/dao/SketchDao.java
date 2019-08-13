package dao;

import pojo.Sketch;

public interface SketchDao {
    int insert(Sketch record);

    Boolean insertSelective(Sketch record);
}