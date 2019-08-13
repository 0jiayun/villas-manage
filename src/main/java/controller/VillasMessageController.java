package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
}
