package Lab_11;
import java.util.Scanner;
public class Objective 10 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int sum=sc.nextInt();
		int arr[]= {2, 7, 4, -5, 11, 5, 20};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
				}
			}
		}
	}

}
