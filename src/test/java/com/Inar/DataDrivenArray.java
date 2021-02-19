package com.Inar;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class DataDrivenArray {
    DataDrivenArray() {
    }


    public String[] getTestCaseInfo(String testCase, String fileName) throws IOException {

        // FileInputStream argument
        FileInputStream fis = new FileInputStream("/Users/hamzaalicetin/Desktop/ExcelDriven/" + fileName + ".xls");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int numberOfSheet = workbook.getNumberOfSheets();


        String[] arr = new String[4];
        String testName = "";
        String data1 = "";
        String data2 = "";
        String data3 = "";
        for (int i = 0; i < numberOfSheet; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> cellsOfFirstRow = firstRow.iterator();
                int columnIndexOfTestcases = 0;
                int columnIndexOfdata1 = 0;
                int columnIndexOfdata2 = 0;
                int columnIndexOfdata3 = 0;

                int k = 0;
                int l = 0;
                int m = 0;
                int n = 0;

                while (cellsOfFirstRow.hasNext()) {
                    Cell value = cellsOfFirstRow.next();
                    switch (value.getStringCellValue()) {
                        case "Testcases":
                            columnIndexOfTestcases = k;
                            break;
                        case "Data1":
                            columnIndexOfdata1 = l;
                            break;
                        case "Data2":
                            columnIndexOfdata2 = m;
                            break;
                        case "Data3":
                            columnIndexOfdata3 = n;
                            break;
                    }
                    k++;
                    l++;
                    m++;
                    n++;
                }


                int indexOfRow = 0;
                while (rows.hasNext()) {
                    Row r = rows.next();
                    Cell testCaseCell = r.getCell(columnIndexOfTestcases);
                    Cell data1Cell = r.getCell(columnIndexOfdata1);
                    Cell data2Cell = r.getCell(columnIndexOfdata2);
                    Cell data3Cell = r.getCell(columnIndexOfdata3);

                    if (testCaseCell.getCellType() == CellType.STRING) {
                        testName = testCaseCell.getStringCellValue();
                    } else {
                        testName = NumberToTextConverter.toText(testCaseCell.getNumericCellValue());
                    }

                    if (data1Cell.getCellType() == CellType.STRING) {
                        data1 = data1Cell.getStringCellValue();
                    } else {
                        data1 = NumberToTextConverter.toText(data1Cell.getNumericCellValue());
                    }
                    if (data2Cell.getCellType() == CellType.STRING) {
                        data2 = data2Cell.getStringCellValue();
                    } else {
                        data2 = NumberToTextConverter.toText(data2Cell.getNumericCellValue());
                    }
                    if (data2Cell.getCellType() == CellType.STRING) {
                        data2 = data2Cell.getStringCellValue();
                    } else {
                        data2 = NumberToTextConverter.toText(data2Cell.getNumericCellValue());
                    }
                    if (data3Cell.getCellType() == CellType.STRING) {
                        data3 = data3Cell.getStringCellValue();
                    } else {
                        data3 = NumberToTextConverter.toText(data3Cell.getNumericCellValue());
                    }


                    if (testName.equalsIgnoreCase(testCase)) {
                        arr[0] = testName;
                        arr[1] = data1;
                        arr[2] = data2;
                        arr[3] = data3;
                    }
                    indexOfRow++;

                }


            }
        }
        return arr;

    }

    public void displayTestCaseInfo(String[] arr) {
        System.out.println("TastCase : " + arr[0]);
        System.out.println("Data 1 : " + arr[1]);
        System.out.println("Data 2 : " + arr[2]);
        System.out.println("Data 3 : " + arr[3]);
    }
}

