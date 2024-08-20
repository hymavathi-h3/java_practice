package strings;

public class String1_practice {
	
	public static void main(String[] args) {
		
		String email="hymavathi1003@gmail.com";
		
		int index=email.indexOf("@");
		
		String username=email.substring(0,index);
		
		String domain=email.substring(index+1);
		
		System.out.println(username);
		
		System.out.println(domain);
		
		System.out.println(domain.startsWith("gmail"));
		
	}

}
