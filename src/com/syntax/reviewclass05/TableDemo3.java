package com.syntax.reviewclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableDemo3 {

    static String URL = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
//selecting the employee list
        WebElement pimButton = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimButton.click();
        WebElement employeeListButton = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        employeeListButton.click();

//get all the rows till we find the EmployeeID  24743A

        String empID = "24610A";
// getting the rows from the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

        System.out.println("The number of ROWS is " + rows.size());

        boolean notFound = true;

        while (notFound) {

            //get each individual row from the list of rows
            for (int i = 0; i < rows.size(); i++) {

                String rowText = rows.get(i).getText();
                System.out.println(rowText);

                //terminate the loop if empID is found
                if (rowText.contains(empID)) {
                    notFound = false;
                    System.out.println("The required id " + empID + " is found on the " + i + " number");

                    //we found that our empID is on this page on the i;th element
                    //so get all the checkboxes on the page
                    ///tr[i]
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    break;
                }

            }
            //only run if the empID has not been found
            if (notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
                rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            }

        }
    }
}