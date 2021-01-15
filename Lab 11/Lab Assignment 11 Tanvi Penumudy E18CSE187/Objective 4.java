package Lab_11;

public class Objective 4 {

	public static void main(String[] args) {
		int arr[]= {21, 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		for(int i=arr.length-1; i>3;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[3]=5;
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}

}
