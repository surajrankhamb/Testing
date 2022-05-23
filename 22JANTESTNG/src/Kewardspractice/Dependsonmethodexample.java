package Kewardspractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethodexample {
	@Test (priority = 1)
	public void openurl() {
		System.out.println("url open"); 
		Reporter.log("url open"); 
		Assert.fail();   //use to fail the test case
	}
	@Test (priority = 2, dependsOnMethods ="openurl" )
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
