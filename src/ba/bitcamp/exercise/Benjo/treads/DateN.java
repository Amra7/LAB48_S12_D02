package ba.bitcamp.exercise.Benjo.treads;

import java.util.Date;

public class DateN {

	public static void main(String[] args) {

		Date start = new Date();

		System.out.println(start.getTime());

		System.out.println("Number of primes: " + countPrimes(1, 20));

		Date stop = new Date();

		System.out.println(stop.getTime());

		// System.out.println("Time: " + );

	}

	public static int countPrimes(int a, int b) {

		int brojac = 0;

		for (int i = a; i <= b; i++) {

			if (isPrime(i)) {

				brojac++;

			}

		}

		return brojac;

	}

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				return false;

			}

		}

		return true;

	}

}
