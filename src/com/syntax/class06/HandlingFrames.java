package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static String url = "http://www.uitestpractice.com/Student/Switchto";


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement textBox=driver.findElement(By.id("name"));
        textBox.sendKeys("Whatsupppp");


        driver.switchTo().defaultContent();
     /*  WebElement simpleAlertButton=driver.findElement(By.id("alert"));
       simpleAlertButton.click();*/

       driver.switchTo().frame("iframe_a");
       textBox.clear();
       textBox.sendKeys("Syntax Techs");

       WebElement frameElement=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));

       textBox.clear();
       textBox.sendKeys("Syntax Batch 10");



    }
}