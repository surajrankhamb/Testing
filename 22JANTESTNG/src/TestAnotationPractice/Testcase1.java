package TestAnotationPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
     
	@BeforeTest
	public void opendb() {
		System.out.println("data base is opened before startin of 1st testcase");
	}
      
	@AfterTest
	public void closedb() {
		System.out.println("data base is close after ending of 2st testcase");
	} 
	
	@Test(priority = 1)
	public void m1() {
		System.out.println("This is method m1 from Testcase1");
	} 
	
	@Test(priority = 2)
	public void m2() {
		System.out.println("This is method m2 from Testcase1");
	}  
	
	@Test(priority = 3)
	public void m3() {
		System.out.println("This is method m3 from Testcase1"); 
	}
	
}//class.
