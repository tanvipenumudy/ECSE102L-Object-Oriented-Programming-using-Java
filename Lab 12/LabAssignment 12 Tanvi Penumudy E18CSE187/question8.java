package lab11e;

import java.util.Scanner;

public class question8 {
	
	static int sum(int no) {
		return no == 0 ? 0 : no%10 + sum(no/10) ; 
	}
		
	public static void main(String args[]) {
		Scanner sc = new  Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		System.out.println((sum(one) == sum(two)) ? true : false);
	}
	
}
