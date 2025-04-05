package apachePOI;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingPasswordFromProtectedExl {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("");
        String password = "test123";
        //XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFWorkbook workbook= (XSSFWorkbook) WorkbookFactory.create(fis,password);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rows =sheet.getLastRowNum();

        int cols = sheet.getRow(0).getLastCellNum();



    }
}
