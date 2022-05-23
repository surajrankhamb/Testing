package Kewardspractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Timeoutsexample {
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
	     
	     @Test(priority = 1, timeOut = 5000)
	    public void homepagetest() throws InterruptedException { 
	    	 Thread.sleep(6000);  //for checking purpose give this.
	    	System.out.println("Home page is tested");
	    }
	     
	     @Test(priority = 2)
	    public void profilepagetest() {
	    	System.out.println("profile page is tested");
	    }  

}//class.
