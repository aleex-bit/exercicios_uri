import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		 
		int inicio, fim, duracao, horas,minutos, resto;
		
		inicio = horaInicial*60*60 + minutoInicial *60;
		fim = horaFinal*60*60+ minutoFinal *60;

		
		if (horaFinal <= horaInicial) {
			inicio = horaInicial*60*60 + minutoInicial *60;
			fim = (horaFinal+24)*60*60+ minutoFinal *60;	
		}
        
		duracao = fim - inicio;
		
		horas = duracao /3600;
		resto = duracao% 3600;
		minutos = resto / 60;
		
		 System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

		sc.close();
	}

}
