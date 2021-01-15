package lab12;

import java.util.Arrays;

public class question2 {
	public static int[] sort(int arr[]) {
		
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if (arr[j]>=arr[i]) {
					arr[i] = arr[j];
					break;
				}
		return arr;
	}
	
	public static void main(String args[]) {
		int arr[] = {23, 2, 100, 45, -5, 7, -2, 9} ;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sort(arr)));
		
	}
}
