package LabAssignment8;
import java.util.Scanner;

public class objective10 {

	public static void obj10() {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter any String: ");
		String str=scan.nextLine();
		System.out.print("Enter start Index: ");
		int a =scan.nextInt();
		System.out.print("Enter end Index: ");
		int b=scan.nextInt();
        String newStr = str.substring(a,b);
        System.out.println("Required string from index "+a+" to "+b+" is: " + newStr);

	}

}
