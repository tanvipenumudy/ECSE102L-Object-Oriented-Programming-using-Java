package labAssignment3;
import java.util.Scanner;

public class objective3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number of your choice: ");
		int num = scan.nextInt();
		int t1 = 0,t2 = 1, t3;
        int i = 1; 
        while(i <= num) {
            System.out.println(t1);
            t3= t1+t2;
            t1=t2;
            t2=t3;
            ++i;
        }

	}

}
