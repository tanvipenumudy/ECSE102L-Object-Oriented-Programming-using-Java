package LabAssignment5M;
import java.util.*;

public class questionsMainClass {

	public static void main(String[] args) {
		questionsMethods function = new questionsMethods();
		System.out.println("#Question 1:");
		function.question1(10,15);
		System.out.println("#Question 2:");
		function.question2(10,15);
		System.out.println("#Question 3:");
		function.question3(777);
		System.out.println("#Question 4:");
		function.question4(987654);
		System.out.println("#Question 5:");
		function.question5(1000);
		System.out.println("#Question 6 (Fahrenheit to Celcius):");
		function.question6(222);
		System.out.println("#Question 6 (Celcius to Fahrenheit):");
		function.question7(0);
	}

}
