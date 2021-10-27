import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int coelhos = 0;
		int sapos = 0;
		int ratos = 0;
		
		for(int i =0; i<N; i++) {
			
			int quantia= sc.nextInt();
			char x = sc.next().charAt(0);
			
			if(x == 'c') {
				coelhos += + quantia;
			}
			if(x =='s') {
				sapos += quantia;
			}
			else {
				ratos += +quantia;
			}
			
		}
		int total = coelhos + sapos + ratos ;
		double porcentagemCoelho = (double)coelhos / total * 100.0;
        double porcentagemRato  =  (double)ratos / total * 100.0;	
        double porcentagemSapo  =  (double)sapos / total * 100.0;
		
        System.out.println("Total:" + total + " cobaias");
		System.out.println("Total de coelhos:" + coelhos);
		System.out.println("Total de ratos:" + ratos);
		System.out.println("Total de sapos:" + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n",porcentagemCoelho );
		System.out.printf("Percentual de ratos: %.2f %%%n",porcentagemRato);
		System.out.printf("Percentual de sapos: %.2f %%%n",porcentagemSapo);

		sc.close();
	}

}
