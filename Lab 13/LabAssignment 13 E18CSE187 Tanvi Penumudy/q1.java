package lab13;

public class q1 {
	public void offdiagonal(int arr[][])
	{	
		for(int k=0;k<arr.length+2;k++)
		{   int count=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++)
				{
					if(i+j==k)
						System.out.print(arr[i][j]+"  ");
				}
			}
			System.out.println();
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,4},{3,7,9},{8,5,6}};
		q1 obj=new q1();
		obj.offdiagonal(arr);
	}

}
