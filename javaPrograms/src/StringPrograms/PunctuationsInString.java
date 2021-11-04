package StringPrograms;

public class PunctuationsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Stores the count of punctuation marks    
//		int count = 0;    
//		String str = "He said, 'The mailman loves you.' I heard it with my own ears.";    
//		for (int i = 0; i < str.length(); i++)   
//		{    
//		//Checks whether given character is punctuation mark    
//		if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
//		str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
//		{    
//		count++;    
//		}    
//		}    
//		System.out.println("The number of punctuations exists in the string is: " +count);    
//		}    
			
		char[] arr = {'!',',','.','?','/','\''};
		
		
		String str = "This is prep!os,tur?ous.";
		int count=0;
			
		for(int j=0;j<arr.length; j++)	{
			for(char ch:str.toCharArray())	{
				if(ch == arr[j]) {
					count++;
					}
				}
			}
		
		System.out.println("Count " + count);
		
	}

}
