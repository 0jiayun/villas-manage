import dao.TestDao;
import dao.VillasMessageDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.VillasMessage;
import service.VillasMessageService;
import utils.TimeToString;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class villasTest {
    @Autowired
    private VillasMessageService villasMessageService;
    @Autowired
    private TestDao testDao;

    @Autowired
    private VillasMessageDao villasMessageDao;

    @Test
    public void test1(){
        System.out.println(villasMessageService.getBuildNo());
    }

    @Test
    public void test2(){
        Map<String,Object> map=testDao.getTest(1);
        System.out.println(map.get("id").toString()+map.get("test_name"));

    }
    @Test
    public void  test3(){

        VillasMessage villasMessage=new VillasMessage(0,10);
        villasMessage.setBuildName("测试2");
        List<VillasMessage> list=villasMessageDao.getVillasMessages(villasMessage);
        for (VillasMessage villasMessage1:list){
            System.out.println(villasMessage1.getBuildNo()+":"+villasMessage1.getBuildName());
        }
    }
}
