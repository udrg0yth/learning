class A {
	A() {
		System.out.println("A constructor");
	}
	
}
class B extends A{
	private int a;
	private int b;
	{
		System.out.println("Initialization Block");
		a=100;
		b=200;
	}
	B() {
		super();
		System.out.println("B constructor: " + (a+b));
	}
}


public class ExampleIIB {
    public static void main(String[] args) {
    	new B(); // super is called before initialization block
    }
}
