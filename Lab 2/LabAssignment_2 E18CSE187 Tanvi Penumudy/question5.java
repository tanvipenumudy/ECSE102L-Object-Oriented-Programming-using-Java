package package1;
import java.util.Scanner;


public class question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number of your choice: ");
        double a = scan.nextDouble();
        if (a>0) {
            if (a<1) {
                System.out.println("Positive Small");
            }
            else if (a>1000000) {
                System.out.println("Positive Large");
            }
            else {
                System.out.println("Positive");
            }
        }
        else if (a<0) {
            if (Math.abs(a)<1) {
                System.out.println("Negative Small");
            }
            else if (Math.abs(a)>1000000) {
                System.out.println("Negative Large");
            }
            else {
                System.out.println("Negative");
            }
        }
        else {
            System.out.println("Zero");
        }
    }
}



	


