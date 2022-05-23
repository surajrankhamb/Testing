package TestNGbasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IntroductiontoTestNG {
 @Test (priority = 1)
	public void openurl() {
		System.out.println("url open"); 
		Reporter.log("url open"); 
		//import:>long(String s) : org.testing.Reporter.  
	}
	@Test (priority = 2)
	public void login() {
		System.out.println("login is successfully"); 
		Reporter.log("login is successfully");
	}
 @Test (priority = 3)
	public void logout() {
		System.out.println("logout successfully"); 
		Reporter.log("logout successfully"); 
		Reporter.log("browser close");
	}
}//class.
