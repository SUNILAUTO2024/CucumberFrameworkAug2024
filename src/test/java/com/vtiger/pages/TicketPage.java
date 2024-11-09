package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketPage extends HeaderPage {


    public TicketPage(WebDriver driver, ExtentTest logger) {
        super(driver,logger);
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "ticketpriorities")
    WebElement DD_Priority;

    @FindBy(name = "ticketseverities")
    WebElement DD_Severity;

    @FindBy(name = "ticketcategories")
    WebElement DD_Category;

    public void setSubject(String subject) {
        //tb_Subject.sendKeys(subject);
    }

    public void setDescription(String description) {
       // tb_Description.sendKeys(description);
    }

    public void clickSave() {
     //   btn_save.click();
    }

    public String check_priority_DD_Options() {
        String prio = getDDValues(DD_Priority,"Checked Priority DD options");
        return prio;
    }
    public String check_Severity_DD_Options() {
        String sever = getDDValues(DD_Severity,"Checked Severity DD options");
        return sever;
    }
    public String check_Category_DD_Options() {
        String Categ = getDDValues(DD_Category,"Checked Severity DD options");
        return Categ;
    }





}
