package labAssignment3;
import java.util.Scanner;

public class objective2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number of your choice: ");
		int num = scan.nextInt();
		int sum=0,dig,temp;  
		    temp=num;  
		    while(num>0) {
		    dig=num%10;  
		    num=num/10;  
		    sum+=(dig*dig*dig);  
		    }  
		    if(temp==sum)  
		    System.out.println("Input is Armstrong Number");   
		    else  
		        System.out.println("Input is not Armstrong Number");

	}

}
