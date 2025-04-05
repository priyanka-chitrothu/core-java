package apachePOI;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFormulaCell {
    public static void main(String[] args) throws IOException {
        String path ="C:\\workspace\\ProjectMaven_1\\src\\dataFiles\\bookPrice.xlsx ";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheetAt(0);
        sheet.getRow(6).getCell(2).setCellFormula("SUM(C2:C6)");
        fis.close();

        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos);
        workbook.close();

    }
}
