package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "http://syntaxprojects.com/dynamic-data-loading-demo.php";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement newUserButton = driver.findElement(By.id("save"));
        newUserButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'First Name')]")));

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(), 'First Name')]"));
        System.out.println(firstName.getText());








    }
}
