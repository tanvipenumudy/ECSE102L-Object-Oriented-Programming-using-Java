package LabAssignment8;
import java.util.Scanner;

public class objective8 {

	public static void obj8() {
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Enter any String: ");
	   String inputString=scan.nextLine();
       String[] words = inputString.split(" ");
       String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--) {
                reverseWord+=word.charAt(j);
            }
            reverseString+=reverseWord + " ";
        }
        System.out.println(inputString);
        System.out.println(reverseString);
	}

}
