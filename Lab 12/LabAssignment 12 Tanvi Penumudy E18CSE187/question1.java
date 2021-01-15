package lab12;

public class question1 {
	static int min(int a, int b) { 
	    return (a < b) ? a : b; 
	    } 
	static int min(int a, int b, int c) { 
	    return min(min(a, b), c); 
	    } 
	static int max(int a, int b) {  
	    return (a > b) ? a : b; 
	    } 
	static void diagonalOrder(int matrix[][]) {
		final int ROW = matrix.length; 
		final int COL = matrix[0].length; 
	    for (int line = 1; line <= (ROW + COL - 1); line++) { 
		    int start_col = max(0, line - ROW); 
		    int count = min(line, (COL - start_col), ROW); 
		    for (int j = 0; j < count; j++) 
		        System.out.print(matrix[min(ROW, line) - j - 1] [start_col + j] + " "); 
		    System.out.println(); 
	    } 
	} 
	  
	public static void main(String[] args) { 
	    int M[][] = {{1, 2, 4},{3, 7,9},{8, 5, 6}}; 
	    diagonalOrder(M); 
	} 
}
