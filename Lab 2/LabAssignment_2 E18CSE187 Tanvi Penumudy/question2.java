package package1;
import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number of your choice: ");
		int n = scan.nextInt();
		if(n%2==0) {
			System.out.println("The number that you've entered is Even");
		}
		else {
			System.out.println("The number that you've entered is Odd");
		}
		// Without Taking Input
		/*int a = 11;
		if(a%2==0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}*/
		
		
    

	}

}
