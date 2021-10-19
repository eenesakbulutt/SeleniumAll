package com.syntax.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxProject {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement startPractising=driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        startPractising.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo=driver.findElement(By.xpath("(//a[text()='Simple Form Demo' and @class='list-group-item'])"));
        simpleFormDemo.click();
        WebElement valueA=driver.findElement(By.xpath("//label[text()='Enter a']/following-sibling::input"));
valueA.sendKeys("12");
WebElement valueB=driver.findElement(By.xpath("//label[text()='Enter b']/following-sibling::input"));
valueB.sendKeys("11");

WebElement getTotal=driver.findElement(By.xpath("//form[@id='gettotal']/child::button"));
getTotal.click();








    }
}
