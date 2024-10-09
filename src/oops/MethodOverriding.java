package oops;

class TV{
	
	public void changeVolume() {
		System.out.println("Volume of TV has changed");
	}
	
	public void changeChannel() {
		System.out.println("Channel of TV has changed");
	}
	
}

class SmartTV extends TV{
	
	public void changeVolume() {
		System.out.println("Volume of SmartTV has changed");
	}
	
	public void changeChannel() {
		System.out.println("Channel of SmartTV has changed");
	}
	
	public void browse() {
		System.out.println("Browsing has been intialised");
	}
	
	
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		TV t=new TV();
		t.changeChannel();
		t.changeVolume();
		
		SmartTV s=new SmartTV();
		s.changeChannel();
		s.changeVolume();
		s.browse();
	}

}
