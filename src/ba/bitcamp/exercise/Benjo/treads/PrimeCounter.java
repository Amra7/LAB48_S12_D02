package ba.bitcamp.exercise.Benjo.treads;

import java.util.Date;

/**
 * Koliko ima prostih brojeva izmedju 1 do 3.000.000
 * 
 * @author amrapoprzanovic
 *
 */
public class PrimeCounter extends Thread {

	private int start;
	private int end;
	private int counter;
	private static Date startTime;
	private static Date endTime;

	public PrimeCounter(int start, int end) {
		super();
		this.start = start;
		this.end =  end;
		counter=0;
	}
	

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public void run (){
		int counter = 0;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				counter++;
			}
		}
	}
	public void printResult(){
		System.out.printf("From %7d to %7d, counted %d5");
		System.out.println(" Thread time: " + ((double) endTime.getTime()));
	}

	public static void main(String[] args) {

		startTime = new Date();
		System.out.println(startTime.getTime());
		System.out.println("Number of primes: " + new PrimeCounter(1, 3000000));
		Date dateStop = new Date();
		System.out.println(dateStop.getTime());
	}

}
