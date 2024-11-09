package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.Utility.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends PageActions {
    public HeaderPage(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Logout")
    WebElement lnk_logout;

    @FindBy(linkText = "New Lead")
    WebElement lnk_NewLead;

    @FindBy(linkText = "Leads")
    WebElement lnk_Lead;

    @FindBy(linkText = "Home")
    WebElement lnk_Home;

    @FindBy(linkText = "New Account")
    WebElement New_Account;

    @FindBy(linkText = "New Contact")
    WebElement New_Contact;

    @FindBy(linkText = "New Potential")
    WebElement New_Potential;

    @FindBy(linkText = "New Ticket")
    WebElement New_Ticket;


//    @FindBy(xpath = "//[contains(text(),'You must specify a valid username and password.')]")
//    WebElement errMsg;
//
//    @FindBy(xpath = "//img[@//src=\"include/images/vtiger-crm.gif]")
//    WebElement logo;

    public void verifyLogOut() {
        ElementExists(lnk_logout," Logout link is exists in Home page");
    }

    public void ClickLogOut() {

        ClickElement(lnk_logout,"Click on Logout link");
    }
    public void clickNewLead() {

        ClickElement(lnk_NewLead," Clicked on New Lead link");
    }
    public void verifyNewLead() {

        ElementExists(lnk_NewLead," Link New lead is exists on Home page");
    }
    public void verifyLead() {

        ElementExists(lnk_Lead,"Lead link is displayed on Home page");
    }
    public void clickLead() {

        ClickElement(lnk_Lead," Successfully clicked on Lead link");
    }
    public void verifyHome() {

        ClickElement(lnk_Home," Home link is Displayed on Home page");
    }

    public void clickNewAccount() {

        ClickElement(New_Account," Successfully clicked on New Account link");
    }

    public void clickNContact() {

        ClickElement(New_Contact," Successfully clicked on New Contact link");
    }

public void Cick_N_Potential(){
        ClickElement(New_Potential,"Successfully clicked on New Pontential link");
}
        public void click_NewTicket(){
        ClickElement(New_Ticket,"Successfully clicked on New Ticket link");



}}
