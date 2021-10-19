package com.syntax.reviewclass03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {


    static String URL="https://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        //simple alert
        WebElement Alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        Alert1.click();
        Alert a1=driver.switchTo().alert();
        Thread.sleep(2000);
        a1.accept();
        Thread.sleep(2000);

        // comfirmation alert
        WebElement Alert2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Alert2.click();
        Thread.sleep(2000);
        System.out.println(a1.getText());
        a1.accept();
        // prompt alert

        WebElement Alert3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        Alert3.click();
        Thread.sleep(2000);
        a1.sendKeys("hello my name is ronaldo");
        Thread.sleep(1000);
        a1.accept();







    }


}
