package operators;

public class bitwiseoperators {
	public static void main(String[] args) {

		int x = -0b1111;
		int y = 0b1110;

//		System.out.println(x&y);
//		System.out.println(x|y);
//		System.out.println(x^y);
//		
//		System.out.println(x<<1);
//		System.out.println(x>>1);
//		System.out.println(x>>>1);
//		
//		System.out.println(x<<2);
//		System.out.println(x>>2);
//		int z = x >>> 2;
//		System.out.println(z);
//        
//		System.out.println(String.format("%s", Integer.toBinaryString(x)));
//		System.out.println(String.format("%s", Integer.toBinaryString(z)));
		
		int a=~y;
		System.out.println(a);
		System.out.printf("%s", Integer.toBinaryString(a));

	}

}
