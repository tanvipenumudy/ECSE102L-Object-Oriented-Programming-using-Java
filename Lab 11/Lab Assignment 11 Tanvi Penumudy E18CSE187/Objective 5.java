package Lab_11;

public class Objective 5 {

	public static void main(String[] args) 
	{
		int arr[]= {21, 25, 14, 56, 15, 36, 56, 77, 18, 29, 49,100};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
