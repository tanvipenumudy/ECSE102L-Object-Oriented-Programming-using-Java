package package1;

import java.util.Scanner;

public class question9 {

	public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of the day (Between range 1-7): ");
        int day = scan.nextInt();
        System.out.println(getDayName(day));
    }

    //To get the name of the Week day
    public static String getDayName(int day) {
        String dayName = "";
        switch(day){
            case 1: 
            	dayName = "Monday"; 
            	break;
            
            case 2: 
            	dayName = "Tuesday"; 
            	break;
            
            case 3: 
            	dayName = "Wednesday"; 
            	break;
            
            case 4: 
            	dayName = "Thursday"; 
            	break;
            
            case 5: 
            	dayName = "Friday"; 
            	break;
            
            case 6: 
            	dayName = "Saturday"; 
            	break;
            
            case 7: 
            	dayName = "Sunday"; 
            	break;
            
            default:
            	dayName = "Invalid Input";
            	break;
        }

        return dayName;
    }
}