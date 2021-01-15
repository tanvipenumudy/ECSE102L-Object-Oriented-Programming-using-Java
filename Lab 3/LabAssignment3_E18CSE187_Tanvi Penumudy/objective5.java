package labAssignment3;
import java.util.Scanner;

public class objective5 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number of your choice: ");
		int n =scan.nextInt();
		int s=0;
	    int temp;
	    int i,p,r;
	    temp=n;//Do-While Loop*
	    while(n!= 0)
	     {
	        i=1;
	        p=1;
	        r=n%10;
	        while(i<=r) {
	           p*=i;
	           i++;
	        }
	        s+=p;
	        n/=10;
	     }
	     if(s==temp) {
	        System.out.print("Input is a Strong Number");
	     }
	     else {
	        System.out.print("Input isn't a Strong Number");
	     }
	  }
}


