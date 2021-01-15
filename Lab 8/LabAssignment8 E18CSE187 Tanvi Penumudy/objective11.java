package LabAssignment8;
import java.util.Scanner;

public class objective11 {
	public static void obj11(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any string of your choice :");
		String str1=scan.nextLine();
		System.out.print("Enter the string you want to replace :");
		String str2=scan.nextLine();
		System.out.println("Before Replacement-\nstr1:"+str1+"\nstr2:"+str2);
		String strReplace=str1.replace(str1,str2);
		System.out.println("After Replacement-\nstr1:"+strReplace+"\nstr2:"+str2);
	}
}