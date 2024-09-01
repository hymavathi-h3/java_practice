package Methods;

public class MethodsPractice {
	
	public static void main(String[] args) {
		
		int a=20,b=100;
		MethodsPractice mp=new MethodsPractice();
		System.out.println(mp.max(a,b));
		System.out.println(a);
		System.out.println(mp.inc(a));
	}
	

	
	int max(int x,int y) {
		
		if(x>y)
			return x;
		else
			return y;
	}
	int inc(int x) {
		x++;
		return x;
	}
	

}
