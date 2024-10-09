package oops;

public class DataHiding {
	
	public static void main(String[] args) {
		
		dataHidingPractice dh=new dataHidingPractice();
		dh.setlength(5);
		dh.setbreadth(6);
		System.out.println(dh.area());
		System.out.println(dh.perimeter());
		System.out.println(dh.getbreadth());
		System.out.println(dh.getlength());
		
		
	}

}


class dataHidingPractice {
	
	private int length;
	private int breadth;
	public int area() {
		return length*breadth;
		
	}
	public int perimeter() {
		return 2*(length+breadth);
		
	}
	public int getlength() {
		return length;
	}
	public void setlength(int l) {
		length=l;
	}
	public int getbreadth() {
		return breadth;
	}
	public void setbreadth(int b) {
		
		breadth=b;
	}
	
}


