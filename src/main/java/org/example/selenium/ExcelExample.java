package org.example.selenium;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelExample {
    public static void main(String[] args) throws IOException {
        // Create a new workbook (XSSFWorkbook for .xlsx format)
        Workbook workbook = new XSSFWorkbook();

        // Create a new sheet in the workbook
        Sheet sheet = workbook.createSheet("Sheet1");

        // Create a row in the sheet
        Row row = sheet.createRow(0);

        // Create a cell in the row and set a value
        Cell cell = row.createCell(0);
        cell.setCellValue("Hello, Apache POI!");

        // Save the workbook to a file
        try (FileOutputStream fileOut = new FileOutputStream("workbook_example.xlsx")) {
            workbook.write(fileOut);
        }

        // Close the workbook to free resources
        workbook.close();

        System.out.println("Excel file created successfully.");
    }
}
