package Lab_11;

public class Objective 11 {

	public static void main(String[] args) 
	{
		int arr[]= {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		int n[]=new int [arr.length];
		int c =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				n[c]=arr[i];
				c++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				n[c]=arr[i];
				c++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(n[i]+" ");
		}
	}

}
