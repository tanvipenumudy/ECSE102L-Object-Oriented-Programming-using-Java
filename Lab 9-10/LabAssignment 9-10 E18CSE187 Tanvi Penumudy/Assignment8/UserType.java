package assignment9;

public class UserType {
	String name;
	UserType(String newparameter){
		name=newparameter;
	}
	UserType(){
		name="student";
	}
	public static void main(String[] args) {
		UserType user1=new UserType("faculty");
		UserType user2=new UserType();
		System.out.println(user1.name);
		System.out.println(user2.name);
	}


}
