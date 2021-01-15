package Lab_11;

public class Objective 9 {

	public static void main(String[] args) 
	{
		int arr1[]= {1, 2, 5, 5, 8, 9, 7, 10, 15};
		int arr2[]= {1, 0, 6, 15, 6, 4, 7, 0, 9};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println("Common element : "+arr1[i]);
					break;
				}
			}
		}
	}

}
