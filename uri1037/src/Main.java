import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor < 0.0 || valor > 100.0){
			System.out.println("Fora de intervalo ");
		}
		else if ( valor <= 25.0) {
			System.out.println("Intervalor [0,25]");
		}
		else if ( valor <= 50.0) {
			System.out.println("(25,50]");
		}
		else if( valor <= 100.0) {
	        System.out.println("(75,100]");
		}
		
		
		
		sc.close();

	}

}
