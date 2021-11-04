package javaPrograms;

public class SwapNumbersNo3rdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5,b=6;
		
		a = a + b;
		b = a - b;		
		a = a - b;
		
		System.out.println("a is " +a+" and b is "+b);
		
	}

}
