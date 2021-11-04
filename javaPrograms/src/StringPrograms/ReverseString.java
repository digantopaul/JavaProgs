package StringPrograms;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is not the end";
		
		String[] strArr = str.split("\s");
		
		String[] arr = new String[strArr.length];
		
		for(int i=0; i<=strArr.length-1; i++)	{
			arr[i] = strArr[strArr.length-1-i];
		}		
		
		String str1 = Arrays.toString(arr);		
		System.out.println("Arrays.toString "+str1);
				
		StringBuilder sb = new StringBuilder();
		for(String s : arr)	{
			sb.append(s).append(" ");
		}
		
		System.out.println(sb.substring(0, sb.length()-1));
	}

}
