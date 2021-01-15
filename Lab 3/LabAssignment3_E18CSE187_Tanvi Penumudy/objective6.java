package labAssignment3;
import java.util.Scanner;

public class objective6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number of your choice: ");
		int n=scan.nextInt();
		System.out.print("The Prime Factors of "+n+" are:" );
		         int i=2;
		         while(i<=n){
		 
		            while (n%i==0) {
		                System.out.print(i+",");
		                n=n/i;
		            }
		            i++;
		        }
		        if (n<1) {
		        	System.out.println(n);
		    }
	}

}
