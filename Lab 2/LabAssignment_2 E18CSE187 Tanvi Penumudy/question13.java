package package1;

import java.util.Scanner;

public class question13 {

	public static void main(String[] strings) {
		/*int month = 2; 
        int year = 2016; 
        int DaysInMonth = 0; */
		
        Scanner scan = new Scanner(System.in);
        int DaysInMonth = 0; 
        String MonthName="Unknown";
        System.out.print("Enter the number of the Month: ");
        int month = scan.nextInt();
        System.out.print("Enter the Year: ");
        int year = scan.nextInt();
        switch(month) {
            case 1:
                MonthName="January";
                DaysInMonth = 31;
                break;
            case 2:
                MonthName="February";
                if((year%400==0) || ((year%4==0) && (year%100!=0))) {
                    DaysInMonth = 29;
                } else {
                    DaysInMonth = 28;
                }
                break;
            case 3:
                MonthName="March";
                DaysInMonth = 31;
                break;
            case 4:
                MonthName="April";
                DaysInMonth = 30;
                break;
            case 5:
                MonthName="May";
                DaysInMonth = 31;
                break;
            case 6:
                MonthName="June";
                DaysInMonth = 30;
                break;
            case 7:
                MonthName="July";
                DaysInMonth = 31;
                break;
            case 8:
                MonthName="August";
                DaysInMonth = 31;
                break;
            case 9:
                MonthName="September";
                DaysInMonth = 30;
                break;
            case 10:
                MonthName="October";
                DaysInMonth = 31;
                break;
            case 11:
                MonthName="November";
                DaysInMonth = 30;
                break;
            case 12:
                MonthName="December";
                DaysInMonth = 31;
        }
        System.out.print(MonthName + ", " + year + " has " + DaysInMonth + " days\n");
    }
}