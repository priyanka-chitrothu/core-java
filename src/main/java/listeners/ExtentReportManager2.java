package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class ExtentReportManager2 {
    public static void main(String[] args) throws IOException {
        ExtentReports extentReports = new ExtentReports();
        File file =new File("C:\\Users\\karth\\Documents");
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(file);
        extentReports.attachReporter(extentSparkReporter);

        extentReports.createTest(" Text based Test")
                .log(Status.INFO, "info")
                .log(Status.INFO, "<b>info2<b>")
                .log(Status.INFO, "<i>infoo2<i>");
         String xmlData = "<menu id=\"file\" value=\"File\">\n" +
                 "  <popup>\n" +
                 "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\n" +
                 "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\n" +
                 "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\n" +
                 "  </popup>\n" +
                 "</menu>";
         String jsonData = "{\"menu\": {\n" +
                 "  \"id\": \"file\",\n" +
                 "  \"value\": \"File\",\n" +
                 "  \"popup\": {\n" +
                 "    \"menuitem\": [\n" +
                 "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n" +
                 "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n" +
                 "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n" +
                 "    ]\n" +
                 "  }\n" +
                 "}}";
        extentReports.createTest(" XML based Test")
                .info(MarkupHelper.createCodeBlock(xmlData, CodeLanguage.XML));
        extentReports.createTest(" Json based Test")
                .log(Status.INFO, MarkupHelper.createCodeBlock(jsonData,CodeLanguage.JSON));

        List<String> listData = new ArrayList<>();
        listData.add("Ram");
        listData.add("Sita");
        listData.add("Laxman");

        Map<Integer, String> mapData = new HashMap<>();
        mapData.put(101, "Ram");
        mapData.put(102, "Sita");
        mapData.put(103, "Laxman");

        Set<Integer> setData = mapData.keySet();

        extentReports
                .createTest("List based Test")
                        .info(MarkupHelper.createOrderedList(listData))
                                .info(MarkupHelper.createUnorderedList(listData));
        extentReports
                .createTest("Set based Test")
                .info(MarkupHelper.createOrderedList(setData))
                .info(MarkupHelper.createUnorderedList(setData));

        extentReports
                .createTest("MAP based Test")
                .info(MarkupHelper.createOrderedList(mapData))
                .info(MarkupHelper.createUnorderedList(mapData));

        extentReports
                .createTest("Highlight log Test")
                        .info(MarkupHelper.createLabel("This is a highlighted message", ExtentColor.ORANGE));
        try{
            int i = 5/0;
        } catch (Exception e) {
            extentReports
                    .createTest("Expection Test1")
                    .info(e);
        }
        Throwable t = new RuntimeException("This is Custom Exception");
        extentReports
                .createTest("Execption Test2")
                        .info(t);
        extentReports.flush();
        Desktop.getDesktop().browse(new File("C:\\Users\\karth\\Documents").toURI());
    }


}