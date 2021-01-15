package LabAssignment7;

public class Calculator {
	static float a,b;
	public static void add() {
	float c=a+b;
	System.out.println("Addition: "+c);
}
	public static float sub() {
		System.out.println("Subtraction: ");
		return a-b;
}
	public static void multi(float a,float b) {
		System.out.println("Multiplication: "+a*b);   	
}
	public static float div(float a,float b) {
		System.out.println("Division :");
		return a/b;
	}

}
