package beginner;

public class StarPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Pattern 1
//		*
//		**
//		***
//		****
//		*****
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");

//		Pattern 2
//		*****
//		****
//		***
//		**
//		*
		
		for(int i=0;i<5;i++) {
			for(int j=4;j>=i;j--)	{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
//		Pattern 3
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
	
		for (int i=0;i<5;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=4;i++) {
			for(int j=4;j>i;j--)	// "j>=i" will make two rows of 5 *s get printed.  	
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
//		Pattern 4
//        *
//	     **
//	    ***
//	   ****
//	  *****
		
		for(int i=0;i<=4;i++) {
			for(int j=4;j>=i;j--)	// "j>=i" will make two rows of 5 *s get printed.  	
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)	// "j>=i" will make two rows of 5 *s get printed.  	
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
