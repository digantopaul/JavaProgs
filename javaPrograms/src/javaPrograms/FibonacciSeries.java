package javaPrograms;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start=0, first=1, next, limit;
		
		System.out.println("Enter the number of terms for Fibonacci Series: ");
				
		try (Scanner sc = new Scanner(System.in)) {
			limit = sc.nextInt();
		}
		
		System.out.println("Limit is " + limit);
		
		System.out.print(start + " " + first);
		
			while( limit>0 ) {
				next = start + first;
				start = first;
				first = next;
				System.out.print(" " + first);
				limit--;
			}
	}
}
