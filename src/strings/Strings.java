package strings;

public class Strings {

	public static void main(String[] args) {

		String str = "heloo...This is Hyma";

		String str1 = new String("Hi..I am Hyma");

		char c[] = { 'A', 'B', 'C', 'D' };

		String str2 = new String(c,1,3);
		
		System.out.println(str2);

		byte b[] = { 65, 66, 67, 68 };

		String str3 = new String(b);
		
		String str4=new String("Hyma here");
		
//		System.out.println(str);
//		
//		System.out.println(str1);
//		
//		
//		
//		System.out.println(str3);
//		
//		System.out.println(str4);
//		
		String s="Hyma";
		String h="Hyma";
		
		System.out.println(s==h);

	}

}
