package Javaworld;

public class Array{

	public static void main(String[] args) {
	
		
		int[] arr= {5,10,20,30,9,10,50};
		int max=arr[2];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}	
			}	
		System.out.println("max value of array "+max);
		}
   }