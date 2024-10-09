package oops;

class methodoverloading{
	
	public int max(int a ,int b) {
		return a>b?a:b;
	}
	
	public int max(int a,int b,int c) {
		return (a>b && a>c)?a:((b>c)?b:c);
	}
}

class Supermethodriding{
	
	public void display() {
		System.out.println("Supermethodriding is called");
	}
}

class submethosrrding extends Supermethodriding{
	
	public void display() {
		System.out.println("Submethodriding is called");
	}
	
}

public class Polymorphism {
	
	public static void main(String[] args) {
		
		Supermethodriding s=new submethosrrding();
		s.display();
		
		methodoverloading m=new methodoverloading();
		
		int r=m.max(7, 4);
		System.out.println(r);
		
		int result=m.max(71, 34,8);
		System.out.println(result);
		
		
	}

}
