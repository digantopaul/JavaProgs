package ArrayPrograms;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] iarr = new int[] {1,2,3,1,5,6,7,8,9,0};
		int count=0;
		for(int i=0; i<iarr.length; i++)	{
			for(int j=i+1; j<iarr.length; j++)
			if(iarr[i] == iarr[j])	{
				System.out.println("Duplicate element "+iarr[j]);
				count++;
			} 
		}
		
		if(count!=0)	{
			System.out.println(count+" duplicate elements found in the array.");
		} else	{
			System.out.println(count+" duplicate elements found in the array.");
		}
		
	}

}
