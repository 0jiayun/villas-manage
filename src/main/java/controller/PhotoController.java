package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.PhotoService;

import java.util.Map;

@Controller
@RequestMapping("photo")
public class PhotoController {
    @Autowired
    private PhotoService photoService;

    @RequestMapping("insertPhotos")
    @ResponseBody
    public Map insertPhotos(@RequestBody Map<String,Object> map){
        return photoService.insertPhotos(map);
    }
}
