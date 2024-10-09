package oops;

class Phone{
	public void calling() {
		System.out.println("Phone is calling");
	
}
	public void sms() {
		System.out.println("SMS is sent!");
	}
}

interface Icamera{
	void Capture();
	void Record();
}
interface IMusic{
	void play();
	void pause();
	
}

class Smartphone extends Phone implements Icamera,IMusic{
	public void calling() {
		System.out.println("SmartPhone is calling");
	
}
	public void sms() {
		System.out.println("Smart SMS is sent!");
	}
	
	public void Capture() {
		System.out.println("Photo is captured!");
	}
	
	public void Record() {
		System.out.println("Video is recorded!");
	}
	
	public void play() {
		System.out.println("video is playing!");
	}
	
	public void pause() {
		System.out.println("video is stopped!");
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		Smartphone s=new Smartphone();
		s.calling();
		s.Capture();
		s.pause();
		s.play();
		s.Record();
		s.sms();

	}

}
