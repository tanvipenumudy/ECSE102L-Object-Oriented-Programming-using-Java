package lab18;
import java.util.Scanner;
public class q2 {
	public static void main(String args[]) {
		int A[][]=new int[4][4];
		int B[][]=new int[4][4];
		int C[][]=new int[4][4];
		Scanner input=new Scanner(System.in);
		System.out.println("enter the values of image A");
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				A[i][j]=input.nextInt();
			}
		}
		System.out.println("enter the values of image B");
		for(int i=0;i<B.length;i++)
		{
			for(int j=0;j<B.length;j++)
			{
				B[i][j]=input.nextInt();
			}
		}
		try
		{
		
		for(int i=0;i<C.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				C[i][j]=(A[i][j]-B[i][j])/(A[i][j]+B[i][j]);
			}
		}
		for(int i=0;i<C.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
		}catch(ArithmeticException e) {System.out.println("arithmetic exception divide by zero");}
		 catch(Exception e) {System.out.println("general exception");}
		}
	}    

