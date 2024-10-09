package oops;

abstract class Super{
	
	public void meth1() {
		System.out.println("meth1 od super class");
	}
	
	abstract public void meth2();
}

class Sub extends Super{

	@Override
	public void meth2() {
		System.out.println("meth2 of sub is called");
		
	}
	
}

public class AbstractClass {
	
	public static void main(String[] args) {
		Super s=new Sub();
		
		s.meth1();
		s.meth2();
	}
	

}
