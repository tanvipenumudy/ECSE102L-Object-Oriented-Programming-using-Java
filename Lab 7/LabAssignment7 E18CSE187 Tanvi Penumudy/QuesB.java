package LabAssignment7;

public class QuesB {
	static double p1, p2, p3, price, sp1, sp2, sp3;

	static {
		p1=25;
		p2=35;
		p3=40;
		sp1=p1;
		sp2=p2;
		sp3=p3;
		price=p1+p2+p3;
	}

	public void costPrice() {
		p1=p1+((8.0/100)*p1);
		p2=p2+((8.0/100)*p2);
		p3=p3+((8.0/100)*p3);
	}
	
	public void sellingPrice() {
		sp1 = p1 +((12.0/100)*p1);
		sp2 = p2 +((12.0/100)*p2);
		sp3 = p3 +((12.0/100)*p3);	
	}

	public static void main(String[] args) {
		QuesB pen = new QuesB();
		
		for(int i = 1991; i <= 1999; i++){
			System.out.println("\nFor the Year: " + i);
			System.out.println("Cost Price of Pen 1: "+p1);
			System.out.println("Cost Price of Pen 2: "+p2);
			System.out.println("Cost Price of Pen 3: "+p3);
			pen.sellingPrice();
			
			System.out.println("\nSelling Price of Pen 1: "+sp1);
			System.out.println("Selling Price of Pen 2: "+sp2);
			System.out.println("Selling Price of Pen 3: "+sp3);
			System.out.println("Cost of Three Pens is: "+(p1+p2+p3));
			pen.costPrice();

		}
	}

}
