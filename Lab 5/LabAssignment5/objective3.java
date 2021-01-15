package LabAssignment5;

import java.util.Scanner;

public class objective3 {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	private String address;
	private long salary;
	private char gender;
	private String date;
	private String dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public String getFirstName() {
		return firstName;
	}
    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
    public String getLastName() {
		return lastName;
	}
    public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    public String getEmail() {
		return email;
	}
    public void setEmail(String email) {
		this.email = email;
	}
    public long getPhoneNumber() {
		return phoneNumber;
	}
    public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    public String getAddress() {
		return address;
	}
    public void setAddress(String address) {
		this.address = address;
	}
    public long getSalary() {
		return salary;
	}
    public void setSalary(long salary) {
		this.salary = salary;
	}
    public char getGender() {
		return gender;
	}
    public void setGender(char gender) {
		this.gender = gender;
	}
    public String getDate() {
		return date;
	}
    public void setDate(String date) {
		this.date = date;
	}
    public String getDob() {
		return dob;
	}
    public void setDob(String dob) {
		this.dob = dob;
	}
    
    public static void main(String[] args) {
		/* Employee ID, First name, Last name, email-id,phone number, address, salary, gender, joining date and date of birth*/
		Scanner scan = new Scanner(System.in);
		objective3 obj= new objective3();
		System.out.println("Please Enter your Personal Details:");
		System.out.println("Employee ID: ");
		obj.setId(scan.nextInt());
		System.out.println("First Name: ");
		obj.setFirstName(scan.next());
		System.out.println("Last Name: ");
		obj.setLastName(scan.next());
	    System.out.println("Email ID: ");
		obj.setEmail(scan.next());
		System.out.println("Phone Number: ");
		obj.setPhoneNumber(scan.nextLong());
		System.out.println("Address: ");
		obj.setAddress(scan.next());
		System.out.println("Salary: ");
		obj.setSalary(scan.nextLong());
		System.out.println("Gender: ");
		obj.setGender(scan.next().charAt(0));
		System.out.println("Joining Date: ");
		obj.setDate(scan.next());
		System.out.println("DOB: ");
		obj.setDob(scan.next());
		
        System.out.println("Employee ID: "+obj.getId()); 
        System.out.println("First Name: "+obj.getFirstName()); 
        System.out.println("Last Name: "+obj.getLastName()); 
        System.out.println("Email ID: "+obj.getEmail()); 
        System.out.println("Phone Number: "+obj.getPhoneNumber());
        System.out.println("Address: "+obj.getAddress());
        System.out.println("Salary: "+obj.getSalary());
        System.out.println("Gender: "+obj.getGender());
        System.out.println("Joining Date: "+obj.getDate());
        System.out.println("DOB: "+obj.getDob());

	}

}
