package LabAssignment5M;
import java.util.*;

public class questionsMethods {
	public void question1(int a,int b) {
		int temp;
		System.out.println("Before Swapping : a,b = "+a+","+b);
		temp=a;
		a=b;
		b=temp;   
		System.out.println("After Swapping : a,b = "+a+","+b);
	}
	
	public void question2(int a,int b) {
		System.out.println("Before Swapping :a,b="+a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping :a,b="+a+","+b);
	}
	
	public void question3(int m) {
		int n,sum=0;
	    if(0<m && m<1000){
        while(m > 0){
            n=m%10;
            sum=sum+n;
            m=m/10;
        }
        System.out.println("Sum of Digits:"+sum);
        }
	    else{
	    	System.out.println("Enter any number between 0 and 1000!");
	    }
	}
	
	public void question4(int min) {
		double minutesInYear=60*24*365;
		long years = (long) (min/minutesInYear);
        int days = (int) (min/60/ 24) % 365;
        System.out.println((int) min+" minutes is approximately "+years+" year/years and "+days+" days");
	}
	
	public void question5(double inch){
        double metres = inch*0.0254;
        System.out.println(inch +" inch/inches is " +metres+ " metres");
	}
	
	public void question6(double tempF){
        double tempC=(tempF-32)*5/9;
        System.out.println(tempF +" degrees Fahrenheit is " +tempC+ " degrees Celcius");
		
	}
	public void question7(double tempC){
        double tempF=(tempC*9/5)+32;
        System.out.println(tempC +" degrees Celcius is " +tempF+ " degrees Fahrenheit");
	}
}
