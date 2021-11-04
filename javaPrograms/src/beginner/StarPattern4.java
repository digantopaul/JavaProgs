package beginner;

//     *
//	  ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//	   *

public class StarPattern4	{
	
	public static void main(String args[])	{
		
		for(int i=0;i<5;i++)	{
			
			for(int k=4;k>=i;k--)	{
				System.out.print(" ");
			}
			
			for(int j=0;j<(2*i)+1;j++)	{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4;i>=0;i--)	{	
		
			for(int k=4;k>=i;k--)	{
				System.out.print(" ");
			}
		
			for(int j=0;j<(2*i)+1;j++)	{
				System.out.print("*");				
			}
			System.out.println();
		}
		
		
		System.out.println("---------------------");
		
		
		for(int i=0;i<5;i++)	{
			
			for(int k=4;k>=i;k--)	{
				System.out.print(" ");
			}
			
			for(int j=0;j<(2*i)+1;j++)	{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=3;i>=0;i--)	{						// The i is initialised as 3 instead of 4
		
			for(int k=4;k>=i;k--)	{
				System.out.print(" ");
			}
		
			for(int j=0;j<(2*i)+1;j++)	{
				System.out.print("*");				
			}
			System.out.println();
		}
	
	}


}