package com.syntax.reviewclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableDemo1 {
    //bu static table ornegiydi.
    static String URL="http://syntaxprojects.com/table-search-filter-demo.php";
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //finding the rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));

        for(WebElement row:rows){

            String rowText = row.getText();
            System.out.println("The row data is  "+rowText);

        }

        //printing the names of just the assignies (row3)
        List<WebElement> rowAssignies = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        for (WebElement rowAssignie :rowAssignies){

            String rowText =rowAssignie.getText();
            System.out.println("This is the text of column 3 " + rowText);
        }

    }

}
