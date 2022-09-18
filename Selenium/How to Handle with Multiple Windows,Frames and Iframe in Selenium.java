package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.cDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandleWinDows {
    public static void main(Sring[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://codeshare.io/");
        driver.findElement(By.xpath("//*[contains(text()='Share Code Now')]")).click();
      	driver.findElement(By.xpath("")).sendKeys("");
        String currentwindow = driver.getWindowHandle();
        Set<String> tabs =  driver.getWindowHandles();
        System.out.println(tabs);
        Iterator<String> i = tabs.iterator();
        while(i.hasNext()){
            String childwindow = i.next();
            if(!childwindow.equalsIgnoreCase(currentwindow)){
                driver.switchTo().window(childwindow);
                System.out.println("The child window is "+childwindow);
            }
        }

        driver.quit();



    }

}
