package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
    /**
     * in this method we will learn how to read from an excel file step by step
     */
    @Test
    public void readFromExcelFile() throws IOException {
        String path = "SampleDataOne.xlsx";

        //to be able to read from excel file we need to load it into FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook > sheet > row > cell

        //1. create a new workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //2. we need to get the specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        //3. select row and cell - print out cell for first employee
        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));

        //print out job id for third employee
        System.out.println("sheet.getRow(3).getCell(2) = " + sheet.getRow(3).getCell(2));

        //print out kogas last name
        System.out.println("sheet.getRow(4).getCell(1) = " + sheet.getRow(4).getCell(1));

        /**
         * return the count of used cells only
         * if there are unused cells, they will not be counted
         * will not count empty rows or cells
         * starts counting from 1 - think of it counting length or size
         */
        int usedRows = sheet.getPhysicalNumberOfRows();

        /**
         * returns the number from the top cell to the bottom cell
         * does not care if there are empty cells
         * starts counting from 0 (more like index numbers)
         */
        int lastUsedRow = sheet.getLastRowNum();

        // TODO: create a logic to print out last name dynamically - searches through and prints once it finds that name

        for (int rowNum = 0; rowNum < usedRows; rowNum++){

            if(sheet.getRow(rowNum).getCell(0).toString().equals("Koga")){
                System.out.println("printing from the loop " + sheet.getRow(rowNum).getCell(0));
            }
        }

        // TODO: create a logic to print out job for matt

        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Matt")){
                System.out.println("matts job - " + sheet.getRow(rowNum).getCell(2));
            }
        }
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Athena")){
                System.out.println("athena's job - " + sheet.getRow(rowNum).getCell(2));
            }
        }

        someonesJob("Koga");
        someonesJob("Angela");

    }
    public static void someonesJob(String name) throws IOException {
        String path = "SampleDataOne.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int usedRows = sheet.getPhysicalNumberOfRows();
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals(name)){
                System.out.println(name + " job - " + sheet.getRow(rowNum).getCell(2));
            }
        }
    }
}
