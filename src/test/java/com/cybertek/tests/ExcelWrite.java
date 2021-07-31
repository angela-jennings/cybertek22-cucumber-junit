package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void excelWritingTest() throws IOException {
        String path = "SampleDataOne.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Sheet1");

        //jennings row
        row = sheet.getRow(1);

        //jennings cell
        cell = row.getCell(1);

        //kogas cell
        XSSFCell kogasCell = sheet.getRow(4).getCell(0);

        System.out.println("Before: " + kogasCell);

        //this method overrides existing cell
        kogasCell.setCellValue("Kogurt");

        System.out.println("After: " + kogasCell);

        //use fileOutputStream to push changes
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        //write to file using fileOutputStream
        workbook.write(fileOutputStream);

        // TODO: change angela's name to tom
        for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {

            if(sheet.getRow(rowNum).getCell(0).toString().equals("Angela")){
                sheet.getRow(rowNum).getCell(0).setCellValue("Tom");
            }
        }




        //=====================================================================================

        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();


    }
}
