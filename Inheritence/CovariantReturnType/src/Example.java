class A {
	protected A get() {
		System.out.println("Class A");
		return null;
	}
}

class B extends A {
	
	@Override
	public B get() { //Get can be overridden by changin it's return type 
		super.get(); //iif the return type of get method in
		System.out.println("Class B");//super class is non-primitive and the return type
		                             //in the subclass must be of subclass type
		
		return null;
	}
}
public class Example {
     public static final void main(String[] args) {
    	 A a = new B();
    	 a.get();
     }
}
