package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

    public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("eenesakbulutt@gmail.com");

driver.findElement(By.id("pass")).sendKeys("syntax123");

driver.findElement(By.name("login")).click();
Thread.sleep(2000);
//driver.findElement(By.linkText("Forgot Password")).click();
//forgot password da yazsan parcali bir sekilde sadece forgot da yazsan program calisiyor.
        driver.findElement(By.partialLinkText("forgot")).click();
        driver.quit();


    }
}
