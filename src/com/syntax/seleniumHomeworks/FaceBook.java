package com.syntax.seleniumHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://en-gb.facebook.com/");

WebElement createAccount=driver.findElement(By.linkText("Create New Account"));

createAccount.click();
Thread.sleep(2000);
WebElement firstName= driver.findElement(By.name("firstname"));
firstName.sendKeys("Enes");

WebElement surName=driver.findElement(By.name("lastname"));
surName.sendKeys("Akbulut");

WebElement Email= driver.findElement(By.name("reg_email__"));
Email.sendKeys("ronaldo@gmail.com");

Thread.sleep(1000);
WebElement reenterEmail= driver.findElement(By.name("reg_email_confirmation__"));
reenterEmail.sendKeys("ronaldo@gmail.com");


WebElement password=driver.findElement(By.id("password_step_input"));
password.sendKeys("arabeni1234");


WebElement Signup=driver.findElement(By.name("wesubmit")); //wesubmit var name

Signup.click();

WebElement closePage= driver.findElement(By.id("u_2_9_f8"));
closePage.click();





    }
}
