package LabAssignment8;
import java.util.Scanner;

public class objective3 {

	public static void obj3() {
		        Scanner scan=new Scanner(System.in);
				System.out.print("Enter any Sentence here: ");
				String sen=scan.nextLine();
				String upperCaseLine=""; 
				Scanner lineScan=new Scanner(sen); 
				while(lineScan.hasNext()) {
					String word=lineScan.next(); 
					upperCaseLine+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" "; 
				}
				System.out.println("Sentence Before :"+sen); 
				System.out.println("Sentence After Capitalisation :"+upperCaseLine.trim()); 
			}
		

	}


