package innerclass;

class outer3{
	static int x=8;
	int y=9;
	 static class inner4{
		 
		public void display3() {
			System.out.println(x);
		
		}
	 }
	
}

public class Static_InnerClass {
	
	public static void main(String[] args) {
		outer3.inner4 oi=new outer3.inner4();
		oi.display3();
		

}
}
