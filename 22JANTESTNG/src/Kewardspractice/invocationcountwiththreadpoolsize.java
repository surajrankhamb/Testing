package Kewardspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocationcountwiththreadpoolsize { 
	
	@Test(invocationCount = 5, threadPoolSize = 5 )
 public void openbrowser() {
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selinium jar file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/"); 
		  
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl()); 
		driver.close();
 }
}//class.
