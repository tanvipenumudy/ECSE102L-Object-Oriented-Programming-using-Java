package lab18;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first number");
		int x=input.nextInt();
		System.out.println("enter the second number");
		int y=input.nextInt();
		dividenos d=new dividenos();
		try
		{
		d.div(x,y);
		}catch(ArithmeticException e) {System.out.println("error handled");}
	}

}
class dividenos 
{
	private int a;
	private int b;
	
	dividenos()
	{
		a=0;
		b=0;	
	}
	public void div(int a,int b) throws ArithmeticException
	{
		System.out.println(a/b);
	}
}