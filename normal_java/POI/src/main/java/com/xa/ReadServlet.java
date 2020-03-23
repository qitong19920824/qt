package com.xa;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: qitong
 * @Date: 2020/2/23 14:19
 */
@WebServlet(name = "readExcelServlet", urlPatterns = "/readExcelServlet")
public class ReadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //文件路径
        String excelPath="E:\\\\readExcelMaven\\\\test.xlsx\"";
        File excel=new File(excelPath);
        if (excel.isFile()&&excel.exists()){
            String[] split = excel.getName().split("\\.");
            Workbook wb = null;
            if ("xls".equals(split[1])){
                FileInputStream fileInputStream=new FileInputStream(excel);
                wb=new HSSFWorkbook(fileInputStream);
            }else if ("xlsx".equals(split[1])){
                try {
                    wb=new XSSFWorkbook(excel);
                } catch (InvalidFormatException e) {

                }
            }else {
                System.out.println("类型错误");
                return;
            }
            //开始解析
            Sheet sheet = wb.getSheetAt(0);//读取sheet 0
            int firstRowIndex = sheet.getFirstRowNum()+1;
            int lastRowIndex = sheet.getLastRowNum();
            System.out.println("firstRowIndex: "+firstRowIndex);
            System.out.println("lastRowIndex: "+lastRowIndex);
            for(int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) {//遍历行
                System.out.println("rIndex: " + rIndex);
                Row row = sheet.getRow(rIndex);
                if (row!=null){
                    int firstCellIndex = row.getFirstCellNum();
                    int lastCellIndex = row.getLastCellNum();
                    for (int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex++) {//遍历列
                        Cell cell = row.getCell(cIndex);
                        if (cell!=null){
                            System.out.println(cell.toString());
                        }
                    }
                    }
            }
        }else {
            System.out.println("找不到指定文件");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
