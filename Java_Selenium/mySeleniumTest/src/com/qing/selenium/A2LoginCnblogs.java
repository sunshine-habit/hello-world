package com.qing.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.Dimension;

public class A2LoginCnblogs {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.out.println("����԰�����������");
		System.out.println("�����������С�����ص���һҳ�桢����");
		
/*		System.setProperty("webdriver.firefox.bin","E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com/");
		driver.findElement(By.id("kw")).sendKeys("selenium java");
		driver.findElement(By.id("su"));		
		driver.close();*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//�޸�������ߴ�
		driver.manage().window().setSize(new Dimension(1480,800));
		driver.get("https://passport.cnblogs.com/user/signin?ReturnUrl=https%3A%2F%2Fwww.cnblogs.com%2F");
				
		driver.findElement(By.id("input1")).sendKeys("liuyaqing1988");
		driver.findElement(By.id("input2")).sendKeys("selenium88!");
		
		//�ڷ����������׳��쳣������Ҫtry catch��,����ѧ��Ԫ�صȴ���ҳ�����ʱ�䡢��λ����ʱ��
		Thread.sleep(2000);
		driver.findElement(By.id("signin")).click();
			
		Thread.sleep(8000);	
		//driver.findElement(By.className("search_input")).sendKeys("good");
		driver.findElement(By.linkText("԰��")).click();
		
		//����ҵĲ���
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='header_user_right']/a[3]")).click();
		
		Thread.sleep(1000);
		System.out.println("���ص���һҳ�棬���˰�ť");
		driver.navigate().back();
		
		Thread.sleep(1000);
		System.out.println("ǰ����ť");
		driver.navigate().forward();

		Thread.sleep(1000);
		driver.close();
		
		
		/*WebDriver driver = new InternetExplorerDriver();*/
		
		System.out.println("game over~ again!");
		
	}

}
