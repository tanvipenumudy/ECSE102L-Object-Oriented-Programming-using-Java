package lab12;

import java.util.Arrays;

public class question3 {
	public static int diff(int arr[]) {
		
		for(int i=0;i<arr.length;i++)
			for(int j=i;j<arr.length;j++) {
				if (arr[i] < arr[j]) {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
			} 
		return arr[0]-arr[arr.length-1];
	}
	
	public static void main(String args[]) {
		int arr[] = {23, 2, 100, 45, -5, 7, -2, 9} ;
		System.out.println(Arrays.toString(arr));
		System.out.println(diff(arr));
		
	}
}
