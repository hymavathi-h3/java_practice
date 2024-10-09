package oops;

class test4{
	static int x=67;
	int y=90;
	
	static void display4() {
		
		System.out.println(x);
	}
	
	public void show() {
		System.out.println(x+" "+y);
	}
	
}

public class staticmethod {
	
	public static void main(String[] args) {
		test4 t1=new test4();
		t1.show();
		t1.x=56;
		
		test4 t2=new test4();
		t2.show();
		
		
		
		
	}

}
