package com.vtiger.pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;

public class Page_Object_Model {

  public static WebDriver driver;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;
    public HeaderPage HDPage;
    public LoginPage LogINPage;
    public LeadPage LdPage;
    public AccountPage AccPage;
    public ContactPage ContPage;
    public Potential_Page Potenl_P;
    public HomePage HMPage;


    public LoginPage getLoginPage(){
//        if(lp==null){
//            return  lp=new LoginPage(driver,logger);
//        }
//        else {
//            return lp;}
        // instead of this - user terminary operator
    return LogINPage=(LogINPage==null) ? new LoginPage(driver,logger) : LogINPage;
    }

    public HeaderPage getHeaderPage(){
        return HDPage=(HDPage==null) ? new HeaderPage(driver,logger) : HDPage;
    }

    public LeadPage getLeadPage(){
        return LdPage=(LdPage==null) ? new LeadPage(driver,logger) : LdPage;
    }


   // keep void - still doing changes on homepage
    public void getHomePage(){
       // return HMPage=(HMPage==null) ? new HomePage(driver,logger) : HMPage;
    }

    public AccountPage getAccountPage(){
        return AccPage=(AccPage==null) ? new AccountPage(driver,logger) : AccPage;
    }//ContPage
//
    public ContactPage getContactPage(){
        return ContPage=(ContPage==null) ? new ContactPage(driver,logger) : ContPage;
    }

    public Potential_Page getPotenl_P(){
        return Potenl_P=(Potenl_P==null) ? new Potential_Page(driver,logger) : Potenl_P;
    }







}
