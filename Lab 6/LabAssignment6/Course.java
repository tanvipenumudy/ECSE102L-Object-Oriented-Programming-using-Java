package LabAssignment6;

public class Course {
	private static int studentCount;
	private int courseId;
	private int studentId;
	
	static{
		studentCount=100;
		System.out.println(studentCount);
		//System.out.println(courseId);
	}
		Course() {
		studentCount++;
		studentId = studentCount;
		}
		
			public static int getStudentCount(){
				return studentCount;
			}
			
			public int getCourseId () {
				return courseId;
			}
			
			public static void setCourseId (int courseId){
				
			}
			
			public int getStudentId () {
				return studentId;


			}
	}

