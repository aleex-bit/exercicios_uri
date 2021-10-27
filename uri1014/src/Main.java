import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia;
		double litroKm, mediaCons;
		
		distancia = sc.nextInt();
		litroKm = sc.nextDouble();
		
		mediaCons = distancia / litroKm;
		
		System.out.printf("%.3f km/l%n", mediaCons);
		
		sc.close();
	}

}
