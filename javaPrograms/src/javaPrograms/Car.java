package javaPrograms;

public class Car {

	
		//Method Hiding --> hid the method start() from child classes using 'static' keyword.
		public static void start()	{
			System.out.println("Start Car");
		}
		
		public static void start(int a)	{
			System.out.println("Start Car");
		}
		
		public static void start(String b)	{
			System.out.println("Start Car");
		}
		
		public void stop()	{
			System.out.println("Stop Car");
		}
		
		public void refuel()	{
			System.out.println("Refuel the car");			
		}


}
