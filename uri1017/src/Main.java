import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horas, velocidade;
		double litros;
		
		horas = sc.nextInt();
		velocidade = sc.nextInt();
		
		litros = (double)horas * velocidade / 12.0;
				
				System.out.printf("%.3f%n ", litros);
		
		sc.close();

	}

}
