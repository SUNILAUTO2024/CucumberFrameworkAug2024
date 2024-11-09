package com.vtiger.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClass {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("http://localhost:100");
       // driver.findElement(By.name("user_name")).sendKeys("admin");
        WebElement login_Theme = driver.findElement(By.name("login_theme"));
        Select sl = new Select(login_Theme);
        List<WebElement> theme = sl.getOptions();
        int index =0;
        for (WebElement s:theme){
            System.out.println("Value of DD at index "+index+" is = "+s.getText());
            index++;
        }
        System.out.println(" DD options are = "+theme.size());
        System.out.println("Currently selected option is = "+sl.getFirstSelectedOption().getText());






    }


}
