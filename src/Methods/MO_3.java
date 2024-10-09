package methods;

public class MO_3 {
	
	static boolean validate(String name) {
		return name.matches("[a-zA-z\\s]+");
	}
	static boolean validate(int age) {
		return age>=3 && age<=20;
	}
	
	public static void main(String[] args) {
		
		String name="Hymavathi";
		int age=50;
		boolean b=validate(age);
		System.out.println(b);
	}

}
