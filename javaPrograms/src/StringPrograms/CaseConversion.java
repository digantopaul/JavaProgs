package StringPrograms;

public class CaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is not tHe End.";
	
		char[] ch = str.toCharArray();
		
		StringBuilder sb = new StringBuilder();

//		USING COLLECTIONS		
		
		for(char c : ch)	{
			if(Character.isLowerCase(c))	{
				sb.append(Character.toUpperCase(c));
			} else	{
				sb.append(Character.toLowerCase(c));
			}			
		}
		System.out.println("String after case conversion USING Collection Methods "+sb.substring(0));
		
//		WITHOUGH USING COLLECTIONS
		
		for(char c : ch)	{
			sb.append(toUpperCaseWithASCIIValue(c));
		}
		System.out.println("String after case conversion USING ASCII \""+sb.substring(0)+"\"");		
	}
	
	
	static char toUpperCaseWithASCIIValue(char c)	{
		if(c >= 'a' && c <= 'z')	{
			c = (char)((int)c - 32);
		} else if (c >= 'A' && c <= 'Z')	{
			c = (char) ((int)c + 32);
		}
		return c;
	}
	
}
