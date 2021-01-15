package package1;
import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number of your choice: ");
		int a = scan.nextInt();
		if(a>0) {
		System.out.println(a + " is a Positive number");
		}
		else if(a<0) {
		System.out.println(a + " is a Negative number");
		}
		else {
		System.out.println("The value you've entered is a Zero");
		}
		//Without Taking Input
		/*int n= 35;
		if(n>0) {
			System.out.println("Positive number");
			}
			else if(n<0) {
			System.out.println("Negative number");
			}
			else {
			System.out.println("Zero");
			}*/
		
		
		

	}

}
