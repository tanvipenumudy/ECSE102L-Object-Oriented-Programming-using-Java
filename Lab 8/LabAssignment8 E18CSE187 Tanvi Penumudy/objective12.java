package LabAssignment8;
import java.util.Scanner;

public class objective12 {

	public static void obj12() {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter any String: ");
		String str=scan.nextLine();
		System.out.println("String Before Trimming :"+str);
		System.out.println("String After Trimming :"+str.trim());
		}

}
