package assignment9;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='B';
		switch (grade) {
		case 'A':
			System.out.println("marks:80-100");
			break;
		case 'B':
			System.out.println("marks:73-79");
			break;
		case 'C':
			System.out.println("marks:65-72");
			break;
		case 'D':
			System.out.println("marks:55-64");
			break;
		case 'E':
			System.out.println("marks:<55");
			break;
		default:
			System.out.println("grade does not exist");
			break;
			
		}

	}

}
