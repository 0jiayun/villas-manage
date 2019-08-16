package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.SketchService;

import java.util.Map;

@Controller
@RequestMapping("sketch")
public class SketchController {
    @Autowired
    private SketchService sketchService;

    @RequestMapping("insertSketchs")
    @ResponseBody
    public Map insertSketchs(@RequestBody Map<String,Object>map){
        return sketchService.insertSketchs(map);
    }
}
