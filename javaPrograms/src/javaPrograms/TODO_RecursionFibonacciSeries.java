package javaPrograms;
// TO DO 
import java.util.Scanner;

public class TODO_RecursionFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start=0, first=1,limit;
		
		System.out.println("Enter the number of terms in the Fibonacci Series: ");
		
		try (Scanner sc = new Scanner(System.in)){
			limit = sc.nextInt();
		}
		
		recFibonacci(limit-2,start,first);
		
	}
	
	static void recFibonacci(int range,int n0, int n1)	{
		
		if(range>0)	{
			int next = n0 + n1;
			n0 = n1;
			n1 = next;
			recFibonacci(range-1, n0, n1);
		}
	}
}
