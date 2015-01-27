package ba.bitcamp.exercise.Benjo.practiceGUI;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ba.bitcamp.exercise.Benjo.practiceGUI.WritingCoordinates.CoordinateListener;

public class EnterCoordinates {

	public static void main(String[] args) throws AWTException {
		CoordinateListener listener =  new CoordinateListener();
		
		JFrame window = new JFrame("Enter coordinate");
		window.setSize(500, 500);
		 
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Scanner scan =  new Scanner(System.in);
		Robot r =  new Robot();
		 while ( true){
			 System.out.println("Enter x and y: ");
			 int x = scan.nextInt();
			 int y = scan.nextInt();
			 r.mouseMove(x, y);
		 }
		
	}
}
