package oops;

class rectangle {

	int length;
	int breadth;

	public rectangle() {
		length = breadth = 1;
	}

	public rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	public int area() {
		return length * breadth;
	}
}

class cuboid extends rectangle {

	int height;

	public cuboid() {
		height = 1;
	}

	public cuboid(int h) {
		height = h;
	}

	public cuboid(int l, int b, int h) {
		super(l, b);
		length = l;
		breadth = b;
		height = h;
	}

	public int volume() {
		return length * breadth * height;
	}
}

public class Inheritance {

	public static void main(String[] args) {

		cuboid c = new cuboid(20, 35, 46);
		System.out.println("Volume of cuboid is " + c.volume());
	}

}
