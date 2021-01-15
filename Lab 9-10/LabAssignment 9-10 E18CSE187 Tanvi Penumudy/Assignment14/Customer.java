package Assignment5;

public class Customer {
	
		private String customername;
		private String customeremail;
		private String customertelno;
		private int customerid;
		private static int no_ofcustomers;
		static {
			no_ofcustomers=50;
			
		}
		Customer(String customername,String customeremail,String customertelno,int customerid){
			this.customername=customername;
			this.customerid=customerid;
			this.customeremail=customeremail;
			this.customertelno=customertelno;
			no_ofcustomers++;
		}

		public String getCustomername() {
			return customername;
		}


		public void setCustomername(String customername) {
			this.customername = customername;
		}


		public String getCustomeremail() {
			return customeremail;
		}


		public void setCustomeremail(String customeremail) {
			this.customeremail = customeremail;
		}


		public String getCustomertelno() {
			return customertelno;
		}


		public void setCustomertelno(String customertelno) {
			this.customertelno = customertelno;
		}


		public int getCustomerid() {
			return customerid;
		}


		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}


		public static int getNo_ofcustomers() {
			return no_ofcustomers;
		}


		public static void setNo_ofcustomers(int no_ofcustomers) {
			Customer.no_ofcustomers = no_ofcustomers;
		}
		public void displayCustomer()
		{
		System.out.println("Customer Id :" + customerid);
		System.out.println("Customer Name :" + customername);
		System.out.println("Customer TelNo : " + customertelno);
		System.out.println("Customer Email Id : " + customeremail);
		System.out.println("no.of customers:"+no_ofcustomers);
		}
		
		public static void customercount() {
			System.out.println("customer count:"+ no_ofcustomers);
		}



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Customer customer1=new Customer("ravi","ravi121@gmail;.com","9874575841",101);
			customer1.displayCustomer();
			//customercount();
			Customer customer2=new Customer("surya","surya478@gmail.com","1478529630",102);
			customer2.displayCustomer();
			//customercount();

		}

	}



