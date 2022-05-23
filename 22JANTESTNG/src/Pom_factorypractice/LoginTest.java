package Pom_factorypractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Selinium jar file\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    @Test
    public void FacebookLoginTest() {
    	Loginpage lg=new Loginpage(driver);
    	lg.verifyFacebookLoginPageLogo();
    	lg.verifyFacebookLoginForgottenAccountLink();
    	lg.verifyFacebookLoginPageFooterlinkSize();
    	lg.setFacebookLoginPageUserName();
    	lg.setFacebookLoginPagePassword();
    	lg.clickFacebookLoginPagebtn();
    }
    @AfterClass
    public void tearDown() {
    	driver.quit();
    }
	
}//class.
