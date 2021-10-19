package com.syntax.seleniumHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxProjects {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();
      WebElement startPractising=driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
      startPractising.click();
      Thread.sleep(2000);
      WebElement simpleFormDemo=driver.findElement(By.xpath("(//a[contains(@class, 'list')])[1]"));
      simpleFormDemo.click();
      Thread.sleep(2000);
      WebElement enterMessage=driver.findElement(By.xpath("//input[@id='user-message']"));
      enterMessage.click();
      enterMessage.sendKeys("I am trying to understand this");
      Thread.sleep(2000);
      WebElement showMessage=driver.findElement(By.xpath("//button[contains(@onclick, 'showInput();')]"));
      showMessage.click();
      Thread.sleep(2000);
      driver.quit();
















    }
}
