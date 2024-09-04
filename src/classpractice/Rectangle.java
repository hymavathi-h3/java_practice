package classpractice;

public class Rectangle {

	public int length;
	public int breadth;

	public int area() {
		return length * breadth;
	}

	public int perimeter() {
		return 2 * (length + breadth);
	}

	public boolean isSquare() {

		return (length == breadth);
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.length = 50;
		r.breadth = 5;
		System.out.println("Area of rectangle: " + r.area());
		System.out.println("Perimeter of rectangle: " + r.perimeter());
		System.out.println("Wheather square or not: " + r.isSquare());

	}

}
