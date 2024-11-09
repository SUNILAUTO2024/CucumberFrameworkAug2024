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

    public String priority_DD_Options() {
        String prio = getDDValues(DD_Priority,"Verified all options in Priority DD");
        return prio;
    }
    public String Severity_DD_Options() {
        String sever = getDDValues(DD_Severity,"Verified all options in Severity DD");
        return sever;
    }
    public String Category_DD_Options() {
        String Categ = getDDValues(DD_Category,"Verified all options in Severity DD");
        return Categ;
    }

    public String selected_Priority() {
        String prio = get_selected_DD_Option(DD_Priority,"Verify default Priority DD options");
        return prio;
    }
    public String selected_Severity() {
        String sever = get_selected_DD_Option(DD_Severity,"Verify default Severity DD options");
        return sever;
    }
    public String selected_Category() {
        String Categ = get_selected_DD_Option(DD_Category,"Verify default Severity DD options");
        return Categ;
    }




}
