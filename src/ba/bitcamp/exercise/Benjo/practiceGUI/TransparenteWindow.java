package ba.bitcamp.exercise.Benjo.practiceGUI;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TransparenteWindow {

	public static void main(String[] args) {
		 CoordinateListener listener =  new CoordinateListener();
		 
		 JFrame window =  new JFrame("Circle");
		 window.setSize(500, 500);
		 Paint panel =  new Paint();
		 panel.addMouseMotionListener(listener);
		 window.setContentPane(panel);
		 
		 window.setVisible(true);
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static class Paint extends JPanel {
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
		}

		
	}
	
	public  static class CoordinateListener implements MouseMotionListener{
		@Override
		public void mouseDragged(MouseEvent e) {
			Component source = (Component)e.getSource();
			Graphics g = source.getGraphics();			
			int x = e.getX();
			int y = e.getY();
			g.fillOval(x, y, 20, 20);
			System.out.println("x: "+x + " y: "+y);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			Component source = (Component)e.getSource();
			Graphics g = source.getGraphics();			
			int x = e.getX();
			int y = e.getY();
			g.fillOval(x, y, 20, 20);
			System.out.println("x: "+x + " y: "+y);
			
		}
	}
	
}
