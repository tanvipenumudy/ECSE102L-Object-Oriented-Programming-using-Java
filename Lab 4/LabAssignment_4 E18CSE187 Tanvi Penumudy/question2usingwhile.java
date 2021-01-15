package blah;

public class mycla3 {

	public static void main(String[] args) {
		//Question:2 Using While Loop
		
		int i=1,j=1;
		//To Print the Decreasing Star Sequence
		while(i<=5) {
			while(j<=5) {
				System.out.print("*");
				j++;
				}
			System.out.println();
			i++;
			j=i;
		}
		int k=1,l=1;
		//To Print the Increasing Star Sequence
		while(k<=5) {
            while(l<=k) {
                System.out.print("*");
                l++;
            }
            System.out.println();
            k++;
            l=1;
        }
	}

}
