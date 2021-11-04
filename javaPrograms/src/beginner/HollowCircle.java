package beginner;
//@author Diganto Paul -- Work In Progress
public class HollowCircle	{

public static void main(String args[])	{

	System.out.println("Printing Circle Pattern Using Geometry");

	int radius=10;
	double halfChord=0;
	double k=0;
	double d=10;
	for(int i=0;i<=radius;i++)	{

			halfChord = Math.sqrt(Math.pow(radius,2) - Math.pow(d,2));
			double blank = radius - halfChord;
			
			for(k=0;k<blank;k++)	{
				System.out.print(" ");
			}
			for(k=0;k<=2*halfChord;k++)	{
				if(k==0 || k==2*halfChord)	{
					System.out.print("*");
				} else	{
						System.out.print(" ");
				}
			}
	d = d-2;
	System.out.println();
		}
	}
}