package labAssignment3;

public class objective9 {

	public static void main(String[] args) {
		int num=1000;
		System.out.println("The Prime Numbers from 1 to 1000 are: ");
		for(int i=2; i<=num; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count+=1;
				}
			}
			if(count<=2) {
				System.out.println(i);
			}
			else {
				continue;
			}
			
		}

	}

}
