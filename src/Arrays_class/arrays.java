package Arrays_class;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) 
	{
		int num[] = {19,28,3,14,59,16,7,85,29,10};
		
		System.out.println(Arrays.toString(num)+"\n");
		Arrays.sort(num);//sort
		System.out.println(Arrays.toString(num)+"\n");
		
		int index = Arrays.binarySearch(num,14);//it only work on sorted array
		System.out.println("The index of element 4 in the array is: "+index+"\n");
		
		int b[] =Arrays.copyOf(num,5);   //copy array 
		System.out.println(Arrays.toString(b)+"\n");
		
		boolean b1 = Arrays.equals(num, b); //check the String equals
		System.out.println("Is a and c both the array are equal: "+b1+"\n");
	
		Arrays.fill(num, 12); //fill
		System.out.println(Arrays.toString(num)+"\n");
		
		int arr[][]= {{10,20,30,40,50},{60,70,80,90},{456,789,234,890}};
		   System.out.println(Arrays.deepToString(arr));
	}

}
