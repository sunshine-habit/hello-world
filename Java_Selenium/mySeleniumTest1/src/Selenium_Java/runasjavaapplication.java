package Selenium_Java;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class runasjavaapplication {

    public static void main(String[] args) {
        
      System.out.println("µÇÂ¼ÍøÒ×126ÓÊÏä£¡");
      System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1480,800));
		driver.get("http://www.126.com/");
		
		try{
			Thread.sleep(3000);
		}	catch(Exception e){
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//*[@id='auto-id-1507277906020']")).sendKeys("liuyaqing1988");
    	   
    }
}