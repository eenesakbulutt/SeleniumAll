package com.syntax.reviewclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsDemo2 {


    static String URL = "https://syntaxprojects.com/basic-radiobutton-demo.php";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

       WebElement radioBtn=driver.findElement(By.xpath("//input[@value='5 - 15']"));
radioBtn.click();



    }
}