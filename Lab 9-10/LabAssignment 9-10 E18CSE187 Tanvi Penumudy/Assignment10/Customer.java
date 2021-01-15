package assignment9;

public class Customer {
	private int customerId;
	private String customerName;
	Customer(int customerId,String customerName){
		this.customerId=customerId;
		this.customerName=customerName;
	}
	public void displaycustomer() {
		System.out.println("customerid:"+customerId+"\n"+"customer name:"+customerName);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer(1001,"john");
		c1.displaycustomer();

	}

}
