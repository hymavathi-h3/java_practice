package oops;

import java.util.Date;

class student1{
	
	private String rollNo;
	private static int count=1;
	
	public student1() {
		rollNo=generatePinno();
	}

	private static String generatePinno() {
		Date d=new Date();
		String pin="GIET"+(d.getYear()+1900)+count;
		count++;
		return pin;
	}
	public String rollNo() {
		return rollNo;
	}
}

public class Static_method {
	
	public static void main(String[] args) {
		student1 s1=new student1();
		student1 s2=new student1();
		System.out.println(s1.rollNo());
		System.out.println(s2.rollNo());
		
		
	}

}
