package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testing3 {
	 SoftAssert softAssert = new SoftAssert();
  @Test (priority = 1, groups ={"smoke", "sanity"} )
  public void createUser() {
	  System.out.println("i am in the home test");
	  System.out.println("before assertion");
	  Assert.assertTrue(4>3, "verifying element");
	  System.out.println("after assertion");
	  Assert.assertEquals("abc","abc");
  }
  @Test (priority = 2, dependsOnMethods = "createUser",groups ="smoke")
  public void editUser() {
	  System.out.println("before asertion");
	  softAssert.assertTrue(2>3, "verifying element");
	  System.out.println("afer");
	  softAssert.assertAll();
  }
  @Test (priority = 3, dependsOnMethods = "editUser")
  public void deletuser() {
	  System.out.println("i am in the end test");
	  System.out.println("before assertion");
	  softAssert.assertTrue(3<2, "element Verifying");
	  System.out.println("after assertion");
	  softAssert.assertEquals("abc", "abc");
	  System.out.println("after second assertion");
	  softAssert.assertAll();
  }
  
  
}

