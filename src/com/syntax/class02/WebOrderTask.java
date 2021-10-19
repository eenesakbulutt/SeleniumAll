package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

       // driver.manage().window().maximize();

driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

driver.findElement(By.className("button")).click();

String title=driver.getTitle();
if(title.equals("Web Orders")){
    System.out.println("Title is correct");
}else{
    System.out.println("Title is wrong");
}

        Thread.sleep(2000);
driver.findElement(By.linkText("Logout")).click();
driver.quit();

    }
}
