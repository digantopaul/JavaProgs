package javaPrograms;

public class DataTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String to Integer
		
		String num = "1";
		
		System.out.print(Integer.parseInt(num));
		
		System.out.println("String to Integer: "+Integer.valueOf(num));	

		
//		Integer To String
		
		int num1 = 1;
		
		System.out.println("Integer To String: "+String.valueOf(num1));
		
//		String to Long
		
		System.out.println("String to Long " + Long.parseLong(num));
		
	}	

}
