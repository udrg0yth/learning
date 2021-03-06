package Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import ClassesToTest.*;


@RunWith(Parameterized.class)
public class Tests {
	 @Parameter
	 private double  m1;
	
	 @Parameter (value = 1)
	 private double  m2;
	
	 @Parameters
	 public static Collection<Object[]> data() {
		 Object[][] data = new Object[][] { { 1.0d , 1.0d }, { 5, 3 }, { 121, 4 } };
	    return Arrays.asList(data);
	 }
	 
	 @Test(timeout = 0)
     public void TestToTest() {
    	 ToTest toTest = new ToTest();
    	 assertEquals("Failed,", 1.0d , toTest.divide(m1, m2), 0);
     }
}
