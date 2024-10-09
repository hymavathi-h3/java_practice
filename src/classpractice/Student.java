package classpractice;

class students {

	public int PinNo;
	public String name;
	public String course;
	public int m1, m2, m3;

	public float average() {
		return (m1 + m2 + m3) / 3;
	}

	public int total() {
		return m1 + m2 + m3;
	}

	public String grade() {

		if (average() > 90)
			return "A grade";

		else if (average() > 80)
			return "B grade";

		else if (average() > 70)
			return "C grade";

		else if (average() > 60)
			return "D grade";
		else
			return "F grade";

	}

}

public class Student {

	public static void main(String[] args) {
		students s = new students();
		s.PinNo = 65765;
		s.name = "Hyma";
		s.m1 = 65;
		s.m2 = 54;
		s.m3 = 67;
		System.out.println("Average marks=" + s.average());
		System.out.println("Total marks are=" + s.total());
		System.out.println(s.grade());

	}

}
