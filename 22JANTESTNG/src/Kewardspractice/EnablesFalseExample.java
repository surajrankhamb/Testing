package Kewardspractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnablesFalseExample {
	 @BeforeClass
		public void launchbrowser() {
			System.out.println("browser is launched");
		}
		 
	     @AfterClass
	     public void closehbrowser() {
	 		System.out.println("browser is close");
	 	} 
	     
	     @BeforeMethod
	     public void login() {
	    	 System.out.println("login is successfull");
	     } 
	     
	     @AfterMethod
	     public void logout() {
	    	 System.out.println("logout is successfull");
	     }
	     
	     @Test(priority = 1)
	    public void homepagetest() {
	    	System.out.println("Home page is tested");
	    }
	     
	     @Test(priority = 2, invocationCount = 5, enabled = false)
	    public void profilepagetest() {
	    	System.out.println("profile page is tested");
	    } 
		
}//class.
