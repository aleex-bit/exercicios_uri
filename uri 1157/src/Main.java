import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int sub;
		for(int i =n; i<=n && i>0; i--) {
		    if(n%i == 0 ) {
		    	sub=n/i;
		    	
			System.out.println(sub);
		}
		}
		sc.close();
	}

}
