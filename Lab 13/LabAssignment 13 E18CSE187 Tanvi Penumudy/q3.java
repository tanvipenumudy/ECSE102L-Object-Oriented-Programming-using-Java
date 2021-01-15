package lab13;
import java.util.Arrays;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,2,100,45,-5,7,-2,9};
		Arrays.sort(arr);
		int diff;
		diff=arr[arr.length-1]-arr[0];
		System.out.println("the difference is :"+diff);
	}

}
