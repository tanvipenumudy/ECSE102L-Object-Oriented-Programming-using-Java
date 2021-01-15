package assignment9;

public class ElectricityBill {
	private int customerId;
	private String customerName;
	private float previousReading;
	private float currentReading;
	


	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public float getPreviousReading() {
		return previousReading;
	}



	public void setPreviousReading(float previousReading) {
		this.previousReading = previousReading;
	}



	public float getCurrentReading() {
		return currentReading;
	}



	public void setCurrentReading(float currentReading) {
		this.currentReading = currentReading;
	}
	public void printdetails() {
		System.out.println("customerid:"+ customerId);
		System.out.println("customername:"+ customerName);
		System.out.println("no.of units:"+ (currentReading-previousReading));
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill bill1=new ElectricityBill();
		bill1.setCustomerId(101);
		bill1.setCustomerName("ravi");
		bill1.setPreviousReading(128.5f);
		bill1.setCurrentReading(285.96f);
		bill1.printdetails();

	}

}
