package TestAnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase4 {
  
	@BeforeClass
	public void openbrowser() {
	 System.out.println("browser is open");
	}
	
	@AfterClass
	public void closebrowser() {
		 System.out.println("browser is close");
		}
	
	@Test(priority = 4)
	public void m4() {
		System.out.println("This is method m4 from Testcase2");
	} 
	
	@Test(priority = 5)
	public void m5() {
		System.out.println("This is method m5 from Testcase2");
	}  
	
	@Test(priority = 6)
	public void m6() {
		System.out.println("This is method m6 from Testcase2");
	}

}//class.
