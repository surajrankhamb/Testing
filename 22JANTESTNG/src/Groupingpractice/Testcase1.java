package Groupingpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {

	@BeforeTest(alwaysRun = true)
	public void opendb() {
		System.out.println("data base open");
	}
   
	@AfterTest(alwaysRun = true)
	public void closedb() {
		System.out.println("data base is close");
	}  
	
	@BeforeClass(alwaysRun = true)
	public void openbrowser() {
	 System.out.println("browser is open");
	}
	
	@AfterClass(alwaysRun = true)
	public void closebrowser() {
		 System.out.println("browser is close");
		}
   @Test(groups = "smoke") 
	public void Test1() {
		System.out.println("Test1");
	}
	
   @Test(groups = "functional")
  	public void Test2() {
  		System.out.println("Test2");
  	}
	
   @Test(groups = {"functional", "regression"})
  	public void Test3() {
  		System.out.println("Test3");
  	}
	
}//class.
