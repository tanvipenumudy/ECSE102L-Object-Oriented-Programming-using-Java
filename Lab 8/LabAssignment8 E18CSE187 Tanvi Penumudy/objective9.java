package LabAssignment8;
import java.util.Scanner;

public class objective9 {

	public static void obj9(){
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter any String: ");
		String a=scan.nextLine();
		String lowerCase=a.toLowerCase();
		String upperCase=a.toUpperCase();
		System.out.println("The String in LowerCase: "+lowerCase);
		System.out.println("The String in UowerCase: "+upperCase);
		}

}
