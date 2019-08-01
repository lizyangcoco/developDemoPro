package com.practice.develop.expExcel;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;

/**
 * 类描述：poi解析excel文件
 * Created by 李泽阳 on 2019/4/25
 */
public class PoiReadExcel {

    public static void readPoi() throws Exception {
        File file = new File("c:/JavaExcel/poi.xls");//需要解析的Excel
        HSSFWorkbook workbook = new HSSFWorkbook(FileUtils.openInputStream(file));//创建Excel,读取文件内容
        //读取文件第一个sheet文件
        //HSSFSheet sheet=workbook.getSheet("Sheet0");//通过文件名称获取
        HSSFSheet sheet = workbook.getSheetAt(0);//通过下标获取文件，第一页
        int firstRowNum = 0;
        //获取sheet中最后一行行号
        int lastRowNum = sheet.getLastRowNum();
        for (int i = firstRowNum; i < lastRowNum; i++) {
            HSSFRow row = sheet.getRow(i);
            //获取行内单元格号
            int lastCellNum = row.getLastCellNum();
            for (int j = 0; j < lastCellNum; j++) {
                HSSFCell cell = row.getCell(j);
                String value = cell.getStringCellValue();
                System.out.print(value);
            }
        }

    }


}
