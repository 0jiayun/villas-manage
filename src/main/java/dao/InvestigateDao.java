package dao;

import pojo.Investigate;

public interface InvestigateDao {
    int insert(Investigate record);

    Boolean insertSelective(Investigate record);

    Investigate getInvestigate(String buildNo);

    Boolean updateInvestigate(Investigate investigate);

    Boolean delete(String buildNo);
}