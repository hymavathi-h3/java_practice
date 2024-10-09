package oops;

class student{
	
	private String pinNo;
	private String name;
	private String dept;
	subjects s=new subjects();
	
	public String getpinNo() {
		
		return pinNo;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		
		return dept;
		
	}
	public void setPinNo(String p) {
		pinNo=p;
	}
	public void setName(String n) {
		name=n;
	}
	public void setDept(String d) {
		pinNo=d;
	}
	
	
	
	
	
	
}

class subjects{
	
	private int subID;
	private String name;
	private int maxMarks;
	private int marksObtain;
	
	
	
	
	
	
}

public class ArrayOfObjects {
	
	public static void main(String[] args) {
		
		student st=new student();
		
		
	}

}
