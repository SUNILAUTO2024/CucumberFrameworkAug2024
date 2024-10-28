package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends HeaderPage {

    public AccountPage(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='accountname']")
    WebElement tb_AccName;


    @FindBy(name = "button")
    WebElement btn_save;


    public void CreateAcc(String acc){
        setAccountName(acc);
        clickSave();
    }

    public void setAccountName(String CompName){

        SetInput(tb_AccName,CompName," Account Name is set on New Account page");
    }

    public void clickSave(){

        ClickElement(btn_save,"Clicked on Save button on New Account page");
    }

//    public void click_Acc_Link(){
//
//        ClickElement(Acc_Link,"Clicked on New Account link on Home page");
//    }







}
