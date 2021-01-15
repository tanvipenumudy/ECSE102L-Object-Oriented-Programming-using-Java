package lab11e;

public class question9 {
    static void lon(int a[]) { 
    	int n = a.length; 
        int maxIdx = 0, maxLen = 0, currLen = 0, currIdx = 0; 
      
        for (int k = 0; k < n; k++)  
        { 
            if (a[k] > 0) 
            { 
                currLen++; 
                if (currLen == 1)  
                    currIdx = k;          
            } 
            else
            { 
                if (currLen > maxLen)  
                { 
                    maxLen = currLen; 
                    maxIdx = currIdx; 
                } 
                currLen = 0; 
            } 
        } 
      
        if (maxLen > 0)  
        { 
            System.out.print( "Length " + maxLen) ;  
            System.out.print( ",starting index " + maxIdx ); 
        } 
        else
            System.out.println("No positive sequence detected.") ; 
    } 
      
    public static void main (String[] args)  
    { 
        int arr[] = { 1, 2, -3, 2, 3, 4, -6, 1, 2, 3, 4, 5, -8, 5, 6 }; 
        lon(arr); 
      
    } 
}
