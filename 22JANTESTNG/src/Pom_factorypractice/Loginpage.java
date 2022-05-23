package Pom_factorypractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Loginpage {
	
	//Declaration
    @FindBy (xpath="//img[@class='_97vu img']") private WebElement login_logo;
    @FindBy (xpath="//h2[text()='Facebook helps you connect and share with the people in your life.']") private WebElement loginfb_tagline;
    @FindBy (xpath="//input[@name='email']") private WebElement username;
    @FindBy (xpath="//input[@name='pass']") private WebElement password;
    @FindBy (xpath="//button[@name='login']") private WebElement login_btn;
    @FindBy (xpath="//a[text()='Forgotten password?']") private WebElement forgate_password;
    @FindBy (xpath="//a[@data-testid='open-registration-form-button']") private WebElement createnew_acc;
    @FindBy (xpath="//a[text()='Create a Page']") private WebElement createpage_link;
    @FindBys({@FindBy(xpath="//ul[contains(@class, 'uiList pageFooterLinkList')]/li/a")}) private List<WebElement> footer_links;
    
    //initialization
    public Loginpage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    	
    }
    
    //uses
    
    public void verifyFacebookLoginPageLogo() {
    	Assert.assertTrue(login_logo.isDisplayed(), "Login page logo is not displayed");
    	Reporter.log("verifyFacebookLoginPageLogo", true);
    }
    
    public void verifyFacebookLoginForgottenAccountLink() {
    	Assert.assertTrue(login_logo.isDisplayed(), "Login page ForgottenAccountLink is not displayed");
    	Reporter.log("verifyFacebookLoginForgottenAccountLink", true);
    }
    
    public void setFacebookLoginPageUserName() {
    	username.sendKeys("suraj");
    	Reporter.log("setFacebookLoginPageUserName", true);
    }
    
    public void setFacebookLoginPagePassword() {
    	password.sendKeys("123#45");
    	Reporter.log("setFacebookLoginPagePassword", true);
    }
    
    public void clickFacebookLoginPagebtn() {
    	Assert.assertTrue(login_btn.isDisplayed());
    	login_btn.click();
    	Reporter.log("clickFacebookLoginPagebtn", true);
    }
    
    public void verifyFacebookLoginPageFooterlinkSize() {
    	Assert.assertEquals(footer_links.size(), 30);
    	//import Assert.assertEquals(int act, int expected):void-Assert
    	Reporter.log("verifyFacebookLoginPageFooterlinkSize", true);
    }
  
}//class.
