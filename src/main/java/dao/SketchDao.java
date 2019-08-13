package dao;

import pojo.Sketch;

public interface SketchDao {
    int insert(Sketch record);

    int insertSelective(Sketch record);
}