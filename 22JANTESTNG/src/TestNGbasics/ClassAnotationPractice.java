package TestNGbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassAnotationPractice {
 //login==>profile page==>home page==>notification page
	
	@BeforeClass
	public void login() {
		System.out.println("login");
	}
	
    @AfterClass
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
	
	@AfterTest
	public void closebrowser() {
		System.out.println("browser is close");
	} 
	
	@AfterSuite
	public void closedb() {
		System.out.println("data base is close");
	}
	
}//class
