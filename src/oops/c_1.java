package oops;



class cylinder{
	
	private int radius;
	private int height;
	
	public cylinder(){
		radius=6;
		height=10;
		
	}
	public cylinder(int r,int height) {
		setRadius(radius);
		setHeight(height);
	}
	public cylinder(int s) {
		radius=height=s;
	}
	
	public void setRadius(int r) {
		
		radius=r;
	}
	
	public void setHeight(int h) {
		height=h;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public int getHeight() {
		return height;
	}
	
	 public double lidArea()
	    {
	        return Math.PI*radius*radius;
	    }
	    public double perimeter()
	    {
	        return 2*Math.PI*radius;
	    }
	    public double drumArea()
	    {
	        return 2*lidArea()+perimeter()*height;
	    }
	    public double volume()
	    {
	        return lidArea()*height;
	    }
	
}

public class c_1 {
	
	public static void main(String[] args) {
		
		cylinder c=new cylinder();
		c.setRadius(9);
		c.setHeight(8);
		System.out.println(c.getHeight());
		System.out.println(c.getRadius());
		System.out.println(c.lidArea());
		System.out.println(c.perimeter());
		System.out.println(c.drumArea());
		System.out.println(c.volume());
	}
	
	

}
