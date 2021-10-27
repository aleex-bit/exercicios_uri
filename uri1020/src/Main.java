import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idadeDias, resto, anos, mes, dias;
		
		idadeDias = sc.nextInt();
		
		anos = idadeDias / 365;
		resto = idadeDias % 365;
		mes = resto / 30;
		dias = resto % 30;
		
		
		System.out.println(anos + " ano (s)");
		System.out.println( mes + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		
		
		
		sc.close();
	}

}
