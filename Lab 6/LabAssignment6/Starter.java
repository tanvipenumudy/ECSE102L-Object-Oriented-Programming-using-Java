package LabAssignment6;

public class Starter {

	public static void main(String[] args) {
		System.out.println("#Objective 1:");
		EmployeeGrade emgrade = new EmployeeGrade();
		emgrade.calculateAverageFeedback();
		emgrade.calculateGrade();
		emgrade.displayInfo();
		
		System.out.println("\n#Objective 2:");
		EmployeeGrade2 emgrade2 = new EmployeeGrade2(123,"Jack",3.2f,4.0f,4.2f);
		emgrade2.calculateAverageFeedback();
		emgrade2.calculateGrade();
		emgrade2.displayInfo();
	}

}
