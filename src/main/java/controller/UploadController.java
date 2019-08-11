package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import utils.FileUpload;

import java.util.Map;

@Controller
@RequestMapping("upload")
public class UploadController {



    /**
     * 上传汇款照片
     * @param file
     * @return
     */
    @RequestMapping("uploadVillaImg")
    @ResponseBody
    public Map uploadImg(@RequestParam("file") MultipartFile file){
        String fileName= FileUpload.getFileName();
        Map result= FileUpload.copyPaymentBillImg(file,fileName);

        return result;
    }

    @RequestMapping("deleteVillaImg")
    @ResponseBody
    public Map deleteImg(@RequestBody Map map ){
        String path=map.get("path").toString();
        return FileUpload.deleteFile(path);
    }

}
