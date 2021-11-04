package beginner;
//@author Diganto Paul
public class StarCircle	{

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
				System.out.print("*");
			}
	d = d-2;
	System.out.println();
		}

	System.out.println();
	System.out.println();
	System.out.println("Printing Circle Pattern Using Trigonometry");

	radius=10;
	halfChord=0;
	k=0;
	double angle = 0.0;
	for(int i=0;i<=radius;i++)	{
			double deg2rad = Math.toRadians(angle);
			halfChord = radius*Math.sin(deg2rad);
			double blank = radius - halfChord;
			
			for(k=0;k<blank;k++)	{
				System.out.print(" ");
			}
			for(k=0;k<=2*halfChord;k++)	{
				System.out.print("*");
			}
	angle = angle+15;
	System.out.println();
		}
	}
}