package service.impl;

import dao.SketchDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Sketch;
import service.SketchService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class SketchServiceImpl implements SketchService {
    @Autowired
    private SketchDao sketchDao;

    @Override
    public Map insertSketchs(Map<String,Object> map) {

        Map resultMap=new HashMap();
        String msg="";

        List<String> sketchList=(List<String>)map.get("sketchList");
        String buildNo=map.get("buildNo").toString();
        if (sketchList.size()!=0){//录入草图

            Integer num=sketchDao.findMaxLineNo(buildNo);
            if (num==null){
                num=1;
            }
            for(String sketchUrl:sketchList){
                Sketch sketch=new Sketch(buildNo,sketchUrl,num);
                if (!sketchDao.insertSelective(sketch)){
                    msg=msg+"第"+num+"张草图录入出错;";
                    resultMap.put("code",1);
                    resultMap.put("msg",msg);
                    return resultMap;
                }
                num++;
            }
        }else {
            msg="图片数为空";
            resultMap.put("code",0);
            resultMap.put("msg",msg);
            return resultMap;
        }
        msg="SUCCESS";
        resultMap.put("code",0);
        resultMap.put("msg",msg);
        return resultMap;


    }
}
