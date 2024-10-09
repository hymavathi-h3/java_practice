package oops;

interface Test{
	
	final static int X=10;
	
	void meth1();
	void meth2();
	static void meth3() {
		System.out.println("Static method of interface");
	}
	default void meth4() {
		System.out.println("Default of interface");
	}
	
}

class test1 implements Test{

	@Override
	public void meth1() {
		System.out.println("Meth1 of class");
		
	}

	@Override
	public void meth2() {
		
		System.out.println("Meth2 of class");
	}
	
	
}

public class Interface_3 {

	public static void main(String[] args) {
		
		System.out.println(Test.X);
		Test.meth3();
		test1 t=new test1();
		t.meth1();
		t.meth2();
		t.meth4();
		
		
		

	}

}
