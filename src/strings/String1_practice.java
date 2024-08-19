package strings;

public class String1_practice {
	
	public static void main(String[] args) {
		
		String email="hymavathi1003@gmail.com";
		
		int index=email.indexOf("@");
		
		String str=email.substring(0,index);
		
		String str1=email.substring(index+1);
		
		System.out.println(str);
		
		System.out.println(str1);
		
	}

}
