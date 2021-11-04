package javaPrograms;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 7;
		
		System.out.println("Calculating factorial of number "+num);
		
		System.out.println("FACTORIAL OF THE NUMBER WITHOUT RECURSION "+ factorialNoRecursion(num));

		
		System.out.print("FACTORIAL OF THE NUMBER WITH RECURSION " + factorialWithRecursion(num));
		
	}
	
	static int factorialNoRecursion(int number)	{
		int fact=1;
		while(number >= 1) {
			fact = fact*number;
			number--;
		}
		return fact;
	}
	
	static int factorialWithRecursion(int number)	{	
		if(number==1)	{
			return 1;
		}	else	
			return number * factorialWithRecursion(number-1);
	}
}
