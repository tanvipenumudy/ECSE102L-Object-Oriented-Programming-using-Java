package Lab_11;
import java.util.Scanner;
public class Objective 15 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int n[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				n[i][j]=sc.nextInt();
			}
				
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				for(int k=0;k<c-1;k++)
				{
					if(n[i][k]>n[i][k+1])
					{
						int t=n[i][k];
						n[i][k]=n[i][k+1];
						n[i][k+1]=t;		
					}
				}
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
