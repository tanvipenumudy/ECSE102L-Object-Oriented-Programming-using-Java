package Lab_11;

public class Objective 7 {

	public static void main(String[] args) 
	{
		int arr[] = {89, 235, 199, 1456, 213, 1458, 258, 1254, 1472, 2365, 1456, 2165, 157, 256};
		int rev[]=new int[arr.length];
		int t=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			rev[t]=arr[i];
			t--;
		}
		for(int i=0;i<rev.length;i++)
		{
			System.out.print(rev[i]+" ");
		}
	}

}
