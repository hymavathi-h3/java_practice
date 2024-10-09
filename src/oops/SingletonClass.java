package oops;

class CoffeeMachine{
	
	private int CoffeeQuantity;
	private int waterQuantity;
	
	private static CoffeeMachine our=null;
	
	private CoffeeMachine() {
		CoffeeQuantity=1;
		waterQuantity=1;
	}
	
	public static CoffeeMachine getInstance() {
		if(our==null) {
			our=new CoffeeMachine();
		}
		return our;
	}
}

public class SingletonClass {
	
	public static void main(String[] args) {
		
		CoffeeMachine c=CoffeeMachine.getInstance();
		CoffeeMachine c2=CoffeeMachine.getInstance();
		CoffeeMachine c3=CoffeeMachine.getInstance();
		
	System.out.println(c);
	System.out.println(c2);                    //Same object is called....
	System.out.println(c3);
	}

}
