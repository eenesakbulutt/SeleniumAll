package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement upload= driver.findElement(By.id("file-upload"));
        upload.sendKeys("C:\\Users\\PC\\Desktop\\zey.txt");
        WebElement submit= driver.findElement(By.id("file-submit"));
        submit.click();
    }
}


