package service.impl;

import dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.*;
import service.VillasMessageService;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class VillasMessageServiceImpl implements VillasMessageService {
    @Autowired
    private VillasMessageDao villasMessageDao;
    private InterviewRecordDao interviewRecordDao;
    private InvestigateDao investigateDao;
    private SketchDao sketchDao;
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
                villaS=villaS.substring(7,11);
                int villaI=Integer.parseInt(villaS);
                nums.add(villaI);

            }
            int villaIMax= Collections.max(nums);
//            order=order.substring(7,11);
            int o=10000;
//            Integer i=Integer.parseInt(order);
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


        VillasMessage villasMessage=(VillasMessage) map.get("villasMessage");//主要信息
        Investigate investigate=(Investigate) map.get("investigate") ;//调查信息
        InterviewRecord interviewRecord=(InterviewRecord) map.get("interviewRecord");//访谈记录+宗族
        List<String> photoList=(List<String>)map.get("photoList");//照片路径集合
        List<String> sketchList=(List<String>)map.get("sketchList");//草图路径集合

        String buildNo=this.getBuildNo();//编号
        villasMessage.setBuildNo(buildNo);
        interviewRecord.setBuildNo(buildNo);
        investigate.setBuildNo(buildNo);

        if (villasMessageDao.insertSelective(villasMessage)&&interviewRecordDao.insertSelective(interviewRecord)
        &&investigateDao.insertSelective(investigate)){
            if (sketchList.size()!=0){//录入草图
                int num=1;
                for(String sketchUrl:sketchList){
                    Sketch sketch=new Sketch(buildNo,sketchUrl);
                    if (!sketchDao.insertSelective(sketch)){
                        msg=msg+"第"+num+"张草图录入出错;";
                    }
                    num++;
                }
            }

            if (photoList.size()!=0){//录入照片
                int num=1;
                for(String photoUrl:photoList){
                    Photo photo=new Photo(buildNo,photoUrl);
                    if (!photoDao.insertSelective(photo)){
                        msg=msg+"第"+num+"张照片录入出错;";
                    }
                    num++;
                }
            }

        }else {
            msg=msg+"祠堂主要信息录入出错";
            resultMap.put("msg",msg);
            resultMap.put("code",1);
            return resultMap;
        }
        msg=msg+"SUCCESS";
        resultMap.put("msg",msg);
        resultMap.put("code",0);
        return resultMap;
    }
}
