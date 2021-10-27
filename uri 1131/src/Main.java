import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int novoGrenal = 1;
		int vitoriaGremio = 0;
		int vitoriaInter = 0; 
		int empate=0 ;
		
		while (novoGrenal == 1) {
			
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();
			
			
			if(golsGremio > golsInter) {
				vitoriaGremio +=  +1;
			}
			
			else if (golsInter > golsGremio) {
				vitoriaInter += +1;
				
			}
				else {
					empate += +1;
				
				}
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
			}
		int total = vitoriaGremio + vitoriaInter + empate;
		
		System.out.println(total + " grenais");
		System.out.println("Inter " + vitoriaInter);
		System.out.println("Gremio " + vitoriaGremio);
		System.out.println("Empate " + empate);
		
		if(vitoriaInter > vitoriaGremio) {
			System.out.println("Inter venceu mais ");
		}
		else if(vitoriaGremio > vitoriaInter) {
			System.out.println( "Gremio venceu mais ");
		}
		else {
			System.out.println("Não houve vencedor");
		}
		
		
		sc.close();
	}

}
