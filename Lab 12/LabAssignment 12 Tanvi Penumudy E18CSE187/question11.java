package lab11e;

import java.util.Arrays;

public class question11 {
	static int[] removeDuplicates(int arr[]) { 
		int n = arr.length;
        
        int j = 0; 
        for (int i = 0; i < n-1; i++) 
            if (arr[i] != arr[i+1]) 
                arr[j++] = arr[i]; 
       
        arr[j++] = arr[n-1]; 
       return arr; 
    } 
      
    public static void main (String[] args)  { 
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(removeDuplicates(arr)));
  
       
    }
}
