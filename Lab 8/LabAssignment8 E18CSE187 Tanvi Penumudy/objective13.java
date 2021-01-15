package LabAssignment8;

import java.util.Scanner;

public class objective13 {

	public static void obj13() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any string of your choice :");
		String s=scan.nextLine();
		System.out.print("Enter the character you want to replace :");
		String s1=scan.nextLine();
		System.out.print("Enter the character you want it with :");
		String s2=scan.nextLine();
		String strReplace=s.replace(s1,s2);
		System.out.println("The String after replacement: "+strReplace);

	}

}
