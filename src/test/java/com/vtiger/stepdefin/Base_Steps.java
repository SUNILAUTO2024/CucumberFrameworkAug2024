package com.vtiger.stepdefin;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;
import com.vtiger.pages.Page_Object_Model;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.filesystem.model.File;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Base_Steps extends Page_Object_Model {

    public static Properties prop;
    public static Map<String,Map<String,String>> td;
    public static String ScenarioName;

    // Inside Base_Steps or relevant initialization class
//    public Base_Steps() {
//        td = new HashMap<>(); // Initialize here or fetch from a proper source
//    }



public void LaunchApp() throws IOException, FilloException {


  //  createExtendRePort();
    td = new HashMap<>();
    readProperties();

    readExcel(System.getProperty("user.dir")+"/src/test/resources/Data/TestData.xlsx","Sheet1");

   System.out.println(td);

   // System.exit(0);
    System.out.println("Jenkings url"+System.getProperty("url"));
    System.out.println("Jenkings browser"+System.getProperty("browser"));


    if (prop.getProperty("browser").equalsIgnoreCase("edge")){
        driver=new EdgeDriver();
    }
    else if (prop.getProperty("browser").equalsIgnoreCase("firefox")){
        driver=new FirefoxDriver();
    }
    else{
        driver=new ChromeDriver();
    }
    driver.get(prop.getProperty("appUrl"));
    LogINPage=new LoginPage(driver,logger);
    LdPage = new LeadPage(driver,logger);
}

public void readProperties() throws IOException {
     prop = new Properties();
    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.property");
     prop.load(fis);

}


public void createExtendRePort(){

    Date d = new Date();
    DateFormat ft = new SimpleDateFormat("ddMMyyyyhhmmss");
    String fileName = ft.format(d);

    htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/src/test/java/com/vtiger/reports/TestReport/ExtentReport"+fileName+".html");
    //htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir"+"/src/test/java/com/vtiger/reports/ExtentReport/"+fileName+".htlm"));
//create object of Extend Reports

    extent = new ExtentReports();

    extent.attachReporter(htmlReporter);
    extent.setSystemInfo("Host Name","ATH_By_Sunil");
    extent.setSystemInfo("Environment","Test");
    extent.setSystemInfo("User Name","SJS_Senior Lead");
    extent.setSystemInfo("Test_URL","http://localhost:100/");
    extent.setSystemInfo("Test_Perform_ON","Edge/Chrome/FireFox");
   htmlReporter.config().setDocumentTitle("Title of the Report Comes Here ===");
//Title of Document
    htmlReporter.config().setReportName("Name of the Report  - Vtiger CRM Automation_Report");
    //Name of Report
    htmlReporter.config().setTheme(Theme.DARK);//Standard
    //Theme of Report


     
}







public void readExcel(String workbook, String sheet) throws FilloException {
    Fillo fillo = new Fillo();
    Connection connection =fillo.getConnection(workbook);
    String strQuery = "Select * from "+sheet;
    Recordset recordset;
    recordset = connection.executeQuery(strQuery);
    ArrayList<String> lst =  recordset.getFieldNames();

     td = new HashMap<>();

    while (recordset.next()) {
        Map<String,String> rowdata = new HashMap<>();
        rowdata.put("column","value");
        for (String colm:lst){
            rowdata.put(colm,recordset.getField(colm));
        }
        td.put(recordset.getField("ScenarioName"), rowdata);


    }

    recordset.close();
    connection.close();


}

}
