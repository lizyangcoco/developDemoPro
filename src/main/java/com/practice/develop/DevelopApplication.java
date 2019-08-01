package com.practice.develop;

import com.practice.develop.expExcel.JxlExpExcel;
import com.practice.develop.expExcel.JxlReadExcel;
import com.practice.develop.expExcel.PoiExpExcel;
import com.practice.develop.expExcel.PoiReadExcel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DevelopApplication {
    private static Logger logger = Logger.getLogger(String.valueOf(DevelopApplication.class));

    public static void main(String[] args) {
        SpringApplication.run(DevelopApplication.class, args);
        try {
            //JxlExpExcel.Jxl();//导出excel数据,Jxl
            //JxlReadExcel.read();//解析excel数据，Jxl
            //PoiExpExcel.poiExp();//导出excel数据，poi
            //PoiReadExcel.readPoi();//解析excel数据，poi
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("================开始启动===============");
        logger.info("================启动成功===============");
    }

}

