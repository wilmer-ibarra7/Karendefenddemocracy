package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	
	public void run() {
		println("This program lists the Fibonacci sequence.");
		int Fib0 = 0;
		int Fib1 = 1;
		while (Fib0 < MAX_TERM_VALUE) {
			println (Fib0);
			int Fib2 = Fib0 + Fib1;
			Fib0 = Fib1;
			Fib1 = Fib2;	
		}
	}
/*Defines the largest term to be displayed */
	private static final int MAX_TERM_VALUE = 10000;
}
