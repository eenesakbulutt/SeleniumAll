package com.syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickActions {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            WebDriver driver = new ChromeDriver(); // launch the browser
            driver.get("http://demo.guru99.com/test/simple_context_menu.html");
            WebElement right= driver.findElement(By.xpath("//span[text()='right click me']"));

            Actions action=new Actions(driver);
            action.contextClick(right).perform();
            WebElement edit= driver.findElement(By.xpath("//span[text()='Edit']"));
            action.click(edit).perform();
            Alert alert=driver.switchTo().alert();
            alert.accept();
            WebElement doubleClick= driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
            action.doubleClick().perform();
            alert.accept();

        }
    }

