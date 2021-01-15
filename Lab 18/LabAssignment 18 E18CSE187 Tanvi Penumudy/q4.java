package lab18;

import java.util.Scanner;

public class q4 {
	public void except()
	{	try
		{
		throw new InputMismatchException("error handled"); // self created exception
		//throw new ArrayIndexOutOfBoundsException();
		}catch(Exception e) {System.out.println(e);}
	}
	
	public static void main(String args[]){
		q4 q=new q4();
		q.except();
		int arr[]=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("enter the values into the array");
		try {
		for(int i=0;i<6;i++)
		{
			arr[i]=input.nextInt();
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {System.out.println("Index is out of bound");}
		catch(Exception e) {System.out.println("Wrong input given");}
		finally {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		}
	}

}
class InputMismatchException extends Exception   
{
	InputMismatchException(String msg)
	{
		super(msg);
	}
}