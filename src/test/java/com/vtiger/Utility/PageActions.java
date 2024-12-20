package com.vtiger.Utility;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.utils.FileUtil;
import com.codoid.products.utils.FilenameUtils;
//import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

public class PageActions {

public WebDriver driver;
public WebDriverWait wait;
public ExtentTest logger;

public PageActions(WebDriver driver, ExtentTest logger){
    this.driver=driver;
    this.logger=logger;
    wait = new WebDriverWait(driver, Duration.ofSeconds(5));

}

public String getScreenshot(){

    Date d = new Date();
    DateFormat ft = new SimpleDateFormat("ddMMyyyymmss");
    String fileName = ft.format(d);
    String path=System.getProperty("user.dir")+"/src/test/java/com/vtiger/reports/Screenhot/"+fileName+".png";

    TakesScreenshot ts = ((TakesScreenshot) driver);

    File srcFile = ts.getScreenshotAs(OutputType.FILE);
    //Move image file to new Destination

    File DestFile = new File(path);
    //copy file at destination

    try{

        FileUtils.copyFile(srcFile, DestFile);

    }
    catch (IOException e){
        //TODO autogenerate  catch block
        e.printStackTrace();
    }
return path;
}




public void SetInput(WebElement elm, String value,String msg){

    try{
        wait.until(ExpectedConditions.visibilityOf(elm));
        elm.clear();
        elm.sendKeys(value);
        logger.pass(msg);
    }
    catch (Exception e){
        System.out.println(e.getMessage());
        logger.fail("Unable to set Data into text field due to error = "+e.getMessage()+"      <a href='"+getScreenshot()+"'><span class='label start-time'>Screenshot</span></a>  ");
    }
}
    public void ClickElement(WebElement elm, String msg){

        try{
            wait.until(ExpectedConditions.elementToBeClickable(elm));
            elm.click();
            logger.pass(msg);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            logger.fail("Unable to click on Element due to error = "+e.getMessage()+"      <a href='"+getScreenshot()+"'><span class='label start-time'>Screenshot</span></a>  ");
        }
    }
    public void ElementExists(WebElement elm, String msg){

        try{
            wait.until(ExpectedConditions.visibilityOf(elm));
            elm.isDisplayed();
            logger.pass(msg);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        logger.fail("Element doesn't exists due to Error =  "+e.getMessage()+" <a href='"+getScreenshot()+"'><span class='label start-time'>Screenshot</span></a>  ");
        }
    }

    public void selectVisibleText(WebElement elm,String value, String msg){

        try{
            wait.until(ExpectedConditions.visibilityOf(elm));
            Select sl = new Select(elm);
            sl.selectByVisibleText(value);
            elm.isDisplayed();
            logger.pass(msg);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

            logger.fail("Unable to Select Data from DD due to Error =  "+e.getMessage()+" <a href='"+getScreenshot()+"'><span class='label start-time'>Screenshot</span></a>  ");
        }
    }

    public void selectTextByIndex(WebElement elm,int value, String msg){

        try{
            wait.until(ExpectedConditions.visibilityOf(elm));
            Select sl = new Select(elm);
            sl.selectByIndex(value);
            elm.isDisplayed();
            logger.pass(msg);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

            logger.fail("Unable to Select Data from DD due to Error =  "+e.getMessage()+" <a href='"+getScreenshot()+"'><span class='label start-time'>Screenshot</span></a>  ");
        }
    }

    public String getDDValues(WebElement elm, String msg){

    List<String> str = new LinkedList<>();

        try{
            wait.until(ExpectedConditions.visibilityOf(elm));
            Select sl = new Select(elm);
            Iterator<WebElement> it = sl.getOptions().iterator();
            while(it.hasNext()){
                str.add(it.next().getText().toString());
            }
            System.out.println(str);
            elm.isDisplayed();
            logger.pass(msg);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

            logger.fail("Unable to Select Data from DD due to Error =  "+e.getMessage()+" <a href='"+getScreenshot()+"'><span class='label start-time'>Screenshot</span></a>  ");
        }
        return str.toString();
    }


    public void selectByValue(WebElement elm,String value, String msg){

        try{
            wait.until(ExpectedConditions.visibilityOf(elm));
            Select sl = new Select(elm);
            sl.selectByVisibleText(value);
            elm.isDisplayed();
            logger.pass(msg);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

            logger.fail("Unable to Select Data from DD due to Error =  "+e.getMessage()+" <a href='"+getScreenshot()+"'><span class='label start-time'>Screenshot</span></a>  ");
        }
    }

    public String get_selected_DD_Option(WebElement elm, String msg){
      String str =null;
        try{
            wait.until(ExpectedConditions.visibilityOf(elm));
            Select sl = new Select(elm);
            str =sl.getFirstSelectedOption().getText();
            elm.isDisplayed();
            logger.pass(msg);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

            logger.fail("Unable to get selected value from DD due to Error =  "+e.getMessage()+" <a href='"+getScreenshot()+"'><span class='label start-time'>Screenshot</span></a>  ");
        }
        return str;
    }

    public String Alert_GetText(String msg) {

        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert al = driver.switchTo().alert();
             String text = al.getText();
            System.out.println(text);
            logger.pass(msg);
            return text;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.fail("Unable to get Alert Text due to Error =  " + e.getMessage() + " <a href='" + getScreenshot() + "'><span class='label start-time'>Screenshot</span></a>  ");
        return null;
        }

    }

    public void Alert_Accept(String msg){
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert al = driver.switchTo().alert();
            al.accept();
            logger.pass(msg);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.fail("Unable to Accept Alert due to Error =  " + e.getMessage() + " <a href='" + getScreenshot() + "'><span class='label start-time'>Screenshot</span></a>  ");
        }
    }


public void Switch_ChildWindow(WebElement elm,String msg){
    try{

        Set<String> Handles = driver.getWindowHandles();
        Iterator<String> iter = Handles.iterator();
        String  ParentH = iter.next();
        System.out.println("Parent Window = "+ParentH);
        String ChildH = iter.next();
        System.out.println("Child WIndow = "+ChildH);
        driver.switchTo().window(ChildH);
        elm.click();
        driver.switchTo().window(ParentH); //Switch back to parent window of driver.
    }
    catch(Exception e){
        System.out.println(e.getMessage());
        logger.fail("Unable to verify Child Window due to Error =  " + e.getMessage() + " <a href='" + getScreenshot() + "'><span class='label start-time'>Screenshot</span></a>  ");
    }
}

    public void Switch_ParentWindow(String msg){
        try{

            Set<String> Handles = driver.getWindowHandles();
            Iterator<String> iter = Handles.iterator();
            String  ParentH = iter.next();
            System.out.println("Parent Window = "+ParentH);
            String ChildH = iter.next();
            System.out.println("Child WIndow = "+ChildH);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            logger.fail("Unable to verify Parent Window due to Error =  " + e.getMessage() + " <a href='" + getScreenshot() + "'><span class='label start-time'>Screenshot</span></a>  ");
        }
    }





}
