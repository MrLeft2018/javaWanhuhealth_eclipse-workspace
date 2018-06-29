package com.javatest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	@Test
    public void testMethodOne(){
		System.out.println("ni");
        Assert.assertTrue(true);
    }
	  
    @Test
    public void testMethodTwo(){
	Assert.assertTrue(true);
    }
	  
    @Test(dependsOnMethods={"testMethodTwo"})
        public void testMethodThree(){
        Assert.assertTrue(true);
    }
}
