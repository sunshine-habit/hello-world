package com.qing.selenium;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class A3YoudaoSubmit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("��Ԫ�ز���~");
		System.out.println("���е���վ~");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.youdao.com/");
		
		driver.findElement(By.id("translateContent")).sendKeys("query");
		WebElement size = driver.findElement(By.id("translateContent"));
		System.out.println("�����ĳߴ磺"+size.getSize());
		
		WebElement text = driver.findElement(By.xpath("//*[@id='margin3']/span[3]/a"));
		System.out.println("Ԫ�ص��ı���"+text.getText());
		System.out.println("Ԫ�ص����ԣ�"+size.getAttribute("q"));
		System.out.println("Ԫ���Ƿ���ʾ��"+size.isDisplayed());
		
		driver.findElement(By.id("translateContent")).submit();
		
		Thread.sleep(5000);
		//driver.findElement(By.tagName("button")).click();
		driver.close();
		
		System.out.println("game over~ again!");
	}

}
