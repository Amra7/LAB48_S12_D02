package ba.bitcamp.exercise.Benjo.treads;

import java.util.Date;

public class PrimeCountDrive {

	
public static void main(String[] args) {
	 int numTreads = Runtime.getRuntime().availableProcessors();;
	 int startIntervals = 1, endIntervals = 20;
	 int step = ( endIntervals - startIntervals)/numTreads;
	 
	 Date startTime = new Date();
	 PrimeCounter [] threads =  new PrimeCounter[numTreads];
	 for ( int  i= 0; i< threads.length; i++){
		 threads[i]= new PrimeCounter(startIntervals + i*step, startIntervals+ (i+1)*step) ;
		 threads[i].start();
				
	 }
	 
	 for ( int i = 0; i <threads.length; i++){
		 
	 }
}

}
