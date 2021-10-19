package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://syntaxprojects.com/window-popup-modal-demo.php";
        driver.get(url);
        driver.manage().window().maximize();
        String mainPageHandle = driver.getWindowHandle();
        WebElement instagramButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement facebookButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
        instagramButton.click();
        facebookButton.click();
        igAndFbButton.click();


        Set<String> allWindowHandles=driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String>it=allWindowHandles.iterator();
        while(it.hasNext()){// start iterating through handles
           String handle= it.next();//get the next handle
           if(!mainPageHandle.equals(handle)) {//set a condition
               driver.switchTo().window(handle);//switch to a window is not equal to main page
               String title = driver.getTitle();
               System.out.println(title);
               driver.close();
           }

        }
        driver.switchTo().window(mainPageHandle);//switch back to parent handle.
        instagramButton.click();


    }
}
