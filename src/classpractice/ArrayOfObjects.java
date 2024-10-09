package classpractice;

class Subject {

	private int subID;
	private String subName;
	private int maxMarks;
	private int marksObtained;

	public int getsubID() {
		return subID;
	}

	public String getsubName() {
		return subName;
	}

	public int getmaxMarks() {
		return maxMarks;
	}

	public int getmarksObtained() {
		return marksObtained;
	}

	public void setmaxMarks(int mm) {
		maxMarks = mm;
	}

	public void setmarksObtained(int mO) {
		marksObtained = mO;
	}

	public Subject(int subID, String subName, int maxMarks) {
		
		this.subID=subID;
		this.subName=subName;
		this.maxMarks=maxMarks;

	}
	
	

	public boolean isQualified() {
		return marksObtained>=maxMarks/10*4;
	}
	public String toString() {
		return "SubID:"+subID+"\n"+"SubName:"+subName+"\n"+"MaximumMarks:"+maxMarks+"\n";
	}

}

public class ArrayOfObjects {
	
	public static void main(String[] args) {
		
		Subject subs[]=new Subject[3];
		subs[0]= new Subject(101,"IOT",100);
		subs[1]= new Subject(102,"Embedded Systems",100);
		subs[2]= new Subject(103,"WirelessSensors",100);
		
		for(Subject s:subs) {
			System.out.println(s);
			
		}
	}

}
