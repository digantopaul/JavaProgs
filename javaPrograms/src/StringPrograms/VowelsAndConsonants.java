package StringPrograms;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] vowels = {'a','e','i','o','u'};
		int count = 0, space = 0;
		
		String str = "This is not the end";		

		for(int i=0; i<vowels.length; i++)	{
			for(char ch:str.toCharArray())	{
				if(ch == vowels[i])	{
					count++;
				} 
			}
		}
		
		for(char ch : str.toCharArray())	{
			if(Character.isWhitespace(ch))	{
				space++;
			}
		}
		
		
		
		System.out.println("Length of the String "+str.length());
		System.out.println(" Vowel Counts " + count);
		System.out.println(" Space Counts " + space);
		System.out.println("Consonant Counts " + (str.length() - count - space));
		
	}

}
