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

    @FindBy(xpath = "//input[@title='Save [Alt+S]']")
    WebElement btn_save;

    @FindBy(name = "ticket_title")
    WebElement tb_T_Title;

    public void setSubject(String subject) {
        //tb_Subject.sendKeys(subject);
    }

    public void setTitle(String Title) {
       SetInput(tb_T_Title,Title,"Title is set on New Ticket page");
    }


    public void clickSave() {
        ClickElement(btn_save,"Clicked on Save button on New Ticket page");
    }

    public String get_Alert_Text() {
        return Alert_GetText("User Get the Alert Text and verified it");
    }

    public void Accept_Alert() {
        Alert_Accept("Accepted Alert");
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
        String Categ = getDDValues(DD_Category,"Verified all options in Category DD");
        return Categ;
    }

    public String selected_Priority() {
        String prio = get_selected_DD_Option(DD_Priority,"Current selected Priority DD options is verified");
        return prio;
    }
    public String selected_Severity() {
        String sever = get_selected_DD_Option(DD_Severity,"Current selected Severity DD options is verified");
        return sever;
    }
    public String selected_Category() {
        String Categ = get_selected_DD_Option(DD_Category,"Current selected Category DD options is verified");
        return Categ;
    }

    public void select_Priority(String priority) {
        selectByValue(DD_Priority,priority,"Selected Priority from DD");

    }
    public void select_Severity(String severity) {
        selectVisibleText(DD_Severity,severity,"Selected Severity from DD");

    }
    public void select_Category(String category) {
        selectByValue(DD_Category,category,"Selected Category from DD");

    }







}
