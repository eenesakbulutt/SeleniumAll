package com.syntax.seleniumHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {
  /*  https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser*/
    public static void main(String[] args) throws InterruptedException {

   System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
driver.findElement(By.id("customer.firstName")).sendKeys("Enes");
driver.findElement(By.id("customer.lastName")).sendKeys("Akbulut");
driver.findElement(By.id("customer.address.street")).sendKeys("34 W Flagler Street");
driver.findElement(By.id("customer.address.city")).sendKeys("Miami");
driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
driver.findElement(By.id("customer.address.zipCode")).sendKeys("33333");
driver.findElement(By.id("customer.phoneNumber")).sendKeys("432343223");
driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
driver.findElement(By.id("customer.username")).sendKeys("enesakblt");
driver.findElement(By.id("customer.password")).sendKeys("mypasswordstrong");
driver.findElement(By.id("repeatedPassword")).sendKeys("mypasswordstrong");
Thread.sleep(3000);
driver.findElement(By.className("button")).click();
Thread.sleep(3000);
driver.quit();









    }



}

