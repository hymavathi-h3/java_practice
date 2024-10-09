package innerclass;

class outer{
	
	int a=10;
	
	class inner{
		int b=98;
		
		public void innermeth() {
			System.out.println(a+b);
		}
		
	}
	
	public void outermeth() {
		
		inner j=new inner();
		j.innermeth();
	}
	
}

public class Innerclasses {
	
	public static void main(String[] args) {
		outer o=new outer();
		o.outermeth();
		
		outer.inner i=new outer().new inner();
		i.innermeth();
		
		
		
	}

}
