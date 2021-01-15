package LabAssignment8;
import java.util.Scanner;

public class objective6 {

	public static void obj6() {
		String S;
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter any String: ");
		String s = scan.nextLine();
		int count=0,len=0;
		do {
			try {
				char name[]=s.toCharArray();
				len=name.length;
				count=0;
				for(int j=0;j<len;j++) {
					if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123))) 
						count++;
				}
				if(count!=0){
					System.out.println(name[0]+" "+count+" times");
				}
				s=s.replace(""+name[0],"");          
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		while(len!=1);
	}
	      
}


