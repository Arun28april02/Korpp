package Javaworld;
import java.util.Arrays;

public class Sorting {
	public static void bubblesort(int[] arr) {
	
		int n=arr.length;
		boolean swapped;
		
		for(int i=0; i < n-1; i++) {
		swapped =false;
		
		for(int j=0;j < n-1-i; j++) {
		if (arr[j] > arr [j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			swapped=true;
		   }
	     }
      if (!swapped)break;
       }
	}
 public static void main(String[] args) { 
	 int arr[]= {1,5,9,6,7,3};
	 System.out.println("orginal array  :"+ Arrays.toString(arr));
	 bubblesort(arr);
	 System.out.println("Sorted Array   :"+Arrays.toString(arr));
 }
 }