package basics;

public class constructorpractice {
	
	public int i;
	
	public static void main(String[] args) {
		
		
		constructorpractice cp=new constructorpractice(78);
		System.out.println(cp.i);
		}
	public constructorpractice(int a) {
		
		i=a;
		System.out.println(a);
	
	}

}
