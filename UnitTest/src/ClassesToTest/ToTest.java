package ClassesToTest;

public class ToTest {
       public double divide(double a, double b) {
    	   try {
    		   return a/b;
    	   } catch(ArithmeticException exception) {
    		   System.err.println(exception.getMessage());
    	   }
    	   return Double.POSITIVE_INFINITY;
       }
}
