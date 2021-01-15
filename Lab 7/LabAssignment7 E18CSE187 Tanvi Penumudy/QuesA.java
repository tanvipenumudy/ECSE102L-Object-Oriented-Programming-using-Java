package LabAssignment7;
import java.util.Scanner;
public class QuesA {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the First Number of your choice: ");
		Calculator.a=scan.nextInt();
		System.out.println("Enter the Second Number of your choice: ");
		Calculator.b=scan.nextInt();
		
		Calculator.add();
		System.out.println(Calculator.sub());
		Calculator.multi(Calculator.a,Calculator.b);
		System.out.println(Calculator.div(Calculator.a,Calculator.b));

	}
}


