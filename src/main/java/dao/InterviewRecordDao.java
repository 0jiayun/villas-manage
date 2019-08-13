package dao;

import pojo.InterviewRecord;

public interface InterviewRecordDao {
    int insert(InterviewRecord record);

    int insertSelective(InterviewRecord record);
}