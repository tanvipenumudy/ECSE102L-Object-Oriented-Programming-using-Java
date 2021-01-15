package lab13;

import java.util.Arrays;

public class q7 {
	public void major(int arr[])
	{	Arrays.sort(arr);
		int count=0;
		for(int i=0;i<arr.length;i++)
		{	count=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count+=1;
			}
			if(count>arr.length/2)
				System.out.println("the major element is "+arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5,5,5,5,5,5,5,55,5,6,7,8,9,5,5};
		q7 obj=new q7();
		obj.major(arr);
	}

}
