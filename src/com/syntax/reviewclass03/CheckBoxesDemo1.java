package com.syntax.reviewclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesDemo1 {

static String URL="https://www.ironspider.ca/forms/checkradio.htm";
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
         WebDriver driver = new ChromeDriver();
        driver.get(URL);
        List<WebElement> colorCheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox' and @name='color']"));
        System.out.println(colorCheckBoxes.size());
//simdi elimizde bir cok checkbox oldugu icin bunlari for loop ile calisalim.

        for(WebElement colorCheckBox: colorCheckBoxes){
          //  colorCheckBox.click();

            //simdi sadece blue olani secmeye calisalim.

          //  System.out.println(colorCheckBox.getText()); it ll not work there is no text.

            String color=colorCheckBox.getAttribute("value");
            if(color.equalsIgnoreCase("blue")){
                colorCheckBox.click();
                System.out.println(colorCheckBox.isSelected());
                break;
            }












        }










}
}
