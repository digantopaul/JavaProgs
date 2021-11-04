package StringPrograms;

public class AllLongestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"aba", "aaaa", "ad", "vcd", "aba"};
//		int[] size = new int[arr.length];
				
		for(int i=0; i<arr.length; i++)	{			
//			 size[i]= arr[i].length();	
			for(int j=0;j<arr.length-1;j++)	{
				if(arr[j].length() > arr[j+1].length())	{
					String strTemp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = strTemp;
				}
			}
		}
		
			
		System.out.println(arr[arr.length-1]);
		
		
	}

}
