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
            }else {
                num+=1;
            }
            for(String sketchUrl:sketchList){
                Sketch sketch=new Sketch(buildNo,sketchUrl,num);
                try {
                    sketchDao.insertSelective(sketch);
                } catch (Exception e){
                    msg=msg+"第"+num+"张草图录入出错;"+"图片录入失败";

                    resultMap.put("msg",msg);
                    resultMap.put("code",1);
                    return resultMap;
                }
                num++;
            }
        }
        msg="SUCCESS";
        resultMap.put("code",0);
        resultMap.put("msg",msg);
        return resultMap;


    }

    @Override
    public Map updateSketch(Sketch sketch) {
        Map resultMap=new HashMap();
        try{
            sketchDao.updateSketch(sketch);
        }catch (Exception e){
            resultMap.put("msg","草图更新失败");
            resultMap.put("code",1);
            return resultMap;
        }
        resultMap.put("msg","草图更新成功");
        resultMap.put("code",1);
        return resultMap;
    }

    @Override
    public Map deleteSelective(String buildNO, Integer lineNo) {
        Map resultMap=new HashMap();
        try {
            sketchDao.deleteSelective(buildNO,lineNo);
        }catch (Exception e){
            resultMap.put("msg","草图删除失败");
            resultMap.put("code",1);
            return resultMap;
        }
        resultMap.put("msg","草图删除成功");
        resultMap.put("code",0);
        return resultMap;

    }
}
