package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class Potential_Page  extends HeaderPage {

    public Potential_Page(WebDriver driver, ExtentTest logger) {
        super(driver,logger);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='potentialname']")
    WebElement tb_PotentialN;

    @FindBy(xpath = "//input[@title='Change']")
    WebElement btn_Change;

    @FindBy(name = "button")
    WebElement btn_save;


    public void Create_Potential(String Pname){

        set_Potential_N(Pname);

        click_Change();
        clickSave();

    }



    public void switch_Frames(){

        Set<String> hnd = driver.getWindowHandles();
        System.out.println(hnd);

        SetInput(tb_PotentialN, String.valueOf(tb_PotentialN)," Last Name is set on New Account page");
    }

    public void set_Potential_N(String P_Name){

        SetInput(tb_PotentialN,P_Name," Potential Name is set on New Potential page");
    }

    public void click_Change(){
        ClickElement(btn_Change,"Clicked on Change button on New Potential page");
    }

    public void clickSave(){

        ClickElement(btn_save,"Clicked on Save button on New Potential page");
    }




}
