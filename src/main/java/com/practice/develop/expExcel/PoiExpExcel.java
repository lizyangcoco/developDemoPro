package com.practice.develop.expExcel;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 类描述：poi生成excel文件
 * Created by 李泽阳 on 2019/4/25
 */
public class PoiExpExcel {

    public static void poiExp() throws Exception {
        String[] title = {"poi", "name", "sex"};
        HSSFWorkbook workbook = new HSSFWorkbook();//创建Excel工作簿
        HSSFSheet sheet = workbook.createSheet();//创建一个工作表sheet
        HSSFRow row = sheet.createRow(0);//创建第一行
        HSSFCell cell = null;//创建单元格
        //插入第一行数据、id、name、sex
        for (int i = 0; i < title.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
        }
        //追加数据
        for (int i = 1; i < 10; i++) {
            HSSFRow nextRow = sheet.createRow(i);//创建第二行单元格
            HSSFCell cell2 = nextRow.createCell(0);
            cell2.setCellValue("a" + i);
            cell2 = nextRow.createCell(1);
            cell2.setCellValue("user" + i);
            cell2 = nextRow.createCell(2);
            cell2.setCellValue("男" + i);
        }
        String i = "m";
        //创建一个文件：文件路径名称可更新
        File file = new File("c:/JavaExcel/" + i + "poi.xls");
        FileOutputStream stream = FileUtils.openOutputStream(file);//文件流
        workbook.write(stream);//写入流
        stream.close();//关闭流

    }
}
