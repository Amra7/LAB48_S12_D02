package ba.bitcamp.lecture.Vedad.xml;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class TestXMLBitCamp {

	public static void main(String[] args) {
/*		
		BitCampStudents bcs = new BitCampStudents();
		bcs.students.add(new Student("Necko", "H"));
		bcs.students.add(new Student("Sanela", "G"));
		bcs.students.add(new Student("Amra", "P"));
		bcs.students.add(new Student("Nedim", "O"));
		bcs.students.add(new Student("Hikmet", "D"));
		bcs.students.add(new Student("Jesenko", "G"));
		System.out.println("<BitCamp>" + bcs.toXML() + "</BitCamp>");
*/
		DocumentBuilder docReader;
		Document xmldoc;
		BitCampStudents bcs = new BitCampStudents();
		try {
			docReader = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			xmldoc = docReader.parse(new File("/Users/amrapoprzanovic/Documents/workspace/LAB48_S12_D02/src/ba/bitcamp/lecture/Vedad/xml/test.xml"));
//			Element el = xmldoc.getDocumentElement();
//			bcs.numStudents = Integer.parseInt(el.getTextContent());
			System.out.println(xmldoc.getDocumentElement().getTextContent());
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
