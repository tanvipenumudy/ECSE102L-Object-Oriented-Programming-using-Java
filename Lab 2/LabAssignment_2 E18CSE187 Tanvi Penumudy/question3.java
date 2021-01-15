package package1;
import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = scan.nextInt();
		System.out.println("Enter the second number: ");
		int b = scan.nextInt();
		System.out.println("Enter the third number: ");
		int c = scan.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is the largest.");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is the largest.");
		}
		else {
			System.out.println(c+" is the largest.");
		}
		// Without taking Input
		/*int e=5, f=2, g=8;
		if(e>f && e>g) {
			System.out.println(e+" is the largest.");
		}
		else if(f>e && f>g) {
			System.out.println(f+" is the largest.");
		}
		else {
			System.out.println(g+" is the largest.");
		}*/
		
		

	}

}
