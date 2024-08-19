package basics;

public class printstatements {
	
	public static void main(String[] args) {
		
		int a=-267;
		float b=456.8f;
		String str="Hello..This is Hyma";
		
//		System.out.printf("%3$s %3$s %2$f",a, b,str);            //explanation about argument index
		
//		System.out.printf("%30s",str);
//		System.out.printf("%-30s",str);                           //about flags and width
//		System.out.printf("%015d",a);
//		System.out.printf("%(15d", a);                            // -ve number is denoted in brackets
		System.out.printf("%6.8f", b);                              //float is never a original value..it is the nearest value                 
	
		
		
//		System.out.println("hello...this is hyma");
//		System.out.print("hello....this is hyma");
//		System.err.printf("my name is %s", "hyma");
		
//		System.err.println("hello...this is hyma");
//		System.err.print("hello....this is hyma");
//		System.err.printf("my name is %s", "hyma");
		
	}

}
