package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo1.Calculator;
/*import com.lti.demo1.MyApp;*/

class MyAppTest {
    @Test
	void testAdd()
	{
    	int r=Calculator.add(16, 6);
    	
    	Assertions.assertEquals(22, r);
    	Assertions.assertEquals(30, Calculator.add(20, 10));
    	Assertions.assertNotEquals(212, r);
	}
    @Test
    void testAssertFalse()
    {
    	Assertions.assertFalse("Prajwal".length()==6);
    	Assertions.assertFalse(10>20,"comparing");
    }
    @Test
    void testAssertNull()
    {
    	String s1=null;
    	String s2="abc";
    	Assertions.assertNull(s1);
    	Assertions.assertNotNull(s2);
    }
//    @Test
//    void testAssertAll()
//    {
//    	String s1="xyz";
//    	String s2="abc";
//    	String s3="pqr";
//    	Assertions.assertAll(
//    			() -> Assertions.assertEquals(s2,"abc"),
//    			() -> Assertions.assertEquals(s1,"xyz"),
//    			() -> Assertions.assertEquals(s3,"pqr")
//    			);
//    }
//    @Disabled
//    @Test
//    void testCollections()
//    {
//    	ArrayList<String> myList = new ArrayList<>();
//    	myList.add("Hello");
//    	Assertions.assertFalse(myList.isEmpty());
//    	
//    	ArrayList<Integer> myList1 =new ArrayList<>();
//    	Assertions.assertEquals(true, myList1.isEmpty());
//    }
//    
    
    

}
