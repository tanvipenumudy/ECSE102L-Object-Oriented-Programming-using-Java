package lab11e;

import java.util.Arrays;

public class question14 {
	static int[] lon(int a[]) { 
		for(int i=0;i<a.length;i++)
			if(a[i] <0)
				a[i] =0;
		return a;
    } 
      
    public static void main (String[] args)  { 
        int arr[] = { 1, 2, -3, 2, 3, 4, -6, 1, 2, 3, 4, 5, -8, 5, 6 }; 
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(lon(arr)));

    } 
}
