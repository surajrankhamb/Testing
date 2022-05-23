package Groupingpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase3 {
	@BeforeClass(alwaysRun = true)
	public void openbrowser() {
	 System.out.println("browser is open");
	}
	
	@AfterClass(alwaysRun = true)
	public void closebrowser() {
		 System.out.println("browser is close");
		}
   @Test(groups = "smoke")
	public void Test7() {
		System.out.println("Test7");
	}
	
   @Test(groups = "functional")
  	public void Test8() {
  		System.out.println("Test8");
  	}
	
   @Test(groups = {"functional", "regression"})
  	public void Test9() {
  		System.out.println("Test9");
  	}
	
}//class.
