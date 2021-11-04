package beginner;

import java.lang.String;

public class StringPalindrome {

	String str;
	boolean checkPalindrome(String str) {
			int l = str.length();
			for(int i=0,j=l-1;i<=j;i++,j--)	{
				if(str.charAt(i) != str.charAt(j))	{
					return false; 
				}				
			}
			return true;
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringPalindrome sp = new StringPalindrome();
		sp.str = "AABAAA";
		
		System.out.println("Is the string "+ sp.str + " palindrome? " + sp.checkPalindrome(sp.str));
	}

}