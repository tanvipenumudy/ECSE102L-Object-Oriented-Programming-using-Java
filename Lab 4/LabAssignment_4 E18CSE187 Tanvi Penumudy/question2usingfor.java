package blah;

public class mycla2 {

	public static void main(String[] args) {
		//Question:2 Using For Loop
		
		int i,j; 
		//To Print the Decreasing Star Sequence
		for(i=0;i<5;i++) {
			for(j=i;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//To Print the Increasing Star Sequence
		for(i=0;i<5;i++){
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
				}
		

	}

}
