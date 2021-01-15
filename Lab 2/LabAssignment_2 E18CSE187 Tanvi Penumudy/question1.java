package package1;
import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = scan.nextInt();
		System.out.println("Enter the second number: ");
		int b = scan.nextInt();
		if(a < b){   
			System.out.println(b+" is greater than "+a);
	    }    
		else  {     
			System.out.println(a+" is greater than "+b); 
		}
		// Without taking Input
		 /*int c=100, d=50;    
		 if(d > c){   
			 System.out.println("d is greater than c");
	     }    
		 else  {
			 System.out.println("c is greater than d"); 
		 }*/
		
		
		
	}

}
