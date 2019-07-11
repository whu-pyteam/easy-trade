package com.pyteam.db.utils;


import com.alibaba.fastjson.JSON;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;


/**
 * @author tyc
 * @date 2019/7/9 9:19
 */
@Log
@Component
public class QiniuUtil
{

    @Value("${qiniu.accessKey}")
    private String accessKey;

    @Value("${qiniu.secretKey}")
    private String secretKey;

    @Value("${qiniu.bucket}")
    private String bucket;

    @Value("${qiniu.path}")
    private String path;

    /**
     * 将图片上传到七牛云
     * @param multipartFile
     * @param key 保存在空间中的名字，如果为空会使用文件的hash值为文件名
     * @return
     */
    public String uploadImg(MultipartFile multipartFile, String key) throws IOException
    {
        FileInputStream file = (FileInputStream) multipartFile.getInputStream();
        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone0());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        try {
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            try {
                Response response = uploadManager.put(file, key, upToken, null, null);
                //解析上传成功的结果
                DefaultPutRet putRet = JSON.parseObject(response.bodyString(), DefaultPutRet.class);

                String returnPath = "http://" + path+"/"+putRet.key;
                log.info("图片链接: " + returnPath);
                return returnPath;
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * @param multipartFile
     * @return
     * @throws IOException
     */
    public String uploadImg(MultipartFile multipartFile) throws IOException
    {
        String fileName = multipartFile.getOriginalFilename();
        log.info("图片名: " + fileName);

        assert fileName != null;
        return  this.uploadImg(multipartFile, System.currentTimeMillis() + fileName.substring(fileName.lastIndexOf(".")));
    }

}
