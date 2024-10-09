package innerclass;

abstract class My{
	
	abstract void display1();
}

class outer2{
	
	public void meth() {
	
	My m=new My() {
		
		@Override
		void display1() {
			System.out.println("Abstract method is overrided");
			
		}
	};
	m.display1();
}
}

public class Anonymousinnerclass {
	
	public static void main(String[] args) {
		outer2 o=new outer2();
		o.meth();
	}

}
