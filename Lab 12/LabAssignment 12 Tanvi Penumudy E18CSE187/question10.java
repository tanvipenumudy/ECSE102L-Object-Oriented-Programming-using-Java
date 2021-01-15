package lab11e;

import java.util.Arrays;

public class question10 {
	public static int[] join(int a1[], int a2[]) {
		int join[] = new int[a1.length+a2.length];
		
		int i=0;
		for(i=0;i<a1.length;i++)
			join[i] = a1[i];
		for(;i<(a1.length+a2.length);i++) {
			join[i] = a2[i-a1.length+1];
			System.out.println(i-a1.length+1);
		}
			
		return join;
		
	}
	
	public static void main(String args[]) {
		int arr[] = {0,1,0,0,1,0,1,0,1,0};
		int arr2[] = {1,1,0,1,0,0,1,0,0,1,0};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(join(arr, arr2)));
		
	}
}
