package com.qing.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.Dimension;


public class A6Mail126GetValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.out.print("****************�����֤��Ϣ****************");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(1480,800));
			
			driver.get("http://www.126.com/");
			System.out.println("��¼ǰ��ַ�ǣ�"+driver.getCurrentUrl());
			System.out.println("��¼ǰ��title��"+driver.getTitle());
			
				Thread.sleep(1000);
					
			driver.switchTo().frame("x-URS-iframe");
			//driver.findElement(By.id("lbNormal")).click();
			driver.findElement(By.name("email")).sendKeys("liuyaqing1988");
			//driver.findElement(By.name("email")).clear();
	    	driver.findElement(By.name("password")).sendKeys("selenium");   
	    	
				Thread.sleep(3000);
			    	
	    	driver.findElement(By.id("dologin")).click();
			
				Thread.sleep(5000);
			
			
			System.out.println("the new is ...");
			System.out.println("��ǰҳ���title�ǣ�"+driver.getTitle());
			System.out.println("��ȡ����ĵ�ַ��"+driver.getCurrentUrl());
			
			//��ȡ��ǰ�û���
			String s=driver.findElement(By.id("spnUid")).getText();
			System.out.println("��¼�˻��ǣ�"+s);
			
			
			System.out.println("game over~ again!");
			
			
	}

}
