package lab12;

import java.util.Arrays;

public class question7 {
	public static int check(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int act = arr[i];
			int f=0;
			for(int j=0;j<arr.length;j++)
				if(arr[j] == act)
					f+=1;
			if (f>=(arr.length/2))
				return act;
		}
		return 0;
	}
	
	public static void main(String args[]) {
		int arr[] = {20, 19, 34, 34, 34, 34, 11} ;
		System.out.println(Arrays.toString(arr));
		System.out.println(check(arr));
		
	}
}
