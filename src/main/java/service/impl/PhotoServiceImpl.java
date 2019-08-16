package service.impl;

import dao.PhotoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Photo;
import pojo.Sketch;
import service.PhotoService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    private PhotoDao photoDao;

    @Override
    public Map insertPhotos(Map<String, Object> map) {
        Map resultMap=new HashMap();
        String msg="";

        List<String> photoList=(List<String>)map.get("photoList");
        String buildNo=map.get("buildNo").toString();
        if (photoList.size()!=0){//录入草图

            Integer num=photoDao.findMaxLineNo(buildNo);
            if (num==null){
                num=1;
            }
            for(String photohUrl:photoList){
                Photo photo=new Photo(buildNo,photohUrl,num);
                if (!photoDao.insertSelective(photo)){
                    msg=msg+"第"+num+"张图录入出错;";
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
