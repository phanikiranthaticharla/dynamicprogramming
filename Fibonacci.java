/**  A Dynamic Program to calculate Fibonacci Numbers
 *   @author Phani Kiran Thaticharla
 *  Ver 1.0: 06/02/2018
 */

import java.util.Scanner;

public class Fibonacci {

    public int fibonacci(int n) {

	// Create an array to store computed values
	int[] fib = new int[n+2];

	// Initialize base values
	fib[0] = 0;
	fib[1] = 1;
	
	for(int i=2; i<=n ;i++) {
	    fib[i] = fib[i-1] + fib[i-2];
	}

	return fib[n];
    }

    public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a positive integer"); 
	int n = sc.nextInt();

	Fibonacci f = new Fibonacci();
	System.out.println("Fibonacci of "+n+": "+f.fibonacci(n));
    }
}
