package com.pyteam.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author tyc
 * @date 2019/7/9 9:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QiniuTest
{
    // @Autowired
    // QiniuUtil qiniuUtil;
    //
    // /**
    //  * 图片上传测试
    //  * @throws FileNotFoundException
    //  */
    // @Test
    // public void imgUploadTest() throws FileNotFoundException
    // {
    //     String fileName = "C:\\Users\\20163\\Desktop\\捕获.PNG";
    //     File file = new File(fileName);
    //     FileInputStream fileInputStream = new FileInputStream(file);
    //     qiniuUtil.uploadImg(fileInputStream, "test");
    // }
}
