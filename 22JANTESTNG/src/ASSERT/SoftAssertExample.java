package ASSERT;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
 
	//Hard assert:-any testcase contain multiple assertion if one one of it fails next will skip/will not check
  // Hard assert method are static method. 
	//Soft assert method are non static method=>object orientted
	//@Test
//	public void sample1() {
//		String str1="Hellow";
//		System.out.println(str1); 
//		Assert.assertEquals(str1, "Hi"); //fail
//		
//		String str2="Hi";
//		System.out.println(str2); 
//		Assert.assertEquals(str2, "Hi"); //pass
//	} 
//	
//	@Test
//	public void sample2() {
//		System.out.println("Automation");
//	}
	 
	// Hard assert method are static method. 
		//Soft assert method are non static method=>object orientted
	@Test
	public void sample1() { 
		SoftAssert soft=new SoftAssert();
		String str1="Hellow";
		System.out.println(str1); 
		soft.assertEquals(str1, "Hi"); //fail
		
		String str2="Hi";
		System.out.println(str2); 
		soft.assertEquals(str2, "Hi");  //pass
		soft.assertAll();  //Use to remove error.
	} 
	
	@Test
	public void sample2() {
		System.out.println("Automation");
	}
}//class.
