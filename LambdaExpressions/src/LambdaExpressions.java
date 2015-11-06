public class LambdaExpressions {
    interface MyOp {
    	double exe(double a, double b);
    }
    
    public static double compute(double a, double b, MyOp operation) {
           return operation.exe(a,b);
    }
	
	public static void main(String[] args) {
        MyOp div = (a,b) -> a/b;
        System.out.println(LambdaExpressions.compute(4, 3, div));
 	}

}
