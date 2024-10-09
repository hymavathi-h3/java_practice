package oops;

class test5{
	
	static {
		System.out.println("Block1");
	}
	static {
		System.out.println("Block2");
	}
}

public class StaticBlock {
	
	public static void main(String[] args) {
		
		test5 t=new test5();
		
		System.out.println("Main");
		
	}

}
