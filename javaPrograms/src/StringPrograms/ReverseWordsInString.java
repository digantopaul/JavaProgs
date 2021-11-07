package StringPrograms;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " This is not the end.";
		
		System.out.println("The original String is \"" + str + "\"");	
		
//		WITHOUT USING THE REVERSE() METHOD of StringBuilder Or StringBuffer
		
		String[] strArr = str.split("\s");
		String revStr = "";
		for(String s : strArr)	{
			StringBuilder sb = new StringBuilder(s);
			
			revStr += sb.reverse() + " ";
		}
		
		System.out.println("The REV String is "+ revStr);
		
//		USING STRING BUILDER REVERSE()
		StringBuilder sb1 = new StringBuilder();
		sb1.append(str);
		System.out.println("The String  NOW IS "+sb1.substring(0));
		sb1.reverse();
		System.out.println("The reversed String  USING STRING BUILDER REVERSE() is "+sb1.substring(0));	
		
		StringBuilder sb2 = new StringBuilder(str);
		sb2.reverse();
		System.out.println("The reversed String with argument to StringBuilder USING STRING BUILDER REVERSE() is "+sb2.substring(0));		
		
//		USING STRING BUFFER REVERSE()
		StringBuffer sbf = new StringBuffer();
		sbf.reverse();
		System.out.println("The reversed String USING STRING BUFFER REVERSE() is "+sbf.substring(0));
		System.out.println("The Entire string is reversed");
		
	}

}
