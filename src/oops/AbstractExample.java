package oops;

abstract class shape{
	
	abstract public void perimeter();
	abstract public void area();
	
	}
class circle extends shape{
	
	private int radius=7;

	@Override
	public void perimeter() {
		System.out.println(2*Math.PI*radius);
		
	}

	@Override
	public void area() {
		System.out.println(Math.PI*radius*radius);
		
	}
	
}

class Rectangleclass extends shape{
	
	int length=5;
	int breadth=89;

	@Override
	public void perimeter() {
		System.out.println(2*(length+breadth));
		
	}

	@Override
	public void area() {
		System.out.println(length*breadth);
		
	}
	
}

public class AbstractExample {
	
	public static void main(String[] args) {
		shape c=new circle();
		c.perimeter();
		c.area();
		
		shape r=new Rectangleclass();
		r.area();
		r.perimeter();
		
	}
	
	
	

}
