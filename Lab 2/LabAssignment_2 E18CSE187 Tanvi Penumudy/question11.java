package package1;
/*import java.util.Scanner;*/


public class question11 {

	public static void main(String arg[]){
		/*Scanner scan_a= new Scanner(System.in);
		System.out.println("Enter you Year: ");
		int year= scan_a.nextInt();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your Branch: ");
		String branch = scan.nextLine();*/
		
		char branch='E'; // C - CSE, E - ECE, M - ME
        int year=2;
        
        switch(year)
        {
            case 1:
                System.out.println("English, Maths, Drawing");
                break;
            case 2:
                switch(branch)
                {
                    case 'C':
                        System.out.println("Data structures, Java, Computer Organization");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch(branch)
                {
                    case 'C':
                        System.out.println("Operating System, RDBMS");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
        }
    
    }
}