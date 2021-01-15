package LabAssignment5;
import java.util.Scanner;

public class objective1methods  { 
	private int num1 = 10; 
	private int num2 = 20; 
		public int add() { 
			return num1 + num2;  
			}
		public int sub() {  
			return num1 - num2; 
			}
        public int multi() {  
			return num1 * num2; 
			} 
		public int div() { 
			return num1 / num2;  
			} 
		 
		public static void main(String[] args) {
			int choice;  
			do {  
			System.out.println("Help On:"); 
			System.out.println("1. Addition"); 
			System.out.println("2. Subtraction"); 
			System.out.println("3. Multiplication");
		    System.out.println("4. Division"); 
		    System.out.println("Choose One:");
		    Scanner scan =new Scanner(System.in); 
		    choice=scan.nextInt(); 
		    }
		while (choice<1 || choice>4);
		 
		objective1methods operation = new objective1methods(); 
		 int value;  
		 switch(choice) { 
		 case 1:  
	     value = operation.add(); 
		 System.out.println("Addition of Numbers: "+value); 
		 break; 
		 case 2:  
	     value = operation.sub(); 
		 System.out.println("Multiplication of Numbers: "+value); 
		 break; 
		 case 3:  
	     value = operation.multi(); 
		 System.out.println("Subtraction of Numbers: "+value); 
		 break; 
		 case 4:  
		 value = operation.div();  
		 System.out.println("Division of Numbers: "+value); 
		 break; 
		 }

	}
}

