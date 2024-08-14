package variables;

public class Instance_variable {

	int i = 345;
	String s = "hymavathi";

	public static void main(String[] args) {

		Instance_variable var = new Instance_variable();

		System.out.println(var.i);

		test1();
	}

	public static void test1() {

		System.out.println(new Instance_variable().s);
	}
}
