package lab11e;

import java.util.Arrays;

public class question12 {
	static void print(int arr[][]) { 
		int r = arr.length;
		for(int i=0;i<r;i++)
			System.out.println(arr[i][i]);
    } 
      
    public static void main (String[] args)  { 
    	
        int arr[][] = {{1, 2, 3}, 
                {4, 5, 6}, 
                {7, 8, 9}}; 
        
        print(arr);
       
    }
}
