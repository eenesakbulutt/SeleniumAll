package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitTaskDemo {

    public static String url="http://syntaxprojects.com/dynamic-elements-loading.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement start =driver.findElement(By.xpath("//*[@id=\"startButton\"]"));
        start.click();
        WebDriverWait wait =new WebDriverWait(driver,20);

        WebElement text =driver.findElement(By.xpath("//*[contains(text(), 'Welcome')]"));
        System.out.println(text.getText());
        driver.quit();






        }


    }

