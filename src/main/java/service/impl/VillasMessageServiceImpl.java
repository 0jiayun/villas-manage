package service.impl;

import dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.*;
import service.VillasMessageService;
import utils.MapUtils;
import utils.TimeToString;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class VillasMessageServiceImpl implements VillasMessageService {
    @Autowired
    private VillasMessageDao villasMessageDao;
    @Autowired
    private InterviewRecordDao interviewRecordDao;

    @Autowired
    private InvestigateDao investigateDao;

    @Autowired
    private SketchDao sketchDao;

    @Autowired
    private PhotoDao photoDao;


    public String getBuildNo(){
        String trueBuildNo="";
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        String s=df.format(new java.util.Date());
        s=s.substring(2);//获取时间后6位，如20190227得190227
        String villasN="VM";

        List<Map<String,Object>> villasMap=villasMessageDao.getTodayVillas(villasN+s);


        if(villasMap.size()==0){
            trueBuildNo=villasN+s+"0001";
        }else{//截取自增
            String order="";
            List<Integer> nums=new ArrayList<>();
            for (Map<String,Object> map:villasMap){
                String villaS=map.get("build_no").toString();
                villaS=villaS.substring(8,12);//substring不计头计尾
                int villaI=Integer.parseInt(villaS);
                nums.add(villaI);

            }
            int villaIMax= Collections.max(nums);

            int o=10000;

            o=o+villaIMax+1;
            String p=o+"";
            p=p.substring(1);
            trueBuildNo=villasN+s+p;
        }
        return trueBuildNo;

    }

    @Override
    public Map insertVilla(Map<String, Object> map) {
        Map resultMap=new HashMap();
        String msg="";//记录信息
        String buildNo=this.getBuildNo();//编号





        if (map.get("villasMessage")!=null){
            VillasMessage villasMessage= MapUtils.mapToBean((Map<String, Object>) map.get("villasMessage"),VillasMessage.class);//主要信息
            String nowTime= TimeToString.getNowTimeString();//当前时间
            villasMessage.setBuildNo(buildNo);
            villasMessage.setInsertTime(nowTime);
            villasMessage.setUpdateTime(nowTime);
            try {
                villasMessageDao.insertSelective(villasMessage);
            }catch (Exception e){
                resultMap.put("code",1);
                resultMap.put("msg","新增VillasMessage（搜索条件）出错");
                return resultMap;
            }

        }
        if (map.get("investigate")!=null){
            Investigate investigate=MapUtils.mapToBean((Map<String, Object>) map.get("investigate"),Investigate.class)  ;//调查信息
            investigate.setBuildNo(buildNo);
            try {

                investigateDao.insertSelective(investigate);
            }catch (Exception e){
                resultMap.put("code",1);
                resultMap.put("msg","新增Investigate（调查信息）出错");
                return resultMap;
            }
        }

        if (map.get("interviewRecord")!=null){
            InterviewRecord interviewRecord=MapUtils.mapToBean((Map<String, Object>) map.get("interviewRecord"),InterviewRecord.class);//访谈记录+宗族
            interviewRecord.setBuildNo(buildNo);
            try {
                interviewRecordDao.insertSelective(interviewRecord);
            }catch (Exception e){
                resultMap.put("code",1);
                resultMap.put("msg","新增InterviewRecord（访谈+宗族信息）出错");
                return resultMap;
            }
        }

        List<String> photoList=(List<String>)map.get("photoList");//照片路径集合
        List<String> sketchList=(List<String>)map.get("sketchList");//草图路径集合

            if (sketchList.size()!=0){//录入草图

                Integer num=1;

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



        if (photoList.size()!=0){//录入照片
            Integer num=1;

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


        msg=msg+"全部信息录入成功";
        resultMap.put("data",buildNo);
        resultMap.put("msg",msg);
        resultMap.put("code",0);
        return resultMap;
    }


    @Override
    public Map getVillasMessages(VillasMessage villasMessage) {
        Map resultMap=new HashMap();

        List<VillasMessage> villasMessages=villasMessageDao.getVillasMessages(villasMessage);
        Integer num=villasMessageDao.count(villasMessage);

        resultMap.put("count",num);
        resultMap.put("data",villasMessages);
        resultMap.put("code",0);
        resultMap.put("msg","SUCCESS");


        return resultMap;
    }

    @Override
    public Map getContentVilla(String buildNo) {
        Map resultMap=new HashMap();
        Map data=new HashMap();
        VillasMessage villasMessage=villasMessageDao.selectByPrimaryKey(buildNo);
        Investigate investigate=investigateDao.getInvestigate(buildNo);
        InterviewRecord interviewRecord=interviewRecordDao.getInterviewRecord(buildNo);
        List<Sketch> sketches=sketchDao.getSketchs(buildNo);
        List<Photo> photos=photoDao.getPhotos(buildNo);
        data.put("villasMessage",villasMessage);
        data.put("investigate",investigate);
        data.put("interviewRecord",interviewRecord);
        data.put("sketches",sketches);
        data.put("photos",photos);
        resultMap.put("data",data);
        resultMap.put("msg","SUCCESS");
        resultMap.put("code",1);

        return resultMap;
    }

    @Override
    public Map updateMessage(Map<String, Object> map) {

        Map resultMap=new HashMap();
        if (map.get("villasMessage")!=null){
            VillasMessage villasMessage= MapUtils.mapToBean((Map<String, Object>) map.get("villasMessage"),VillasMessage.class);//主要信息
            String nowTime= TimeToString.getNowTimeString();//当前时间
            villasMessage.setUpdateTime(nowTime);
            try {
                villasMessageDao.updateByPrimaryKeySelective(villasMessage);
            }catch (Exception e){
                resultMap.put("code",1);
                resultMap.put("msg","更新VillasMessage（搜索条件）出错");
                return resultMap;
            }

        }

        if (map.get("investigate")!=null){
            Investigate investigate=MapUtils.mapToBean((Map<String, Object>) map.get("investigate"),Investigate.class)  ;//调查信息
            try {
                investigateDao.updateInvestigate(investigate);
            }catch (Exception e){
                resultMap.put("code",1);
                resultMap.put("msg","更新Investigate（调查信息）出错");
                return resultMap;
            }
        }

        if (map.get("interviewRecord")!=null){
            InterviewRecord interviewRecord=MapUtils.mapToBean((Map<String, Object>) map.get("interviewRecord"),InterviewRecord.class);//访谈记录+宗族
            try {
                interviewRecordDao.updateInterviewRecord(interviewRecord);
            }catch (Exception e){
                resultMap.put("code",1);
                resultMap.put("msg","更新InterviewRecord（访谈+宗族信息）出错");
                return resultMap;
            }
        }


        resultMap.put("code",0);
        resultMap.put("msg","更新成功");



        return resultMap;
    }

    @Override
    public Map deleteMessageAll(String buildNo) {
        Map resultMap=new HashMap();
        try {
            villasMessageDao.deleteByPrimaryKey(buildNo);
        }catch (Exception e){
            resultMap.put("code",1);
            resultMap.put("msg","删除主要信息出错");
            return resultMap;
        }

        try {
            interviewRecordDao.delete(buildNo);
        }catch (Exception e){
            resultMap.put("code",1);
            resultMap.put("msg","删除访谈纪录出错");
            return resultMap;
        }

        try {
            investigateDao.delete(buildNo);
        }catch (Exception e){
            resultMap.put("code",1);
            resultMap.put("msg","删除调查出错");
            return resultMap;
        }

        try {
            photoDao.deleteAll(buildNo);
            sketchDao.deleteAll(buildNo);
        }catch (Exception e){
            resultMap.put("code",1);
            resultMap.put("msg","删除图片出错");
            return resultMap;
        }

        resultMap.put("code",0);
        resultMap.put("msg","删除成功");
        return resultMap;
    }
}
