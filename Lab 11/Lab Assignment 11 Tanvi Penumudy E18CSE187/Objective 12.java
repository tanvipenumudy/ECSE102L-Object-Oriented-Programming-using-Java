package Lab_11;

public class Objective 12 {

	public static void main(String[] args) 
	{
		int arr[]= {10, 20, 30, 40, 59, 660, 170, 80, 90, 100};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int t = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
