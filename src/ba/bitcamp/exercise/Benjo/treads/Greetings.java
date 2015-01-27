package ba.bitcamp.exercise.Benjo.treads;

public class Greetings extends Thread{

	private int id;
	private static int totalCount;

	public Greetings(int id) {
		this.id = id;
	}
	
	public synchronized void increaseCount(){
		totalCount++;
	}

	public void greetingCount() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("Hello from %d! Just counted to: %d . Total count is: %d\n", id, i, totalCount);
			increaseCount();
		}
	}
	public void run (){
		greetingCount();
	}

	public static void main(String[] args) {

		Greetings[] gr =  new Greetings[5];
		for ( int i=0; i<5; i++){
			gr[i]=  new Greetings(i);
			gr[i].start();
//			g.run();
//			gr[i].join();
		}
		for ( Greetings g : gr){
			try {
				g.join();
			} catch (InterruptedException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Gotovo!");
	}

}
