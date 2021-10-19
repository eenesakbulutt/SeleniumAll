package com.syntax.class04;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement ageRadioButton= driver.findElement(By.cssSelector("input[value='5 - 15']"));
        boolean  isAgeRadioButtonEnabled =ageRadioButton.isEnabled();
        System.out.println(isAgeRadioButtonEnabled);
        if(!isAgeRadioButtonEnabled){
            System.out.println("tattt");
        }else{
            System.out.println("enable");
        }

        boolean isAgeRadioButtonDisplayed=ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioButtonDisplayed);

        boolean isAgeRadioButtonSelected=ageRadioButton.isSelected();
        System.out.println("Before clicking "+  isAgeRadioButtonSelected);

        ageRadioButton.click();
        //boolean value yi asagida reassign yaptik tekrardan. Eger yapmazsak false vermeye devam eder.
        isAgeRadioButtonSelected=ageRadioButton.isSelected();
        System.out.println("After clicking "+ isAgeRadioButtonSelected);

driver.quit();






    }
}
