package com.syntax.reviewclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo1 {
//tikladiginda boyle secmeli olan seyler oluyor bunlar. please select yapiosun bir kac secenek cikiyor.
//bir tane secebildigin multi select olabilen de var.

    static String URL = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));

        createAccount.click();
        Thread.sleep(2000);

        WebElement birthDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select select = new Select(birthDay);
        select.selectByIndex(0);

        WebElement birthMonth = driver.findElement(By.xpath("//select[@id='month']"));
        Select select1 = new Select(birthMonth);
        select1.selectByValue("3");

        Thread.sleep(2000);
        select1.selectByVisibleText("Aug");
//simdi burada butun aylari gostermek icin calisicaz.(12 tane ay var ).

        List<WebElement> availableMonths = select1.getOptions();
        for (int i = 0; i < availableMonths.size(); i++) {

            String month = availableMonths.get(i).getText();
            System.out.println(month);

        }

    }
}







