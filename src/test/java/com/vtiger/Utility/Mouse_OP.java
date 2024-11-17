package com.vtiger.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_OP {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("http://localhost:100");
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).click();

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id("showSubMenu"))).perform();
        Thread.sleep(3000);
        act.click(driver.findElement(By.linkText("New Vendor"))).perform();

        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.name("Customise")).click();

        act.dragAndDrop(driver.findElement(By.id("cl5")),driver.findElement(By.id("cl9"))).perform();;

        driver.findElement(By.xpath("//input[@value='Save']")).click();
       // driver.close();

    }


}
