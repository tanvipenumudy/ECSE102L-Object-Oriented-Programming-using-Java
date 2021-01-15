package lab13;
import java.util.Arrays;
public class q6 {
	public int removeDuplicate(int arr[])
	{	Arrays.sort(arr);
		int count=0,k=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
				count+=1;
		}
		if(arr[arr.length-1]!=arr[arr.length-2])
			count+=1;
		System.out.println(Arrays.toString(arr));
		//System.out.println(count);
		int newarr[]=new int[count];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
				newarr[k++]=arr[i];
		}
		newarr[k]=arr[arr.length-1];
		System.out.println(Arrays.toString(newarr));
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12, 5, 15, 12, 5, 22, 4, 15};
		q6 obj=new q6();
		int k=obj.removeDuplicate(arr);
		System.out.println(k);
	}

}
