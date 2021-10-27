import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int inicio =1;
		for(int i =1; i<=n; i++) {
			
			int segundo = inicio * inicio;
			int terceiro = inicio * inicio * inicio;
			
			System.out.printf("%d %d %d%n", inicio, segundo, terceiro);
		
			inicio += +1;
		}
		
		sc.close();
		
	}

}
