package Pom_factorypractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Regisrationpage {
   
	@FindBy(xpath = "//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy(xpath = "//img[@class='fb_logo _registrationPage__fbLogo img']") private WebElement facebooklogo;
	@FindBy(xpath = "//a[text()='Already have an account?']") private WebElement alreadyaccount;
	@FindBy(name = "firstname") private WebElement firstname;
	@FindBy(name = "lastname") private WebElement lastname;
	@FindBy(name = "reg_email__") private WebElement mob_email;
	@FindBy(name = "reg_passwd__") private WebElement password;
	@FindBy(name = "birthday_day") private WebElement birthdate;
	@FindBy(name = "birthday_month") private WebElement birthmonth;
	@FindBy(name = "birthday_year") private WebElement birthyear;
	@FindBy(xpath = "//input[@value='1']") private WebElement gender_female;
	@FindBy(xpath = "//input[@value='2']") private WebElement gender_male;
	@FindBy(name = "websubmit") private WebElement submitbtn;
	
	//initialization=>declare class constructor with public access
	public Regisrationpage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	} 
	
	//uses
	//=================static member============================
	public void clickFacebookSignupLink() {
		signuplink.click();	
		Reporter.log("clickFacebookSignupLink", true);
	}
	
	public void verifyFacebookRegistrationPageLogo() {
		Assert.assertTrue(facebooklogo.isDisplayed(),"Facebook page logo is not displayed");
		Reporter.log("verifyFacebookRegistrationPageLogo", true);
	} 
	
	public void verifyFacebookRegistrationpageAlreadyAccount() {
		Assert.assertTrue(alreadyaccount.isDisplayed(), "Already have account not displayed");
		Assert.assertEquals(alreadyaccount.getText(), "Already have an account?");
		Reporter.log("verifyFacebookRegistrationpageAlreadyAccount", true);
	}
	
	//=================Dyanamic member====================
    public void setFacebookRegistrationPageFirstName(String fname) {
    	firstname.sendKeys(fname);
    	Reporter.log("setFacebookRegistrationPageFirstName", true);
	}
    
    public void setFacebookRegistrationPageLasttName(String lname) {
    	lastname.sendKeys(lname);
    	Reporter.log("setFacebookRegistrationPageLasttName", true);
	}
    
    public void setFacebookRegistrationPageMobileEmail(String mobno) {
    	mob_email.sendKeys(mobno);
    	Reporter.log("setFacebookRegistrationPageMobileEmail", true);
	}
    
    public void setFacebookRegistrationPagePassward(String pwd) {
    	password.sendKeys(pwd);
    	Reporter.log("setFacebookRegistrationPagePassward", true);
	}
    
    public void setFacebookRegistrationPageBirthDate() {
    	Select bday=new Select(birthdate);
    	Assert.assertTrue(birthdate.isDisplayed());
    	Assert.assertFalse(birthdate.isSelected());
    	bday.selectByVisibleText("19");
    	Reporter.log("setFacebookRegistrationPageBirthDate", true);
	}
    
    public void setFacebookRegistrationPageBirthMonth() {
    	Select bmonth=new Select(birthmonth);
    	Assert.assertTrue(birthmonth.isDisplayed());
    	Assert.assertFalse(birthmonth.isSelected());
    	bmonth.selectByVisibleText("Mar");
    	Reporter.log("setFacebookRegistrationPageBirthMonth", true);
    }
    
 public void setFacebookRegistrationPageBirthYear() {
	 Select byear=new Select(birthyear);
	 Assert.assertTrue(birthyear.isDisplayed());
     Assert.assertFalse(birthyear.isSelected());
     byear.selectByVisibleText("1992");
     Reporter.log("setFacebookRegistrationPageBirthYear", true);
   	
    }
 
 public void setFacebookRegistrationPageGender(String Gender) {
	 if(Gender.equalsIgnoreCase("male")) {
		 gender_male.click();	 
	 }else if(Gender.equalsIgnoreCase("female"))
	 {
		 gender_female.click();	 
	 }
	 Reporter.log("setFacebookRegistrationPageGender", true);
    }
	 
 public void clickFacebookRegistrationSignupbtn() {
	 submitbtn.click(); 
	 Reporter.log("clickFacebookRegistrationSignupbtn", true);
 }
    
}//class
