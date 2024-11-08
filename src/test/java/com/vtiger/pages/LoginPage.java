package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.Utility.PageActions;
import io.cucumber.java.gl.Logo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends PageActions {

 //public WebDriver driver;

 public LoginPage(WebDriver driver, ExtentTest logger){
     super(driver,logger);
     this.driver= driver;
     PageFactory.initElements(driver,this);}

 @FindBy(name = "user_name")
    WebElement username;

    @FindBy(name ="user_password")
    WebElement password;

    @FindBy(name = "Login")
    WebElement Login;

    @FindBy(name = "login_theme")
    WebElement Lg_Theme;

    @FindBy(xpath = "//*[contains(text(),'You must specify a valid username and password.')]")
    WebElement errMsg;

    @FindBy(xpath = "//img[@src='include/images/vtiger-crm.gif']")
    WebElement logo;


//    String username = "user_name";
//    String password = "user_password";
//    String login = "//input[@title='Login [Alt+L]']";

//    By username = By.name("user_name");
//    By password = By.name("user_password");
//    By login = By.xpath("//input[@title='Login [Alt+L]']");


            public void login(String uid, String pwd) {


                try {
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

                    wait.until(ExpectedConditions.visibilityOf(username));
                    verifyLogo();
                  //  verifyErrorMsg();
                    setUsername(uid);
                    setPassword(pwd);
                    clickLogin();
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }

    public void login(String uid, String pwd, String theme) {
                try{
                    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

                    setUsername(uid);
                    setPassword(pwd);
                    selectTheme(theme);
                    clickLogin();
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }

        }


//    public void inValid_Login() {
//        username.sendKeys("admin12322");
//        password.sendKeys("admin1123");
//        Login.click();
//    }

    public void setUsername(String uid) {

                SetInput(username,uid,uid+" has been entered into username field");
    }

    public void selectTheme(String themeValue){

                selectVisibleText(Lg_Theme,themeValue,themeValue+" has been Selected from DD");
            }


    public void setPassword(String pwd) {

                SetInput(password,pwd,pwd+" has been entered into password field");
    }
    public void clickLogin() {
      ClickElement(Login," login button is clicked");
    }
    public void verifyLogo() {
        ElementExists(logo," logo is displayed on Login Page");
    }

    public void verifyErrorMsg() {
        ElementExists(errMsg,"Error message validated successfully");
    }
    public void VerifyLogin() {
        ElementExists(Login,"Login button exists and validated");
    }




}
