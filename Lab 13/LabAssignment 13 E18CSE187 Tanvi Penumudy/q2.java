package lab13;

import java.util.Arrays;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,2,100,45,-5,7,-2,9};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
					arr[i]=arr[j];
			}
		}
		System.out.println("output array :"+Arrays.toString(arr));
	}

}
