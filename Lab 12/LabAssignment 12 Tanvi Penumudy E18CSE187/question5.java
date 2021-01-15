package lab12;

import java.util.Arrays;

public class question5 {
	public static void check(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int act = arr[i];
			int f=0;
			for(int j=i+1;j<arr.length;j++)
				if(arr[j]>act) {
					f=1;
					break;
				}
			if(f==0)
				System.out.println(act);
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {20, 19, 34, 53, 25, 0, 11} ;
		System.out.println(Arrays.toString(arr));
		check(arr);
		
	}
}
