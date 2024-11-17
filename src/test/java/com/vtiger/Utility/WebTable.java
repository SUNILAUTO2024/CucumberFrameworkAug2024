package com.vtiger.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {


    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("http://localhost:100");
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).click(); //driver.findElement(By.name("submitButton")).click();

        driver.findElement(By.linkText("Leads")).click();

        String txt = driver.findElement(By.xpath("//td[contains(text(),'Showing 1')]")).getText().trim();

        System.out.println(txt);
        String[] arr = txt.split("of");
        int total_Record = Integer.parseInt(arr[1].trim());
        System.out.println("Total Record = " + total_Record);
        int flag = 0;
        int pagecount = 1;
//        int rcount = 0;
        if (total_Record > 20) {
            pagecount = (total_Record / 20) + 1;
        }

        for (int i = 1; i <= pagecount; i++) {
            for (int j = 0; j < 20; j++) {
                int row = j + 5;
                if (driver.findElements(By.xpath("//table[@class='FormBorder']/tbody/tr[" + row + "]/td[4]")).size() > 0) {
                    String cellvalue = driver.findElement(By.xpath("//table[@class='FormBorder']/tbody/tr[" + row + "]/td[4]")).getText();
                   // System.out.println(cellvalue);
                    if (cellvalue.equalsIgnoreCase("SHinde")) {
                        driver.findElements(By.name("selected_id")).get(j).click();
                        driver.findElement(By.xpath("//input[@value='Delete']")).click();
                        flag = 1;
                        driver.findElements(By.xpath("//a[text()='Pawar']/following::td[2]")).get(1).getText();
                        break;
                    }
                }
            }
                if (driver.findElements(By.xpath("//img[@src='themes/blue/images/next.gif']")).size() > 0) {
                    driver.findElement(By.xpath("//img[@src='themes/blue/images/next.gif']")).click();
                }
                if (flag == 1) {
                    break;
                }
//                rcount = 0;
            }
        }
    }


