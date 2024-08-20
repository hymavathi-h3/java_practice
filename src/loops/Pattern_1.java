package loops;

public class Pattern_1 {
	
	public static void main(String[] args) {
		int count=25;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%02d ",count--);
			}
			System.out.println();
		}
	}

}
