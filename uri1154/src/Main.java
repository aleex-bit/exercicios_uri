import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		while(idade >= 0) {
			cont += +1;
			soma += + idade;
			idade = sc.nextInt();
		}
		
		double media = (double) soma / cont;
		System.out.printf("%.2f%n", media );

		sc.close();
	}

}
