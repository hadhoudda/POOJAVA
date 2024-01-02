package fr.houda.record;

public class StartRecord {

	public static void main(String[] args) {
		Point p = new Point(75, 83);
		System.out.println(p);
		RecordPoint pRecord = new RecordPoint(56, 17);
		System.out.println(pRecord);
		System.out.println("-----------------");
		PersonRecord person = new PersonRecord("houda", "ben",10);
		person.Age();
		PersonRecord person2 = new PersonRecord("jawad", "aoun",48);
		System.out.println(person);// on besoin de redefinir le methoide ToString
		System.out.println(person2);
		person2.Age();

	}

}
