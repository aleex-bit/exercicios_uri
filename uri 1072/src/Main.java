import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma1 =0;
		int soma2 = 0;
	for (int i=1; i <= N; i++) {
		
		int x = sc.nextInt();
		if(x >= 10 && x <=20) {
			soma1 += +1;
		}
		else {
			soma2 += +1;
		}
	
		}
	System.out.println(soma1 + " in");
	System.out.println(soma2 + " out");

		sc.close();
	}

}
