package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage extends HeaderPage {

    public LeadPage(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "lastname")
    WebElement tb_lastname;

    @FindBy(name = "company")
    WebElement tb_company;

    @FindBy(xpath = "//input[@title='Save [Alt+S]']")
    WebElement btn_save;

    @FindBy(xpath = "//input[@title='Convert [Alt+C]']") //
    WebElement btn_convert;

    @FindBy(name = "Duplicate")
        WebElement btn_Duplicate;


    public void creatLead(String lname, String comp){
        setLastName(lname);
        setCompName(comp);
        clickSave();
    }
    public void setLastName(String lname){

        SetInput(tb_lastname,lname," Last Name is set on New Lead page");
    }

    public void setCompName(String CompName){

        SetInput(tb_company,CompName," Company Name is set on New Lead page");
    }

    public void clickSave(){

        ClickElement(btn_save,"Clicked on Save button on New Lead page");
    }

    public void verify_Duplicate(){
        ElementExists(btn_Duplicate,"Duplicate button is visible post save details");
    }

    public void verify_Convert(){
        ElementExists(btn_convert,"Convert button is visible post save details");
    }

}
