package labAssignment3;
import java.util.Scanner;

public class objective1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number of your choice: ");
		int num = scan.nextInt();
		int x=0,rem;
		
		while(num>0) {
		 rem=num%10;
		 num=num/10;
		 x+=1;
		 }
		 System.out.println("The Number of Digits is equal to: "+x);

	}

}
