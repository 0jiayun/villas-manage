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
        if (photoList.size()!=0){//录入照片
            Integer num=photoDao.findMaxLineNo(buildNo);
            if (num==null){
                num=1;
            }else {
                num+=1;
            }
            for(String photoUrl:photoList){
                Photo photo=new Photo(buildNo,photoUrl,num);
                try{
                    photoDao.insertSelective(photo);
                }catch (Exception e){
                    msg=msg+"第"+num+"张照片录入出错;"+"图片录入失败";

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
    public Map updatePhoto(Photo photo) {
        Map resultMap=new HashMap();
        try {
            photoDao.updatePhoto(photo);
        }catch (Exception e){
            resultMap.put("msg","图片更新失败");
            resultMap.put("code",1);
            return resultMap;
        }

        resultMap.put("msg","图片更新成功");
        resultMap.put("code",0);
        return resultMap;
    }

    @Override
    public Map deleteSelective(String buildNO, Integer lineNo) {
        Map resultMap=new HashMap();
        try {
            photoDao.deleteSelective(buildNO,lineNo);
        }catch (Exception e){
            resultMap.put("msg","图片删除失败");
            resultMap.put("code",1);
            return resultMap;
        }
        resultMap.put("msg","图片删除成功");
        resultMap.put("code",0);
        return resultMap;

    }
}
