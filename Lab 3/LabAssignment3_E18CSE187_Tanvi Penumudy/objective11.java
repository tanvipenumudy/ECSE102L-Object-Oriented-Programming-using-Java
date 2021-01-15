package labAssignment3;


public class objective11 {

	public static void main(String[] args) {
        int n = 7, c= 1, spaces = 1, s= 0;

        for (int i=1; i<(n*2); i++) {
            for (int spc=n-spaces; spc>0; spc--) {
                System.out.print(" ");
            }
            if (i<n){
                s=i;         
                spaces++;   
            } 
            else{
                s= n*2-i; 
                spaces--; 
            }
            for (int j = 0; j<c; j++){
                System.out.print(s);
                if (j<c/2) {
                    s--;
                } 
                else {
                    s++;
                }
            }
            if (i < n){
                c+=2;
            } 
            else{
                c-=2;
            }

            System.out.println();
        }
    }

}


