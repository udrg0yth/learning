package first;

class A {
	public void fin() throws Throwable {
		super.finalize();
	}
	
}
public class FirstClass {

	public static void main(String[] args) throws Throwable {
		    String str = "a";
            for(int i=0;i<Math.pow(10,10);i++) {
            	str += "a";
            }
	}

}
