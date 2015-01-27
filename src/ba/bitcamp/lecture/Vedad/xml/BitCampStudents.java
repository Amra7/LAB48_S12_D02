package ba.bitcamp.lecture.Vedad.xml;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class BitCampStudents {

	public int numStudents = 22;
	// public Student [] students = new Student[numStudents];
	public ArrayList<Student> students;

	public BitCampStudents() {
		this.students = new ArrayList<Student>();
	}

	public String toXML() {
		String tmp = "";

		tmp = "<numStudents>" + numStudents + "\n</numStudents>\n";
		for (Student stu : students) {
			tmp += "    <students>" + stu.toXML() + "</students>\n";
		}
		
		/* drugi nacin*/
//		for ( int i =0; i<students.size(); i++){
//			tmp += "<students>" + students.get(i).toXML() + "</students>";
//		}
		return tmp;

	}
	
	
}
