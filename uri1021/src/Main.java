import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
double N;
int sobra, resto, nota, moeda;

N = sc.nextDouble();
resto = (int)(N * 100 + 0.5);

System.out.println("NOTAS:");

nota = 100;
sobra = resto/(nota*100);
System.out.println(sobra + " nota(s) de R$ " + nota +".00" );
resto = resto%(nota *100);
nota = 50;
sobra = resto/(nota*100);
System.out.println(sobra + " nota(s) de R$ " + nota +".00" );
resto = resto%(nota *100);
nota = 20;
sobra = resto/(nota*100);
System.out.println(sobra + " nota(s) de R$ " + nota +".00" );
resto = resto%(nota *100);
nota = 10;
sobra = resto/(nota*100);
System.out.println(sobra + " nota(s) de R$ " + nota +".00" );
resto = resto%(nota *100);
nota = 5;
sobra = resto/(nota*100);
System.out.println(sobra + " nota(s) de R$ " + nota +".00" );
resto = resto%(nota *100);
nota = 2;
sobra = resto/(nota*100);
System.out.println(sobra + " nota(s) de R$ " + nota +".00" );
resto = resto%(nota *100);

System.out.println("MOEDAS:");

moeda = 100;
sobra = resto/ moeda;
System.out.println(sobra + " nota(s) de R$ 1.00" );
resto = resto % moeda;
moeda = 50;
sobra = resto/ moeda;
System.out.println(sobra + " nota(s) de R$ 0.50" );
resto = resto % moeda;
moeda = 25;
sobra = resto/ moeda;
System.out.println(sobra + " nota(s) de R$ 0.25" );
resto = resto % moeda;
moeda = 10;
sobra = resto/ moeda;
System.out.println(sobra + " nota(s) de R$ 0.10" );
resto = resto % moeda;
moeda = 5;
sobra = resto/ moeda;
System.out.println(sobra + " nota(s) de R$ 0.05" );
resto = resto % moeda;
moeda = 1;
sobra = resto/ moeda;
System.out.println(sobra + " nota(s) de R$ 0.01" );
		
		sc.close();
	}

}
