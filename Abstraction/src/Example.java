interface A{
	int a=1;
	static final int f=1;
	public abstract int A();
}

interface B{
	public abstract int B();
}

interface C extends A,B {
	int C();
}

class D {
	void D(){
		
	}
}

abstract class Abst implements C{
	abstract void get();
	Abst() {
	}
	Abst(int a) {
		this();
	}
	final void print() {
		System.out.println("Meant to be inherited but not overriden!");
	}
}

class AbstSub extends Abst {

	@Override
	public int C() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int A() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int B() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void get() {
		// TODO Auto-generated method stub
		
	}
     
}
public class Example {
	public static void main(String[] args) {
		//Abst a = new Abst(1);//cannot be instantiated
	}
}
