package ba.bitcamp.exercise.BenjoDone.treads;

public class Greetings extends Thread {

	private int id;
	private static int totalCount = 0;

	public Greetings(int id) {
		super();
		this.id = id;
	}
	
	public synchronized void increaseCount(){
		totalCount++;
	}

	public void greetingCount() {
		for (int i = 0; i < 5; i++) {
			System.out.printf(
					"Hello from %d! Just counted to: %d. Total count is: %d\n",
					id, i, totalCount);
			increaseCount();
		}
	}

	public void run() {
		greetingCount();
	}

	public static void main(String[] args) {

		Greetings[] gr = new Greetings[5];
		for (int i = 0; i < gr.length; i++) {
			gr[i] = new Greetings(i);
			gr[i].start();
		}

		for (Greetings g : gr) {
			try {
				g.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Gotovo");
	}

}
