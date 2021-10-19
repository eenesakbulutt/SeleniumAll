package com.syntax.reviewclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarDemo1 {

    static String URL = "http://syntaxprojects.com/bootstrap-date-picker-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        //click on calender
        WebElement calander = driver.findElement(By.xpath("//input[@placeholder='Start date']"));
        calander.click();

        //get the month and year

        WebElement nextBtn = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));

        boolean notFound = true;

        while(notFound){

            WebElement monthYear = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
            String monthYearText = monthYear.getText();
            if(monthYearText.equalsIgnoreCase("January 2022")){
                notFound=false;
                List<WebElement> dates = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
                for(WebElement date :dates){

                    if (date.getText().equals("15")){

                        date.click();

                    }

                }




//                WebElement date = driver.findElement(By.xpath("//td[text()='15']"));
//                date.click();

            }

            else
                nextBtn.click();


        }



    }













}
