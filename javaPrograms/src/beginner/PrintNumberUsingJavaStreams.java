package beginner;

import java.util.stream.IntStream;

public class PrintNumberUsingJavaStreams {
	
	public static void main(String args[])	{
		
		IntStream.range(1, 101).forEach(e -> System.out.println(e));
	}
}
