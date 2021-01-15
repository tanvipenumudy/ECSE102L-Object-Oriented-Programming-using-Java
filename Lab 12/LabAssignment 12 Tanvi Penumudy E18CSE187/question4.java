package lab12;

import java.util.Arrays;

public class question4 {
	public static void oe(int arr[]) {
		int o=0,e=0,name=0;
		for(int i=0;i<arr.length;i++)
			name = ((arr[i]%2 == 0) ? e++ : o++);
		System.out.println("Odd : " + o);
		System.out.println("Even : " + e);
	}
	
	public static void main(String args[]) {
		int arr[] = {23, 2, 100, 45, -5, 7, -2, 9} ;
		System.out.println(Arrays.toString(arr));
		oe(arr);
	}
}
