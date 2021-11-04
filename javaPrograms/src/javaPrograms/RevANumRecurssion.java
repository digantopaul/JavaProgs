package javaPrograms;

public class RevANumRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5678, reverse=0;
		recRev(num,reverse);
	}
	
	
	static void recRev(int n, int rev)	{
		if(n > 0)	{
			int rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
			recRev(n,rev);
		}
		else {
			System.out.println("Reverse is " +rev);
		}
	}
	
}
