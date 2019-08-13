package dao;

import pojo.InterviewRecord;

public interface InterviewRecordDao {
    int insert(InterviewRecord record);

    Boolean insertSelective(InterviewRecord record);
}