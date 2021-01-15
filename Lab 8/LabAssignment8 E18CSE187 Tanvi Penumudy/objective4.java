package LabAssignment8;
import java.util.Scanner;

public class objective4 {

	public static void obj4() {
			String S;
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter any String of your choice :");
			String s=scan.nextLine();
			System.out.print("Enter the character whose last index you require :");
			String s1=scan.nextLine();
			int index = 0;
			index = s.lastIndexOf(s1);         
            System.out.println("The Last Index is :" +index);
		}
	
}
