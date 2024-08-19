package strings;

public class StringMethods {

	public static void main(String[] args) {

		String str = "  Hymavathi  ";

		int len = str.length();

		str = str.trim();

		String str1 = str.toLowerCase();

		String str2 = str.toUpperCase();

		String str3 = str.substring(4);

		String str4 = str.replace('a', 'e');
		
		Boolean b=str.startsWith("H");
		
		Boolean a=str.endsWith("i");
		
		char ch=str.charAt(4);
		
		int c=str.indexOf("ym");        //overloaded methods can be changed based on requirement
		
		int d=str.lastIndexOf("a");

		System.out.println(str);

		System.out.println(len);

		System.out.println(str1);

		System.out.println(str2);

		System.out.println(str3);

		System.out.println(str4);
		
		System.out.println(b);

		System.out.println(a);
		
		System.out.println(c);
		
		System.out.println(ch);
		
		System.out.println(d);
		
		String str5="Hymavathi";
		String str6="vathi";
		System.out.println(str5.contains(str6));
		
		
	}

}
