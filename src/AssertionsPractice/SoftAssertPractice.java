package AssertionsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {

	
//	@Test
//	public void sample() {
//		String str= "Hello";
//		Assert.assertEquals(str, "hi");
//		System.out.println("Hello");
//		
//		String str1= "hi";
//		Assert.assertEquals(str1, "hi");
//		System.out.println("hi");
//	}
	
	@Test
	public void sample() {
		SoftAssert soft = new SoftAssert();  // object create.s
		
		String str= "Hello";
		soft.assertEquals(str, "hi");
		System.out.println("Hello");
		
		String str1= "hi";
		soft.assertEquals(str1, "hi");
		System.out.println("hi");
		soft.assertAll();
	}
	
	
	
	
	
}
