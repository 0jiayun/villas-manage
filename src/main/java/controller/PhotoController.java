package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Photo;
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

    @RequestMapping("updatePhoto")
    @ResponseBody
    public  Map updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }

    @RequestMapping("deleteSelective")
    @ResponseBody
    public Map deleteSelective(@RequestParam("buildNo")String buildNo,@RequestParam("lineNo")Integer lineNo){
        return photoService.deleteSelective(buildNo,lineNo);
    }
}
