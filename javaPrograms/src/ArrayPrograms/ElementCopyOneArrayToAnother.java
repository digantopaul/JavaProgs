package ArrayPrograms;

public class ElementCopyOneArrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[]{1,2,3,4,5};
		int[] b = new int[5];
		
		
		for(int i=0; i<5; i++)	{
			b[i] = a[i];
			System.out.println("B at "+i+" is "+ b[i]);
 		}
		
	}

}
