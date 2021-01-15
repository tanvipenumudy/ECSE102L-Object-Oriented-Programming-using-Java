package package1;
import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		double a = scan.nextInt();
		System.out.println("Enter the value of b :");
		double b = scan.nextInt();
		System.out.println("Enter the value of c :");
		double c = scan.nextInt();
		System.out.println("The Resultant Quadratic Equation is:"+a+"x^2 + "+b+"x + "+c);
        double d = b*b-4*a*c;
        double r1, r2;
        if(d>0) {
            System.out.println("Roots are Real and Unequal");
            r1 = ( - b + Math.sqrt(d))/(2*a);
            r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("First root is:"+r1);
            System.out.println("Second root is:"+r2);
        }
        else if(d==0) {
            System.out.println("Roots are Real and Equal");
            r1 = (-b+ Math.sqrt(d))/(2*a);
            System.out.println("Root:"+r1);
        }
        else {
            System.out.println("Roots are Imaginary");
        }
		

	}

}
