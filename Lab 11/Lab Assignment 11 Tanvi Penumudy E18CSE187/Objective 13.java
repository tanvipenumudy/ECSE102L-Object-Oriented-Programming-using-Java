package Lab_11;

public class Objective 13 {

	public static void main(String[] args)
	{
		int arr[]= {1, 5, -4, 7, 8, -6};
		int min =arr[0]+arr[1];
		int a=0;
		int b=0;
		if(min<0)
		{
			min=min*-1;
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				int sum =arr[i]+arr[j];
				if(sum<0)
				{
					sum=sum*-1;
				}
				if(sum<min)
				{
					min=sum;
					a=arr[i];
					b=arr[j];
				}
			}
		}
		System.out.println(a+" "+b);

	}

}
