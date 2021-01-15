package LabAssignment8;
import java.util.Scanner;

public class objective2 {

	public static void obj2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input any String of your choice: ");
		String a=scan.nextLine();
		System.out.println("The Substrings are: ");
		for (int i = 0; i < a.length(); i++) {
			for (int j = i+1; j <= a.length(); j++) {
				System.out.println(a.substring(i,j));
		   }
		}
	}
}
