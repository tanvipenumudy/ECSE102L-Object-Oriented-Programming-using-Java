import java.util.Scanner;
public class Assignment13{
	public static void main(String[] args){
		Lab13main lab13=new Lab13main();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user name:");
		String username=sc.nextLine();
		lab13.setusername(username);
		System.out.println("length of the string is:"+lab13.getusername().length());
		System.out.println("hi "+lab13.getusername());
		lab13.display();
	}
}
		