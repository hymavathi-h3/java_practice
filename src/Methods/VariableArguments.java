package methods;

public class VariableArguments {
	
//	static void show(int ...a) {
//		
//		for(int x:a) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//		
//		
//	}
	static void showList(int n,String... s) {
		
		for(int i=0;i<s.length;i++) {
			System.out.println(n+". "+s[i]);
			n++;
		}
		
	}
	
	public static void main(String[] args) {
//		show(10,20,30);
//		show(new int[] {2,8,0,7,6,});     //anonymns array
		showList(3,"hyma","sridevi","lakshmi");
	}
	
	

}
