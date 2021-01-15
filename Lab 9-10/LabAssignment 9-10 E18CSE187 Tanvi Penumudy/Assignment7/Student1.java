package assignment9;

public class Student1 {
	private int studentid;
	private char studenttype;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public char getStudenttype() {
		return studenttype;
	}
	public void setStudenttype(char studenttype) {
		this.studenttype = studenttype;
	}
	Student1(){
		studentid=10;
		studenttype='F';
	}
	public static void main(String[] args) {
		Student1 student;
		student=new Student1();
		System.out.println("studentid:"+student.getStudentid());
		System.out.println("student type:"+student.getStudenttype());
	}
		

}
