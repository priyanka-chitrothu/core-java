package apachePOI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class WrittingExcelUsingForeach {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Emp Info");

        ArrayList<Object[]> empdata = new ArrayList<Object[]>();

        empdata.add(new Object[]{"Emp ID", "Name", "Job"});
        empdata.add(new Object[]{101, "David", "Engineer"});
        empdata.add(new Object[]{102, "Druv", "Doctor"});
        empdata.add(new Object[]{101, "Dharm", "Civil Engineer"});



        //using for each... loop
        int rowCount = 0;
        for(Object emp[]:empdata){
            XSSFRow row = sheet.createRow(rowCount++);
            int columnCount =0 ;
            for(Object value:emp){
               XSSFCell cell=  row.createCell(columnCount++);
               if(value instanceof String)
                   cell.setCellValue((String) value);
                if(value instanceof Integer)
                    cell.setCellValue((Integer) value);
                if(value instanceof Boolean)
                    cell.setCellValue((Boolean) value);


            }
        }


        String filepath = "C:\\workspace\\ProjectMaven_1\\src\\dataFiles\\employee1.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filepath);
        workbook.write(outputStream);
        outputStream.close();

        System.out.println("Written data sucessfully");

    }
}
