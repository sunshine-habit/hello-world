package com.qing.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
//����������ߴ�
import org.openqa.selenium.Dimension;

public class A1LoginMail126 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("***********��λԪ�أ�������л�frame***********");
		System.out.println("��¼126���䣡��������˺ţ�");

/*		System.setProperty("webdriver.firefox.bin","E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com/");
		driver.findElement(By.id("kw")).sendKeys("selenium java");
		driver.findElement(By.id("su"));		
		driver.close();*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1480,800));
		driver.get("http://www.126.com/");
		Thread.sleep(1000);
		
		
		driver.switchTo().frame("x-URS-iframe");
		//driver.findElement(By.id("lbNormal")).click();
		driver.findElement(By.name("email")).sendKeys("liuyaqing1988");
		//driver.findElement(By.name("email")).clear();
    	driver.findElement(By.name("password")).sendKeys("selenium");   
    	
    	Thread.sleep(3000);
		
    	
    	driver.findElement(By.id("dologin")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("�˳�")).click();
		
		System.out.println("game over~ again!");
	}

}
