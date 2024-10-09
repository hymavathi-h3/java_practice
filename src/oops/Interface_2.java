package oops;

interface Member{
	void callback();
	
}


class store{
	
	Member mem[]=new Member[5];
	int count=0;
	public void register(Member m) {
		mem[count++]=m;
	}
	
	public void InviteSale() {
		for(int i=0;i<count;i++) {
			mem[i].callback();
		}
	}
}

class customer implements Member{
	
	String name;
	public customer(String n) {
		name=n;
	}
	@Override
	public void callback() {
		System.out.println("Ok, I will visit.. "+name);
		
	}
	
}

public class Interface_2 {
	
	public static void main(String[] args) {
		store s=new store();
		customer c1=new customer("Hyma");
		customer c2=new customer("Sridevi");
		s.register(c1);
		s.register(c2);
		s.InviteSale();
		
		
		
		
		
	}

}
