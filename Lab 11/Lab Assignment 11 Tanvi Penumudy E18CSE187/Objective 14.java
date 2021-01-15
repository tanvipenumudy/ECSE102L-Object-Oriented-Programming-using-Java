package Lab_11;

public class Objective 14 {

	public static void main(String[] args){
		int arr[]= {10, 20, 30, 40, 50, 60};
		for(int i=arr.length-1;i>0;i++)
		{
			int t=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=t;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
