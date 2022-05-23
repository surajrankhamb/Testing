package Parameterization_crossbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllBrowserTesting {
	WebDriver driver;
	@Parameters("browser")
	@Test(priority = 1)
	public void crossBrowserTesting(String browser) {
	   if(browser.equalsIgnoreCase("chrome")) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Selinium jar file\\chromedriver.exe");
		   driver=new ChromeDriver();
	   }else if(browser.equalsIgnoreCase("firefox")) {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\Selinium jar file\\geckodriver.exe");
		   driver=new FirefoxDriver();
	   }else {
		   System.out.println("selected browser is wrong");
	   }
	   
	   driver.get("https://www.facebook.com/");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();	
	}

	@Test(priority = 2)
	public void verifyCurrenturl() {
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	Reporter.log("verifyCurrenturl", true);
	}
	
	@Test(priority = 3)
	public void verifyPageTitle() {
	Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");	
	Reporter.log("verifyPageTitle", true);	
	}
	
	@Test(priority = 4)
	public void verifyUsernameField() {
	WebElement username = driver.findElement(By.xpath("//input[@id='email']"));	
	Assert.assertTrue(username.isDisplayed());
	Assert.assertTrue(username.isEnabled());
	username.sendKeys("suraj");
	Reporter.log("verifyUsernameField", true);
	} 
	
	@Test(priority = 5)
	public void verifyPasswordField() {
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));	
		Assert.assertTrue(password.isDisplayed());
		Assert.assertTrue(password.isEnabled());
		password.sendKeys("suraj");
		Reporter.log("verifyPasswordField", true);
		}
    
	@Test(priority = 6)
	public void clickLoginButton() {
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));	
		Assert.assertTrue(LoginBtn.isDisplayed());
		Assert.assertTrue(LoginBtn.isEnabled());
		LoginBtn.click();
		Reporter.log("clickLoginButton", true);
	}
	
}//class.
