package oops;

public class Products_customer {

	public static void main(String[] args) {

		product p = new product();
		System.out.println(p.getItemno());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println(p.getQuantity());
		
		

	}

}

class product {
	private int itemno;
	private String name;
	private float price;
	private int quantity;

	public void setPrice(float f) {
		price = f;
	}

	public void setItemNo(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setQuantity(int n) {
		quantity = n;
	}
	
	
	public int getItemno() {
		return itemno;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public product(int itemno,String name) {
		itemno=345646;
		name="hyma";
	}
	public product(int itemno,String name,float price,int quantity) {
		itemno=5657;
		name="jhansi";
		price=908.7f;
		quantity=87;
		
	}

	public product() {
		// TODO Auto-generated constructor stub
	}
}
