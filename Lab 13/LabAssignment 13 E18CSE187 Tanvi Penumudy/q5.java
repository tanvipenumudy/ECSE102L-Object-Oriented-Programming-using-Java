package lab13;

public class q5 {
	
		public void leader(int arr[])
		{	int flag=0;
			for(int i=0;i<arr.length;i++)
			{	flag=0;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]<arr[j])
						flag=1;
				}
				if(flag==0)
					System.out.print(arr[i]+"  ");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q5 obj=new q5();
		int arr[]={20, 19, 34, 53, 25, 0, 11};
		obj.leader(arr);
	}

}
