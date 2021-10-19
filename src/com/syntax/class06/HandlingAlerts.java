package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

public static String url="http://www.uitestpractice.com/Students/Switchto";


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);


        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Alert simpleAlert = driver.switchTo().alert(); //switching the focus to alert.
        Thread.sleep(2000);
        simpleAlert.accept(); //handling simple alert.

        WebElement confirmAlertButton= driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Alert confirmAlert=driver.switchTo().alert();
       String alertText= confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();

//burada dismiss olan yani confirmi iptal ettik okeylemedik.
        //click cancel dismiss oluyor.

WebElement promptAlertButton=driver.findElement(By.id("prompt"));
promptAlertButton.click();
Thread.sleep(2000);

Alert promptAlert= driver.switchTo().alert();
promptAlert.sendKeys("ASGHAR IS KING");
promptAlert.accept();



    }


}

