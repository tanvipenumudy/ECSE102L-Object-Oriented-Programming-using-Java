package LabAssignment5;

import java.util.Scanner;

public class objective2methodsMainFunction {

	public static void main(String args[]) {
		objective2methods function = new objective2methods();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 1 for Fibonacci Term\n2 for Prime Numbers\n3 for Factorial Number\n4 for Armstrong number");
		int choice=obj.nextInt();
		switch(choice) {
		case 1:
			System.out.println("The Value at the 15th position in Fibonacci Series is: "+function.fib());
			break;
		case 2:
			System.out.println("The number of Prime Numbers between 0 and 1000 are: "+function.prime(0, 1000));
			break;
		case 3:
			System.out.println("Enter a Number: ");
			int x=obj.nextInt();
			function.fact(x);
			break;
		case 4:
			System.out.println("The number of Armstrong Numbers printed above are: "+function.arm());
			 
			default:
				break;
				
		}
	}
}