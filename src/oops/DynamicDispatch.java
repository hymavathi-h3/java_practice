package oops;

class superClass {

	public void meth1() {
		System.out.println("Meth1 od super class");
	}

	public void meth2() {
		System.out.println("Meth2 of super class");
	}

}

class subclass extends superClass {
	public void meth2() {
		System.out.println("Meth2 of sub class ");
	}

	public void meth3() {
		System.out.println("Meth3 of sub class ");
	}
}

public class DynamicDispatch {

	public static void main(String[] args) {

		superClass s = new subclass();
		s.meth2();
	}

}
