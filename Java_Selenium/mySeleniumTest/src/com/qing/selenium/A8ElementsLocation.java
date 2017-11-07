package com.qing.selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.util.List;


public class A8ElementsLocation {

	public static void main(String[] args) throws 	InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("***********��λһ��Ԫ��***********");
		System.out.println("*******Ҫô��Hbuilder*********");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//String url="http://127.0.0.1:8020/gitHub_helloworld/HTMLCSS/Day3/leesson/form.html";
		File file = new File( "E:/gitHub_helloworld/HTMLCSS/Day3/leesson/form.html");
		String url = file.getAbsolutePath();
		//����ķ���Ҳ�����ã�����·����������İ�
		//String url ="E:/gitHub_helloworld/HTMLCSS/Day3/leesson/form.html";
		driver.get(url);
		//list ���飬�ҵ�һ���ǩ��Ϊinput��Ԫ��
		List<WebElement>  inputs = driver.findElements(By.tagName("input"));
		//ѭ����������
		for(WebElement checkbox : inputs){
			//checkbox����ĳһ��Ԫ�أ�getAttribut("type")��ȡtype���Ե�ֵ��
			String type = new String(checkbox.getAttribute("type"));
			if (type.equals("radio")){
			checkbox.click();
			Thread.sleep(1000);
			}
			}
		
		
			//ͨ��css �ҵ�һ��Ԫ��
			//List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=checkbox]"));
			//ͨ��xpath �ҵ�һ��Ԫ��
			List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println(checkboxes.size());
			
			for(WebElement checkbox : checkboxes) {
			checkbox.click();
			}
			//���һ����ѡ����
			checkboxes.get(checkboxes.size() - 1).click();
			Thread.sleep(3000);
			
			
			driver.navigate().refresh();
			
			System.out.println("game over~ again!");
	}

}
