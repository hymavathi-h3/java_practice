package oops;

class constrctorpractice{
	
	private int length;
	private int breadth;
	
	public constrctorpractice() {
		length=4;
		breadth=7;
	}
	public constrctorpractice(int l,int b) {
		setbreadth(b);
		setlength(l);
	}
	public constrctorpractice(int s) {
		length=breadth=s;
	}
	
	public int getlength() {
		return length;
	}
	public int getbreadth() {
		return breadth;
		
	}
	public void setlength(int l) {
		length=l;
		}
	public void setbreadth(int b) {
		breadth=b;
	}
	
	public int area() {
		return length*breadth;
	}
	
}

public class Constructors {
	
	public static void main(String[] args) {
		constrctorpractice cp=new constrctorpractice();
		cp.setlength(3);
		cp.setbreadth(8);
		System.out.println(cp.area());
		System.out.println(cp.getbreadth());
		
		
	}

}

