package com.zhao.utils.excel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ExcelUtils {

    /*
     * 导出excel常用的组件有以下几种
     *  1.HSSFWorkbook excel的文档对象
     *  2.HSSFSheet  excel的表单
     *  3.HSSFRow    excel的行
     *  4.HSSFCell   excel的格子单元
     *  5.HSSFFONT   excel字体
     *
     *
     *  1、用HSSFWorkbook打开或者创建“Excel文件对象
     *  2、用HSSFWorkbook对象返回或者创建Sheet对象
     *  3、用Sheet对象返回行对象，用行对象得到Cell对象
     *  4、对Cell对象读写。
     */

    /*
     * 参数
     *  1.sheetName
     */

    public static boolean getHSSFWorkbook(String sheetName, String []title, String [][]values , String filePath)  {
        OutputStream outputStream = null ;
        try {
            // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
            HSSFWorkbook wb = new HSSFWorkbook();

            // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
            HSSFSheet sheet = wb.createSheet(sheetName);

            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
            HSSFRow row = sheet.createRow(0);

            // 第四步，创建单元格，并设置值表头 设置表头居中
            HSSFCellStyle style = wb.createCellStyle();
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

            //声明列对象
            HSSFCell cell = null;

            //创建标题
            for(int i=0;i<title.length;i++){
                cell = row.createCell(i);
                cell.setCellValue(title[i]);
                cell.setCellStyle(style);
            }

            //创建内容
            for(int i=0;i<values.length;i++){
                row = sheet.createRow(i + 1);
                for(int j=0;j<values[i].length;j++){
                    //将内容按顺序赋给对应的列对象
                    row.createCell(j).setCellValue(values[i][j]);
                }
            }
            File file = new File(filePath);
            if(!file.exists()) {
                file.createNewFile();
            }
            outputStream = new FileOutputStream(filePath);
            wb.write(outputStream);
            outputStream.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws IOException {
        String sheet = "爱你表";
        String[] title = {"第一列","第二列"};
        String[][] values = {{"mamabi","nishishei"},{"woshiniba","woshinima"}};
        getHSSFWorkbook(sheet,title,values,"/home/zhaohuan1/hahaha.xlsx");



    }

}
