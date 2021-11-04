package javaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234331, reverse=0;
		int tmp = num;
		
		while(num>0) {
			reverse = reverse*10 + num%10;
			num = num/10;
		}		
		
		System.out.println("Reverse "+reverse);
		
		if(reverse==tmp)	{
			System.out.println("Palindrome");
		}else	{System.out.println("Not Palindrome");}
	}
}
