package com.practice.develop.expExcel;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;

/**
 * 类描述：Jxl创建Excel文件
 * Created by 李泽阳 on 2019/4/24
 */
public class JxlExpExcel {

    public static void Jxl() throws Exception {
        String[] title = {"id", "name", "sex"};
        //创建文件（说明：指向文件，而不是目录）
        //File file = new File("c:/JavaExcel");
        File file = new File("c:/JavaExcel/Jxl.xls");
        file.createNewFile();
        WritableWorkbook workbook = Workbook.createWorkbook(file); //创建工作簿
        WritableSheet sheet = workbook.createSheet("sheet1", 0);  //创建sheet1页面
        Label label = null; //给sheet页添加数据
        //第一行设置列名
        for (int i = 0; i < title.length; i++) {
            label = new Label(i, 0, title[i]);//第一行添加标题数据
            sheet.addCell(label);
        }
        //追加数据
        for (int i = 0; i < 10; i++) {
            label = new Label(0, i, "a" + 1);//第一个参数代表列，第二个代表行，第三个代表数据
            sheet.addCell(label);
            label = new Label(1, i, "user" + i);
            sheet.addCell(label);
            label = new Label(2, i, "男" + i);
            sheet.addCell(label);
        }
        workbook.write();//写入数据
        workbook.close();//关闭流


    }

}
