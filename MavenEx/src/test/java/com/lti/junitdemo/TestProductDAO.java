package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class TestProductDAO {

//	@Test
//	public void testExceptions() {		
//		
//	    Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
//	        Integer.parseInt("100abc");
//	        });
//
//	    String expectedMessage = "For input string";
//	    String actualMessage = exception.getMessage();
//	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
	   // Assertions.assertEquals(expectedMessage,actualMessage);
	    
//	}	
//	 @Test
//	 void testAssumeTrue() {
//	      boolean b = "A" == "A";
//	      Assumptions.assumeTrue(b);
//	     // Assertions.assertEquals("Hello", "Hello");
//	 }
//
//	
 @Test
	 void testAssumeFalse() {
	      boolean b = 'A' != 'A';
	      Assumptions.assumeFalse(b);
	      Assertions.assertEquals("Hello", "Hello");
	 }
//	 @Test
//	 void testAssumeFalseEnvProp() {
//	      System.setProperty("env", "prod");
//	      Assumptions.assumeFalse("dev".equals(System.getProperty("env")));
//	      System.out.println("further code will execute only if above assumption hold");
//	 }
//
//	 @Test
//	 void testAssumingThat() {
//	      System.setProperty("env", "test");
//	      Assumptions.assumingThat("test".equals(System.getProperty("env")),
//	           () -> {
//	        	   Assertions.assertEquals(10, 10);
//	                System.out.println("perform below assertions only on the test env");
//	                });
//
//	      Assertions.assertEquals(20, 20);
//	      System.out.println("perform below assertions on all env");
//	 }
}

