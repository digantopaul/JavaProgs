package ArrayPrograms;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {10,20,30,40,50};
		int tmp;
		
		for (int i=0; i<=(arr1.length-1)/2;i++) {
			tmp = arr1[i];
			arr1[i] = arr1[(arr1.length-1)-i];
			arr1[(arr1.length-1)-i] = tmp;
		}
		
		for (int i=0; i<=arr1.length-1;i++) {
			System.out.println(arr1[i]);
		}
	
	}

}
