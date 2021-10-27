import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		float N1 = sc.nextFloat();
		float N2 = sc.nextFloat();
		float N3 = sc.nextFloat();
		float N4 = sc.nextFloat();
		
		float media = (N1*2f + N2*3f + N3*4f + N4* 1f) / 10f;
		System.out.printf("Media : %.1f%n", media);
		
		 if (media >= 7f){
			 System.out.println("Aluno aprovado.");
		     }
		 else if (media < 5f) {
			 System.out.println("Aluno reprovado.");
		     }
		 else  {
			  float nota = sc.nextFloat();
			  System.out.println("Aluno em exame.");
			  float mediaFinal = (media + nota)/2f;
			  System.out.println("Nota do exame: "+ nota);
		     
		      if(mediaFinal > 5f) {
			  System.out.println("Aluno aprovado.");
		      }
		      else {
			 System.out.println("Aluno reprovado.");
		     }
		 
		     System.out.printf("media final: %.1f%n", mediaFinal);
		 }
		sc.close();
	}

	}
