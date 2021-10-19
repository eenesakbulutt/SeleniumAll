package com.syntax.reviewclass05;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableDemo2 {
    //dynamic table ornegi simdi.
//static dinamik arasinda table larda fazla fark yok.


    static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();


        //getting all the rows of table
        List<WebElement> row = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));

        List<WebElement>checkboxes=driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr/td[1]"));


        for(int i=1; i< row.size();i++){
            //getting the text of rows in table
            String rowsText = row.get(i).getText();
            System.out.println(rowsText);



            if(rowsText.contains("Mark Smith")) {
                //getting the desired checkbox
                System.out.println("The number of checkboxes is : "+checkboxes.size());
                System.out.println("the value of i is "+ i);
                checkboxes.get(i-1).click();

            }

        }


    }

}