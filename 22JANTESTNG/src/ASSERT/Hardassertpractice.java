package ASSERT;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertpractice {
  //ASSERT-use to varify scernaro
 //we use static method avialable inside assert class for hard assert method
	  String st1="Hello"; 
	  String st2="hi";

  //1.Assert equals():-if expected=actual 
	  @Test
	  public void test1() {
		  Assert.assertEquals(st1, st2);  //fail
	  } 
	  
  //2. Assertnotequals()
	  @Test
	  public void test2() {
		  Assert.assertNotEquals(st1, st2); //pass
	  }  
  //3.Assertnull:-test case will pass if provide data is null 
	  
	  @Test
	  public void test3() {
		  Assert.assertNull(st1);
	  } 
	  
	//4.Asser not null:-test case will pass if provide data is not null
	  @Test
	  public void test4() {
		  Assert.assertNotNull(st1);
	  }
}//class.
