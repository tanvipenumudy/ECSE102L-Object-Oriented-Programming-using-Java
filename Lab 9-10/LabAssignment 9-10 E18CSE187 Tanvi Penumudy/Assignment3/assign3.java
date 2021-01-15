package assignment9;

public class assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool1 = false;
		boolean bool2 = true;
		boolean bool3 = true;
		if(bool2 || (bool1 && (bool2=false))){
		System.out.println("Success");
		}
		else{
		System.out.println("Failure");
		}
		System.out.println("bool2 value : " + bool2);
		System.out.println("press any key to continue...");


	}

}
