package LabAssignment6;

public class EmployeeGrade2 {
	private int employeeNo;
	private String employeeName;
	private float customer1Feedback;
	private float customer2Feedback;
	private float customer3Feedback;
	private float averageFeedback;
	private char grade; 
	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeNme) {
		this.employeeName = employeeName;
	}

	public float getCustomer1Feedback() {
		return customer1Feedback;
	}

	public void setCustomer1Feedback(float customer1Feedback) {
		this.customer1Feedback = customer1Feedback;
	}

	public float getCustomer2Feedback() {
		return customer2Feedback;
	}

	public void setCustomer2Feedback(float customer2Feedback) {
		this.customer2Feedback = customer2Feedback;
	}

	public float getCustomer3Feedback() {
		return customer3Feedback;
	}

	public void setCustomer3Feedback(float customer3Feedback) {
		this.customer3Feedback = customer3Feedback;
	}

	public float getAverageFeedback() {
		return averageFeedback;
	}

	public void setAverageFeedback(float averageFeedback) {
		this.averageFeedback = averageFeedback;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public EmployeeGrade2(){
		employeeNo=101;
		employeeName="Ram";
		customer1Feedback=4.1f;
		customer2Feedback=4.0f;
		customer3Feedback=4.3f;	
	}
	public EmployeeGrade2(int employeeNo,String employeeName,float customer1Feedback,float customer2Feedback,float customer3Feedback ){
		this.employeeNo= employeeNo;
		this.employeeName= employeeName;
		this.customer1Feedback= customer1Feedback;
		this.customer2Feedback= customer2Feedback;
		this.customer3Feedback= customer3Feedback;
	}
	
	
	public void calculateAverageFeedback() {
		
		averageFeedback = (getCustomer1Feedback()+getCustomer2Feedback()+getCustomer3Feedback())/3;
	}
	public void calculateGrade() {
		
		if (averageFeedback>=4.5 && averageFeedback<=5.0) {
			grade='A';
		}
		else if(averageFeedback>=4.0 && averageFeedback<4.5){
			grade='B';
		}
		else {
			grade='C';
		}
		
	}
	public void displayInfo() {
		System.out.println("The Average Employee Feedback is: "+getAverageFeedback());
		System.out.println("The Resultant Grade is:"+getGrade());
		
	}


}
