package Pom_factorypractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class RegitrationTest {
	WebDriver driver;
   @BeforeMethod
   public void setup() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Selinium jar file\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   
   @Test
   public void FacebookRegitrationPageTest_Negative() {
	   Regisrationpage rgpage=new Regisrationpage(driver);
	   rgpage.clickFacebookSignupLink();
	   Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/reg/");
	   rgpage.verifyFacebookRegistrationPageLogo();
	   rgpage.verifyFacebookRegistrationpageAlreadyAccount();
	   rgpage.setFacebookRegistrationPageFirstName("ABC");
	   rgpage.setFacebookRegistrationPageLasttName("PQR");
	   rgpage.setFacebookRegistrationPageMobileEmail("1234567889");
	   rgpage.setFacebookRegistrationPagePassward("ABG@AW");
	   rgpage.setFacebookRegistrationPageBirthDate();
	   rgpage.setFacebookRegistrationPageBirthMonth();
	   rgpage.setFacebookRegistrationPageBirthYear();
	   rgpage.setFacebookRegistrationPageGender("male");
	   rgpage.clickFacebookRegistrationSignupbtn();
   }
   
   @Test
   public void FacebookRegitrationPageTest_positive() {
	   Regisrationpage rgpage=new Regisrationpage(driver);
	   rgpage.clickFacebookSignupLink();
	   Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/reg/");
	   rgpage.verifyFacebookRegistrationPageLogo();
	   rgpage.verifyFacebookRegistrationpageAlreadyAccount();
	   rgpage.setFacebookRegistrationPageFirstName("NHG");
	   rgpage.setFacebookRegistrationPageLasttName("SDWDD");
	   rgpage.setFacebookRegistrationPageMobileEmail("9234567889");
	   rgpage.setFacebookRegistrationPagePassward("HGT@HH");
	   rgpage.setFacebookRegistrationPageBirthDate();
	   rgpage.setFacebookRegistrationPageBirthMonth();
	   rgpage.setFacebookRegistrationPageBirthYear();
	   rgpage.setFacebookRegistrationPageGender("male");
	   rgpage.clickFacebookRegistrationSignupbtn();
   }
   
   @AfterMethod
   public void tearDown() {
	   driver.quit();
   }

}//class.
