package dao;

import pojo.InterviewRecord;

public interface InterviewRecordDao {
    int insert(InterviewRecord record);

    Boolean insertSelective(InterviewRecord record);

    InterviewRecord getInterviewRecord(String buildNo);

    Boolean updateInterviewRecord(InterviewRecord interviewRecord);

    Boolean delete(String buildNo);
}