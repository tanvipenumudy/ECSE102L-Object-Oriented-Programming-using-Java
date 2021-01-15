package assignment9;

public class Student2 {
	//private static int studentcount=549;
	private static int studentid=549;
	private char studenttype;
	private String studentname;
	Student2(){
		studentid++;
	}
	Student2(char studenttype,String firstname,String lastname){
		this.studenttype=studenttype;
		studentname=firstname+" "+lastname;
	}
	public void printdetails() {
		System.out.println("student id:"+studentid+"\nstudent type:"+studenttype+"\nstudent name:"+studentname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2('D',"bony","thomas");
		Student2 st1=new Student2();
		s1.printdetails();
		Student2 s2=new Student2('H',"dinil","bose");
		Student2 st2=new Student2();
		s2.printdetails();

	}

}
