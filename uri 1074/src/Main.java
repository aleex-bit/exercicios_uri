import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     
     int N = sc.nextInt();
     
     for(int i = 0; i<N; i++) {
    	 int x = sc.nextInt();
    	 if (x % 2 == 0 && x > 0) {
    		 System.out.println("EVEN POSITIVE");
    		  }
    	 else if(x % 2 == 0 && x < 0) {
    		 System.out.println("EVEN NEGATIVE");
    	 }
    	 if(x % 2 != 0 && x <0) {
    		 System.out.println("ODD NEGATIVE");
    	 }
    	 else if (x % 2 != 0 && x > 0){
    		 System.out.println("ODD POSITIVE");
    	 }
    	 if (x == 0) {
    		 System.out.println("NULL");
    	 }
     }
     
     
     sc.close();
	}

}
