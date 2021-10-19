package com.syntax.reviewclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.util.Password;

public class SauceDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

       //driver.get("https://www.google.com/");

      // Thread.sleep(1000);

        driver.navigate().to("https://www.saucedemo.com/");
       // driver.navigate().back();
       // Thread.sleep(2000);
       // driver.navigate().forward();

        String titleOfThePage=driver.getTitle();

        System.out.println("The title of the page is "+ titleOfThePage);

        String Url= driver.getCurrentUrl();
        System.out.println("The title of the page is "+ Url);

        driver.manage().window().maximize();

        //driver.quit();

        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement Password=driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");

        WebElement Login=driver.findElement(By.id("login-button"));
        Login.click();

        Thread.sleep(2000);
        WebElement Menu=driver.findElement(By.id("react-burger-menu-btn"));
        Menu.click();

        Thread.sleep(2000);
        WebElement About= driver.findElement(By.id("about_sidebar_link"));
        About.click();
        driver.navigate().back();


WebElement addToCart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
addToCart.click();




    }









}
