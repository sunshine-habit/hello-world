package Selenium_Java;

import java.util.Iterator;
import java.lang.Thread;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


public class Hello {
	public static void main(String[] args){
        System.out.println("srart selenium");
        
        System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://passport.cnblogs.com/user/signin?ReturnUrl=https%3A%2F%2Fwww.cnblogs.com%2F");
      
        driver.findElement(By.id("input1")).clear();
        driver.findElement(By.id("input1")).sendKeys("sunshine-habit");
        driver.findElement(By.id("input2")).clear();
        driver.findElement(By.id("input2")).sendKeys("liuyaqing1020!");
        driver.findElement(By.id("signin")).click();
        
        
        /*driver.close();
         *      driver.findElement(By.xpath('//html//body//div//section//div//div//a//img'));
        ø…“‘∆Ù∂Øfirefox‰Ø¿¿∆˜
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\liu_y\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.baidu.com/");
        driver.close();
         */
    }
}
