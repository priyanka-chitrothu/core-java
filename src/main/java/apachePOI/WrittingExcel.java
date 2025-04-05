package apachePOI;

//Workbook->sheet->Rows->Cells

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WrittingExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Emp Info");

        Object empdata[][] = {{"Emp ID", "Name", "Job"},
                {101, "David", "Engineer"},
                {102, "Druv", "Doctor"},
                {101, "Dharm", "Civil Engineer"}
        };

        //Using for loop
        int rows = empdata.length;
        int cols = empdata[0].length;

        System.out.println(rows);
        System.out.println(cols);

        for(int r=0;r<rows;r++){
            XSSFRow row = sheet.createRow(r);
            for(int c=0;c<cols;c++){
                XSSFCell cell = row.createCell(c);
                Object value=empdata[r][c];
                if(value instanceof String)
                    cell.setCellValue((String) value);
                if(value instanceof Integer)
                    cell.setCellValue((Integer) value);
                if(value instanceof Boolean)
                    cell.setCellValue((Boolean) value);
            }
        }
      String filepath = "C:\\workspace\\ProjectMaven_1\\src\\dataFiles\\employee.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filepath);
        workbook.write(outputStream);
         outputStream.close();

         System.out.println("Written data sucessfully");

    }
}
