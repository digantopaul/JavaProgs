package javaPrograms;

public class BMW extends Car{

	public static void start()	{
		System.out.println("Start the BMW");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW bmw = new BMW();
		
		start();
		bmw.stop();
		bmw.refuel();
		start();
	}

}


//