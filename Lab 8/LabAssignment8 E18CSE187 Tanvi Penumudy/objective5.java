package LabAssignment8;
import java.util.Scanner;

public class objective5 {

	public static void obj5() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the First String: ");
		String a=scan.nextLine();
		System.out.print("Enter the Second String: ");
		String b=scan.nextLine();
		String d=" ";
		String c=a.concat(d.concat(b));
		System.out.println("The Concatenation of both the input Strings is(With Concat):"+c);
		System.out.println("The Concatenation of both the input Strings is(Without Concat):"+a+" "+b);
		}

}
