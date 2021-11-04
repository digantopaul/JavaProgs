package beginner;
// Concept of Recursive function
public class NumbersWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNum(1);
		
		System.out.println("\n");
		
		printNum(50,100);

	}
	
	public static void printNum(int n)	{
		if(n <= 100 )	{
			System.out.print(n + ",");
			n++;
			printNum(n);
		}
	}
	
	public static void printNum(int stNum, int endNum)	{
		if(stNum <= endNum )	{
			System.out.print(stNum + ",");
			stNum++;
			printNum(stNum,endNum);
		}
	}

}
