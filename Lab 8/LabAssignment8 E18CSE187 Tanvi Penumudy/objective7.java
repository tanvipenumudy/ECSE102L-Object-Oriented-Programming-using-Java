package LabAssignment8;

import java.util.Scanner;

public class objective7 {

	public static void obj7() {
		String str,rev = "";
	      Scanner scan =new Scanner(System.in);
	      System.out.print("Enter a string:");
	      str=scan.nextLine();
	      int len=str.length();
	      for (int i=len-1;i>=0;i--) {
	         rev=rev+str.charAt(i);
	      }
	      if (str.equals(rev)) {
	         System.out.println(str+" is a Palindrome");
	      }
	      else {
	         System.out.println(str+" is not a Palindrome");
	      }
		

	}

}
