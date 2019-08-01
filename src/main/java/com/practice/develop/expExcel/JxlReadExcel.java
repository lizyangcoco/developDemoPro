package com.practice.develop.expExcel;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 类描述：Jxl解析Excel
 * Created by 李泽阳 on 2019/4/25
 */
public class JxlReadExcel {

    public static void read() throws Exception {
        Workbook workbook = Workbook.getWorkbook(new File("c:/JavaExcel/Jxl.xls"));//创建workbook
        Sheet sheet = workbook.getSheet(0);//获取第一个工作表sheet(0)页
        //获取数据,row行参数
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < sheet.getRows(); i++) {
            //columns列参数
            for (int j = 0; j < sheet.getColumns(); j++) {
                Cell cell = sheet.getCell(j, i);//获取单元格
                System.out.print(cell.getContents() + "    ");
            }
        }
    }

}
