package ArrayPrograms;

import java.util.ArrayList;

public class ElementFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,4,5,6,7,8,1,2,3};
		ArrayList<Integer> aL = new ArrayList<Integer>();
		int count = 0;
		
		for(int i=0;i<=a.length-1;i++)	{
			for(int j=i+1; j<=(a.length-1)-i; j++)	{
				if(a[i] == a[j])	{
					count++;
					aL.add(a[i]);
				} else	continue;
			}
		}		
		if(count > 1)	{
			System.out.println("There are duplicate elements in the array");
			System.out.println("The duplicate elements are ");
			for(int e : aL)	{
				System.out.print(e + " ");
			}
		} else	System.out.println("There are no duplicate elements in the array");
	}

}
