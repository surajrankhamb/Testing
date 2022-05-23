package Groupingpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase2 {

	@BeforeClass(alwaysRun = true)
	public void openbrowser() {
	 System.out.println("browser is open");
	}
	
	@AfterClass(alwaysRun = true)
	public void closebrowser() {
		 System.out.println("browser is close");
		}
   @Test(groups = "smoke")
	public void Test4() {
		System.out.println("Test4");
	}
	
   @Test(groups = "functional")
  	public void Test5() {
  		System.out.println("Test5");
  	}
	
   @Test(groups = {"functional", "regression"})
  	public void Test6() {
  		System.out.println("Test6");
  	}
}//class
