package lab13;
import java.util.Arrays;
import java.util.Random;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		int even=0,odd=0;
		Random gen=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=gen.nextInt(100);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				even+=1;
			else
				odd+=1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("even elements :"+even);
		System.out.println("odd elements  :"+odd);
	}

}
