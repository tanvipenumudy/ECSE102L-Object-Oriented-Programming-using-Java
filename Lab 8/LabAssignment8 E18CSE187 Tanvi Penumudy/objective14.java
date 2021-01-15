package LabAssignment8;
import java.util.Scanner;

public class objective14 {

	public static void obj14() {
		Scanner scan = new Scanner(System.in);
		String str = " ";
        System.out.print("Enter any String: ");
        str = scan.nextLine();
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int firstIndex = str.indexOf(character);
            int lastIndex = str.lastIndexOf(character);
            if(firstIndex != lastIndex) {
                System.out.println("The character '"+character+"' is repeated.");
                break; 
            }
        }
	}

}
