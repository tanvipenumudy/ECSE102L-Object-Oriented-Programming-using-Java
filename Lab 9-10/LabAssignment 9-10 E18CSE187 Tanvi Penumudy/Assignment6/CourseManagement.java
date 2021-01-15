package assignment9;

public class CourseManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stid=101;
		char sttype='F';
		Student student=new Student();
		student.setstudentid(stid);
		student.setstudenttype(sttype);
		System.out.println("student details:");
		System.out.println("student id:"+student.getstudentid());
		System.out.println("student type:"+student.getstudenttype());

	}

}
