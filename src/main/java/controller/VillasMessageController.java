package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.VillasMessage;
import service.VillasMessageService;

import java.util.Map;

@Controller
@RequestMapping("villa")
public class VillasMessageController {
    @Autowired
    private VillasMessageService villasMessageService;

    /**
     * 新增祠堂信息
     * @param map
     * @return
     */
    @RequestMapping("insertVilla")
    @ResponseBody
    public Map insertVilla(@RequestBody Map<String,Object> map){
        return villasMessageService.insertVilla(map);
    }

    /**
     * 获取祠堂列表
     * @param villasMessage
     * @return
     */
    @RequestMapping("getVillasMessages")
    @ResponseBody
    public Map getVillasMessages(@RequestBody VillasMessage villasMessage){
        return villasMessageService.getVillasMessages(villasMessage);
    }

    /**
     * 获取详细祠堂信息
     * @param buildNo
     * @return
     */
    @RequestMapping("getContentVilla")
    @ResponseBody
    public Map getContentVilla(@RequestParam("buildNo") String buildNo){
        return villasMessageService.getContentVilla(buildNo);
    }

    /**
     * 更新祠堂主要文字信息
     * @param map
     * @return
     */
    @RequestMapping("updateMessage")
    @ResponseBody
    public Map updateMessage(@RequestBody Map<String,Object>map){
        return villasMessageService.updateMessage(map);
    }

    /**
     * 删除所有信息
     * @param buildNo
     * @return
     */
    @RequestMapping("deleteMessageAll")
    @ResponseBody
    public Map deleteMessageAll(@RequestParam("buildNo")String buildNo){
        return  villasMessageService.deleteMessageAll(buildNo);
    }


}
