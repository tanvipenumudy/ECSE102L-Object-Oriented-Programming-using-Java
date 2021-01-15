package package1;
import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quiz Score: ");
		int a = scan.nextInt();
		System.out.println("Mid Term Score: ");
		int b = scan.nextInt();
		System.out.println("Final Score: ");
		int c = scan.nextInt();
	    int sum =a+b+c;
	    float avg = sum/3;
		if(avg>=90) {
			System.out.println("Grade A");
		}
		else if(avg<90 && avg>=70) {
			System.out.println("Grade B");
		}
		else if(avg<70 && avg>=50) {
			System.out.println("Grade C");
		}
		else if(avg<50 && avg>=0) {
			System.out.println("Grade F");
		}
				
	}

}
