package com.cruisemaniac;

import junit.framework.Assert;
import org.junit.Test;

public class HelloServletTest {
	
	//sample test case
	@Test
	public void testPrintHello() {
		Assert.assertEquals(true, true);
	}
	
	
	@Test
	public void testFailPrintHello() {
		Assert.assertEquals(false, false);
	}
	
}
