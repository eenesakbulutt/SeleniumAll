package com.syntax.reviewclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class MultipleDropDowns1 {
// burada multiple select one  olayini kullanacagiz.

    static String URL = "http://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement states=driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select select=new Select(states);
        boolean  isMul=select.isMultiple();

        if(isMul){
            List<WebElement> statesAvailable= select.getOptions();
            Iterator<WebElement>iterator=statesAvailable.iterator();
            while(iterator.hasNext()){

                WebElement option=iterator.next();
                String optionA= option.getText();
                System.out.println(optionA);
                select.selectByVisibleText(optionA);

            }
Thread.sleep(2000);

            select.deselectAll();

        }










    }


}

