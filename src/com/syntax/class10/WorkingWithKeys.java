package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeys {
//ekstra bilgi verdi burada

    public static void main(String[] args) {

        System.setProperty("webDriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("ctl00_MaintContent_username"));
        username.sendKeys("Tester", Keys.TAB);
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test", Keys.ENTER);


    }


}
