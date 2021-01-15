package Lab_11;
import java.util.Scanner;
public class Objective 3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t= sc.nextInt();
		int[] arr = {14, 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		for(int i=0;i<arr.length;i++)
		{
			if(t==arr[i])
			{
				System.out.println(i);
				break;
			}
		}

	}

}
