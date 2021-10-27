import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor, resto,nota, sobra;
		
		valor = sc.nextInt();
		
		nota = 100;
		sobra = valor /nota;
		System.out.println( sobra + " nota(s) de R$" + nota +",00");
		resto = valor % nota;
		
		nota = 50; 
		sobra= resto / 50;
		System.out.println( sobra+ " nota(s) de R$" + nota +",00");
		resto = resto % 50;
		
		nota = 20;
		sobra= resto / 20;
		System.out.println( sobra + " nota(s) de R$" + nota +",00");
		resto = resto % 20;
		
		nota = 10;
		sobra= resto / 10;
		System.out.println(sobra + " nota(s) de R$" + nota +",00");
		resto = resto % 10;
		
		nota = 5;
		sobra= resto / 5;
		System.out.println( sobra + " nota(s) de R$" + nota +",00");
		resto = resto % 5;
		
		nota = 2;
		sobra= resto / 2;
		System.out.println( sobra + " nota(s) de R$" + nota +",00");
		resto = resto % 2;
		
		nota = 1;
		sobra= resto ;
		System.out.println( sobra + " nota(s) de R$" + nota +",00");
	    
		

		
		sc. close();
	}

}
