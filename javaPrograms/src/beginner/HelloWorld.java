package beginner;

public class HelloWorld	{

	public static void main(String args[])	{  //args[] is just name, you can used diganto[] there if you want. Also without any parameter at runtime, an empty string arrya is passed.
		System.out.println("HelloWorld");
		
		if(args.length == 0)	{
			System.out.println("No Parameters Passed. String args[] is empty.");
		}
		
	}
}