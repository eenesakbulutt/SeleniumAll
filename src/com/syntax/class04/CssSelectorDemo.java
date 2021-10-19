package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
//gecenki odevi bazi yerlerde css ile yapiyoruz pratik olsun diye.
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        Thread.sleep(2000);
WebElement startPractising=driver.findElement(By.cssSelector("a#btn_basic_example"));
startPractising.click();
        Thread.sleep(2000);
WebElement simpleFormDemo=driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]"));
simpleFormDemo.click();
        Thread.sleep(2000);
WebElement textBox=driver.findElement(By.cssSelector("input[placeholder^= 'Please enter']"));
textBox.sendKeys("Selenium is cool");
WebElement showMessageButton=driver.findElement(By.cssSelector("button[onclick*='owIn']"));
showMessageButton.click();
driver.quit();












    }




}
