package innerclass;

class OuterClass{
	
	public void display() {
		
		class inner{
			
			public void show() {
				System.out.println("display");
			}
		}
		
		inner i=new inner();
		i.show();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		OuterClass o=new OuterClass();
		o.display();

	}

}
