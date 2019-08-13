import dao.TestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.VillasMessageService;

import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class villasTest {
    @Autowired
    private VillasMessageService villasMessageService;
    @Autowired
    private TestDao testDao;

    @Test
    public void test1(){
        System.out.println(villasMessageService.getBuildNo());
    }

    @Test
    public void test2(){
        Map<String,Object> map=testDao.getTest(1);
        System.out.println(map.get("id").toString()+map.get("test_name"));

    }
}
