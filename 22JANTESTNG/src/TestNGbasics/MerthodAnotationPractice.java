package TestNGbasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MerthodAnotationPractice {
  //login==>homepage==>logout
  //login==>notification==>logout
	//login==>profilepage==>logout 
	
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout"); 	
	} 
	
	@Test (priority = 2)
	public void homepage() {
		System.out.println("homepage testing");
	} 
	
	@Test (priority = 3)
	public void notification() {
		System.out.println("notification testing");
	}
	
	@Test (priority = 1)
	public void profilepage() {
		System.out.println("profile page testing");
	}
		
}//class.
