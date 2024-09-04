package classpractice;

public class Cylinder {

	public int radius;
	public int height;

	public double lidArea() {

		return Math.PI * radius * radius;

	}

	public double SurfaceArea() {

		return 2 * lidArea() + Circumference() * height;

	}

	public double Volume() {

		return lidArea() * height;

	}

	public double Circumference() {

		return 2 * Math.PI * radius;

	}

	public static void main(String[] args) {

		Cylinder c = new Cylinder();
		c.radius = 3;
		c.height = 6;
		System.out.printf("LidArea: %.2f\n", c.lidArea());
		System.out.printf(" Surfacearea: %.2f\n",c.SurfaceArea());
		System.out.printf(" Volume: %.2f\n",c.Volume());
		System.out.printf(" Circumference: %.2f",c.Circumference());

	}

}
