package ba.bitcamp.lecture.Vedad.xml;

public class Student {

	public String name;
	public String surname;

	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;

	}

	public String toXML() {
		return "<name>" + name + "</name>" + "\n     <surname>" + surname
				+ "</surname>";
	}
}
