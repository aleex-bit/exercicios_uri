
import java.util.Locale;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		double a, b, c, med;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		med = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
				
		System.out.printf(" MEDIA = %.1f%n", med);
		
		sc.close();
	}

}
