package TestAnotationPractice;

import org.testng.annotations.Test;

public class Testcase2 {

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
	//select two classes in package then right click and run 
	                   //or 
	//right click on package then run

}//class.
