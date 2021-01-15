package Lab_11;

public class Objective 6 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 5, 6, 6, 7, 2, 9, 10}; 
		int du[]=new int [arr.length];
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					int t=0;
					for(int k=0;k<du.length;k++)
					{
						if(du[k]==arr[i])
						{
							t=t+1;
							break;
						}
					}
					if(t==0)
					{
						System.out.println("Duplicate element : "+arr[i]);
					}
				}
			}
		}

	}

}
