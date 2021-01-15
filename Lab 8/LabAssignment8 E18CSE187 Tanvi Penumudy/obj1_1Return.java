package LabAssignment8;
import java.util.Scanner;

public class obj1_1Return {

	public static void main(String[] args) {
		objective1_1 stringMethod = new objective1_1();    
		String var1;    
		int index;    
		stringMethod.setVar("Bennett");        
		Scanner scan=new Scanner(System.in);    
		System.out.print("Enter any String :");    
		var1 = scan.nextLine();    
		System.out.print("Enter the Index for which you need the Character :");    
		index = scan.nextInt();    
		stringMethod.charAtFunc(var1, index); 

	}

}
